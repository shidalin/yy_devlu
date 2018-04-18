package nc.bs.baal.fukuandan.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据审核的BP
 */
public class AceFukuandanApproveBP {

  /**
   * 审核动作
   * 
   * @param vos
   * @param script
   * @return
   */
  

  public AggFukuadanVO[] approve(AggFukuadanVO[] clientBills,
      AggFukuadanVO[] originBills) {
	  this.setHeadVOStatus(clientBills);
    BillUpdate<AggFukuadanVO> update = new BillUpdate<AggFukuadanVO>();
    AggFukuadanVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(AggFukuadanVO[] clientBills) {
      for (AggFukuadanVO clientBill : clientBills) {
      clientBill.getParentVO().setAttributeValue("approvestatus", 1);
          clientBill.getParentVO().setStatus(VOStatus.UPDATED);
      }
  }
  
}
