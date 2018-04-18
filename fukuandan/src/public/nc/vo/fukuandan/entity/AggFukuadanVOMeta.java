package nc.vo.fukuandan.entity;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggFukuadanVOMeta extends AbstractBillMeta {
  public AggFukuadanVOMeta() {
    this.init();
  }
  private void init() {
    this.setParent(nc.vo.fukuandan.entity.FukuandanVO.class);
    this.addChildren(nc.vo.fukuandan.entity.Fukuandan_bVO.class);
  }
}