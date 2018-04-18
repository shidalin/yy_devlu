package nc.impl.pub.ace;

import java.util.HashMap;
import java.util.Map;

import nc.bs.baal.fukuandan.ace.bp.AceFukuandanApproveBP;
import nc.bs.baal.fukuandan.ace.bp.AceFukuandanDeleteBP;
import nc.bs.baal.fukuandan.ace.bp.AceFukuandanInsertBP;
import nc.bs.baal.fukuandan.ace.bp.AceFukuandanSendApproveBP;
import nc.bs.baal.fukuandan.ace.bp.AceFukuandanUnApproveBP;
import nc.bs.baal.fukuandan.ace.bp.AceFukuandanUnSendApproveBP;
import nc.bs.baal.fukuandan.ace.bp.AceFukuandanUpdateBP;
import nc.bs.dao.BaseDAO;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.fukuandan.entity.FukuandanVO;
import nc.vo.fukuandan.entity.Fukuandan_bVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.VOStatus;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceFukuandanPubServiceImpl {
	// ����
	public AggFukuadanVO[] pubinsertBills(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		/*
		 * try { // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ�� BillTransferTool<AggFukuadanVO>
		 * transferTool = new BillTransferTool<AggFukuadanVO>( clientFullVOs);
		 * // ����BP AceFukuandanInsertBP action = new AceFukuandanInsertBP();
		 * AggFukuadanVO[] retvos = action.insert(clientFullVOs); // ���췵������
		 * return transferTool.getBillForToClient(retvos); } catch (Exception e)
		 * { ExceptionUtils.marsh(e); } return null;
		 */
		PersistenceManager manager = null;
		JdbcSession session = null;
		try {
			updateDate(clientFullVOs);
			// ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
			BillTransferTool<AggFukuadanVO> transferTool = new BillTransferTool<AggFukuadanVO>(
					clientFullVOs);
			// ����BP
			AceFukuandanInsertBP action = new AceFukuandanInsertBP();
			// �������ݻ�д
			// ���ε�������def2=ʣ���ͬ��˰���
			// ���ε�������def1=��Դ������������,def2=ʣ���ͬ��˰���
			manager = PersistenceManager.getInstance();
			session = manager.getJdbcSession();
			// �������ݿ��д���ݲ���
			for (AggFukuadanVO retvo : clientFullVOs) {
				for (Fukuandan_bVO fksqb : retvo
						.getChildren(Fukuandan_bVO.class)) {
					if (fksqb.getTaxrate() != null
							&& fksqb.getTaxrate().equals(UFDouble.ZERO_DBL)) {
						fksqb.setTaxrate(new UFDouble("0"));
					}
				}
				if (retvo.getParentVO().getDef1() != null
						&& !retvo.getParentVO().getDef1().trim().equals("")) {// �������ݲ���
					String obj = retvo.getParentVO().getDef2();// ���ε�ʣ�൥�ݼ�˰���
					if (obj == null) {
						// ��ѯ���μ�˰�ϼ�֮��
						String querysql = "select sum(norigtaxmny) from ct_ap_b where nvl(dr,0)=0 and pk_ct_ap = '"
								+ retvo.getParentVO().getDef1() + "'";
						Object sum_src = session.executeQuery(querysql,
								new ColumnProcessor());
						obj = sum_src.toString();
					}
					double sum = 0;
					for (Fukuandan_bVO fksqb : retvo
							.getChildren(Fukuandan_bVO.class)) {
						// ��֯���ҽ��(�跽
						UFDouble money = fksqb.getMoney_de();
						if (money != null) {
							sum += money.doubleValue();
						}
					}
					Double srcmoney = Double.parseDouble(obj);
					double dif = srcmoney - sum;
					if (dif < 0) {
						throw new BusinessException("������������ɿ���Ʊ�����");
					}
					retvo.getParentVO().setDef2(new Double(dif).toString());
					String usql = "update ct_ap t set t.vdef2 = '" + dif
							+ "' where nvl(t.dr,0)=0 and t.pk_ct_ap = '"
							+ retvo.getParentVO().getDef1() + "'";
					session.executeUpdate(usql);
					String sql2 = "update fukuandan fkd set fkd.def2='" + dif
							+ "' where fkd.def1='"
							+ retvo.getParentVO().getDef1() + "'";
					session.executeUpdate(sql2);
				}
			}
			AggFukuadanVO[] retvos = action.insert(clientFullVOs);
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		} finally {
			if (session != null)
				session.closeAll();
			if (manager != null)
				manager.release();// �رպ��ͷ����ӻỰ
		}
		return null;
	}

	// ɾ��
	public void pubdeleteBills(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		PersistenceManager manager = null;
		JdbcSession session = null;
		try {
			// ����BP
			new AceFukuandanDeleteBP().delete(clientFullVOs);
			// ɾ����Ʊ�ָ����ε��ݿɿ���Ʊ���
			manager = PersistenceManager.getInstance();
			session = manager.getJdbcSession();
			// �������ݿ��д���ݲ���
			for (AggFukuadanVO retvo : clientFullVOs) {
				String usql = "update ct_ap t set t.vdef2 = '";
				String qsql = "select t.vdef2 from ct_ap t where nvl(t.dr,0)=0  and  t.pk_ct_ap = '";
				if (retvo.getParentVO().getDef1() != null
						&& !retvo.getParentVO().getDef1().trim().equals("")) {// �������ݲ���
					qsql += retvo.getParentVO().getDef1() + "'";
					// ����ʣ��ɿ����
					Object sum_src = session.executeQuery(qsql,
							new ColumnProcessor());
					if (sum_src == null) {
						sum_src = "0";
					}
					double sum = 0;
					for (Fukuandan_bVO cgfpb : retvo
							.getChildren(Fukuandan_bVO.class)) {
						UFDouble money = cgfpb.getMoney_de();// ��˰�ϼ�
						if (money != null) {
							sum += money.doubleValue();
						}
					}
					// ��ԭ�ۼ�������ɾ�����ݼ�˰�ϼ�
					Double d = Double.parseDouble(sum_src.toString()) + sum;
					usql += d.toString() + "' where t.pk_ct_ap = '"
							+ retvo.getParentVO().getDef1() + "'";
					session.executeUpdate(usql);
					String sql2 = "update fukuandan fkd set fkd.def2='"
							+ d.toString() + "' where fkd.def1='"
							+ retvo.getParentVO().getDef1() + "'";
					session.executeUpdate(sql2);
				}
			}
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		} finally {
			if (session != null)
				session.closeAll();
			if (manager != null)
				manager.release();// �رպ��ͷ����ӻỰ
		}
	}

	private void updateDate(AggFukuadanVO[] clientFullVOs) {
		if (clientFullVOs != null && clientFullVOs.length > 0) {
			for (AggFukuadanVO clientFullVO : clientFullVOs) {
				FukuandanVO pvo = clientFullVO.getParentVO();
				CircularlyAccessibleValueObject[] cvos = clientFullVO
						.getChildrenVO();
				// ����
				String pk_deptid = pvo.getPk_deptid();
				String pk_deptid_v = pvo.getPk_deptid_v();
				//��Ӧ��
				String supplier = pvo.getSupplier();
				// ҵ��Ա
				String pk_psndoc = pvo.getPk_psndoc();
				if (cvos != null && cvos.length > 0) {
					for (CircularlyAccessibleValueObject cvo : cvos) {
						((Fukuandan_bVO) cvo).setPk_deptid(pk_deptid);
						((Fukuandan_bVO) cvo).setPk_deptid_v(pk_deptid_v);
						((Fukuandan_bVO) cvo).setPk_psndoc(pk_psndoc);
						((Fukuandan_bVO) cvo).setSupplier(supplier);
					}
				}
			}
		}
	}

	// �޸�
	public AggFukuadanVO[] pubupdateBills(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		try {
			// // ���� + ���ts
			// BillTransferTool<AggFukuadanVO> transferTool = new
			// BillTransferTool<AggFukuadanVO>(
			// clientFullVOs);
			// AceFukuandanUpdateBP bp = new AceFukuandanUpdateBP();
			// AggFukuadanVO[] retvos = bp.update(clientFullVOs, originBills);
			// // ���췵������
			// return transferTool.getBillForToClient(retvos);
			// ���� + ���ts
			updateDate(clientFullVOs);
			BillTransferTool<AggFukuadanVO> transferTool = new BillTransferTool<AggFukuadanVO>(
					clientFullVOs);
			AceFukuandanUpdateBP bp = new AceFukuandanUpdateBP();
			Map<String, AggFukuadanVO> pk2agg = new HashMap<String, AggFukuadanVO>();
			for (AggFukuadanVO agg : originBills) {
				pk2agg.put(agg.getParentVO().getPk_fukuandan(), agg);
			}
			BaseDAO dao = new BaseDAO();
			Map<String, String> pk2sql = new HashMap<String, String>();
			String sql2 = "";
			for (AggFukuadanVO agg : clientFullVOs) {
				for (Fukuandan_bVO fksqb : agg.getChildren(Fukuandan_bVO.class)) {
					if (fksqb.getTaxrate() != null
							&& fksqb.getTaxrate().equals(UFDouble.ZERO_DBL)) {
						fksqb.setTaxrate(new UFDouble("0"));
					}
				}
				if (agg.getParentVO().getDef1() != null
						&& !agg.getParentVO().getDef1().toString().trim()
								.equals("")) {
					double sum_client = 0;
					double sum_origin = 0;
					String updatesql = null;
					for (Fukuandan_bVO cgfpb : agg
							.getChildren(Fukuandan_bVO.class)) {
						UFDouble money = cgfpb.getMoney_de();
						if (money != null) {
							sum_client += money.doubleValue();
						}
					}
					for (Fukuandan_bVO cgfpb : pk2agg.get(
							agg.getParentVO().getPk_fukuandan()).getChildren(
							Fukuandan_bVO.class)) {
						UFDouble money = cgfpb.getMoney_de();
						if (money != null) {
							sum_origin += money.doubleValue();
						}
					}
					// �޸ĺ�ļ�˰�ϼ�-�޸�ǰ�ļ�˰�ϼ�
					double dif_ = sum_client - sum_origin;
					if (sum_client < 0) {
						throw new BusinessException("��Ʊ������Ϊ����");
					}
					if (dif_ > 0) {
						double dif = new Double(agg.getParentVO().getDef2()
								.toString())
								- dif_;
						if (dif < 0) {
							throw new BusinessException("��Ʊ�������ε��ݿɿ���Ʊ�����");
						}
						// �����µ�ֵ
						agg.getParentVO().setDef2(new Double(dif).toString());
					} else if (dif_ < 0) {
						double dif = new Double(agg.getParentVO().getDef2()
								.toString())
								- dif_;
						// �����µ�ֵ
						agg.getParentVO().setDef2(new Double(dif).toString());
					}
					updatesql = "update ct_ap t set t.vdef2 = '"
							+ agg.getParentVO().getDef2()
							+ "' where t.pk_ct_ap = '"
							+ agg.getParentVO().getDef1() + "'";
					sql2 = "update fukuandan fkd set fkd.def2='"
							+ agg.getParentVO().getDef2()
							+ "' where fkd.def1='"
							+ agg.getParentVO().getDef1() + "'";

					pk2sql.put(agg.getParentVO().getPk_fukuandan(), updatesql);
				}
			}
			AggFukuadanVO[] retvos = bp.update(clientFullVOs, originBills);
			// ��д��������
			for (AggFukuadanVO retvo : retvos) {
				String updatesql = pk2sql.get(retvo.getParentVO()
						.getPk_fukuandan());
				if (updatesql != null) {
					dao.executeUpdate(updatesql);
				}
			}
			if (!"".equals(sql2))
				dao.executeUpdate(sql2);
			// ���췵������
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggFukuadanVO[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggFukuadanVO[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggFukuadanVO> query = new BillLazyQuery<AggFukuadanVO>(
					AggFukuadanVO.class);
			bills = query.query(queryScheme, null);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return bills;
	}

	/**
	 * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
	 * 
	 * @param queryScheme
	 */
	protected void preQuery(IQueryScheme queryScheme) {
		// ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
	}

	// �ύ
	public AggFukuadanVO[] pubsendapprovebills(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		AceFukuandanSendApproveBP bp = new AceFukuandanSendApproveBP();
		AggFukuadanVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// �ջ�
	public AggFukuadanVO[] pubunsendapprovebills(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		AceFukuandanUnSendApproveBP bp = new AceFukuandanUnSendApproveBP();
		AggFukuadanVO[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// ����
	public AggFukuadanVO[] pubapprovebills(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceFukuandanApproveBP bp = new AceFukuandanApproveBP();
		AggFukuadanVO[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// ����

	public AggFukuadanVO[] pubunapprovebills(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceFukuandanUnApproveBP bp = new AceFukuandanUnApproveBP();
		AggFukuadanVO[] retvos = bp.unApprove(clientFullVOs, originBills);
		return retvos;
	}

}