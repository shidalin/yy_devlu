package nc.ui.ap.ap_paybill.billref;

/**
 * ��Դ���ݲ�ѯ��
 * ���ܣ���Դ���ݲ�ѯģ���ʼ��
 * �趨����
 */
import java.awt.Container;

import nc.ui.pubapp.billref.src.DefaultBillReferQuery;
import nc.ui.pubapp.uif2app.query2.QueryConditionDLGDelegator;
import nc.vo.querytemplate.TemplateInfo;

public class FksqRefPaybillReferQuery extends DefaultBillReferQuery {

	public FksqRefPaybillReferQuery(Container c, TemplateInfo info) {
		super(c, info);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void initQueryConditionDLG(QueryConditionDLGDelegator dlgDelegator) {

	}

}