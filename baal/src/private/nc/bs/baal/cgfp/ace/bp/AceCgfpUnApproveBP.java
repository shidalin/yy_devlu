package nc.bs.baal.cgfp.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.cgfp.entity.AggCgfpVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceCgfpUnApproveBP {

  public AggCgfpVO[] unApprove(AggCgfpVO[] clientBills,
      AggCgfpVO[] originBills) {
    BillUpdate<AggCgfpVO> update = new BillUpdate<AggCgfpVO>();
    AggCgfpVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(AggCgfpVO[] clientBills) {
        for (AggCgfpVO clientBill : clientBills) {
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
