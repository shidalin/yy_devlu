package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.fukuandan.ace.bp.AceFukuandanInsertBP;
import nc.bs.baal.fukuandan.ace.bp.AceFukuandanUpdateBP;
import nc.bs.baal.fukuandan.plugin.bpplugin.FukuandanPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.jcom.lang.StringUtil;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_FKSQ_SAVEBASE extends AbstractPfAction<AggFukuadanVO> {

	@Override
	protected CompareAroundProcesser<AggFukuadanVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggFukuadanVO> processor = null;
		AggFukuadanVO[] clientFullVOs = (AggFukuadanVO[]) this.getVos();
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<AggFukuadanVO>(
					FukuandanPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<AggFukuadanVO>(
					FukuandanPluginPoint.SCRIPT_INSERT);
		}
		// TODO 在此处添加前后规则
		IRule<AggFukuadanVO> rule = null;

		return processor;
	}

	@Override
	protected AggFukuadanVO[] processBP(Object userObj,
			AggFukuadanVO[] clientFullVOs, AggFukuadanVO[] originBills) {
		AggFukuadanVO[] bills = null;
		try {
			nc.itf.baal.IFukuandanMaintain operator = NCLocator.getInstance()
					.lookup(nc.itf.baal.IFukuandanMaintain.class);
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
