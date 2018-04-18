package nc.impl.ct.ap;

import java.util.HashMap;
import java.util.Map;

import nc.impl.ct.ap.action.ApDeleteAction;
import nc.impl.ct.ap.action.ApInsertAction;
import nc.impl.ct.ap.action.ApUpdateAction;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.BillQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.itf.ct.ap.IApMaintain;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.ct.ap.entity.AggCtApVO;
import nc.vo.ct.ap.entity.CtApBVO;
import nc.vo.ct.ap.entity.CtApVO;
import nc.vo.ct.uitl.ValueUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.data.IRowSet;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.pub.SqlBuilder;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;

/**
 * ��������ͬ���ɹ���ͬ�� ��̨ʵ����
 * 
 */
public class ApMaintainImpl implements IApMaintain {

	@Override
	public void deleteAp(AggCtApVO[] bills) throws BusinessException {
		PersistenceManager manager = null;
		JdbcSession session = null;
		try {
			// ����BP
			new ApDeleteAction().delete(bills);
			// ɾ����Ʊ�ָ����ε��ݿɿ���Ʊ���
			manager = PersistenceManager.getInstance();
			session = manager.getJdbcSession();
			// �������ݿ��д���ݲ���
			for (AggCtApVO retvo : bills) {
				String usql = "update ct_ar t set t.vdef2 = '";
				String qsql = "select t.vdef2 from ct_ar t where nvl(t.dr,0)=0  and  t.pk_ct_ar = '";
				if (retvo.getParentVO().getVdef3() != null
						&& !retvo.getParentVO().getVdef3().trim().equals("")) {// �������ݲ���
					qsql += retvo.getParentVO().getVdef3() + "'";
					Object sum_src = session.executeQuery(qsql,
							new ColumnProcessor());// ����ʣ��ɿ����
					if (sum_src == null) {
						sum_src = "0";
					}
					double sum = 0;
					for (CtApBVO cgfpb : retvo.getCtApBVO()) {
						UFDouble money = cgfpb.getNorigtaxmny();// ��˰�ϼ�
						if (money != null) {
							sum += money.doubleValue();
						}
					}
					Double d = Double.parseDouble(sum_src.toString()) + sum;
					usql += d.toString() + "' where t.pk_ct_ar = '"
							+ retvo.getParentVO().getVdef3() + "'";
					session.executeUpdate(usql);
				}
			}
		} catch (Exception ex) {
			ExceptionUtils.marsh(ex);
		} finally {
			if (session != null)
				session.closeAll();
			if (manager != null)
				manager.release();// �رպ��ͷ����ӻỰ
		}
	}

