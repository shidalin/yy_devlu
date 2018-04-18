package nc.ui.ap.ap_paybill.billref;

/**
 * ���ܣ�������Դ���ݲ�ѯ����ӿڣ�ʵ����Դ���ݲ�ѯ
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
		// TODO �Զ����ɵķ������
		return null;
	}
}
