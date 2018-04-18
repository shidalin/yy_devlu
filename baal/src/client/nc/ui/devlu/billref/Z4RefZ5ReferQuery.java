package nc.ui.devlu.billref;

/**
 * ��Դ���ݲ�ѯ��
 * ���ܣ���Դ���ݲ�ѯģ���ʼ��
 * �趨����
 */
import java.awt.Container;

import nc.ui.pubapp.billref.src.DefaultBillReferQuery;
import nc.ui.pubapp.uif2app.query2.QueryConditionDLGDelegator;
import nc.ui.pubapp.uif2app.query2.totalvo.MarAssistantDealer;
import nc.vo.querytemplate.TemplateInfo;

public class Z4RefZ5ReferQuery extends DefaultBillReferQuery {

	public Z4RefZ5ReferQuery(Container c, TemplateInfo info) {
		super(c, info);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void initQueryConditionDLG(QueryConditionDLGDelegator dlgDelegator) {
		// ע����Ҫ���û�������֯���й��˵���֯��������������������֯����
		dlgDelegator.registerNeedPermissionOrgFieldCode("pk_org");
		dlgDelegator.addQueryCondVODealer(new MarAssistantDealer());
		dlgDelegator.setPowerEnable(true);
	}
}