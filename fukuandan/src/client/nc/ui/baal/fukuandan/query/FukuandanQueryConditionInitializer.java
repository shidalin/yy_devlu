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
		// TODO 初始化查询模板逻辑
		// 这个数组目前是空的，请业务组把需要按组织过滤的参照字段加入到这个数组中
		condDLGDelegator.setRefFilter("pk_org",
				new MainOrgWithPermissionOrgFilter(model));
		List<String> targetFields = new ArrayList<String>();
		targetFields.add("pk_psndoc");
		targetFields.add("pk_deptid");
		// TODO 加入需要按组织过滤的参照字段
		QueryDefaultOrgFilter orgFilter = new QueryDefaultOrgFilter(
				condDLGDelegator, "pk_org", targetFields);
		orgFilter.addEditorListener();
	}

}
