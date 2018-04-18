package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.xsfp.ace.bp.AceXsfpDeleteBP;
import nc.bs.baal.xsfp.plugin.bpplugin.XsfpPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.xsfp.entity.AggXsfpVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_XSFP_DELETE extends AbstractPfAction<AggXsfpVO> {

  @Override
  protected CompareAroundProcesser<AggXsfpVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<AggXsfpVO> processor =
      new CompareAroundProcesser<AggXsfpVO>(XsfpPluginPoint.SCRIPT_DELETE);
    // TODO 在此处添加前后规则
   IRule<AggXsfpVO> rule=null;
				  
				      return processor;
  }

  @Override
  protected AggXsfpVO[] processBP(Object userObj,
      AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills) {
    nc.itf.baal.IXsfpMaintain operator = NCLocator.getInstance().lookup(nc.itf.baal.IXsfpMaintain.class);
    try {
          operator.delete(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return clientFullVOs;
  }

}
