package nc.impl.pub.ace;

import java.util.HashMap;
import java.util.Map;

import nc.bs.baal.xsfp.ace.bp.AceXsfpApproveBP;
import nc.bs.baal.xsfp.ace.bp.AceXsfpDeleteBP;
import nc.bs.baal.xsfp.ace.bp.AceXsfpInsertBP;
import nc.bs.baal.xsfp.ace.bp.AceXsfpSendApproveBP;
import nc.bs.baal.xsfp.ace.bp.AceXsfpUnApproveBP;
import nc.bs.baal.xsfp.ace.bp.AceXsfpUnSendApproveBP;
import nc.bs.baal.xsfp.ace.bp.AceXsfpUpdateBP;
import nc.bs.dao.BaseDAO;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.xsfp.entity.AggXsfpVO;
import nc.vo.xsfp.entity.XsfpBVO;

public abstract class AceXsfpPubServiceImpl {
	// ����
	public AggXsfpVO[] pubinsertBills(AggXsfpVO[] clientFullVOs,
			AggXsfpVO[] originBills) throws BusinessException {
		// try {
		// // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
		// BillTransferTool<AggXsfpVO> transferTool = new
		// BillTransferTool<AggXsfpVO>(
		// clientFullVOs);
		// // ����BP
		// AceXsfpInsertBP action = new AceXsfpInsertBP();
		// AggXsfpVO[] retvos = action.insert(clientFullVOs);
		// // ���췵������
		// return transferTool.getBillForToClient(retvos);
		// } catch (Exception e) {
		// ExceptionUtils.marsh(e);
		// }
		// return null;
		PersistenceManager manager = null;
		JdbcSession session = null;
		try {
			// ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
			BillTransferTool<AggXsfpVO> transferTool = new BillTransferTool<AggXsfpVO>(
					clientFullVOs);
			// ����BP
			AceXsfpInsertBP action = new AceXsfpInsertBP();
			// �������ݻ�д
			// ���ε�������def1=ʣ���ͬ��˰���
			// ���ε�������def1=��Դ������������,def2=���ε�ʣ�൥�ݼ�˰���
			manager = PersistenceManager.getInstance();
			session = manager.getJdbcSession();
			// ��ѯ���ε�ʣ�൥�ݼ�˰���
			// �������ݿ��д���ݲ���
			for (AggXsfpVO retvo : clientFullVOs) {
				String usql = "update ct_ar t set t.vdef1 = '";
				if (retvo.getParentVO().getVdef1() != null
						&& !retvo.getParentVO().getVdef1().trim().equals("")) {// �ж��Ƿ�����������
					String obj = retvo.getParentVO().getVdef2();// ���ε���ʣ���˰���֮��
					if (obj == null) {// ��������¼
						// ��ѯ���μ�˰�ϼ�֮��
						String querysql = "select sum(norigtaxmny) from ct_ar_b where nvl(dr,0)=0 and pk_ct_ar = '"
								+ retvo.getParentVO().getVdef1() + "'";
						Object sum_src = session.executeQuery(querysql,
								new ColumnProcessor());
						obj = sum_src.toString();
					}
					double sum = 0;
					for (XsfpBVO cgfpb : retvo.getChildren(XsfpBVO.class)) {
						UFDouble money = cgfpb.getNorigtaxmny();// ��˰�ϼ�
						if (money != null) {
							sum += money.doubleValue();
						}
					}
					Double srcmoney = Double.parseDouble(obj);
					double dif = srcmoney - sum;
					if (dif < 0) {
						throw new Exception("��Ʊ�����ɿ���Ʊ�����");
					}
					retvo.getParentVO().setVdef2(new Double(dif).toString());
					usql += dif + "' where nvl(t.dr,0)=0 and t.pk_ct_ar = '"
							+ retvo.getParentVO().getVdef1() + "'";
					session.executeUpdate(usql);
					String sql2 = "update xsfp set xsfp.vdef2='"
					        +dif+"' where xsfp.vdef1='"
							+retvo.getParentVO().getVdef1()+"'";
					session.executeUpdate(sql2);
				}
			}
			AggXsfpVO[] retvos = action.insert(clientFullVOs);
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}finally {
			if (session != null)
				session.closeAll();
			if (manager != null)
				manager.release();// �رպ��ͷ����ӻỰ
		}
		return null;
	}

