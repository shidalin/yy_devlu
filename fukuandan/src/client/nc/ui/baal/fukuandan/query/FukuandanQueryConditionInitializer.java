package nc.ui.baal.fukuandan.query;

import java.util.ArrayList;
import java.util.List;

import nc.ui.arap.query.MainOrgWithPermissionOrgFilter;
import nc.ui.pubapp.uif2app.query2.IQueryConditionDLGInitializer;
import nc.ui.pubapp.uif2app.query2.QueryConditionDLGDelegator;
import nc.ui.pubapp.uif2app.query2.refregion.QueryDefaultOrgFilter;
import nc.ui.uif2.model.AbstractUIAppModel;

public class FukuandanQueryConditionInitializer implements
		IQueryConditionDLGInitializer {
	private AbstractUIAppModel model;

	public AbstractUIAppModel getModel() {
		return model;
	}

	public void setModel(AbstractUIAppModel model) {
		this.model = model;
	}

	@Override
	public void initQueryConditionDLG(
			QueryConditionDLGDelegator condDLGDelegator) {
		// TODO ��ʼ����ѯģ���߼�
		// �������Ŀǰ�ǿյģ���ҵ�������Ҫ����֯���˵Ĳ����ֶμ��뵽���������
		condDLGDelegator.setRefFilter("pk_org",
				new MainOrgWithPermissionOrgFilter(model));
		List<String> targetFields = new ArrayList<String>();
		targetFields.add("pk_psndoc");
		targetFields.add("pk_deptid");
		// TODO ������Ҫ����֯���˵Ĳ����ֶ�
		QueryDefaultOrgFilter orgFilter = new QueryDefaultOrgFilter(
				condDLGDelegator, "pk_org", targetFields);
		orgFilter.addEditorListener();
	}

}
