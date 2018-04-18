package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.baal.fukuandan.ace.bp.AceFukuandanSendApproveBP;
import nc.bs.baal.fukuandan.plugin.bpplugin.FukuandanPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.VOStatus;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.pf.IPfRetCheckInfo;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_FKSQ_SAVE extends AbstractPfAction<AggFukuadanVO> {
  public N_FKSQ_SAVE() {
    super();
  }

  protected CompareAroundProcesser<AggFukuadanVO> getCompareAroundProcesserWithRules(
	      Object userObj) {
	    CompareAroundProcesser<AggFukuadanVO> processor = new CompareAroundProcesser<AggFukuadanVO>(
	        		FukuandanPluginPoint.SEND_APPROVE);
	    // TODO 在此处添加审核前后规则
	   IRule<AggFukuadanVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.CommitStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				  	    return processor;
	  }
  @Override
  protected AggFukuadanVO[] processBP(Object userObj,AggFukuadanVO[] clientFullVOs,
		      AggFukuadanVO[] originBills) {
		      nc.itf.baal.IFukuandanMaintain operator = NCLocator.getInstance().lookup(nc.itf.baal.IFukuandanMaintain.class);
      AggFukuadanVO[] bills = null;
      try {
          bills=operator.save(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
      return bills;
  }

}
