package nc.ui.devlu.billref;
/**
 * 其他付合同(z4)参照其他收合同(z5)
 */
import java.awt.event.ActionEvent;

import nc.ui.pub.pf.PfUtilClient;
import nc.ui.pubapp.uif2app.actions.AbstractReferenceAction;
import nc.ui.pubapp.uif2app.view.BillForm;
import nc.ui.uif2.UIState;
import nc.ui.uif2.model.AbstractAppModel;
import nc.vo.ct.ap.entity.AggCtApVO;

public class AddZ5Action extends AbstractReferenceAction {
	private static final long serialVersionUID = 1L;

	private BillForm editor;

	private AbstractAppModel model;

	@Override
	public void doAction(ActionEvent e) throws Exception {
		PfUtilClient.childButtonClicked(getSourceBillType(), getModel()
				.getContext().getPk_group(), getModel().getContext()
				.getPk_loginUser(), "Z4", getModel().getContext()
				.getEntranceUI(), null, null);
		if (PfUtilClient.isCloseOK()) {
			AggCtApVO[] vos = (AggCtApVO[]) PfUtilClient.getRetVos();
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
