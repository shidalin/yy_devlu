package nc.vo.xsfp.entity;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggXsfpVOMeta extends AbstractBillMeta {
  public AggXsfpVOMeta() {
    this.init();
  }
  private void init() {
    this.setParent(nc.vo.xsfp.entity.XsfpHVO.class);
    this.addChildren(nc.vo.xsfp.entity.XsfpBVO.class);
  }
}