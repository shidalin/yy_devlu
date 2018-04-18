package nc.ui.baal.fukuandan.ace.handler;

import java.util.Arrays;
import java.util.List;

import nc.ui.pub.beans.UIRefPane;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardHeadTailBeforeEditEvent;

/**
 * 单据表头表尾字段编辑前事件处理类
 * 
 * @since 6.0
 * @version 2011-7-7 下午02:51:21
 * @author duy
 */
public class AceHeadTailBeforeEditHandler implements
		IAppEventHandler<CardHeadTailBeforeEditEvent> {

	@Override
	public void handleAppEvent(CardHeadTailBeforeEditEvent e) {
		String key = e.getKey();
		BillCardPanel cardPanel = e.getBillCardPanel();
		String pk_org = cardPanel.getHeadItem("pk_org").getValue();
		// String [] items = new String [] {"pk_psndoc","pk_deptid"};
		List<String> list = Arrays.asList("pk_psndoc", "pk_deptid");
		//参照前加组织过滤
		if (list.contains(key)) {
			UIRefPane ref = (UIRefPane) cardPanel.getHeadItem(key)
					.getComponent();
			ref.setPk_org(pk_org);
		}
		//组织编辑前过滤
		if("pk_org".equals(key)){
			
		}
	}
}
