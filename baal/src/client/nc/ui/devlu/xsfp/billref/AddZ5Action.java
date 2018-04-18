package nc.ui.devlu.xsfp.billref;

import java.awt.event.ActionEvent;

import nc.ui.pub.pf.PfUtilClient;
import nc.ui.pubapp.uif2app.actions.AbstractReferenceAction;
import nc.ui.pubapp.uif2app.view.BillForm;
import nc.ui.uif2.UIState;
import nc.ui.uif2.model.AbstractAppModel;
import nc.vo.xsfp.entity.AggXsfpVO;

public class AddZ5Action extends AbstractReferenceAction {
	private static final long serialVersionUID = 1L;

	private BillForm editor;

	private AbstractAppModel model;

	@Override
	public void doAction(ActionEvent e) throws Exception {
		PfUtilClient.childButtonClicked(getSourceBillType(), getModel()
				.getContext().getPk_group(), getModel().getContext()
				.getPk_loginUser(), "XSFP", getModel().getContext()
				.getEntranceUI(), null, null);
		if (PfUtilClient.isCloseOK()) {
			AggXsfpVO[] vos = (AggXsfpVO[]) PfUtilClient.getRetVos();
			this.getTransferViewProcessor().processBillTransfer(vos);
		}

	}

	public BillForm getEditor() {
		return this.editor;
	}

	public AbstractAppModel getModel() {
		return this.model;
	}

	public void setEditor(BillForm editor) {
		this.editor = editor;
	}

	public void setModel(AbstractAppModel model) {
		this.model = model;
		model.addAppEventListener(this);
	}

	@Override
	protected boolean isActionEnable() {
		return this.model.getUiState() == UIState.NOT_EDIT;
	}

}
