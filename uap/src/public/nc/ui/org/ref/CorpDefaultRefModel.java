package nc.ui.org.ref;

import nc.bs.IconResources;
import nc.itf.org.IOrgResourceCodeConst;
import nc.ui.pub.beans.ValueChangedEvent;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.CorpVO;
import nc.vo.org.util.OrgTreeCellRendererIconPolicy;

/**
 * ��˾ ���β���
 * 
 * @version NC6.0
 * @author guoting
 */
public class CorpDefaultRefModel extends OrgBaseTreeDefaultRefModel {

	public CorpDefaultRefModel() {
		super();
		reset();
	}

	public void reset() {
		super.reset();
		setRefNodeName("��˾");/* -=notranslate=- */

		setFieldCode(new String[] { CorpVO.CODE, CorpVO.NAME });
		setFieldName(new String[] {
				NCLangRes4VoTransl.getNCLangRes().getStrByID("common",
						"UC000-0003279") /* @res "����" */,
				NCLangRes4VoTransl.getNCLangRes().getStrByID("common",
						"UC000-0001155") /* @res "����" */
		});
		setHiddenFieldCode(new String[] { CorpVO.PK_CORP, CorpVO.PK_FATHERORG,
				CorpVO.DISORDER });
		setPkFieldCode(CorpVO.PK_CORP);
		setRefCodeField(CorpVO.CODE);
		setRefNameField(CorpVO.NAME);
		setFatherField(CorpVO.PK_FATHERORG);
		setChildField(CorpVO.PK_CORP);
		setTableName(CorpVO.getDefaultTableName());

		setResourceID(IOrgResourceCodeConst.CORP);

		// �����ù�����������
		setAddEnableStateWherePart(true);

		setFilterRefNodeName(new String[] { "����" });/* -=notranslate=- */

		// ����ʾ˳�򡢱�������
		setOrderPart(CorpVO.DISORDER + ", " + CorpVO.CODE);
		resetFieldName();

		this.setTreeIconPolicy(new OrgTreeCellRendererIconPolicy(
				IconResources.ICON_Bu));
	}

	@Override
	public void filterValueChanged(ValueChangedEvent changedValue) {
		super.filterValueChanged(changedValue);
		String[] selectedPKs = (String[]) changedValue.getNewValue();
		if (selectedPKs != null && selectedPKs.length > 0) {
			setPk_group(selectedPKs[0]);
		}
	}




}
