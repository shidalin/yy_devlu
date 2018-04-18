package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.cgfp.ace.bp.AceCgfpInsertBP;
import nc.bs.baal.cgfp.ace.bp.AceCgfpUpdateBP;
import nc.bs.baal.cgfp.plugin.bpplugin.CgfpPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.jcom.lang.StringUtil;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.cgfp.entity.AggCgfpVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_CGFP_SAVEBASE extends AbstractPfAction<AggCgfpVO> {

	@Override
	protected CompareAroundProcesser<AggCgfpVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggCgfpVO> processor = null;
		AggCgfpVO[] clientFullVOs = (AggCgfpVO[]) this.getVos();
		/*
		 * BillTransferTool<AggCgfpVO> tool = new BillTransferTool<AggCgfpVO>(
		 * clientFullVOs); clientFullVOs = tool.getClientFullInfoBill();
		 */
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<AggCgfpVO>(
					CgfpPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<AggCgfpVO>(
					CgfpPluginPoint.SCRIPT_INSERT);
		}
		// TODO 在此处添加前后规则
		IRule<AggCgfpVO> rule = null;

		return processor;
	}

	@Override
	protected AggCgfpVO[] processBP(Object userObj, AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) {

		AggCgfpVO[] bills = null;
		try {
			nc.itf.baal.ICgfpMaintain operator = NCLocator.getInstance()
					.lookup(nc.itf.baal.ICgfpMaintain.class);
			if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
					.getPrimaryKey())) {
				bills = operator.update(clientFullVOs, originBills);
			} else {
				bills = operator.insert(clientFullVOs, originBills);
			}
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}
}
