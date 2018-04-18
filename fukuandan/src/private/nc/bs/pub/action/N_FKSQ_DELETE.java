package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.fukuandan.ace.bp.AceFukuandanDeleteBP;
import nc.bs.baal.fukuandan.plugin.bpplugin.FukuandanPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_FKSQ_DELETE extends AbstractPfAction<AggFukuadanVO> {

  @Override
  protected CompareAroundProcesser<AggFukuadanVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<AggFukuadanVO> processor =
      new CompareAroundProcesser<AggFukuadanVO>(FukuandanPluginPoint.SCRIPT_DELETE);
    // TODO 在此处添加前后规则
   IRule<AggFukuadanVO> rule=null;
				  
				      return processor;
  }

  @Override
  protected AggFukuadanVO[] processBP(Object userObj,
      AggFukuadanVO[] clientFullVOs,AggFukuadanVO[] originBills) {
    nc.itf.baal.IFukuandanMaintain operator = NCLocator.getInstance().lookup(nc.itf.baal.IFukuandanMaintain.class);
    try {
          operator.delete(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return clientFullVOs;
  }

}
