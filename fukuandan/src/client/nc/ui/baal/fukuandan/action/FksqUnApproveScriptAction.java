package nc.ui.baal.fukuandan.action;

import java.awt.event.ActionEvent;
import java.util.List;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.ui.pubapp.uif2app.actions.pflow.UNApproveScriptAction;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.fukuandan.entity.FukuandanVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.pub.SqlBuilder;

public class FksqUnApproveScriptAction extends UNApproveScriptAction {

	@Override
	public void doAction(ActionEvent e) throws Exception {
		// TODO 自动生成的方法存根
		// 新增弃审校验-如果存在付款申请记录不可以弃审
		AggFukuadanVO ctVo = (AggFukuadanVO) getModel().getSelectedData();
		FukuandanVO headVo = (FukuandanVO) ctVo.getParentVO();
		String srcpk = headVo.getPk_fukuandan();
		SqlBuilder sqlBuilder = new SqlBuilder();
		sqlBuilder.append("	select　ap_paybill.billno from ap_paybill 	");
		sqlBuilder.append("	inner join ap_payitem	");
		sqlBuilder.append("	on ap_paybill.pk_paybill= ap_payitem.pk_paybill	");
		sqlBuilder.append("	where nvl(ap_paybill.dr,0)=0	");
		sqlBuilder.append("	and nvl(ap_payitem.dr,0)=0	");
		sqlBuilder.append("	and ap_payitem.top_billid ='" + srcpk + "'	");
		sqlBuilder.append("	group by ap_paybill.billno	");
		String sql = sqlBuilder.toString();
		IUAPQueryBS query = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		List<Object> list = (List<Object>) query.executeQuery(sql,
				new ArrayListProcessor());
		if (list.size() > 0) {
			String codes = "";
			for (Object objs : list) {
				Object[] array = (Object[]) objs;
				codes += array[0].toString() + ",";
			}
			// 去除最后一个逗号
			codes = codes.substring(0, codes.length());
			throw new BusinessException("弃审失败!该单据存在下游付款单记录,请删除下游单据再弃审。\n"
					+ "下游付款单单据号为:" + codes);
		}
		super.doAction(e);
	}

}
