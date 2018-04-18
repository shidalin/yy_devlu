package nc.ui.baal.xsfp.ace.handler;

import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent;
import nc.vo.pub.lang.UFDouble;

/**
 * 单据表体字段编辑后事件
 * 
 * @since 6.0
 * @version 2011-7-12 下午08:17:33
 * @author duy
 */
public class AceBodyAfterEditHandler implements
		IAppEventHandler<CardBodyAfterEditEvent> {

	@Override
	public void handleAppEvent(CardBodyAfterEditEvent e) {
		String key = e.getKey();
		if (key.equals("cmaterialvid")) {
			nc.ui.baal.xsfp.handler.MaterialHandler handler = new nc.ui.baal.xsfp.handler.MaterialHandler();
			handler.afterEdit(e);
		}
		// 价税合计 ntotalorigmny
		if (key.equals("norigtaxmny")) {
			BillCardPanel cpanel = e.getBillCardPanel();
			int count = cpanel.getBillModel().getRowCount();
			UFDouble ntotalorigmny = UFDouble.ZERO_DBL;
			for (int i = 0; i < count; i++) {
				UFDouble ntotalorigmny_ = (UFDouble) cpanel.getBodyValueAt(i,
						"norigtaxmny");
				ntotalorigmny = ntotalorigmny.add(ntotalorigmny_);
			}
			cpanel.setHeadItem("ntotalorigmny", ntotalorigmny);
		}
	}

}
