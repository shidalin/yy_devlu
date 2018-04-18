package nc.bs.baal.cgfp.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.cgfp.entity.AggCgfpVO;

/**
 * 标准单据审核的BP
 */
public class AceCgfpApproveBP {

  /**
   * 审核动作
   * 
   * @param vos
   * @param script
   * @return
   */
  

  public AggCgfpVO[] approve(AggCgfpVO[] clientBills,
      AggCgfpVO[] originBills) {
    BillUpdate<AggCgfpVO> update = new BillUpdate<AggCgfpVO>();
    AggCgfpVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
}
