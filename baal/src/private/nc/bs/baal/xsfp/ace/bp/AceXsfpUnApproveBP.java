package nc.bs.baal.xsfp.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.xsfp.entity.AggXsfpVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceXsfpUnApproveBP {

	public AggXsfpVO[] unApprove(AggXsfpVO[] clientBills,
			AggXsfpVO[] originBills) {
		BillUpdate<AggXsfpVO> update = new BillUpdate<AggXsfpVO>();
		AggXsfpVO[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}

	private void setHeadVOStatus(AggXsfpVO[] clientBills) {
		for (AggXsfpVO clientBill : clientBills) {
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
	}
}
