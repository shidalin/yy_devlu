package nc.itf.baal;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.cgfp.entity.AggCgfpVO;
import nc.vo.pub.BusinessException;

public interface ICgfpMaintain {

	public void delete(AggCgfpVO[] clientFullVOs, AggCgfpVO[] originBills)
			throws BusinessException;

	public AggCgfpVO[] insert(AggCgfpVO[] clientFullVOs, AggCgfpVO[] originBills)
			throws BusinessException;

	public AggCgfpVO[] update(AggCgfpVO[] clientFullVOs, AggCgfpVO[] originBills)
			throws BusinessException;

	public AggCgfpVO[] query(IQueryScheme queryScheme) throws BusinessException;

	public AggCgfpVO[] save(AggCgfpVO[] clientFullVOs, AggCgfpVO[] originBills)
			throws BusinessException;

	public AggCgfpVO[] unsave(AggCgfpVO[] clientFullVOs, AggCgfpVO[] originBills)
			throws BusinessException;

	public AggCgfpVO[] approve(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException;

	public AggCgfpVO[] unapprove(AggCgfpVO[] clientFullVOs,
			AggCgfpVO[] originBills) throws BusinessException;
}
