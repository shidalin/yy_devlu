package nc.vo.fukuandan.entity;

import nc.vo.pub.ISuperVO;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.fukuandan.entity.FukuandanVO")
public class AggFukuadanVO extends AbstractBill {

  @Override
  public IBillMeta getMetaData() {
    IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggFukuadanVOMeta.class);
    return billMeta;
  }

  @Override
  public FukuandanVO getParentVO() {
    return (FukuandanVO) this.getParent();
  }

@Override
public Fukuandan_bVO[] getChildren(Class<? extends ISuperVO> clazz) {
	// TODO 自动生成的方法存根
	return (Fukuandan_bVO[]) super.getChildren(Fukuandan_bVO.class);
}
  
  
}