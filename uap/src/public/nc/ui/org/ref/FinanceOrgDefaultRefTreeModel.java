package nc.ui.org.ref;

import nc.bs.IconResources;
import nc.itf.org.IOrgConst;
import nc.itf.org.IOrgResourceCodeConst;
import nc.ui.pub.beans.ValueChangedEvent;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.util.OrgTreeCellRendererIconPolicy;
import nc.vo.org.util.OrgTypeManager;

/**
 * ������֯ ���β��գ��Թ�˾�����������֯������˾����Ϊ������֯����˾�µ����в�����֯ƽ����
 * @version NC6.0
 * @author guoting
 */
public class FinanceOrgDefaultRefTreeModel extends OrgBaseTreeDefaultRefModel {

	public FinanceOrgDefaultRefTreeModel() {
		super();
		reset();
	}

	public void reset() {
		setRefNodeName("������֯");/*-=notranslate=-*/
		
		setFieldCode(new String[] { "code", "name"});
		setFieldName(new String[] { 
				NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0003279") /* @res "����" */,
				NCLangRes4VoTransl.getNCLangRes().getStrByID("common", "UC000-0001155") /* @res "����" */
					});
		setHiddenFieldCode(new String[] {"pk_financeorg", "pk_fatherorg", "pk_corp", "pk_group", "enablestate" });
		setPkFieldCode("pk_financeorg");
		setRefCodeField("code");
		setRefNameField("name");
		setFatherField("pk_fatherorg");
		setChildField("pk_financeorg");
		
		setFilterRefNodeName(new String[] {"����"});/*-=notranslate=-*/
		
		setResourceID(IOrgResourceCodeConst.FINANCEORG);
		
		//�����ù�����������
		setAddEnableStateWherePart(true);
		
		setOrderPart("code");
		
		resetFieldName();
		
    this.setTreeIconPolicy(new OrgTreeCellRendererIconPolicy(
        IconResources.ICON_Bu));
	}

	@Override
	public String getTableName() {
		String financeorg_fieldname = OrgTypeManager.getInstance().getOrgTypeByID(IOrgConst.FINANCEORGTYPE).getFieldname();
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT org_corp.code, org_corp.name, org_corp.name2, org_corp.name3, org_corp.name4, org_corp.name5, org_corp.name6, org_corp.pk_corp AS pk_financeorg, org_corp.pk_fatherorg, org_corp.pk_corp, org_corp.pk_group, org_financeorg.enablestate " +
				"FROM org_corp LEFT JOIN org_financeorg ON org_corp.pk_corp = org_financeorg.pk_financeorg " +
				"WHERE org_corp.pk_corp IN (SELECT pk_org FROM org_orgs WHERE " + financeorg_fieldname + " = 'Y') ");
				
		sb.append(" UNION ");
		
		sb.append("SELECT org_financeorg.code , org_financeorg.name , org_financeorg.name2 , org_financeorg.name3 , org_financeorg.name4 , org_financeorg.name5 , org_financeorg.name6 , org_financeorg.pk_financeorg, org_orgs.pk_corp as pk_fatherorg, org_orgs.pk_corp, org_financeorg.pk_group, org_financeorg.enablestate " +
				"FROM org_financeorg LEFT JOIN org_orgs ON org_financeorg.pk_financeorg = org_orgs.pk_org  " +
				"WHERE " + financeorg_fieldname + " = 'Y' AND org_financeorg.pk_financeorg <> org_orgs.pk_corp");
		

		return "(" + sb.toString() + ") org_financeorg_temp";
	}
	
	@Override
	public void filterValueChanged(ValueChangedEvent changedValue) {
		super.filterValueChanged(changedValue);
		String[] selectedPKs = (String[]) changedValue.getNewValue();
		if (selectedPKs != null && selectedPKs.length > 0) {
			setPk_group(selectedPKs[0]);
		}
	}
	
	/**
	 * ��Ϊ������֯�����ɹ�˾�������ɵģ�û��innercode�����Բ�����ʹ�ð����¼�����
	 */
	@Override
	public boolean isIncludeSub() {
		return false;
	}

}
