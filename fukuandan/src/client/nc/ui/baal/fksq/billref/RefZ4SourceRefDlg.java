package nc.ui.baal.fksq.billref;
/**
 * ��Դ������ʾ��
 * ���ܣ���ѯ���ѡ������
 * ��д����getRefBillInfoBeanPath(),
 * �����������������ļ�
 */
import java.awt.Container;

import nc.ui.pub.pf.BillSourceVar;
import nc.ui.pubapp.billref.src.view.SourceRefDlg;

public class RefZ4SourceRefDlg extends SourceRefDlg {

	public RefZ4SourceRefDlg(Container parent, BillSourceVar bsVar) {
		super(parent, bsVar);
		// TODO �Զ����ɵĹ��캯�����
	}



	private static final long serialVersionUID = 1L;


	/**
	 * ���������ļ�
	 */
	@Override
	public String getRefBillInfoBeanPath() {
		return "nc/ui/baal/fksq/billref/Z4RefFksqInfo.xml";
	}
}
