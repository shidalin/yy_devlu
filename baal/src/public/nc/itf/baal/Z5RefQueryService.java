package nc.itf.baal;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.ct.ar.entity.AggCtArVO;
import nc.vo.pub.BusinessException;

/**
 * 销售发票转单查询接口 上游单据：其他收合同
 * 
 * @author shida
 * 
 */
public interface Z5RefQueryService {
	public AggCtArVO[] queryZ5ForXsfp(IQueryScheme queryScheme)
			throws BusinessException;

	public AggCtArVO[] queryZ5ForZ4(IQueryScheme queryScheme)
			throws BusinessException;
}
