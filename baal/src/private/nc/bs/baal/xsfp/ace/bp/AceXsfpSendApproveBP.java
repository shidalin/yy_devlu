package nc.bs.baal.xsfp.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.xsfp.entity.AggXsfpVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * 标准单据送审的BP
 */
public class AceXsfpSendApproveBP {
	/**
	 * 送审动作
	 * 
	 * @param vos
	 *            单据VO数组
	 * @param script
	 *            单据动作脚本对象
	 * @return 送审后的单据VO数组
	 */

	public AggXsfpVO[] sendApprove(AggXsfpVO[] clientBills,
			AggXsfpVO[] originBills) {
		for (AggXsfpVO clientFullVO : clientBills) {
			clientFullVO.getParentVO().setAttributeValue("vbillstatus",
					BillStatusEnum.COMMIT.value());
			clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
		}
		// 数据持久化
		AggXsfpVO[] returnVos = new BillUpdate<AggXsfpVO>().update(clientBills,
				originBills);
		return returnVos;
	}
}
