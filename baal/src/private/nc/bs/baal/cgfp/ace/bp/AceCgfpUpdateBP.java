package nc.bs.baal.cgfp.ace.bp;

import nc.bs.baal.cgfp.plugin.bpplugin.CgfpPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.ICompareRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.cgfp.entity.AggCgfpVO;

/**
 * 修改保存的BP
 * 
 */
public class AceCgfpUpdateBP {

	public AggCgfpVO[] update(AggCgfpVO[] bills, AggCgfpVO[] originBills) {

		// 调用修改模板
		UpdateBPTemplate<AggCgfpVO> bp = new UpdateBPTemplate<AggCgfpVO>(
				CgfpPluginPoint.UPDATE);

		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggCgfpVO> processer) {
		IRule<AggCgfpVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("CGFP");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setCodeItem("vbillcode");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");

		processer.addAfterRule(rule);

	}

	private void addBeforeRule(CompareAroundProcesser<AggCgfpVO> processer) {
		IRule<AggCgfpVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
		ICompareRule<AggCgfpVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCbilltype("CGFP");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCodeItem("vbillcode");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setOrgItem("pk_org");
		processer.addBeforeRule(ruleCom);
		rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
		processer.addBeforeRule(rule);
		rule = new nc.impl.pubapp.bd.material.assistant.MarAssistantSaveRule();
		((nc.impl.pubapp.bd.material.assistant.MarAssistantSaveRule) rule)
				.setNotNullValidate("pk_material");
		processer.addBeforeRule(rule);
	}

}
