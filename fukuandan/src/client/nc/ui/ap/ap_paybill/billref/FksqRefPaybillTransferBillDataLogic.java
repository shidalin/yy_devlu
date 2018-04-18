package nc.ui.ap.ap_paybill.billref;

import nc.ui.arap.model.ArapBillManageModel;
import nc.ui.pubapp.billref.dest.DefaultBillDataLogic;
import nc.ui.uif2.model.AbstractAppModel;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.pay.PayBillItemVO;
import nc.vo.arap.pay.PayBillVO;
import nc.vo.pub.lang.UFDouble;

public class FksqRefPaybillTransferBillDataLogic extends DefaultBillDataLogic {
	@Override
	public void doTransferAddLogic(Object selectedData) {
		// 把数据设置在界面上
		AggPayBillVO aggvo = (AggPayBillVO) selectedData;
		PayBillItemVO[] bvos = (PayBillItemVO[]) aggvo.getChildrenVO();
		UFDouble summny = new UFDouble(0);
		for (int i = 0; i < bvos.length; i++) {
			PayBillItemVO bvo = bvos[i];
			UFDouble money_de = bvo.getMoney_de();
			summny = summny.add(money_de);
			UFDouble rate = bvo.getRate();
			if (rate == null) {
				rate = new UFDouble(1);
				UFDouble local_money_de = rate.multiply(money_de);
				bvo.setLocal_money_de(local_money_de);
			}
		}
		PayBillVO vo = (PayBillVO) aggvo.getParent();
		vo.setMoney(summny);
		if (super.getBillForm().getModel().getSelectedData() != null) {
			super.getBillForm().getModel().directlyAdd(aggvo);
		}
		super.doTransferAddLogic(selectedData);
	}
}
