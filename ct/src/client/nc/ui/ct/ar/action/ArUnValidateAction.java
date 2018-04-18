package nc.ui.ct.ar.action;

import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.ui.ct.action.ActionNameUtil;
import nc.ui.ct.action.CtScriptPFlowAction;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pub.beans.UIDialog;
import nc.ui.scmpub.action.SCMActionInitializer;
import nc.vo.ct.ar.entity.AggCtArVO;
import nc.vo.ct.ar.entity.CtArVO;
import nc.vo.ct.enumeration.CtFlowEnum;
import nc.vo.ct.rule.ActionStateRule;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.pub.ListToArrayTool;
import nc.vo.scmpub.res.SCMActionCode;

/**
 * <p>
 * ��ͬȡ����Чaction <b>������Ҫ������¹��ܣ�</b>
 * <ul>
 * <li>
 * </ul>
 * <p>
 * <p>
 * 
 * @version 6.0
 * @since 6.0
 * @author lizhengb
 * @time 2010-5-11 ����01:17:13
 */
@SuppressWarnings("restriction")
public class ArUnValidateAction extends CtScriptPFlowAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sReason;

	public ArUnValidateAction() {
		SCMActionInitializer.initializeAction(this,
				SCMActionCode.CT_CANCELVALIDATE);
		// this.putValue(Action.ACCELERATOR_KEY,
		// KeyStroke.getKeyStroke(KeyEvent.VK_H,
		// InputEvent.CTRL_MASK));
		// this.putValue(Action.SHORT_DESCRIPTION, this.getBtnName());
	}

	/**
	 * ȡ����Ч�������ε���У��
	 * 
	 * @throws Exception
	 */
	public void checkFlowBills() throws Exception {
		// ��������У��-����������۷�Ʊ��¼����������
		AggCtArVO ctVo = (AggCtArVO) this.getModel().getSelectedData();
		CtArVO headVo = (CtArVO) ctVo.getParentVO();
		String srcpk = headVo.getPk_ct_ar();
		String sql = "select t.vbillcode  from xsfp t where nvl(t.dr,0)=0 and t.vdef1 = '"
				+ srcpk + "'";
		IUAPQueryBS query = NCLocator.getInstance().lookup(
				IUAPQueryBS.class);
		List<Object> list = (List<Object>) query.executeQuery(sql,
				new ColumnListProcessor());
		if (list.size() > 0) {
			String codes = "";
			for (Object obj : list) {
				codes += obj.toString() + ",";
			}
			// ȥ�����һ������
			codes = codes.substring(0, codes.length());
			throw new BusinessException("����ʧ��!�õ��ݴ����������۷�Ʊ��¼,��ɾ�����ε���������\n"
					+ "�������۷�Ʊ���ݺ�Ϊ:" + codes);
		}
		String sql_cght = "select t.vbillcode  from ct_ap t where nvl(t.dr,0)=0 and t.vdef3 = '"
				+ srcpk + "'";
		List<Object> list_cght = (List<Object>) query.executeQuery(sql_cght,
				new ColumnListProcessor());
		if (list_cght.size() > 0) {
			String codes = "";
			for (Object obj : list_cght) {
				codes += obj.toString() + ",";
			}
			// ȥ�����һ������
			codes = codes.substring(0, codes.length());
			throw new BusinessException("����ʧ��!�õ��ݴ������βɹ���ͬ��¼,��ɾ�����ε���������\n"
					+ "���βɹ���ͬ���ݺ�Ϊ:" + codes);
		}
	}

	@Override
	public void doAction(ActionEvent e) throws Exception {
		checkFlowBills();
		this.sReason = null;
		if (UIDialog.ID_YES == MessageDialog.showYesNoDlg(
				this.getModel().getContext().getEntranceUI(),
				null,
				nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID(
						"4020003_0", "04020003-0021")/*
													 * @res "�Ƿ�ȷ��Ҫȡ���ú�ͬ��Ч��"
													 */)) {
			this.sReason = (String) MessageDialog.showInputDlg(
					this.getModel().getContext().getEntranceUI(),
					nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID(
							"common", "UC000-0000900")/*
													 * @res "ԭ��"
													 */,
					nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID(
							"4020003_0", "04020003-0022")/*
														 * @res "������ȡ����ͬ��Ч��ԭ��"
														 */, null, 120);
			super.doAction(e);
		}
	}

	@Override
	protected Object[] ctProcessBefore(AbstractBill[] vos) {
		List<AbstractBill> listDate = Arrays.asList(vos);
		ListToArrayTool<AbstractBill> tool = new ListToArrayTool<AbstractBill>();
		AbstractBill[] arrayBills = tool.convertToArray(listDate);
		ActionUtil.addNewExecVO((AggCtArVO[]) arrayBills,
				(Integer) CtFlowEnum.VALIDATE.value(), this.sReason,
				ActionNameUtil.getUNVALIDATE());
		return arrayBills;
	}

	@Override
	protected boolean isActionEnable() {
		if (this.getModel().getSelectedOperaDatas() == null) {
			return false;
		} else if (this.getModel().getSelectedOperaDatas().length > 1) {
			return true;
		} else {
			ActionStateRule rule = new ActionStateRule();
			return rule.isHaveValidate(this.getModel().getSelectedData());
		}
	}

}
