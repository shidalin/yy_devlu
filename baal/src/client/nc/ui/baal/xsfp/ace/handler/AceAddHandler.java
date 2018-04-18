package nc.ui.baal.xsfp.ace.handler;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.billform.AddEvent;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.vo.ic.pub.pf.billtype.BillTypeInfoQuery;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pf.BillStatusEnum;
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
		// 设置主组织默认值
		panel.setHeadItem("pk_group", pk_group);
		panel.setHeadItem("pk_org", pk_org);
		// 设置单据状态、日期默认值
		panel.setHeadItem("vbillstatus", BillStatusEnum.FREE.value());
		panel.setHeadItem("dbilldate", AppContext.getInstance().getBusiDate());
		// String typeid = new
		// BillTypeInfoQuery().getPk_billtypeidByCode("XSFP");
		panel.setHeadItem("ctrantypeid ", "XSFP");
		panel.setHeadItem("vtrantypecode ", "XSFP");
		String qsql = "select t.pk_supplier from bd_customer t where nvl(t.dr,0)=0 and t.pk_financeorg = '"
				+ pk_org + "'";
		IUAPQueryBS query = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		try {
			Object obj = query.executeQuery(qsql, new ColumnProcessor());
			if(obj!=null){
				panel.setHeadItem("vdef10", obj.toString());
			}
		} catch (BusinessException e1) {
			// TODO 自动生成的 catch 块
			ShowStatusBarMsgUtil.showErrorMsg("提示", "获取当前用户所在组织的客户档案失败",
					e.getContext());

		}
	}

}
