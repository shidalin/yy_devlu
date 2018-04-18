package nc.ui.baal.cgfp.action;

import nc.desktop.ui.ServerTimeProxy;
import nc.ui.pubapp.uif2app.actions.intf.ICopyActionProcessor;
import nc.vo.cgfp.entity.AggCgfpVO;
import nc.vo.cgfp.entity.CgfpHVO;
import nc.vo.pu.pub.enumeration.POEnumBillStatus;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.uif2.LoginContext;
/**
 * 单据复制时表头表体处理
 * 
 * @since 6.0
 * @version 2011-7-7 下午02:31:23
 * @author duy
 */
public class CopyActionProcessor implements ICopyActionProcessor<AggCgfpVO> {

  @Override
  public void processVOAfterCopy(AggCgfpVO billVO, LoginContext context) {
    this.processHeadVO(billVO, context);
    this.processBodyVO(billVO);
  }

  private void processBodyVO(AggCgfpVO vo) {
  	  vo.getParent().setAttributeValue(
    vo.getMetaData().getParent().getPrimaryAttribute().getName(), null);
    vo.getParent().setAttributeValue("ts", null);
    for (IVOMeta meta : vo.getMetaData().getChildren()) {
      if(vo.getChildren(meta)==null)
      			     continue;
      for (ISuperVO childvo : vo.getChildren(meta)) {
          childvo.setAttributeValue(meta.getPrimaryAttribute().getName(), null);
          childvo.setAttributeValue("pk_group", null);
          childvo.setAttributeValue("pk_org", null);
          childvo.setAttributeValue("ts", null);
      }
    }
  }

  private void processHeadVO(AggCgfpVO vo, LoginContext context) {
    UFDateTime datetime = ServerTimeProxy.getInstance().getServerTime();
    CgfpHVO hvo = vo.getParentVO();
    // 设置空处理
    hvo.setVbillcode(null);
    hvo.setApprover(null);
    hvo.setTaudittime(null);
    hvo.setModifier(null);
    hvo.setModifiedtime(null);
    hvo.setCreator(null);
    hvo.setCreationtime(null);
    //hvo.setTs(null);
    // 设置默认值
    hvo.setDbilldate(datetime.getDate());
    hvo.setPk_group(context.getPk_group());
    hvo.setPk_org(context.getPk_org());
    hvo.setAttributeValue("fbillstatus", nc.vo.pub.pf.BillStatusEnum.FREE.value());
  }

}
