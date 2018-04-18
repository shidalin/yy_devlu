package nc.ui.baal.fukuandan.action;

import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.actions.BodyDelLineAction;
import nc.vo.pub.lang.UFDouble;

public class FukuandanDelLineAction extends BodyDelLineAction {

	@Override
	public void doAction() {
		// TODO 自动生成的方法存根
		super.doAction();
		//价税合计
		BillCardPanel cpanel = getCardPanel();
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
