package nc.bs.baal.xsfp.ace.bp;

import nc.bs.baal.xsfp.plugin.bpplugin.XsfpPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.ICompareRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.xsfp.entity.AggXsfpVO;

/**
 * 修改保存的BP
 * 
 */
public class AceXsfpUpdateBP {

	public AggXsfpVO[] update(AggXsfpVO[] bills, AggXsfpVO[] originBills) {

		// 调用修改模板
		UpdateBPTemplate<AggXsfpVO> bp = new UpdateBPTemplate<AggXsfpVO>(
				XsfpPluginPoint.UPDATE);

		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggXsfpVO> processer) {
		IRule<AggXsfpVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("XSFP");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setCodeItem("vbillcode");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");

		processer.addAfterRule(rule);

	}

	private void addBeforeRule(CompareAroundProcesser<AggXsfpVO> processer) {
		IRule<AggXsfpVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
		ICompareRule<AggXsfpVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCbilltype("XSFP");
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
				.setNotNullValidate("cmaterialvid");
		processer.addBeforeRule(rule);
	}

}
