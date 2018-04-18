package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.cgfp.ace.bp.AceCgfpApproveBP;
import nc.bs.baal.cgfp.plugin.bpplugin.CgfpPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.cgfp.entity.AggCgfpVO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_CGFP_APPROVE extends AbstractPfAction<AggCgfpVO> {

  public N_CGFP_APPROVE() {
    super();
  }

  @Override
  protected CompareAroundProcesser<AggCgfpVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<AggCgfpVO> processor =
        new CompareAroundProcesser<AggCgfpVO>(
            CgfpPluginPoint.APPROVE);
   IRule<AggCgfpVO> rule=null;
				  				   				     rule = new nc.bs.pubapp.pub.rule.ApproveStatusCheckRule();
				   				   				    				   				   
	   				     processor.addBeforeRule(rule);
				   				   
  
				      return processor;
  }
  
  @Override
  protected AggCgfpVO[] processBP(Object userObj,
      AggCgfpVO[] clientFullVOs, AggCgfpVO[] originBills) {
		      AggCgfpVO[] bills = null;
		      nc.itf.baal.ICgfpMaintain operator = NCLocator.getInstance().lookup(nc.itf.baal.ICgfpMaintain.class);
      try {
          bills=operator.approve(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
      return bills;
  }

}
