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
	// 新增
	public AggCgfpVO[] pubinsertBills(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException {
		PersistenceManager manager = null;
		JdbcSession session = null;
		try {
			// 数据库中数据和前台传递过来的差异VO合并后的结果
			BillTransferTool<AggCgfpVO> transferTool = new BillTransferTool<AggCgfpVO>(
					clientFullVOs);
			// 调用BP
			AceCgfpInsertBP action = new AceCgfpInsertBP();
			// 上游数据回写
			// 上游单据主表def1=下游采购发票剩余合同计税金额
			// 下游单据主表def1=上游其他付主表主键,
			// 下游单据主表def2=上游其他付剩余合同计税金额
			manager = PersistenceManager.getInstance();
			session = manager.getJdbcSession();
			// 拉单数据库回写数据操作
			for (AggCgfpVO retvo : clientFullVOs) {
				String usql = "update ct_ap t set t.vdef1 = '";
				if (retvo.getParentVO().getVdef1() != null
						&& !retvo.getParentVO().getVdef1().trim().equals("")) {// 拉单数据操作
					String obj = retvo.getParentVO().getVdef2();// 上游的剩余单据计税金额
					if (obj == null) {
						// 查询上游价税合计之和
						String querysql = "select sum(norigtaxmny) from ct_ap_b where nvl(dr,0)=0 and pk_ct_ap = '"
								+ retvo.getParentVO().getVdef1() + "'";
						Object sum_src = session.executeQuery(querysql,
								new ColumnProcessor());
						obj = sum_src.toString();
					}
					// 当前已开价税合计
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
						throw new BusinessException("发票金额超过上游单据可开发票最大金额");
					}
					retvo.getParentVO().setVdef2(new Double(dif).toString());
					// 回写上游可开价税合计
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
				manager.release();// 关闭和释放连接会话
		}
		return null;
	}

	// 删除
	public void pubdeleteBills(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException {
		PersistenceManager manager = null;
		JdbcSession session = null;
		try {
			// 调用BP
			new AceCgfpDeleteBP().delete(clientFullVOs);
			// 删除发票恢复上游单据可开发票金额
			manager = PersistenceManager.getInstance();
			session = manager.getJdbcSession();
			// 拉单数据库回写数据操作
			for (AggCgfpVO retvo : clientFullVOs) {
				String usql = "update ct_ap t set t.vdef1 = '";
				String qsql = "select t.vdef1 from ct_ap t where nvl(t.dr,0)=0  and  t.pk_ct_ap = '";
				if (retvo.getParentVO().getVdef1() != null
						&& !retvo.getParentVO().getVdef1().trim().equals("")) {// 拉单数据操作
					qsql += retvo.getParentVO().getVdef1() + "'";
					// 上游剩余可开金额
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
					// 还原累加上下游删除数据价税合计
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
				manager.release();// 关闭和释放连接会话
		}
	}

	// 修改
	public AggCgfpVO[] pubupdateBills(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException {
		try {
			// 加锁 + 检查ts
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
					// 修改后的价税合计-修改前的价税合计
					double dif_ = sum_client - sum_origin;
					if (sum_client < 0) {
						throw new BusinessException("发票金额不可以为负数");
					}
					if (dif_ > 0) {
						double dif = new Double(agg.getParentVO().getVdef2()
								.toString())
								- dif_;
						if (dif < 0) {
							throw new BusinessException("发票金额超过上游单据可开发票最大金额");
						}
						// 设置新的值
						agg.getParentVO().setVdef2(new Double(dif).toString());
					} else if (dif_ < 0) {
						double dif = new Double(agg.getParentVO().getVdef2()
								.toString())
								- dif_;
						// 设置新的值
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
			// 回写上游数据
			for (AggCgfpVO retvo : retvos) {
				String updatesql = pk2sql.get(retvo.getParentVO().getPk_cgfp());
				if (updatesql != null) {
					dao.executeUpdate(updatesql);
				}
			}
			dao.executeUpdate(sql2);
			// 构造返回数据
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
	 * 由子类实现，查询之前对queryScheme进行加工，加入自己的逻辑
	 * 
	 * @param queryScheme
	 */
	protected void preQuery(IQueryScheme queryScheme) {
		// 查询之前对queryScheme进行加工，加入自己的逻辑
	}

	// 提交
	public AggCgfpVO[] pubsendapprovebills(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException {
		AceCgfpSendApproveBP bp = new AceCgfpSendApproveBP();
		AggCgfpVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// 收回
	public AggCgfpVO[] pubunsendapprovebills(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException {
		AceCgfpUnSendApproveBP bp = new AceCgfpUnSendApproveBP();
		AggCgfpVO[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// 审批
	public AggCgfpVO[] pubapprovebills(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceCgfpApproveBP bp = new AceCgfpApproveBP();
		AggCgfpVO[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// 弃审

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