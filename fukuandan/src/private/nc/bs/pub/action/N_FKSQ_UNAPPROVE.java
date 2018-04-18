package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.fukuandan.ace.bp.AceFukuandanUnApproveBP;
import nc.bs.baal.fukuandan.plugin.bpplugin.FukuandanPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_FKSQ_UNAPPROVE extends AbstractPfAction<AggFukuadanVO> {

	public N_FKSQ_UNAPPROVE() {
		super();
	}

	@Override
	protected CompareAroundProcesser<AggFukuadanVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggFukuadanVO> processor = new CompareAroundProcesser<AggFukuadanVO>(
				FukuandanPluginPoint.UNAPPROVE);
		// TODO 在此处添加前后规则
		IRule<AggFukuadanVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule();

		processor.addBeforeRule(rule);

		return processor;
	}

	@Override
	protected AggFukuadanVO[] processBP(Object userObj,
			AggFukuadanVO[] clientFullVOs, AggFukuadanVO[] originBills) {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AggFukuadanVO[] bills = null;
		try {
			nc.itf.baal.IFukuandanMaintain operator = NCLocator.getInstance()
					.lookup(nc.itf.baal.IFukuandanMaintain.class);
			bills = operator.unapprove(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
