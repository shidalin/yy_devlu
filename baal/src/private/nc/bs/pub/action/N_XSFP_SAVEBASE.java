package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.xsfp.ace.bp.AceXsfpInsertBP;
import nc.bs.baal.xsfp.ace.bp.AceXsfpUpdateBP;
import nc.bs.baal.xsfp.plugin.bpplugin.XsfpPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.jcom.lang.StringUtil;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.xsfp.entity.AggXsfpVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_XSFP_SAVEBASE extends AbstractPfAction<AggXsfpVO> {

	@Override
	protected CompareAroundProcesser<AggXsfpVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggXsfpVO> processor = null;
		AggXsfpVO[] clientFullVOs = (AggXsfpVO[]) this.getVos();
		/*
		 * BillTransferTool<AggXsfpVO> tool = new BillTransferTool<AggXsfpVO>(
		 * clientFullVOs); clientFullVOs = tool.getClientFullInfoBill();
		 */
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<AggXsfpVO>(
					XsfpPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<AggXsfpVO>(
					XsfpPluginPoint.SCRIPT_INSERT);
		}
		// TODO 在此处添加前后规则
		IRule<AggXsfpVO> rule = null;

		return processor;
	}

	@Override
	protected AggXsfpVO[] processBP(Object userObj, AggXsfpVO[] clientFullVOs,
			AggXsfpVO[] originBills) {

		AggXsfpVO[] bills = null;
		try {
			nc.itf.baal.IXsfpMaintain operator = NCLocator.getInstance()
					.lookup(nc.itf.baal.IXsfpMaintain.class);
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
