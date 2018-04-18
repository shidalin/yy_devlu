package nc.bs.baal.cgfp.ace.bp;

import nc.bs.baal.cgfp.plugin.bpplugin.CgfpPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.cgfp.entity.AggCgfpVO;

/**
 * 标准单据删除BP
 */
public class AceCgfpDeleteBP {

	public void delete(AggCgfpVO[] bills) {

		DeleteBPTemplate<AggCgfpVO> bp = new DeleteBPTemplate<AggCgfpVO>(
				CgfpPluginPoint.DELETE);

		// 增加执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 增加执行后业务规则
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggCgfpVO> processer) {
		IRule<AggCgfpVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();

		processer.addBeforeRule(rule);

	}

	/**
	 * 删除后业务规则
	 * 
	 * @param processer
	 */
	private void addAfterRule(AroundProcesser<AggCgfpVO> processer) {
		IRule<AggCgfpVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.ReturnBillCodeRule();
		((nc.bs.pubapp.pub.rule.ReturnBillCodeRule) rule).setCbilltype("CGFP");
		((nc.bs.pubapp.pub.rule.ReturnBillCodeRule) rule)
				.setCodeItem("vbillcode");
		((nc.bs.pubapp.pub.rule.ReturnBillCodeRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.ReturnBillCodeRule) rule).setOrgItem("pk_org");

		processer.addAfterRule(rule);

	}
}
