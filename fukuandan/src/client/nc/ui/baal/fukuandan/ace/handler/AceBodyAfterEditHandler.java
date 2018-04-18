package nc.ui.baal.fukuandan.ace.handler;

import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent;
import nc.vo.fukuandan.entity.Fukuandan_bVO;
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
		if (key.equals("material_src")) {
			nc.ui.baal.fukuandan.handler.MaterialHandler handler = new nc.ui.baal.fukuandan.handler.MaterialHandler();
			handler.afterEdit(e);
		}
		// 价税合计 ntotalorigmny
		if (key.equals("money_de")) {
			BillCardPanel cpanel = e.getBillCardPanel();
			int count = cpanel.getBillModel().getRowCount();
			UFDouble ntotalorigmny = UFDouble.ZERO_DBL;
			for (int i = 0; i < count; i++) {
				UFDouble ntotalorigmny_ = (UFDouble) cpanel.getBodyValueAt(i,
						"money_de");
				ntotalorigmny = ntotalorigmny.add(ntotalorigmny_);
			}
			cpanel.setHeadItem("money", ntotalorigmny);
		}
	}

}
