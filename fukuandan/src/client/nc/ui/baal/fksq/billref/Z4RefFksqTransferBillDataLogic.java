package nc.ui.baal.fksq.billref;

import nc.ui.pubapp.billref.dest.DefaultBillDataLogic;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.fukuandan.entity.FukuandanVO;
import nc.vo.fukuandan.entity.Fukuandan_bVO;
import nc.vo.pub.lang.UFDouble;

public class Z4RefFksqTransferBillDataLogic extends DefaultBillDataLogic {
	@Override
	public void doTransferAddLogic(Object selectedData) {
		// 把数据设置在界面上
		AggFukuadanVO aggvo = (AggFukuadanVO)selectedData;
		if(aggvo==null){
			return;
		}
		Fukuandan_bVO[] bvos =  (Fukuandan_bVO[]) aggvo.getChildrenVO();
		UFDouble summny = new UFDouble(0); 
		for(int i=0;i<bvos.length;i++){
			Fukuandan_bVO bvo = bvos[i];
			UFDouble money_de = bvo.getMoney_de();//借方原币金额
			if(money_de==null){
				money_de=new UFDouble(0);
			}
			summny = summny.add(money_de);
		}
		FukuandanVO vo = aggvo.getParentVO();
		vo.setMoney(summny);
		super.doTransferAddLogic(selectedData);
	}
}

