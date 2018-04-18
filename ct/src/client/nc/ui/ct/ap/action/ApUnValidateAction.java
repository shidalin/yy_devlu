package nc.ui.ct.ap.action;

import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.List;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.ui.ct.action.ActionNameUtil;
import nc.ui.ct.action.CtScriptPFlowAction;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pub.beans.UIDialog;
import nc.ui.scmpub.action.SCMActionInitializer;
import nc.vo.ct.ap.entity.AggCtApVO;
import nc.vo.ct.ap.entity.CtApVO;
import nc.vo.ct.enumeration.CtFlowEnum;
import nc.vo.ct.rule.ActionStateRule;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.pub.ListToArrayTool;
import nc.vo.scmpub.res.SCMActionCode;

/**
 * <p>
 * 其他付合同取消生效action <b>本类主要完成以下功能：</b>
 * <ul>
 * <li>
 * </ul>
 * <p>
 * <p>
 * 
 * @version 6.0
 * @since 6.0
 * @author lizhengb
 * @time 2010-5-11 下午01:17:13
 */
@SuppressWarnings("restriction")
public class ApUnValidateAction extends CtScriptPFlowAction {

	private static final long serialVersionUID = 1L;
	private String sReason;

	public ApUnValidateAction() {
		SCMActionInitializer.initializeAction(this,
				SCMActionCode.CT_CANCELVALIDATE);
		// this.putValue(Action.ACCELERATOR_KEY,
		// KeyStroke.getKeyStroke(KeyEvent.VK_H,
		// InputEvent.CTRL_MASK));
		// this.putValue(Action.SHORT_DESCRIPTION, this.getBtnName());
	}

	/**
	 * 取消生效增加下游单据校验
	 * 
	 * @throws Exception
	 */
	public void checkFlowBills() throws Exception {
		// 新增弃审校验-如果存在付款申请记录不可以弃审
		AggCtApVO ctVo = (AggCtApVO) this.getModel().getSelectedData();
		CtApVO headVo = (CtApVO) ctVo.getParentVO();
		String srcpk = headVo.getPk_ct_ap();
		String sql = "select t.billno  from fukuandan t where nvl(t.dr,0)=0 and t.def1 = '"
				+ srcpk + "'";
		IUAPQueryBS query = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		List<Object> list = (List<Object>) query.executeQuery(sql,
				new ColumnListProcessor());
		if (list.size() > 0) {
			String codes = "";
			for (Object obj : list) {
				codes += obj.toString() + ",";
			}
			// 去除最后一个逗号
			codes = codes.substring(0, codes.length());
			throw new BusinessException("弃审失败!该单据存在下游付款申请记录,请删除下游单据再弃审。\n"
					+ "下游付款申请单据号为:" + codes);
		}
		// 新增弃审校验2-如果存在采购发票记录不可以弃审
		String sql_cgfp = "select t.vbillcode  from cgfp t where nvl(t.dr,0)=0 and t.vdef1 = '"
				+ srcpk + "'";
		List<Object> list_cgfp = (List<Object>) query.executeQuery(sql_cgfp,
				new BeanListProcessor(Object.class));
		if (list_cgfp.size() > 0) {
			String codes = "";
			for (Object obj : list) {
				codes += obj.toString() + ",";
			}
			// 去除最后一个逗号
			codes = codes.substring(0, codes.length());
			throw new BusinessException("弃审失败!该单据存在下游采购发票记录,请删除下游单据再弃审。\n"
					+ "下游采购发票单据号为:" + codes);
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
													 * @res "是否确定要取消该合同生效？"
													 */)) {
			this.sReason = (String) MessageDialog.showInputDlg(
					this.getModel().getContext().getEntranceUI(),
					nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID(
							"common", "UC000-0000900")/*
													 * @res "原因"
													 */,
					nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID(
							"4020003_0", "04020003-0022")/*
														 * @res "请输入取消合同生效的原因"
														 */, null, 120);
			super.doAction(e);
		}
	}

	@Override
	protected Object[] ctProcessBefore(AbstractBill[] vos) {
		List<AbstractBill> listDate = Arrays.asList(vos);
		ListToArrayTool<AbstractBill> tool = new ListToArrayTool<AbstractBill>();
		AbstractBill[] arrayBill = tool.convertToArray(listDate);
		ActionUtil.addNewExecVO((AggCtApVO[]) arrayBill,
				(Integer) CtFlowEnum.VALIDATE.value(), this.sReason,
				ActionNameUtil.getUNVALIDATE());
		return arrayBill;
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
