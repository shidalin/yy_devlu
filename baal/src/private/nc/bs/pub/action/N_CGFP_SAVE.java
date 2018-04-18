package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.cgfp.ace.bp.AceCgfpSendApproveBP;
import nc.bs.baal.cgfp.plugin.bpplugin.CgfpPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.cgfp.entity.AggCgfpVO;
import nc.vo.pu.pub.enumeration.POEnumBillStatus;
import nc.vo.pub.VOStatus;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.pf.IPfRetCheckInfo;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_CGFP_SAVE extends AbstractPfAction<AggCgfpVO> {
	public N_CGFP_SAVE() {
		super();
	}

	protected CompareAroundProcesser<AggCgfpVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggCgfpVO> processor = new CompareAroundProcesser<AggCgfpVO>(
				CgfpPluginPoint.SEND_APPROVE);
		// TODO 在此处添加审核前后规则
		IRule<AggCgfpVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.CommitStatusCheckRule();

		processor.addBeforeRule(rule);

		return processor;
	}

	@Override
	protected AggCgfpVO[] processBP(Object userObj, AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) {
		nc.itf.baal.ICgfpMaintain operator = NCLocator.getInstance().lookup(
				nc.itf.baal.ICgfpMaintain.class);
		AggCgfpVO[] bills = null;
		try {
			bills = operator.save(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
