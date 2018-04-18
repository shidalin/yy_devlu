package nc.ui.baal.fukuandan.action;

import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.actions.BodyPasteLineAction;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.AppContext;

public class FukuandanBodyPasteLineAction extends BodyPasteLineAction {

	@Override
	public void doAction() {
		// TODO 自动生成的方法存根
		super.doAction();
		String pk_group = AppContext.getInstance().getPkGroup();
		String pk_org = null;
		try {
			pk_org = nc.pubitf.setting.defaultdata.OrgSettingAccessor
					.getDefaultOrgUnit();
			throw new Exception();
		} catch (Exception e2) {
		}
		int[] rows = new int[] { super.getCardPanel().getRowCount() - 1 };
		if (rows != null && rows.length > 0) {
			for (int i = 0; i < rows.length; i++) {
				super.getCardPanel().setBodyValueAt(pk_group, rows[i],
						"pk_group");
				super.getCardPanel().setBodyValueAt(pk_org, rows[i], "pk_org");
				super.getCardPanel().setBodyValueAt("0001ZZ100000000043KD",
						rows[i], "pk_billtype");
				super.getCardPanel().setBodyValueAt(
						AppContext.getInstance().getBusiDate(), rows[i],
						"billdate");
				super.getCardPanel().setBodyValueAt("FKSQ-Cxx-01", rows[i],
						"pk_tradetype");
				super.getCardPanel().setBodyValueAt("1001E41000000000JMPG",
						rows[i], "pk_tradetypeid");
				super.getCardPanel().setBodyValueAt(1, rows[i], "direction");
				super.getCardPanel().setBodyValueAt(0, rows[i], "taxrate");
			}
		}
		// 价税合计
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
