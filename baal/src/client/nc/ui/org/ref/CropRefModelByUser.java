package nc.ui.org.ref;

import nc.desktop.ui.WorkbenchEnvironment;
import nc.pub.utils.SqlInUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.sm.UserVO;
import nc.vo.uap.rbac.profile.FunctionPermProfileManager;
import nc.vo.uap.rbac.profile.IFunctionPermProfile;

/**
 * 根据当前登录用户过滤公司参照 1.bd_refinfo表注册相应信息
 * 
 * @author shidl
 * 
 */
public class CropRefModelByUser extends CorpDefaultRefModel {
	@Override
	public String getWherePart() {
		UserVO user = WorkbenchEnvironment.getInstance().getLoginUser(); // 获得当前登录的用户；
		IFunctionPermProfile profile = FunctionPermProfileManager.getInstance()
				.getProfile(user.getUser_code());
		String[] orgIDs = profile.getPermPkorgs();// 这样得到的便是当前登录用户有权限的组织集合。
		String sqlparam = "";
		try {
			sqlparam = nc.pubitf.bd.reportitem.pub.SqlUtils.getInStr("pk_org",
					orgIDs, true);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			ExceptionUtils.wrappBusinessException("组织按用户权限过滤查询失败");
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
