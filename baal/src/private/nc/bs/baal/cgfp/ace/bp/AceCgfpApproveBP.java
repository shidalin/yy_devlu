package nc.bs.baal.cgfp.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.cgfp.entity.AggCgfpVO;

/**
 * ��׼������˵�BP
 */
public class AceCgfpApproveBP {

  /**
   * ��˶���
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
