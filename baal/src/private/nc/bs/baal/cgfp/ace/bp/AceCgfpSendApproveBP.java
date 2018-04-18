package nc.bs.baal.cgfp.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.cgfp.entity.AggCgfpVO;
import nc.vo.pu.pub.enumeration.POEnumBillStatus;
import nc.vo.pub.VOStatus;

/**
 * ��׼���������BP
 */
public class AceCgfpSendApproveBP {
	/**
	 * ������
	 * 
	 * @param vos
	 *            ����VO����
	 * @param script
	 *            ���ݶ����ű�����
	 * @return �����ĵ���VO����
	 */

	public AggCgfpVO[] sendApprove(AggCgfpVO[] clientBills,
			AggCgfpVO[] originBills) {
		for (AggCgfpVO clientFullVO : clientBills) {
			clientFullVO.getParentVO().setAttributeValue("fbillstatus",
					nc.vo.pub.pf.BillStatusEnum.COMMIT.value());
			clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
		}
		// ���ݳ־û�
		AggCgfpVO[] returnVos = new BillUpdate<AggCgfpVO>().update(clientBills,
				originBills);
		return returnVos;
	}
}
