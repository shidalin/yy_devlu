package nc.bs.baal.xsfp.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.xsfp.entity.AggXsfpVO;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceXsfpUnSendApproveBP {
	public AggXsfpVO[] unSend(AggXsfpVO[] clientBills, AggXsfpVO[] originBills) {
		// 把VO持久化到数据库中
		this.setHeadVOStatus(clientBills);
		BillUpdate<AggXsfpVO> update = new BillUpdate<AggXsfpVO>();
		AggXsfpVO[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}

	private void setHeadVOStatus(AggXsfpVO[] clientBills) {
		for (AggXsfpVO clientBill : clientBills) {
			clientBill.getParentVO().setAttributeValue("vbillstatus",
					BillStatusEnum.FREE.value());
			clientBill.getParentVO().setStatus(VOStatus.UPDATED);
		}
	}
}
