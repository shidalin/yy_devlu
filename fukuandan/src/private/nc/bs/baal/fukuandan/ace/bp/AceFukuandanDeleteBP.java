package nc.bs.baal.fukuandan.ace.bp;

import nc.bs.baal.fukuandan.plugin.bpplugin.FukuandanPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.fukuandan.entity.AggFukuadanVO;

/**
 * 标准单据删除BP
 */
public class AceFukuandanDeleteBP {

	public void delete(AggFukuadanVO[] bills) {

		DeleteBPTemplate<AggFukuadanVO> bp = new DeleteBPTemplate<AggFukuadanVO>(
				FukuandanPluginPoint.DELETE);

		// 增加执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggFukuadanVO> processer) {
		IRule<AggFukuadanVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();

		processer.addBeforeRule(rule);

	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggFukuadanVO> processer) {
		IRule<AggFukuadanVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.ReturnBillCodeRule();
		((nc.bs.pubapp.pub.rule.ReturnBillCodeRule) rule).setCbilltype("FKSQ");
		((nc.bs.pubapp.pub.rule.ReturnBillCodeRule) rule).setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.ReturnBillCodeRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.ReturnBillCodeRule) rule).setOrgItem("pk_org");

		processer.addAfterRule(rule);

	}
}
