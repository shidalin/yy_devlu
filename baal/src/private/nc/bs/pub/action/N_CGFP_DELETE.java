package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.cgfp.ace.bp.AceCgfpDeleteBP;
import nc.bs.baal.cgfp.plugin.bpplugin.CgfpPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.cgfp.entity.AggCgfpVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_CGFP_DELETE extends AbstractPfAction<AggCgfpVO> {

  @Override
  protected CompareAroundProcesser<AggCgfpVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<AggCgfpVO> processor =
      new CompareAroundProcesser<AggCgfpVO>(CgfpPluginPoint.SCRIPT_DELETE);
    // TODO 在此处添加前后规则
   IRule<AggCgfpVO> rule=null;
				  
				      return processor;
  }

  @Override
  protected AggCgfpVO[] processBP(Object userObj,
      AggCgfpVO[] clientFullVOs,AggCgfpVO[] originBills) {
    nc.itf.baal.ICgfpMaintain operator = NCLocator.getInstance().lookup(nc.itf.baal.ICgfpMaintain.class);
    try {
          operator.delete(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return clientFullVOs;
  }

}
