package nc.bs.baal.fukuandan.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceFukuandanUnApproveBP {

	public AggFukuadanVO[] unApprove(AggFukuadanVO[] clientBills,
			AggFukuadanVO[] originBills) {
		this.setHeadVOStatus(clientBills);
		BillUpdate<AggFukuadanVO> update = new BillUpdate<AggFukuadanVO>();
		AggFukuadanVO[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}

	private void setHeadVOStatus(AggFukuadanVO[] clientBills) {
		for (AggFukuadanVO clientBill : clientBills) {
			clientBill.getParentVO().setAttributeValue("approvestatus", -1);
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
	}
}
