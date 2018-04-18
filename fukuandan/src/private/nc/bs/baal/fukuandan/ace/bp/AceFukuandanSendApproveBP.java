package nc.bs.baal.fukuandan.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.VOStatus;

/**
 * ��׼���������BP
 */
public class AceFukuandanSendApproveBP {
  /**
   * ������
   * 
   * @param vos ����VO����
   * @param script ���ݶ����ű�����
   * @return �����ĵ���VO����
   */
  
  public AggFukuadanVO[] sendApprove(AggFukuadanVO[] clientBills,
      AggFukuadanVO[] originBills) {
      for(AggFukuadanVO clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approvestatus", 3);
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // ���ݳ־û�
    AggFukuadanVO[] returnVos =
        new BillUpdate<AggFukuadanVO>().update(clientBills, originBills);
    return returnVos;
  }
}
