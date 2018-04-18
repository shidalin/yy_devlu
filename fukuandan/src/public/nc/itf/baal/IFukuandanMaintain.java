package nc.itf.baal;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.ct.ap.entity.AggCtApVO;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.pub.BusinessException;

public interface IFukuandanMaintain {

	public void delete(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException;

	public AggFukuadanVO[] insert(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException;

	public AggFukuadanVO[] update(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException;

	public AggFukuadanVO[] query(IQueryScheme queryScheme)
			throws BusinessException;

	public AggFukuadanVO[] save(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException;

	public AggFukuadanVO[] unsave(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException;

	public AggFukuadanVO[] approve(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException;

	public AggFukuadanVO[] unapprove(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException;

	public AggFukuadanVO[] queryFksqRefPaybill(IQueryScheme queryScheme)
			throws BusinessException;

	public AggCtApVO[] queryZ4ForFksq(IQueryScheme queryScheme)
			throws BusinessException;

	public void updateBySql(String sql) throws BusinessException;
}
