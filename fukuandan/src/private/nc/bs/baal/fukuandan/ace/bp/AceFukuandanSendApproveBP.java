package nc.bs.baal.fukuandan.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.VOStatus;

/**
 * 标准单据送审的BP
 */
public class AceFukuandanSendApproveBP {
  /**
   * 送审动作
   * 
   * @param vos 单据VO数组
   * @param script 单据动作脚本对象
   * @return 送审后的单据VO数组
   */
  
  public AggFukuadanVO[] sendApprove(AggFukuadanVO[] clientBills,
      AggFukuadanVO[] originBills) {
      for(AggFukuadanVO clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approvestatus", 3);
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // 数据持久化
    AggFukuadanVO[] returnVos =
        new BillUpdate<AggFukuadanVO>().update(clientBills, originBills);
    return returnVos;
  }
}
