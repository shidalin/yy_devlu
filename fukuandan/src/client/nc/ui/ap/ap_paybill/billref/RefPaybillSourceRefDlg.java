package nc.ui.ap.ap_paybill.billref;
/**
 * ��Դ������ʾ��
 * ���ܣ���ѯ���ѡ������
 * ��д����getRefBillInfoBeanPath(),
 * �����������������ļ�
 */
import java.awt.Container;

import nc.ui.pub.pf.BillSourceVar;
import nc.ui.pubapp.billref.src.view.SourceRefDlg;

public class RefPaybillSourceRefDlg extends SourceRefDlg {

	public RefPaybillSourceRefDlg(Container parent, BillSourceVar bsVar) {
		super(parent, bsVar);
		// TODO �Զ����ɵĹ��캯�����
	}



	private static final long serialVersionUID = 1L;


	/**
	 * ���������ļ�
	 */
	@Override
	public String getRefBillInfoBeanPath() {
		return "nc/ui/ap/ap_paybill/billref/FksqRefPaybillInfo.xml";
	}
}
