package nc.bs.baal.fukuandan.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.pub.VOStatus;
import nc.vo.arap.pub.BillEnumCollection;

/**
 * ��׼�����ջص�BP
 */
public class AceFukuandanUnSendApproveBP {
  public AggFukuadanVO[] unSend(AggFukuadanVO[] clientBills,
      AggFukuadanVO[] originBills) {
    // ��VO�־û������ݿ���
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
