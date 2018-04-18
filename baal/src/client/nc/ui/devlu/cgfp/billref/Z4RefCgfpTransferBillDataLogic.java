package nc.ui.devlu.cgfp.billref;

import nc.ui.pubapp.bill.BillCardPanel;
import nc.ui.pubapp.billref.dest.DefaultBillDataLogic;
import nc.vo.pub.lang.UFDouble;

public class Z4RefCgfpTransferBillDataLogic extends DefaultBillDataLogic {
	@Override
	public void doTransferAddLogic(Object selectedData) {
		// 把数据设置在界面上
		super.doTransferAddLogic(selectedData);
		 BillCardPanel cpanel =(BillCardPanel) this.getBillForm().getBillCardPanel();
		 int count = cpanel.getBillModel().getRowCount();
			UFDouble ntotalorigmny = UFDouble.ZERO_DBL;
			for (int i = 0; i < count; i++) {
				UFDouble ntotalorigmny_ = (UFDouble) cpanel.getBodyValueAt(i,
						"norigtaxmny");
				if(ntotalorigmny_==null){
					ntotalorigmny_=new UFDouble(0);
				}
				ntotalorigmny = ntotalorigmny.add(ntotalorigmny_);
			}
			cpanel.setHeadItem("ntotalorigmny", ntotalorigmny);
	}
}

