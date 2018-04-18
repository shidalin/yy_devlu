package nc.bs.baal.cgfp.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.cgfp.entity.AggCgfpVO;
import nc.vo.pub.VOStatus;
import nc.vo.pu.pub.enumeration.POEnumBillStatus;

/**
 * 标准单据收回的BP
 */
public class AceCgfpUnSendApproveBP {
	public AggCgfpVO[] unSend(AggCgfpVO[] clientBills, AggCgfpVO[] originBills) {
		// 把VO持久化到数据库中
		this.setHeadVOStatus(clientBills);
		BillUpdate<AggCgfpVO> update = new BillUpdate<AggCgfpVO>();
		AggCgfpVO[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}

	private void setHeadVOStatus(AggCgfpVO[] clientBills) {
		for (AggCgfpVO clientBill : clientBills) {
			clientBill.getParentVO().setAttributeValue("fbillstatus",
					nc.vo.pub.pf.BillStatusEnum.FREE.value());
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
	}
}
