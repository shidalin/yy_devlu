package nc.bs.baal.cgfp.ace.bp;

import nc.bs.baal.cgfp.plugin.bpplugin.CgfpPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.cgfp.entity.AggCgfpVO;

/**
 * ��׼����ɾ��BP
 */
public class AceCgfpDeleteBP {

	public void delete(AggCgfpVO[] bills) {

		DeleteBPTemplate<AggCgfpVO> bp = new DeleteBPTemplate<AggCgfpVO>(
				CgfpPluginPoint.DELETE);

		// ����ִ��ǰ����
		this.addBeforeRule(bp.getAroundProcesser());
		// ����ִ�к�ҵ�����
		this.addAfterRule(bp.getAroundProcesser());
		bp.delete(bills);
	}

	private void addBeforeRule(AroundProcesser<AggCgfpVO> processer) {
		IRule<AggCgfpVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();

		processer.addBeforeRule(rule);

	}

	/**
	 * ɾ����ҵ�����
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
