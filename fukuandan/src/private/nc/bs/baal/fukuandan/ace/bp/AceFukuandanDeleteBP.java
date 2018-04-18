package nc.bs.baal.fukuandan.ace.bp;

import nc.bs.baal.fukuandan.plugin.bpplugin.FukuandanPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.fukuandan.entity.AggFukuadanVO;

/**
 * ��׼����ɾ��BP
 */
public class AceFukuandanDeleteBP {

	public void delete(AggFukuadanVO[] bills) {

		DeleteBPTemplate<AggFukuadanVO> bp = new DeleteBPTemplate<AggFukuadanVO>(
				FukuandanPluginPoint.DELETE);

		// ����ִ��ǰ����
		this.addBeforeRule(bp.getAroundProcesser());
		// ����ִ�к�ҵ�����
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggFukuadanVO> processer) {
		IRule<AggFukuadanVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();

		processer.addBeforeRule(rule);

	}

	/**
	 * ɾ����ҵ�����
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
