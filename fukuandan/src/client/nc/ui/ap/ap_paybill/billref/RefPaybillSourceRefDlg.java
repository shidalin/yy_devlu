package nc.ui.ap.ap_paybill.billref;
/**
 * 来源单据显示类
 * 功能：查询后的选择框界面
 * 复写父类getRefBillInfoBeanPath(),
 * 加载拉单参照配置文件
 */
import java.awt.Container;

import nc.ui.pub.pf.BillSourceVar;
import nc.ui.pubapp.billref.src.view.SourceRefDlg;

public class RefPaybillSourceRefDlg extends SourceRefDlg {

	public RefPaybillSourceRefDlg(Container parent, BillSourceVar bsVar) {
		super(parent, bsVar);
		// TODO 自动生成的构造函数存根
	}



	private static final long serialVersionUID = 1L;


	/**
	 * 加载配置文件
	 */
	@Override
	public String getRefBillInfoBeanPath() {
		return "nc/ui/ap/ap_paybill/billref/FksqRefPaybillInfo.xml";
	}
}
