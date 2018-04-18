package nc.itf.baal;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.ct.ap.entity.AggCtApVO;
import nc.vo.pub.BusinessException;

public interface Z4RefQueryService {
	public AggCtApVO[] queryZ4ForCgfp(IQueryScheme queryScheme)
			throws BusinessException;
	
}
