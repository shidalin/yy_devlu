package nc.bs.baal.fukuandan.ace.bp;

import nc.bs.baal.fukuandan.plugin.bpplugin.FukuandanPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.ICompareRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.fukuandan.entity.Fukuandan_bVO;

/**
 * 修改保存的BP
 * 
 */
public class AceFukuandanUpdateBP {

	public AggFukuadanVO[] update(AggFukuadanVO[] bills,
			AggFukuadanVO[] originBills) {

		// 调用修改模板
		UpdateBPTemplate<AggFukuadanVO> bp = new UpdateBPTemplate<AggFukuadanVO>(
				FukuandanPluginPoint.UPDATE);

		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggFukuadanVO> processer) {
		IRule<AggFukuadanVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("FKSQ");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");

		processer.addAfterRule(rule);

	}

	private void addBeforeRule(CompareAroundProcesser<AggFukuadanVO> processer) {
		IRule<AggFukuadanVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
		ICompareRule<AggFukuadanVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCbilltype("FKSQ");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setOrgItem("pk_org");
		processer.addBeforeRule(ruleCom);
		rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
		processer.addBeforeRule(rule);
		rule = new nc.impl.pubapp.bd.material.assistant.MarAssistantSaveRule();
		((nc.impl.pubapp.bd.material.assistant.MarAssistantSaveRule) rule)
				.setNotNullValidate("material_src");
		processer.addBeforeRule(rule);
	}

}
