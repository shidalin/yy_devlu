package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.xsfp.ace.bp.AceXsfpUnApproveBP;
import nc.bs.baal.xsfp.plugin.bpplugin.XsfpPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.xsfp.entity.AggXsfpVO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_XSFP_UNAPPROVE extends AbstractPfAction<AggXsfpVO> {

  public N_XSFP_UNAPPROVE() {
    super();
  }

  @Override
  protected CompareAroundProcesser<AggXsfpVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<AggXsfpVO> processor =
        new CompareAroundProcesser<AggXsfpVO>(
            XsfpPluginPoint.UNAPPROVE);
   // TODO 在此处添加前后规则
		   IRule<AggXsfpVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				      return processor;
  }

  @Override
  protected AggXsfpVO[] processBP(Object userObj,
      AggXsfpVO[] clientFullVOs, AggXsfpVO[] originBills) {
    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		    }
		    AggXsfpVO[] bills = null;
      try {
          nc.itf.baal.IXsfpMaintain operator = NCLocator.getInstance().lookup(nc.itf.baal.IXsfpMaintain.class);
          bills=operator.unapprove(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return bills;
  }

}
