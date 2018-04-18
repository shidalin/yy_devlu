package nc.vo.cgfp.entity;

import nc.vo.pub.ISuperVO;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.cgfp.entity.CgfpHVO")
public class AggCgfpVO extends AbstractBill {

  @Override
  public IBillMeta getMetaData() {
    IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggCgfpVOMeta.class);
    return billMeta;
  }

  @Override
  public CgfpHVO getParentVO() {
    return (CgfpHVO) this.getParent();
  }

@Override
public CgfpBVO[] getChildren(Class<? extends ISuperVO> clazz) {
	// TODO 自动生成的方法存根
	return (CgfpBVO[])super.getChildren(CgfpBVO.class);
}


  
}