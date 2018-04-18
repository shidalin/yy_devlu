package nc.bs.baal.xsfp.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.xsfp.entity.AggXsfpVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据审核的BP
 */
public class AceXsfpApproveBP {

  /**
   * 审核动作
   * 
   * @param vos
   * @param script
   * @return
   */
  

  public AggXsfpVO[] approve(AggXsfpVO[] clientBills,
      AggXsfpVO[] originBills) {
    BillUpdate<AggXsfpVO> update = new BillUpdate<AggXsfpVO>();
    AggXsfpVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
}
