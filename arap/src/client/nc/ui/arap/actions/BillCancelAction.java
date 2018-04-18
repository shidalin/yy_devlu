package nc.ui.arap.actions;

import java.awt.event.ActionEvent;

import javax.swing.JComponent;

import nc.bs.arap.util.ArapBillType2TableMapping;
import nc.desktop.ui.WorkbenchEnvironment;
import nc.funcnode.ui.IFuncletWindow;
import nc.itf.arap.fieldmap.IBillFieldGet;
import nc.itf.cmp.busi.ISettleinfoCarrier;
import nc.ui.arap.model.ArapBillManageModel;
import nc.ui.arap.view.ArapToftPanelBase;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pub.linkoperate.ILinkType;
import nc.ui.pubapp.uif2app.actions.CancelAction;
import nc.ui.pubapp.uif2app.view.BillForm;
import nc.ui.uif2.IShowMsgConstant;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.pub.BillEnumCollection.FromSystem;
import nc.vo.pub.IAttributeMeta;
import nc.vo.pub.ISuperVO;

/**
 * 取消
 * 
 * @see
 * @author guodw
 * @version V6.0
 * @since V6.0
 */
@SuppressWarnings("restriction")
public class BillCancelAction extends CancelAction {
	private static final long serialVersionUID = 1L;
	private String pk_billtype;

	public BillCancelAction() {
		super();
	}

	@Override
	public void doAction(ActionEvent e) throws Exception {
		super.doAction(e);
		// @see BillOrgPanel.fireChangedEvent
		// //this.getModel().getContext().setPk_org(newPkOrg);
		// 需要在单据保存或者取消的时候将context中的pk_org设置为空或者默认组织
		if (!isCanceled()) {
			return;
		}

		this.getModel().getContext().setPk_org(null);

		ArapBillManageModel model = (ArapBillManageModel) getModel();
		if (model.getSelectedData() != null) {
			Object obj = model.getSelectedData();
			if (obj instanceof AggPayBillVO) {
				AggPayBillVO agg = (AggPayBillVO) obj;
				if (agg.getParentVO() != null) {
					nc.vo.arap.pay.PayBillVO paybill = (nc.vo.arap.pay.PayBillVO) agg
							.getParentVO();
					String pk = paybill.getPk_paybill();
					if (pk == null) {
						if (model.getSelectedOldRow() != -1) {
							model.setSelectedRow(model.getSelectedOldRow());
						} else {
							model.setSelectedRow(model.getSelectedRow());
						}
					}
				}
			}
			return;
		}

		if (getModel() instanceof ArapBillManageModel) {// 处理新增操作取消后，回显上一张单据
			model.setSelectedRow(model.getSelectedOldRow());
		}

		// 列表上没值的时候 , 界面上会存在 '业务类型','生效状态','金额'(这些通过billcardpanel上设置的)
		// 如果model上选中的数据,则跳过清除
		if (getModel().getSelectedData() != null) {
			return;
		}
		// 清空独立结算信息
		((ISettleinfoCarrier) getEditor()).setSettlementInfo(null);

		BillCardPanel bcp = ((BillForm) getEditor()).getBillCardPanel();
		Class<ISuperVO> vo = null;
		if (FromSystem.AR.VALUE.equals(bcp.getTailItem(
				IBillFieldGet.SRC_SYSCODE).getValueObject())) {
			vo = ArapBillType2TableMapping
					.getParentVOByBilltype(IBillFieldGet.F0);
		} else {
			vo = ArapBillType2TableMapping
					.getParentVOByBilltype(IBillFieldGet.F1);
		}

		if (vo != null) {
			String tableCode = (bcp.getBillData().getBodyTableCodes())[0];
			for (IAttributeMeta meta : vo.newInstance().getMetaData()
					.getAttributes()) {
				bcp.setHeadItem(meta.getName(), null);
			}

			int[] array = new int[bcp.getRowCount()];
			for (int row = 0; row < bcp.getRowCount(); row++) {
				array[row] = row;
			}
			bcp.getBillModel(tableCode).delLine(array);

		}

		JComponent entranceUI = this.getModel().getContext().getEntranceUI();
		if (entranceUI instanceof ArapToftPanelBase) {
			ArapToftPanelBase arapToftPanel = (ArapToftPanelBase) entranceUI;
			if (ILinkType.LINK_TYPE_ADD == arapToftPanel.getLinkType()) {
				IFuncletWindow[] allOpenedFuncletWindow = WorkbenchEnvironment
						.getInstance().getAllOpenedFuncletWindow();
				for (IFuncletWindow window : allOpenedFuncletWindow) {
					if (window.getCurrFunclet() instanceof ArapToftPanelBase) {
						if (((ArapToftPanelBase) window.getCurrFunclet())
								.getLinkType() != ILinkType.NONLINK_TYPE) {
							window.closeWindow();
						}
					}
				}
			} else {
				ShowStatusBarMsgUtil.showStatusBarMsg(IShowMsgConstant
						.getCancelInfo(), getModel().getContext());
			}

		}
	}

	public String getPk_billtype() {
		return pk_billtype;
	}

	public void setPk_billtype(String pkBilltype) {
		pk_billtype = pkBilltype;
	}

}
