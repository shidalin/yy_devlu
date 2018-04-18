package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.fukuandan.ace.bp.AceFukuandanUnSendApproveBP;
import nc.bs.baal.fukuandan.plugin.bpplugin.FukuandanPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_FKSQ_UNSAVEBILL extends AbstractPfAction<AggFukuadanVO> {

  public N_FKSQ_UNSAVEBILL() {
    super();
  }

  @Override
  protected CompareAroundProcesser<AggFukuadanVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<AggFukuadanVO> processor =
        new CompareAroundProcesser<AggFukuadanVO>(
            FukuandanPluginPoint.UNSEND_APPROVE);
   // TODO 在此处添加前后规则
		   IRule<AggFukuadanVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.UncommitStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				      return processor;
  }

  @Override
  protected AggFukuadanVO[] processBP(Object userObj,
      AggFukuadanVO[] clientFullVOs, AggFukuadanVO[] originBills) {
    nc.itf.baal.IFukuandanMaintain operator = NCLocator.getInstance().lookup(nc.itf.baal.IFukuandanMaintain.class);
    AggFukuadanVO[] bills = null;
      try {
          bills=operator.unsave(clientFullVOs, originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return bills;
  }

}