	// ɾ��
	public void pubdeleteBills(AggXsfpVO[] clientFullVOs,
			AggXsfpVO[] originBills) throws BusinessException {
		PersistenceManager manager = null;
		JdbcSession session = null;
		try {
			// ����BP
			new AceXsfpDeleteBP().delete(clientFullVOs);
			// ɾ����Ʊ�ָ����ε��ݿɿ���Ʊ���
			manager = PersistenceManager.getInstance();
			session = manager.getJdbcSession();
			// �������ݿ��д���ݲ���
			for (AggXsfpVO retvo : clientFullVOs) {
				String usql = "update ct_ar t set t.vdef1 = '";
				String qsql = "select t.vdef1 from ct_ar t where nvl(t.dr,0)=0  and  t.pk_ct_ar = '";
				if (retvo.getParentVO().getVdef1() != null
						&& !retvo.getParentVO().getVdef1().trim().equals("")) {// �������ݲ���
					qsql += retvo.getParentVO().getVdef1() + "'";
					Object sum_src = session.executeQuery(qsql,
							new ColumnProcessor());// ����ʣ��ɿ����
					if (sum_src == null) {
						sum_src = "0";
					}
					double sum = 0;
					for (XsfpBVO cgfpb : retvo.getChildren(XsfpBVO.class)) {
						UFDouble money = cgfpb.getNorigtaxmny();// ��˰�ϼ�
						if (money != null) {
							sum += money.doubleValue();
						}
					}
					Double d = Double.parseDouble(sum_src.toString()) + sum;
					usql += d.toString() + "' where t.pk_ct_ar = '"
							+ retvo.getParentVO().getVdef1() + "'";
					session.executeUpdate(usql);
					String sql2 = "update xsfp set xsfp.vdef2='"
					        +d.toString()+"' where xsfp.vdef1='"
							+retvo.getParentVO().getVdef1()+"'";
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

	// �޸�
	public AggXsfpVO[] pubupdateBills(AggXsfpVO[] clientFullVOs,
			AggXsfpVO[] originBills) throws BusinessException {
		try {
			// ���� + ���ts
			// BillTransferTool<AggXsfpVO> transferTool = new
			// BillTransferTool<AggXsfpVO>(
			// clientFullVOs);
			// AceXsfpUpdateBP bp = new AceXsfpUpdateBP();
			// AggXsfpVO[] retvos = bp.update(clientFullVOs, originBills);
			// // ���췵������
			// return transferTool.getBillForToClient(retvos);
			// ���� + ���ts
			BillTransferTool<AggXsfpVO> transferTool = new BillTransferTool<AggXsfpVO>(
					clientFullVOs);
			AceXsfpUpdateBP bp = new AceXsfpUpdateBP();
			Map<String, AggXsfpVO> pk2agg = new HashMap<String, AggXsfpVO>();
			for (AggXsfpVO agg : originBills) {
				pk2agg.put(agg.getParentVO().getCsaleinvoiceid(), agg);
			}
			BaseDAO dao = new BaseDAO();
			Map<String, String> pk2sql = new HashMap<String, String>();
			String sql2 = "";
			for (AggXsfpVO agg : clientFullVOs) {
				if (agg.getParentVO().getVdef1() != null
						&& !agg.getParentVO().getVdef1().toString().trim()
								.equals("")) {
					double sum_client = 0;
					double sum_origin = 0;
					String updatesql = null;
					for (XsfpBVO cgfpb : agg.getChildren(XsfpBVO.class)) {
						UFDouble money = cgfpb.getNorigtaxmny();
						if (money != null) {
							sum_client += money.doubleValue();
						}
					}
					for (XsfpBVO xsfpb : pk2agg.get(
							agg.getParentVO().getCsaleinvoiceid()).getChildren(
							XsfpBVO.class)) {
						UFDouble money = xsfpb.getNorigtaxmny();
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
						double dif = new Double(agg.getParentVO().getVdef2()
								.toString())
								- dif_;
						if (dif < 0) {
							throw new BusinessException("��Ʊ�������ε��ݿɿ���Ʊ�����");
						}
						// �����µ�ֵ
						agg.getParentVO().setVdef2(new Double(dif).toString());
					} else if (dif_ < 0) {
						double dif = new Double(agg.getParentVO().getVdef2()
								.toString())
								- dif_;
						// �����µ�ֵ
						agg.getParentVO().setVdef2(new Double(dif).toString());
					}
					updatesql = "update ct_ar t set t.vdef1 = '"
							+ agg.getParentVO().getVdef2()
							+ "' where t.pk_ct_ar = '"
							+ agg.getParentVO().getVdef1() + "'";
					pk2sql.put(agg.getParentVO().getCsaleinvoiceid(), updatesql);
					sql2 = "update xsfp set xsfp.vdef2='"
					        +agg.getParentVO().getVdef2()+"' where xsfp.vdef1='"
							+agg.getParentVO().getVdef1()+"'";
					
				}
			}
			AggXsfpVO[] retvos = bp.update(clientFullVOs, originBills);
			// ��д��������
			for (AggXsfpVO retvo : retvos) {
				String updatesql = pk2sql.get(retvo.getParentVO()
						.getCsaleinvoiceid());
				if (updatesql != null) {
					dao.executeUpdate(updatesql);
				}
			}
			dao.executeUpdate(sql2);
			// ���췵������
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public AggXsfpVO[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggXsfpVO[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggXsfpVO> query = new BillLazyQuery<AggXsfpVO>(
					AggXsfpVO.class);
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
	public AggXsfpVO[] pubsendapprovebills(AggXsfpVO[] clientFullVOs,
			AggXsfpVO[] originBills) throws BusinessException {
		AceXsfpSendApproveBP bp = new AceXsfpSendApproveBP();
		AggXsfpVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// �ջ�
	public AggXsfpVO[] pubunsendapprovebills(AggXsfpVO[] clientFullVOs,
			AggXsfpVO[] originBills) throws BusinessException {
		AceXsfpUnSendApproveBP bp = new AceXsfpUnSendApproveBP();
		AggXsfpVO[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// ����
	public AggXsfpVO[] pubapprovebills(AggXsfpVO[] clientFullVOs,
			AggXsfpVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceXsfpApproveBP bp = new AceXsfpApproveBP();
		AggXsfpVO[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// ����

	public AggXsfpVO[] pubunapprovebills(AggXsfpVO[] clientFullVOs,
			AggXsfpVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceXsfpUnApproveBP bp = new AceXsfpUnApproveBP();
		AggXsfpVO[] retvos = bp.unApprove(clientFullVOs, originBills);
		return retvos;
	}

}