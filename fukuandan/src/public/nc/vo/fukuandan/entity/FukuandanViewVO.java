package nc.vo.fukuandan.entity;

import nc.vo.pubapp.pattern.model.entity.view.AbstractDataView;
import nc.vo.pubapp.pattern.model.meta.entity.view.DataViewMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.view.IDataViewMeta;

/**
 * 视图VO
 * 
 * @author shidl
 * 
 */
public class FukuandanViewVO extends AbstractDataView {

	public AggFukuadanVO changeToBill() {
		AggFukuadanVO aggvo = new AggFukuadanVO();
		aggvo.setParent(this.getHead());
		Fukuandan_bVO[] items = new Fukuandan_bVO[] { this.getItem() };
		aggvo.setChildrenVO(items);
		return aggvo;
	}

	public FukuandanVO getHead() {
		return (FukuandanVO) this.getVO(FukuandanVO.class);
	}

	public Fukuandan_bVO getItem() {
		return (Fukuandan_bVO) this.getVO(Fukuandan_bVO.class);
	}

	@Override
	public IDataViewMeta getMetaData() {
		// TODO 自动生成的方法存根
		return DataViewMetaFactory.getInstance().getBillViewMeta(
				AggFukuadanVO.class);
	}

	public void setHead(FukuandanVO head) {
		this.setVO(head);
	}

	public void setItem(Fukuandan_bVO item) {
		this.setVO(item);
	}
}
