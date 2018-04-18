package nc.ui.ap.ap_paybill.billref;

/**
 * 功能：调用来源单据查询服务接口，实现来源单据查询
 */
import nc.bs.framework.common.NCLocator;
import nc.ui.pubapp.uif2app.query2.model.IRefQueryService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class FksqQueryServiceForPaybill implements IRefQueryService {
	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		AggFukuadanVO[] retbills = null;
		nc.itf.baal.IFukuandanMaintain service = NCLocator.getInstance()
				.lookup(nc.itf.baal.IFukuandanMaintain.class);
		try {
			retbills = service.queryFksqRefPaybill(queryScheme);
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
