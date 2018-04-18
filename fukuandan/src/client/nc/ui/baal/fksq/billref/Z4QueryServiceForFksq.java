package nc.ui.baal.fksq.billref;

/**
 * 功能：调用来源单据查询服务接口，实现来源单据查询
 */
import nc.bs.framework.common.NCLocator;
import nc.itf.baal.IFukuandanMaintain;
import nc.ui.pubapp.uif2app.query2.model.IRefQueryService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.ct.ap.entity.AggCtApVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class Z4QueryServiceForFksq implements IRefQueryService {
	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		AggCtApVO[] retbills = null;
		IFukuandanMaintain service = NCLocator.getInstance().lookup(
				IFukuandanMaintain.class);
		try {
			retbills = service.queryZ4ForFksq(queryScheme);
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
