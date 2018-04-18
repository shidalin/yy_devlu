package nc.ui.devlu.billref;

/**
 * 来源单据查询类
 * 功能：来源单据查询模板初始化
 * 设定过滤
 */
import java.awt.Container;

import nc.ui.pubapp.billref.src.DefaultBillReferQuery;
import nc.ui.pubapp.uif2app.query2.QueryConditionDLGDelegator;
import nc.ui.pubapp.uif2app.query2.totalvo.MarAssistantDealer;
import nc.vo.querytemplate.TemplateInfo;

public class Z4RefZ5ReferQuery extends DefaultBillReferQuery {

	public Z4RefZ5ReferQuery(Container c, TemplateInfo info) {
		super(c, info);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void initQueryConditionDLG(QueryConditionDLGDelegator dlgDelegator) {
		// 注册需要按用户分配组织进行过滤的组织条件，该条件必须是组织条件
		dlgDelegator.registerNeedPermissionOrgFieldCode("pk_org");
		dlgDelegator.addQueryCondVODealer(new MarAssistantDealer());
		dlgDelegator.setPowerEnable(true);
	}
}