package nc.ui.devlu.xsfp.billref;

import java.awt.Container;

import nc.ui.pub.pf.BillSourceVar;
import nc.ui.pubapp.billref.src.view.SourceRefDlg;

public class RefZ5SourceRefDlg extends SourceRefDlg {

	public RefZ5SourceRefDlg(Container parent, BillSourceVar bsVar) {
		super(parent, bsVar);
		// TODO �Զ����ɵĹ��캯�����
	}

	private static final long serialVersionUID = 1L;

	/**
	 * ���������ļ�
	 */
	@Override
	public String getRefBillInfoBeanPath() {
		return "nc/ui/devlu/xsfp/billref/Z5RefXsfpInfo.xml";
	}
}
