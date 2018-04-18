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
 * 其他付合同（采购合同） 后台实现类
 * 
 */
public class ApMaintainImpl implements IApMaintain {

	@Override
	public void deleteAp(AggCtApVO[] bills) throws BusinessException {
		PersistenceManager manager = null;
		JdbcSession session = null;
		try {
			// 调用BP
			new ApDeleteAction().delete(bills);
			// 删除发票恢复上游单据可开发票金额
			manager = PersistenceManager.getInstance();
			session = manager.getJdbcSession();
			// 拉单数据库回写数据操作
			for (AggCtApVO retvo : bills) {
				String usql = "update ct_ar t set t.vdef2 = '";
				String qsql = "select t.vdef2 from ct_ar t where nvl(t.dr,0)=0  and  t.pk_ct_ar = '";
				if (retvo.getParentVO().getVdef3() != null
						&& !retvo.getParentVO().getVdef3().trim().equals("")) {// 拉单数据操作
					qsql += retvo.getParentVO().getVdef3() + "'";
					Object sum_src = session.executeQuery(qsql,
							new ColumnProcessor());// 上游剩余可开金额
					if (sum_src == null) {
						sum_src = "0";
					}
					double sum = 0;
					for (CtApBVO cgfpb : retvo.getCtApBVO()) {
						UFDouble money = cgfpb.getNorigtaxmny();// 价税合计
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
				manager.release();// 关闭和释放连接会话
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
			// 当前集团
			qrySchemeProcessor.appendCurrentGroup();
			// 当前有权限的组织
			qrySchemeProcessor.appendFuncPermissionOrgSql();
			// 排序
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
	 * 通过主键 查询vo
	 */
	@Override
	public AggCtApVO[] queryCtApVoByIds(String[] ids) throws BusinessException {
		if (ValueUtil.isEmpty(ids)) {
			return null;
		}
		AggCtApVO[] bills = null;
		try {

			DataAccessUtils utils = new DataAccessUtils();
			// 执行sql，查询表头id
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
	 * 方法功能描述：合同走脚本的新增和修改方法,在EJB边界抛出异常
	 * <p>
	 * <b>参数说明</b>
	 * 
	 * @param bill
	 * @param obj
	 * @return
	 * @throws BusinessException
	 *             <p>
	 * @since 6.0
	 * @author lizhengb
	 * @time 2010-4-23 下午02:20:42
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
						// 修改后的价税合计-修改前的价税合计
						double dif_ = sum_client - sum_origin;
						if (sum_client < 0) {
							//throw new BusinessException("合同金额不可以为负数");
						}
						if (dif_ > 0) {
							double dif = new Double(agg.getParentVO()
									.getVdef4().toString())
									- dif_;
							if (dif < 0) {
//								throw new BusinessException(
//										"合同金额超过上游单据可开合同最大金额");
							}
							// 设置新的值
							code2agg.get(agg.getParentVO().getVbillcode())
									.getParentVO()
									.setVdef4(new Double(dif).toString());
						} else if (dif_ < 0) {
							double dif = new Double(agg.getParentVO()
									.getVdef4().toString())
									- dif_;
							// 设置新的值
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
				// 回写上游数据
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
						&& !retvo.getParentVO().getVdef3().trim().equals("")) {// 判断是否是拉单数据
					String obj = retvo.getParentVO().getVdef2();// 上游单据剩余计税金额之和
					if (obj == null) {// 无拉单记录
						// 查询上游价税合计之和
						String querysql = "select sum(norigtaxmny) from ct_ar_b where nvl(dr,0)=0 and pk_ct_ar = '"
								+ retvo.getParentVO().getVdef3() + "'";
						Object sum_src = session.executeQuery(querysql,
								new ColumnProcessor());
						obj = sum_src.toString();
					}
					double sum = 0;
					for (CtApBVO cgfpb : retvo.getCtApBVO()) {
						UFDouble money = cgfpb.getNorigtaxmny();// 价税合计
						if (money != null) {
							sum += money.doubleValue();
						}
					}
					Double srcmoney = Double.parseDouble(obj);
					double dif = srcmoney - sum;
					if (dif < 0) {
//						throw new Exception("合同金额超过可开合同最大金额");
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
				manager.release();// 关闭和释放连接会话
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