	@Override
	public AggCtApVO[] maintainQuery(IQueryScheme queryScheme)
			throws BusinessException {
		AggCtApVO[] bills = null;
		try {
			QuerySchemeProcessor qrySchemeProcessor = new QuerySchemeProcessor(
					queryScheme);
			String headTableName = qrySchemeProcessor.getMainTableAlias();
			qrySchemeProcessor.appendWhere(" and " + headTableName
					+ ".blatest= 'Y' ");
			// ��ǰ����
			qrySchemeProcessor.appendCurrentGroup();
			// ��ǰ��Ȩ�޵���֯
			qrySchemeProcessor.appendFuncPermissionOrgSql();
			// ����
			SqlBuilder order = new SqlBuilder();
			order.append("order by ");
			order.append(headTableName);
			order.append(".vbillcode");

			BillLazyQuery<AggCtApVO> qry = new BillLazyQuery<AggCtApVO>(
					AggCtApVO.class);
			bills = qry.query(queryScheme, order.toString());
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return bills;
	}

	/**
	 * ͨ������ ��ѯvo
	 */
	@Override
	public AggCtApVO[] queryCtApVoByIds(String[] ids) throws BusinessException {
		if (ValueUtil.isEmpty(ids)) {
			return null;
		}
		AggCtApVO[] bills = null;
		try {

			DataAccessUtils utils = new DataAccessUtils();
			// ִ��sql����ѯ��ͷid
			IRowSet rowset = utils.query(this.createWholeSql(ids));
			String[] cbillids = rowset.toOneDimensionStringArray();
			if (ValueUtil.isEmpty(cbillids)) {
				return null;
			}
			BillQuery<AggCtApVO> queryVO = new BillQuery<AggCtApVO>(
					AggCtApVO.class);
			bills = queryVO.query(cbillids);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}

		return bills;
	}

	/**
	 * ����������������ͬ�߽ű����������޸ķ���,��EJB�߽��׳��쳣
	 * <p>
	 * <b>����˵��</b>
	 * 
	 * @param bill
	 * @param obj
	 * @return
	 * @throws BusinessException
	 *             <p>
	 * @since 6.0
	 * @author lizhengb
	 * @time 2010-4-23 ����02:20:42
	 */
	@Override
	public AggCtApVO[] save(AggCtApVO[] bills) throws BusinessException {
		PersistenceManager manager = null;
		JdbcSession session = null;
		try {
			manager = PersistenceManager.getInstance();
			session = manager.getJdbcSession();
			Map<String, AggCtApVO> code2agg = new HashMap<String, AggCtApVO>();
			for (AggCtApVO agg : bills) {
				code2agg.put(agg.getParentVO().getVbillcode(), agg);
			}
			BillTransferTool<AggCtApVO> tool = new BillTransferTool<AggCtApVO>(
					bills);
			AggCtApVO[] clientFullVOs = tool.getClientFullInfoBill();
			AggCtApVO[] originBills = tool.getOriginBills();
			CtApVO ctApVO = bills[0].getParentVO();
			String updatechildsql = "";
			if (null != ctApVO.getPk_ct_ap()) {
				Map<String, AggCtApVO> pk2agg = new HashMap<String, AggCtApVO>();
				for (AggCtApVO agg : originBills) {
					pk2agg.put(agg.getParentVO().getPk_ct_ap(), agg);
				}
				Map<String, String> pk2sql = new HashMap<String, String>();
				for (AggCtApVO agg : clientFullVOs) {
					if (agg.getParentVO().getVdef3() != null
							&& !agg.getParentVO().getVdef3().toString().trim()
									.equals("")) {
						double sum_client = 0;
						double sum_origin = 0;
						String updatesql = null;
						for (CtApBVO cgfpb : agg.getCtApBVO()) {
							UFDouble money = cgfpb.getNorigtaxmny();
							if (money != null) {
								sum_client += money.doubleValue();
							}
						}
						for (CtApBVO xsfpb : pk2agg.get(
								agg.getParentVO().getPk_ct_ap()).getCtApBVO()) {
							UFDouble money = xsfpb.getNorigtaxmny();
							if (money != null) {
								sum_origin += money.doubleValue();
							}
						}
						// �޸ĺ�ļ�˰�ϼ�-�޸�ǰ�ļ�˰�ϼ�
						double dif_ = sum_client - sum_origin;
						if (sum_client < 0) {
							//throw new BusinessException("��ͬ������Ϊ����");
						}
						if (dif_ > 0) {
							double dif = new Double(agg.getParentVO()
									.getVdef4().toString())
									- dif_;
							if (dif < 0) {
//								throw new BusinessException(
//										"��ͬ�������ε��ݿɿ���ͬ�����");
							}
							// �����µ�ֵ
							code2agg.get(agg.getParentVO().getVbillcode())
									.getParentVO()
									.setVdef4(new Double(dif).toString());
						} else if (dif_ < 0) {
							double dif = new Double(agg.getParentVO()
									.getVdef4().toString())
									- dif_;
							// �����µ�ֵ
							code2agg.get(agg.getParentVO().getVbillcode())
									.getParentVO()
									.setVdef4(new Double(dif).toString());
						}
						updatesql = "update ct_ar t set t.vdef2 = '"
								+ agg.getParentVO().getVdef4()
								+ "' where t.pk_ct_ar = '"
								+ agg.getParentVO().getVdef3() + "'";
						updatechildsql = "update ct_ap ap set ap.vdef4='"
								+ agg.getParentVO().getVdef4()
								+ "' where ap.vdef3='"
								+ agg.getParentVO().getVdef3() + "'";
						pk2sql.put(agg.getParentVO().getPk_ct_ap(), updatesql);
					}
				}
				AggCtApVO[] bills_ = new ApUpdateAction().update(bills);
				// ��д��������
				for (AggCtApVO retvo : bills_) {
					String updatesql = pk2sql.get(retvo.getParentVO()
							.getPk_ct_ap());
					if (updatesql != null) {
						session.executeUpdate(updatesql);
					}
				}
				if (!"".equals(updatechildsql)) {
					session.executeUpdate(updatechildsql);
				}
				return bills_;
			}

			for (AggCtApVO retvo : clientFullVOs) {
				String usql = "update ct_ar t set t.vdef2 = '";
				if (retvo.getParentVO().getVdef3() != null
						&& !retvo.getParentVO().getVdef3().trim().equals("")) {// �ж��Ƿ�����������
					String obj = retvo.getParentVO().getVdef2();// ���ε���ʣ���˰���֮��
					if (obj == null) {// ��������¼
						// ��ѯ���μ�˰�ϼ�֮��
						String querysql = "select sum(norigtaxmny) from ct_ar_b where nvl(dr,0)=0 and pk_ct_ar = '"
								+ retvo.getParentVO().getVdef3() + "'";
						Object sum_src = session.executeQuery(querysql,
								new ColumnProcessor());
						obj = sum_src.toString();
					}
					double sum = 0;
					for (CtApBVO cgfpb : retvo.getCtApBVO()) {
						UFDouble money = cgfpb.getNorigtaxmny();// ��˰�ϼ�
						if (money != null) {
							sum += money.doubleValue();
						}
					}
					Double srcmoney = Double.parseDouble(obj);
					double dif = srcmoney - sum;
					if (dif < 0) {
//						throw new Exception("��ͬ�����ɿ���ͬ�����");
					}
					code2agg.get(retvo.getParentVO().getVbillcode())
							.getParentVO().setVdef4(new Double(dif).toString());
					usql += dif + "' where nvl(t.dr,0)=0 and t.pk_ct_ar = '"
							+ retvo.getParentVO().getVdef3() + "'";
					session.executeUpdate(usql);
				}
			}
			AggCtApVO[] bills_ = new ApInsertAction().insert(bills);
			return bills_;

		} catch (Exception ex) {
			ExceptionUtils.marsh(ex);
		} finally {
			if (session != null)
				session.closeAll();
			if (manager != null)
				manager.release();// �رպ��ͷ����ӻỰ
		}
		return null;
	}

	/*
	 * private String createWholeMaintainSql(IQueryScheme queryScheme) {
	 * QuerySchemeProcessor qrySchemeProcessor = new
	 * QuerySchemeProcessor(queryScheme); String mainTableAlias =
	 * qrySchemeProcessor.getMainTableAlias(); StringBuilder wholeSql = new
	 * StringBuilder(); wholeSql.append("select distinct " + mainTableAlias +
	 * ".pk_ct_ap "); qrySchemeProcessor.appendWhere(" and " + mainTableAlias +
	 * ".blatest= 'Y' "); qrySchemeProcessor.appendCurrentGroup();
	 * qrySchemeProcessor.appendFuncPermissionOrgSql();
	 * wholeSql.append(qrySchemeProcessor.getFinalFromWhere()); return
	 * wholeSql.toString(); }
	 */

	private String createWholeSql(String[] ids) {
		SqlBuilder sql = new SqlBuilder();
		sql.append("select distinct ct_ap.pk_ct_ap from ct_ap where ");
		sql.append(" ct_ap.pk_ct_ap", ids);
		sql.append(" and ct_ap.dr = 0 ");
		sql.append(" and ct_ap.blatest = 'Y' ");
		return sql.toString();
	}


}
