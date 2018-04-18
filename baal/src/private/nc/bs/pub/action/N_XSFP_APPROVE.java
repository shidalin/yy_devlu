package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.xsfp.ace.bp.AceXsfpApproveBP;
import nc.bs.baal.xsfp.plugin.bpplugin.XsfpPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.xsfp.entity.AggXsfpVO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_XSFP_APPROVE extends AbstractPfAction<AggXsfpVO> {

  public N_XSFP_APPROVE() {
    super();
  }

  @Override
  protected CompareAroundProcesser<AggXsfpVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<AggXsfpVO> processor =
        new CompareAroundProcesser<AggXsfpVO>(
            XsfpPluginPoint.APPROVE);
   IRule<AggXsfpVO> rule=null;
				  				   				     rule = new nc.bs.pubapp.pub.rule.ApproveStatusCheckRule();
				   				   				    				   				   
	   				     processor.addBeforeRule(rule);
				   				   
  
				      return processor;
  }
  
  @Override
  protected AggXsfpVO[] processBP(Object userObj,
      AggXsfpVO[] clientFullVOs, AggXsfpVO[] originBills) {
		      AggXsfpVO[] bills = null;
		      nc.itf.baal.IXsfpMaintain operator = NCLocator.getInstance().lookup(nc.itf.baal.IXsfpMaintain.class);
      try {
          bills=operator.approve(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
      return bills;
  }

}
