package nc.ui.baal.fukuandan.ace.handler;

import nc.itf.scmpub.reference.uap.org.OrgUnitPubService;
import nc.ui.ct.util.CardEditorHelper;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.OrgChangedEvent;
import nc.ui.pubapp.uif2app.view.BillForm;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
import nc.ui.pubapp.uif2app.view.util.BillPanelUtils;
import nc.vo.ct.uitl.ValueUtil;
import nc.vo.uif2.LoginContext;
import nc.ui.pubapp.uif2app.view.ShowUpableBillForm;

/**
 * 组织切换事件
 * 
 * @since 6.0
 * @version 2011-7-7 上午10:41:59
 * @author duy
 */
public class AceOrgChangedHandler implements IAppEventHandler<OrgChangedEvent> {

	private ShowUpableBillForm billfrom;

	public AceOrgChangedHandler(ShowUpableBillForm bill) {
		this.billfrom = bill;
	}

	@Override
	public void handleAppEvent(OrgChangedEvent e) {
		if (this.billfrom.isEditable()) {
			// 在编辑状态下，主组织切换时，清空界面数据，自动表体增行，并设置行号
			this.billfrom.addNew();
		}
		CardEditorHelper util = CardEditorHelper.getInstance(billfrom
				.getBillCardPanel());
		String pk_org = billfrom.getModel().getContext().getPk_org();
		String pk_group = billfrom.getModel().getContext().getPk_group();
		String pk_org_v = null;
		if (!ValueUtil.isEmpty(pk_org)) {
			pk_org_v = OrgUnitPubService.getOrgVid(pk_org);
		}

		util.setHeadValue("pk_org_v", pk_org_v);
		util.setHeadValue("pk_org", pk_org);
		LoginContext context = this.billfrom.getModel().getContext();
		// 进行参照过滤
		BillPanelUtils.setOrgForAllRef(this.billfrom.getBillCardPanel(),
				context);
	}

}
