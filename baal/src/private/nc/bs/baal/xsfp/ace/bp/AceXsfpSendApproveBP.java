package nc.bs.baal.xsfp.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.xsfp.entity.AggXsfpVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * ��׼���������BP
 */
public class AceXsfpSendApproveBP {
	/**
	 * ������
	 * 
	 * @param vos
	 *            ����VO����
	 * @param script
	 *            ���ݶ����ű�����
	 * @return �����ĵ���VO����
	 */

	public AggXsfpVO[] sendApprove(AggXsfpVO[] clientBills,
			AggXsfpVO[] originBills) {
		for (AggXsfpVO clientFullVO : clientBills) {
			clientFullVO.getParentVO().setAttributeValue("vbillstatus",
					BillStatusEnum.COMMIT.value());
			clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
		}
		// ���ݳ־û�
		AggXsfpVO[] returnVos = new BillUpdate<AggXsfpVO>().update(clientBills,
				originBills);
		return returnVos;
	}
}
