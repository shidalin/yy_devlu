package nc.bs.baal.xsfp.ace.bp;

import nc.bs.baal.xsfp.plugin.bpplugin.XsfpPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.ICompareRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.xsfp.entity.AggXsfpVO;

/**
 * �޸ı����BP
 * 
 */
public class AceXsfpUpdateBP {

	public AggXsfpVO[] update(AggXsfpVO[] bills, AggXsfpVO[] originBills) {

		// �����޸�ģ��
		UpdateBPTemplate<AggXsfpVO> bp = new UpdateBPTemplate<AggXsfpVO>(
				XsfpPluginPoint.UPDATE);

		// ִ��ǰ����
		this.addBeforeRule(bp.getAroundProcesser());
		// ִ�к����
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
