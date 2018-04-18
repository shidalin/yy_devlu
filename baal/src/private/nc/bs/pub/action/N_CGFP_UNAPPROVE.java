package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.cgfp.ace.bp.AceCgfpUnApproveBP;
import nc.bs.baal.cgfp.plugin.bpplugin.CgfpPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.cgfp.entity.AggCgfpVO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_CGFP_UNAPPROVE extends AbstractPfAction<AggCgfpVO> {

  public N_CGFP_UNAPPROVE() {
    super();
  }

  @Override
  protected CompareAroundProcesser<AggCgfpVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<AggCgfpVO> processor =
        new CompareAroundProcesser<AggCgfpVO>(
            CgfpPluginPoint.UNAPPROVE);
   // TODO 在此处添加前后规则
		   IRule<AggCgfpVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				      return processor;
  }

  @Override
  protected AggCgfpVO[] processBP(Object userObj,
      AggCgfpVO[] clientFullVOs, AggCgfpVO[] originBills) {
    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		    }
		    AggCgfpVO[] bills = null;
      try {
          nc.itf.baal.ICgfpMaintain operator = NCLocator.getInstance().lookup(nc.itf.baal.ICgfpMaintain.class);
          bills=operator.unapprove(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return bills;
  }

}
