// Decompiled by DJ v2.9.9.60 Copyright 2000 Atanas Neshkov  Date: 2004-08-10 09:03:07
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) ansi 
// Source File Name:   N_F3_DELETE.java

package nc.bs.pub.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import nc.bs.dao.BaseDAO;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.pay.PayBillItemVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fukuandan.entity.Fukuandan_bVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.pub.SqlBuilder;

public class N_F3_DELETE extends AbstractCompiler2 {
	// private Hashtable<String, Object> m_methodReturnHas = new
	// Hashtable<String, Object>();
	private Hashtable<String, Object> m_keyHas = null;

	/*
	 * ��ע��ƽ̨��д������ �ӿ�ִ����
	 */
	public Object runComClass(PfParameterVO paraVo) throws BusinessException {
		try {

			if (paraVo.m_preValueVos == null)
				return null;
			Object obj = null;// paraVo.m_workFlow.getTaskInfo().getTask().setStatus(1);
			super.m_tmpVo = paraVo;
			// ��������
			setParameter("context", paraVo.m_preValueVos);
			// Hashtable ret = this.procFlowBacth(paraVo);
			obj = runClass("nc.bs.arap.actions.PaybillDeleteBatchBSAction",
					"deleteVOs", "&context:nc.vo.pub.AggregatedValueObject[]",
					paraVo, m_keyHas);
			// if (obj != null)
			// m_methodReturnHas.put("deleteVOs", obj);
			reinfo(paraVo.m_preValueVo);
			return obj;
		} catch (Exception ex) {
			throw ExceptionHandler.handleException(this.getClass(), ex);
		}
	}

	public String getCodeRemark() {
		return " arap action script not allowed to modify ,all rights reserved!";
	}

	protected void setParameter(String key, Object val) {
		if (m_keyHas == null) {
			m_keyHas = new Hashtable<String, Object>();
		}
		if (val != null) {
			m_keyHas.put(key, val);
		}
	}

	// ɾ����д���ε��ݲ���
	private void reinfo(Object bill) throws BusinessException {
		// add-by-shidl-�������ϼ�����У����ϼ����ݻ�д
		// ���ε����ӱ�vdef11���ε��ݱ���ԭʼ���
		// ���ε����ӱ�vdef12���ε��ݱ���ʣ����
		// ���ε����ӱ�vdef12���ݱ���ʣ����
		BaseDAO baseDAO = new BaseDAO();
		if (bill != null && (bill instanceof AggPayBillVO)) {
			PayBillItemVO[] bodyVOs = ((AggPayBillVO) bill).getBodyVOs();
			if (bodyVOs == null || bodyVOs.length == 0) {
				return;
			}
			HashMap<String, PayBillItemVO> topItemPK2Bvo = new HashMap<String, PayBillItemVO>();
			HashMap<String, Fukuandan_bVO> fkItemPK2Bvo = new HashMap<String, Fukuandan_bVO>();
			for (PayBillItemVO bodyvo : bodyVOs) {
				String top_billtype = bodyvo.getTop_billtype();
				String top_itemid = bodyvo.getTop_itemid();
				if ("FKSQ".equals(top_billtype)) {
					topItemPK2Bvo.put(top_itemid, bodyvo);
				}
			}
			if (topItemPK2Bvo.keySet().size() > 0) {
				SqlBuilder sqlBuilder = new SqlBuilder();
				sqlBuilder
						.append("select * from fukuandan_b t where nvl(t.dr,0)=0 and  ");
				sqlBuilder.append(nc.pubitf.bd.reportitem.pub.SqlUtils
						.getInStr("t.pk_fukuandan_b", topItemPK2Bvo.keySet(),
								true));
				String queryFKSQSql = sqlBuilder.toString();
				List<Fukuandan_bVO> fuKuanDanList = (List<Fukuandan_bVO>) baseDAO
						.executeQuery(queryFKSQSql, new BeanListProcessor(
								Fukuandan_bVO.class));
				if (fuKuanDanList == null || fuKuanDanList.size() == 0) {
					return;
				}
				for (Fukuandan_bVO fkBvo : fuKuanDanList) {
					fkItemPK2Bvo.put(fkBvo.getPk_fukuandan_b(), fkBvo);
				}
				// ���ñ���vdef12-û�����ε��ݼ�¼
				for (PayBillItemVO payitem : topItemPK2Bvo.values()) {
					String def12 = payitem.getDef12();
					if (def12 == null || "".equals(def12.trim())) {
						payitem.setDef12(payitem.getDef11());
					}
				}
				StringBuffer message = new StringBuffer();
				ArrayList<Fukuandan_bVO> fkUpdateList = new ArrayList<Fukuandan_bVO>();
				// ���ݻ�д
				for (String pk_item : topItemPK2Bvo.keySet()) {
					PayBillItemVO payBillItemVO = topItemPK2Bvo.get(pk_item);
					String def12 = payBillItemVO.getDef12();// ����ʣ����
					UFDouble money_de = payBillItemVO.getMoney_de();// ��ǰ������
					UFDouble addnum = new UFDouble(def12).add(money_de);
					String top_itemid = payBillItemVO.getTop_itemid();
					Fukuandan_bVO fukuandan_bVO = fkItemPK2Bvo.get(top_itemid);
					// �����µ�ʣ��ɿ����
					fukuandan_bVO.setDef12(addnum.toString());
					fukuandan_bVO.setDr(0);
					fkUpdateList.add(fukuandan_bVO);
				}
				if (message.length() > 0) {
					ExceptionUtils.wrappBusinessException("ɾ��ʧ�ܣ�\n"
							+ message.toString());
				}
				// �������ݻ�д
				if (fkUpdateList.size() > 0) {
					baseDAO.updateVOList(fkUpdateList);
				}
			}
		}
	}

}