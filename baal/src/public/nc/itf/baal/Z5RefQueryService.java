package nc.itf.baal;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.ct.ar.entity.AggCtArVO;
import nc.vo.pub.BusinessException;

/**
 * ���۷�Ʊת����ѯ�ӿ� ���ε��ݣ������պ�ͬ
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
