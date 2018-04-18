package nc.vo.cgfp.entity;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggCgfpVOMeta extends AbstractBillMeta {
  public AggCgfpVOMeta() {
    this.init();
  }
  private void init() {
    this.setParent(nc.vo.cgfp.entity.CgfpHVO.class);
    this.addChildren(nc.vo.cgfp.entity.CgfpBVO.class);
  }
}