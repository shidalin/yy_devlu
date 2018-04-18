package nc.bs.baal.cgfp.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.cgfp.entity.AggCgfpVO;
import nc.vo.pu.pub.enumeration.POEnumBillStatus;
import nc.vo.pub.VOStatus;

/**
 * 标准单据送审的BP
 */
public class AceCgfpSendApproveBP {
	/**
	 * 送审动作
	 * 
	 * @param vos
	 *            单据VO数组
	 * @param script
	 *            单据动作脚本对象
	 * @return 送审后的单据VO数组
	 */

	public AggCgfpVO[] sendApprove(AggCgfpVO[] clientBills,
			AggCgfpVO[] originBills) {
		for (AggCgfpVO clientFullVO : clientBills) {
			clientFullVO.getParentVO().setAttributeValue("fbillstatus",
					nc.vo.pub.pf.BillStatusEnum.COMMIT.value());
			clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
		}
		// 数据持久化
		AggCgfpVO[] returnVos = new BillUpdate<AggCgfpVO>().update(clientBills,
				originBills);
		return returnVos;
	}
}
