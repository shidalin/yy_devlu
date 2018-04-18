package nc.impl.pub.ace;

import java.util.HashMap;
import java.util.Map;

import nc.bs.baal.cgfp.ace.bp.AceCgfpApproveBP;
import nc.bs.baal.cgfp.ace.bp.AceCgfpDeleteBP;
import nc.bs.baal.cgfp.ace.bp.AceCgfpInsertBP;
import nc.bs.baal.cgfp.ace.bp.AceCgfpSendApproveBP;
import nc.bs.baal.cgfp.ace.bp.AceCgfpUnApproveBP;
import nc.bs.baal.cgfp.ace.bp.AceCgfpUnSendApproveBP;
import nc.bs.baal.cgfp.ace.bp.AceCgfpUpdateBP;
import nc.bs.dao.BaseDAO;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.jdbc.framework.JdbcSession;
import nc.jdbc.framework.PersistenceManager;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.cgfp.entity.AggCgfpVO;
import nc.vo.cgfp.entity.CgfpBVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public abstract class AceCgfpPubServiceImpl {
	// ����
	public AggCgfpVO[] pubinsertBills(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException {
		PersistenceManager manager = null;
		JdbcSession session = null;
		try {
			// ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
			BillTransferTool<AggCgfpVO> transferTool = new BillTransferTool<AggCgfpVO>(
					clientFullVOs);
			// ����BP
			AceCgfpInsertBP action = new AceCgfpInsertBP();
			// �������ݻ�д
			// ���ε�������def1=���βɹ���Ʊʣ���ͬ��˰���
			// ���ε�������def1=������������������,
			// ���ε�������def2=����������ʣ���ͬ��˰���
			manager = PersistenceManager.getInstance();
			session = manager.getJdbcSession();
			// �������ݿ��д���ݲ���
			for (AggCgfpVO retvo : clientFullVOs) {
				String usql = "update ct_ap t set t.vdef1 = '";
				if (retvo.getParentVO().getVdef1() != null
						&& !retvo.getParentVO().getVdef1().trim().equals("")) {// �������ݲ���
					String obj = retvo.getParentVO().getVdef2();// ���ε�ʣ�൥�ݼ�˰���
					if (obj == null) {
						// ��ѯ���μ�˰�ϼ�֮��
						String querysql = "select sum(norigtaxmny) from ct_ap_b where nvl(dr,0)=0 and pk_ct_ap = '"
								+ retvo.getParentVO().getVdef1() + "'";
						Object sum_src = session.executeQuery(querysql,
								new ColumnProcessor());
						obj = sum_src.toString();
					}
					// ��ǰ�ѿ���˰�ϼ�
					double sum = 0;
					for (CgfpBVO cgfpb : retvo.getChildren(CgfpBVO.class)) {
						UFDouble money = cgfpb.getNorigtaxmny();
						if (money != null) {
							sum += money.doubleValue();
						}
					}
					Double srcmoney = Double.parseDouble(obj);
					double dif = srcmoney - sum;
					if (dif < 0) {
						throw new BusinessException("��Ʊ�������ε��ݿɿ���Ʊ�����");
					}
					retvo.getParentVO().setVdef2(new Double(dif).toString());
					// ��д���οɿ���˰�ϼ�
					usql += dif + "' where nvl(t.dr,0)=0 and t.pk_ct_ap = '"
							+ retvo.getParentVO().getVdef1() + "'";
					session.executeUpdate(usql);
					String sql2 = "update cgfp set cgfp.vdef2='"
					        +dif+"' where cgfp.vdef1='"
							+retvo.getParentVO().getVdef1()+"'";
					session.executeUpdate(sql2);
				}
			}
			AggCgfpVO[] retvos = action.insert(clientFullVOs);
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
	public void pubdeleteBills(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException {
		PersistenceManager manager = null;
		JdbcSession session = null;
		try {
			// ����BP
			new AceCgfpDeleteBP().delete(clientFullVOs);
			// ɾ����Ʊ�ָ����ε��ݿɿ���Ʊ���
			manager = PersistenceManager.getInstance();
			session = manager.getJdbcSession();
			// �������ݿ��д���ݲ���
			for (AggCgfpVO retvo : clientFullVOs) {
				String usql = "update ct_ap t set t.vdef1 = '";
				String qsql = "select t.vdef1 from ct_ap t where nvl(t.dr,0)=0  and  t.pk_ct_ap = '";
				if (retvo.getParentVO().getVdef1() != null
						&& !retvo.getParentVO().getVdef1().trim().equals("")) {// �������ݲ���
					qsql += retvo.getParentVO().getVdef1() + "'";
					// ����ʣ��ɿ����
					Object sum_src = session.executeQuery(qsql,
							new ColumnProcessor());
					if (sum_src == null) {
						sum_src = "0";
					}
					double sum = 0;
					for (CgfpBVO cgfpb : retvo.getChildren(CgfpBVO.class)) {
						UFDouble money = cgfpb.getNorigtaxmny();
						if (money != null) {
							sum += money.doubleValue();
						}
					}
					// ��ԭ�ۼ�������ɾ�����ݼ�˰�ϼ�
					Double d = Double.parseDouble(sum_src.toString()) + sum;
					usql += d.toString() + "' where t.pk_ct_ap = '"
							+ retvo.getParentVO().getVdef1() + "'";
					session.executeUpdate(usql);
					String sql2 = "update cgfp set cgfp.vdef2='"
					        +d.toString()+"' where cgfp.vdef1='"
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
	public AggCgfpVO[] pubupdateBills(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException {
		try {
			// ���� + ���ts
			BillTransferTool<AggCgfpVO> transferTool = new BillTransferTool<AggCgfpVO>(
					clientFullVOs);
			AceCgfpUpdateBP bp = new AceCgfpUpdateBP();
			Map<String, AggCgfpVO> pk2agg = new HashMap<String, AggCgfpVO>();
			for (AggCgfpVO agg : originBills) {
				pk2agg.put(agg.getParentVO().getPk_cgfp(), agg);
			}
			BaseDAO dao = new BaseDAO();
			Map<String, String> pk2sql = new HashMap<String, String>();
			String sql2="";
			for (AggCgfpVO agg : clientFullVOs) {
				if (agg.getParentVO().getVdef1() != null
						&& !agg.getParentVO().getVdef1().toString().trim()
								.equals("")) {
					double sum_client = 0;
					double sum_origin = 0;
					String updatesql = null;
					for (CgfpBVO cgfpb : agg.getChildren(CgfpBVO.class)) {
						UFDouble money = cgfpb.getNorigtaxmny();
						if (money != null) {
							sum_client += money.doubleValue();
						}
					}
					for (CgfpBVO cgfpb : pk2agg.get(
							agg.getParentVO().getPk_cgfp()).getChildren(
							CgfpBVO.class)) {
						UFDouble money = cgfpb.getNorigtaxmny();
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
					updatesql = "update ct_ap t set t.vdef1 = '"
							+ agg.getParentVO().getVdef2()
							+ "' where t.pk_ct_ap = '"
							+ agg.getParentVO().getVdef1() + "'";
					sql2 = "update cgfp set cgfp.vdef2='"
					        +agg.getParentVO().getVdef2()+"' where cgfp.vdef1='"
							+agg.getParentVO().getVdef1()+"'";
					pk2sql.put(agg.getParentVO().getPk_cgfp(), updatesql);
				}
			}
			AggCgfpVO[] retvos = bp.update(clientFullVOs, originBills);
			// ��д��������
			for (AggCgfpVO retvo : retvos) {
				String updatesql = pk2sql.get(retvo.getParentVO().getPk_cgfp());
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

	public AggCgfpVO[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		AggCgfpVO[] bills = null;
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<AggCgfpVO> query = new BillLazyQuery<AggCgfpVO>(
					AggCgfpVO.class);
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
	public AggCgfpVO[] pubsendapprovebills(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException {
		AceCgfpSendApproveBP bp = new AceCgfpSendApproveBP();
		AggCgfpVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// �ջ�
	public AggCgfpVO[] pubunsendapprovebills(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException {
		AceCgfpUnSendApproveBP bp = new AceCgfpUnSendApproveBP();
		AggCgfpVO[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// ����
	public AggCgfpVO[] pubapprovebills(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceCgfpApproveBP bp = new AceCgfpApproveBP();
		AggCgfpVO[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// ����

	public AggCgfpVO[] pubunapprovebills(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceCgfpUnApproveBP bp = new AceCgfpUnApproveBP();
		AggCgfpVO[] retvos = bp.unApprove(clientFullVOs, originBills);
		return retvos;
	}

}