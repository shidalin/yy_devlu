package nc.ui.baal.fukuandan.ace.handler;

import java.util.List;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.ui.ml.NCLangRes;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.billform.AddEvent;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.AppContext;

public class AceAddHandler implements IAppEventHandler<AddEvent> {

	@Override
	public void handleAppEvent(AddEvent e) {
		BillCardPanel panel = e.getBillForm().getBillCardPanel();
		String pk_group = e.getContext().getPk_group();
		// String pk_org = e.getContext().getPk_org();
		String pk_org = null;
		try {
			pk_org = nc.pubitf.setting.defaultdata.OrgSettingAccessor
					.getDefaultOrgUnit();
			throw new Exception();
		} catch (Exception e2) {
		}
		String pk_user = e.getContext().getPk_loginUser();
		IUAPQueryBS query = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		StringBuffer sb = new StringBuffer();
		// ���ҵ�ǰ��¼�˹�������Ա����
		sb.append("	select t2.pk_psndoc, t3.pk_dept	")
				.append("	  from sm_user t1	")
				.append("	  left join bd_psndoc t2	")
				.append("	    on t1.pk_psndoc = t2.pk_psndoc	")
				.append("	  left join bd_psnjob t3	")
				.append("	    on t2.pk_psndoc = t3.pk_psndoc	")
				.append("	  left join org_dept t4	")
				.append("	    on t3.pk_dept = t4.pk_dept	")
				.append("	 where nvl(t1.dr, 0) = 0	")
				.append("	   and nvl(t2.dr, 0) = 0	")
				.append("	   and nvl(t3.dr, 0) = 0	")
				.append("	   and nvl(t4.dr, 0) = 0	")
				.append("	   and t1.cuserid = '" + pk_user + "'	");
		String sql = sb.toString();
		try {
			List<Object> list = (List<Object>) query.executeQuery(sql,
					new ArrayListProcessor());
			if (list != null && list.size() > 0) {
				Object[] objs = (Object[]) list.get(0);
				panel.setHeadItem("pk_deptid", objs[1]);
				panel.setHeadItem("pk_psndoc", objs[0]);
			}
		} catch (BusinessException e1) {
			// TODO �Զ����ɵ� catch ��
			ShowStatusBarMsgUtil.showErrorMsg(
					NCLangRes.getInstance().getStrByID("uif2",
							"ExceptionHandlerWithDLG-000000")/* ���� */,
					"��ǰ��¼�û�û�й�����Ա������Ϣ", e.getContext());
		}
		// ��������֯Ĭ��ֵ
		panel.setHeadItem("pk_group", pk_group);
		panel.setHeadItem("pk_org", pk_org);
		// ���õ���״̬������Ĭ��ֵ
		panel.setHeadItem("approvestatus", -1);
		panel.setHeadItem("billdate", AppContext.getInstance().getBusiDate());
		// �����ˣ�����ʱ�䣬�������ͱ��롢��������ϵͳ������״̬���������ͣ���������code���Ƶ���
		panel.setHeadItem("creator", pk_user);
		panel.setHeadItem("creationtime", new UFDateTime());
		panel.setTailItem("billmaker", pk_user);
		panel.setHeadItem("pk_billtype", "0001ZZ100000000043KD");
		panel.setHeadItem("syscode", 1);// ��������ϵͳ
		panel.setHeadItem("pk_tradetype", "FKSQ-Cxx-01");// ��������code
		panel.setHeadItem("pk_tradetypeid", "1001E41000000000JMPG");// ��������
		panel.setHeadItem("billstatus", -1);
	}

}
