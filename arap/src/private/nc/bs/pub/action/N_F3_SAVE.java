// Decompiled by DJ v2.9.9.60 Copyright 2000 Atanas Neshkov  Date: 2004-08-10 09:03:09
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) ansi 
// Source File Name:   N_F3_SAVE.java

package nc.bs.pub.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import nc.bs.arap.actions.N_BASE_ACTION;
import nc.bs.dao.BaseDAO;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.pay.PayBillItemVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fukuandan.entity.Fukuandan_bVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.compiler.PfParameterVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.pub.SqlBuilder;

/**
 * fk(付款) F3(供应商付款单) D3(供应商付款单) ap_paybill ap_payitem </br>
 * #####################
 * #########################################################
 * #########################</br>
 * nc.bs.arap.actions.PaybillBatchSaveBSAction#invertVOs Agg+表名+VO 表名+BillVO
 * 表名+ItemVO</br>
 * 
 * @modified by liaobx 2010-7-6
 * @author guodw
 * 
 */

public class N_F3_SAVE extends N_BASE_ACTION {
	private Hashtable<String, Object> m_methodReturnHas;
	private Hashtable<String, Object> m_keyHas;

	public N_F3_SAVE() {
		m_methodReturnHas = new Hashtable<String, Object>();
	}

	public Object runComClass(PfParameterVO paraVo)
			throws nc.vo.pub.BusinessException {
		try {
			if (paraVo.m_preValueVos == null)
				return null;
			reinfo(paraVo.m_preValueVo);
			Object obj = null;
			super.m_tmpVo = paraVo;
			// // 走批量
			setParameter("context", paraVo.m_preValueVos);

			beforeCheck();

			obj = runClass("nc.bs.arap.actions.PaybillSaveBatchBSAction",
					"insertVOs", "&context:nc.vo.pub.AggregatedValueObject[]",
					paraVo, m_keyHas);
			// if (obj != null)
			// m_methodReturnHas.put("insertVOs", obj);
			afterCheck();

			return obj;
		} catch (Exception exception) {
			throw ExceptionHandler.handleException(this.getClass(), exception);

		}
	}

	protected void setParameter(String key, Object val) {
		if (m_keyHas == null) {
			m_keyHas = new Hashtable<String, Object>();
		}
		if (val != null) {
			m_keyHas.put(key, val);
		}
	}

	public String getCodeRemark() {
		return " arap action script not allowed to modify ,all rights reserved!";
	}

	/**
	 * 付款申请->付款单流程信息回写
	 * 
	 * @param bill
	 * @return
	 * @throws Exception
	 */
	public AggPayBillVO reinfo(AggregatedValueObject bill) throws Exception {
		// add-by-shidl-新增对上级数据校验和上级数据回写
		// 下游单据子表vdef11上游单据表体原始金额
		// 下游单据子表vdef12上游单据表体剩余金额
		// 上游单据子表vdef12单据表体剩余金额
		AggPayBillVO aggvo = null;
		BaseDAO baseDAO = new BaseDAO();
		if (bill != null && (bill instanceof AggPayBillVO)) {
			PayBillItemVO[] bodyVOs = ((AggPayBillVO) bill).getBodyVOs();
			if (bodyVOs == null || bodyVOs.length == 0) {
				return (AggPayBillVO) bill;
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
					return (AggPayBillVO) bill;
				}
				for (Fukuandan_bVO fkBvo : fuKuanDanList) {
					fkItemPK2Bvo.put(fkBvo.getPk_fukuandan_b(), fkBvo);
				}
				// 归置表体vdef12-没有下游单据记录
				for (PayBillItemVO payitem : topItemPK2Bvo.values()) {
					String def12 = payitem.getDef12();
					if (def12 == null || "".equals(def12.trim())) {
						payitem.setDef12(payitem.getDef11());
					}
				}
				StringBuffer message = new StringBuffer();
				ArrayList<Fukuandan_bVO> fkUpdateList = new ArrayList<Fukuandan_bVO>();
				// 数据校验
				for (String pk_item : topItemPK2Bvo.keySet()) {
					PayBillItemVO payBillItemVO = topItemPK2Bvo.get(pk_item);
					String def12 = payBillItemVO.getDef12();// 上游剩余金额
					UFDouble money_de = payBillItemVO.getMoney_de();// 当前付款金额
					UFDouble subnum = new UFDouble(def12).sub(money_de);
					if (subnum.compareTo(UFDouble.ZERO_DBL) < 0) {
						message.append("行号：" + payBillItemVO.getRowno()
								+ ",付款单明细金额超过付款申请明细可开最大金额\n");
					}
					payBillItemVO.setDef12(subnum.toString());
					String top_itemid = payBillItemVO.getTop_itemid();
					Fukuandan_bVO fukuandan_bVO = fkItemPK2Bvo.get(top_itemid);
					// 设置新的剩余可开金额
					fukuandan_bVO.setDef12(subnum.toString());
					fukuandan_bVO.setDr(0);
					fkUpdateList.add(fukuandan_bVO);
				}
				if (message.length() > 0) {
					ExceptionUtils.wrappBusinessException("保存失败！\n"
							+ message.toString());
				}
				// 上游数据回写
				if (fkUpdateList.size() > 0) {
					baseDAO.updateVOList(fkUpdateList);
				}
			}
		}
		return aggvo;
	}
}