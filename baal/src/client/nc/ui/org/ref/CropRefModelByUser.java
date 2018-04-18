package nc.ui.org.ref;

import nc.desktop.ui.WorkbenchEnvironment;
import nc.pub.utils.SqlInUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.sm.UserVO;
import nc.vo.uap.rbac.profile.FunctionPermProfileManager;
import nc.vo.uap.rbac.profile.IFunctionPermProfile;

/**
 * ���ݵ�ǰ��¼�û����˹�˾���� 1.bd_refinfo��ע����Ӧ��Ϣ
 * 
 * @author shidl
 * 
 */
public class CropRefModelByUser extends CorpDefaultRefModel {
	@Override
	public String getWherePart() {
		UserVO user = WorkbenchEnvironment.getInstance().getLoginUser(); // ��õ�ǰ��¼���û���
		IFunctionPermProfile profile = FunctionPermProfileManager.getInstance()
				.getProfile(user.getUser_code());
		String[] orgIDs = profile.getPermPkorgs();// �����õ��ı��ǵ�ǰ��¼�û���Ȩ�޵���֯���ϡ�
		String sqlparam = "";
		try {
			sqlparam = nc.pubitf.bd.reportitem.pub.SqlUtils.getInStr("pk_org",
					orgIDs, true);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			ExceptionUtils.wrappBusinessException("��֯���û�Ȩ�޹��˲�ѯʧ��");
		}
		String sql = " pk_corp in ( "
				+ " select pk_org from org_orgs t where orgtype2 = 'Y' and nvl(dr,0)=0 and "
				+ sqlparam + " ) ";
		String wherePart = super.getWherePart();
		if (null == wherePart || "".equals(wherePart.trim())) {
			wherePart = sql;
		} else {
			wherePart += " and " + sql;
		}
		return wherePart;
	}
}
