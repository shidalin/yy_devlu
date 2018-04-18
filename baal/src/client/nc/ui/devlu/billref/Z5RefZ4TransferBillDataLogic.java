package nc.ui.devlu.billref;

import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.billref.dest.DefaultBillDataLogic;
import nc.vo.ct.ap.entity.AggCtApVO;
import nc.vo.ct.ap.entity.CtApBVO;
import nc.vo.ct.ap.entity.CtApVO;
import nc.vo.pub.lang.UFDouble;

public class Z5RefZ4TransferBillDataLogic extends DefaultBillDataLogic {
	@Override
	public void doTransferAddLogic(Object selectedData) {
		// 把数据设置在界面上
		AggCtApVO aggvo = (AggCtApVO)selectedData;
		CtApBVO[] bvos = (CtApBVO[]) aggvo.getChildrenVO();
		UFDouble sum = new UFDouble(0);
		for(int i = 0;i<bvos.length;i++){
			CtApBVO bvo = bvos[i];
			UFDouble norigtaxmny = bvo.getNorigtaxmny();//表体价税合计
			if(norigtaxmny==null){
				norigtaxmny=new UFDouble(0);
			}
			sum=sum.add(norigtaxmny);			
		}
		CtApVO vo = aggvo.getParentVO();
		vo.setNtotalorigmny(sum);		
		super.doTransferAddLogic(selectedData);
	}
}
