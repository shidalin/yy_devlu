package nc.vo.xsfp.entity;

import nc.vo.pub.ISuperVO;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.xsfp.entity.XsfpHVO")
public class AggXsfpVO extends AbstractBill {

	@Override
	public IBillMeta getMetaData() {
		IBillMeta billMeta = BillMetaFactory.getInstance().getBillMeta(
				AggXsfpVOMeta.class);
		return billMeta;
	}

	@Override
	public XsfpHVO getParentVO() {
		return (XsfpHVO) this.getParent();
	}

	@Override
	public XsfpBVO[] getChildren(Class<? extends ISuperVO> clazz) {
		// TODO 自动生成的方法存根
		return (XsfpBVO[]) super.getChildren(XsfpBVO.class);
	}

}