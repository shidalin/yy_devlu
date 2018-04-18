package nc.ui.baal.cgfp.ace.handler;

import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.billform.AddEvent;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.vo.ic.pub.pf.billtype.BillTypeInfoQuery;
import nc.vo.pubapp.AppContext;

public class AceAddHandler implements IAppEventHandler<AddEvent> {

  @Override
  public void handleAppEvent(AddEvent e) {
    String pk_group = e.getContext().getPk_group();
	String pk_org = null;
	try {
		pk_org = nc.pubitf.setting.defaultdata.OrgSettingAccessor
				.getDefaultOrgUnit();
		throw new Exception();
	} catch (Exception e2) {
	}
    BillCardPanel panel = e.getBillForm().getBillCardPanel();
	    //设置主组织默认值
    panel.setHeadItem("pk_group", pk_group); 
    panel.setHeadItem("pk_org", pk_org); 
    //设置单据状态、日期默认值
    panel.setHeadItem("fbillstatus", nc.vo.pub.pf.BillStatusEnum.FREE.value());
    panel.setHeadItem("dbilldate", AppContext.getInstance().getBusiDate());
    //String typeid = new BillTypeInfoQuery().getPk_billtypeidByCode("CGFP");
	panel.setHeadItem("ctrantypeid ", "CGFP");
	panel.setHeadItem("vtrantypecode ", "CGFP");
  }

}
