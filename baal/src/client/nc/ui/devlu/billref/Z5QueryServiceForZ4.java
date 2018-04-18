package nc.ui.devlu.billref;
/**
 * 查询服务类
 */
import nc.bs.framework.common.NCLocator;
import nc.itf.baal.Z5RefQueryService;
import nc.ui.pubapp.uif2app.query2.model.IRefQueryService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.ct.ar.entity.AggCtArVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class Z5QueryServiceForZ4 implements IRefQueryService {
	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		AggCtArVO[] retbills = null;
		Z5RefQueryService service = NCLocator.getInstance().lookup(
				Z5RefQueryService.class);
		try {
			retbills = service.queryZ5ForZ4(queryScheme);
		} catch (BusinessException e) {
			ExceptionUtils.wrappException(e);
		}
		return retbills;
	}

	@Override
	public Object[] queryByWhereSql(String arg0) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}
}