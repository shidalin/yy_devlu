// Decompiled by DJ v2.9.9.60 Copyright 2000 Atanas Neshkov  Date: 2004-08-10 09:02:59
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) ansi
// Source File Name:   N_F3_EDIT.java

package nc.bs.pub.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import nc.bs.arap.actions.N_BASE_ACTION;
import nc.bs.dao.BaseDAO;
import nc.itf.arap.fieldmap.IBillFieldGet;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.vo.arap.pay.AggPayBillVO;
import nc.vo.arap.pay.PayBillItemVO;
import nc.vo.arap.pay.PayBillVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.fukuandan.entity.Fukuandan_bVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.pub.SqlBuilder;
import nc.vo.pubapp.pflow.PfUserObject;

import org.apache.commons.lang.ArrayUtils;

public class N_F3_EDIT extends N_BASE_ACTION {
	// private final Hashtable<String, Object> m_methodReturnHas = new
	// Hashtable<String, Object>();
	private Hashtable<String, Object> m_keyHas = null;

	/*
	 * 备注：平台编写规则类 接口执行类
	 */
	@Override
	public Object runComClass(PfParameterVO paraVo) throws BusinessException {
		try {

			if (paraVo.m_preValueVos == null)
				return null;
			reinfo(paraVo.m_preValueVo);
			Object obj = null;// paraVo.m_workFlow.getTaskInfo().getTask().setStatus(1);
			super.m_tmpVo = paraVo;
			// 批量操作
			setParameter("context", paraVo.m_preValueVos);
			// Hashtable ret = this.procFlowBacth(paraVo);

			beforeCheck();

			if (getCommissionFlag()) {
				obj = runClass(
						"nc.bs.arap.actions.PaybillCommissonSaveBatchBSAction",
						"updateVOs",
						"&context:nc.vo.pub.AggregatedValueObject[]", paraVo,
						m_keyHas);
			} else {
				obj = runClass(
						"nc.bs.arap.actions.PaybillEditSaveBatchBSAction",
						"updateVOs",
						"&context:nc.vo.pub.AggregatedValueObject[]", paraVo,
						m_keyHas);
			}
			// if (obj != null)
			// m_methodReturnHas.put("updateVOs", obj);
			return obj;
		} catch (Exception ex) {
			throw ExceptionHandler.handleException(this.getClass(), ex);

		}
	}

	private boolean getCommissionFlag() {
		if (this.getUserObj() == null) {
			return false;
		}
		PfUserObject userObj = null;

		if (this.getUserObj() instanceof PfUserObject) {
			userObj = (PfUserObject) this.getUserObj();
		} else if (this.getUserObj() instanceof PfUserObject[]) {
			userObj = ArrayUtils.isEmpty((PfUserObject[]) this.getUserObj()) ? null
					: ((PfUserObject[]) this.getUserObj())[0];
		}

		if (userObj == null)
			return false;

		Boolean flag = userObj.getBusinessCheckMap().get(
				IBillFieldGet.ARAP_COMMISSION_FLAG);
		return flag == null ? false : flag.booleanValue();
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

	public AggPayBillVO reinfo(AggregatedValueObject bill) throws Exception {
		// add-by-shidl-新增对上级数据校验和上级数据回写
		// 下游单据子表vdef11上游单据表体原始金额
		// 下游单据子表vdef12上游单据表体剩余金额
		// 上游单据子表vdef12单据表体剩余金额
		AggPayBillVO aggvo = null;
		BaseDAO baseDAO = new BaseDAO();
		if (bill != null && (bill instanceof AggPayBillVO)) {
			aggvo = (AggPayBillVO) bill;
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
				// 查询数据库历史记录
				SqlBuilder sqlBuilder2 = new SqlBuilder();
				sqlBuilder2
						.append(" select * from ap_payitem t where nvl(t.dr,0)=0 and t.pk_paybill = '"
								+ ((PayBillVO) aggvo.getParentVO())
										.getPk_paybill() + "'");
				List<PayBillItemVO> payItemList_SRC = (List<PayBillItemVO>) baseDAO
						.executeQuery(sqlBuilder2.toString(),
								new BeanListProcessor(PayBillItemVO.class));
				HashMap<String, PayBillItemVO> pk2payItem_SRC = new HashMap<String, PayBillItemVO>();
				HashMap<String, PayBillItemVO> topItemPK2payItem_SRC = new HashMap<String, PayBillItemVO>();
				for (PayBillItemVO bvo : payItemList_SRC) {
					pk2payItem_SRC.put(bvo.getPk_payitem(), bvo);
					String top_billtype = bvo.getTop_billtype();
					String top_itemid = bvo.getTop_itemid();
					if ("FKSQ".equals(top_billtype)) {
						topItemPK2payItem_SRC.put(bvo.getTop_itemid(), bvo);
					}

				}
				SqlBuilder sqlBuilder = new SqlBuilder();
				sqlBuilder
						.append("select * from fukuandan_b t where nvl(t.dr,0)=0 and  ");
				sqlBuilder.append(nc.pubitf.bd.reportitem.pub.SqlUtils
						.getInStr("t.pk_fukuandan_b",
								topItemPK2payItem_SRC.keySet(), true));
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
				// 初始化表体vdef12-没有下游单据记录
				for (PayBillItemVO payitem : topItemPK2Bvo.values()) {
					String def12 = payitem.getDef12();
					if (def12 == null || "".equals(def12.trim())) {
						payitem.setDef12(payitem.getDef11());
					}
				}
				StringBuffer message = new StringBuffer();
				ArrayList<Fukuandan_bVO> fkUpdateList = new ArrayList<Fukuandan_bVO>();
				// 数据校验
				for (String pk_item : topItemPK2payItem_SRC.keySet()) {
					// 付款单界面修改行
					PayBillItemVO payBillItemVO_src = topItemPK2payItem_SRC
							.get(pk_item);
					if (topItemPK2Bvo.keySet().contains(pk_item)) {
						PayBillItemVO payBillItemVO = topItemPK2Bvo
								.get(pk_item);
						String def12 = payBillItemVO.getDef12();// 上游剩余金额
						String top_itemid = payBillItemVO.getTop_itemid();
						Fukuandan_bVO fukuandan_bVO = fkItemPK2Bvo
								.get(top_itemid);
						UFDouble money_de = payBillItemVO.getMoney_de();// 当前付款金额
						UFDouble money_de_src = payBillItemVO_src.getMoney_de();// 历史付款金额
						UFDouble subnum = new UFDouble(def12).sub(money_de)
								.add(money_de_src);
						if (subnum.compareTo(UFDouble.ZERO_DBL) < 0) {
							message.append("行号：" + payBillItemVO.getRowno()
									+ ",付款单明细金额超过付款申请明细可开最大金额\n");
						}
						payBillItemVO.setDef12(subnum.toString());
						// 设置新的剩余可开金额
						fukuandan_bVO.setDef12(subnum.toString());
						fukuandan_bVO.setDr(0);
						fkUpdateList.add(fukuandan_bVO);
					} else {// 付款单界面删除行
						String def12 = payBillItemVO_src.getDef12();// 上游剩余金额
						String top_itemid = payBillItemVO_src.getTop_itemid();
						Fukuandan_bVO fukuandan_bVO = fkItemPK2Bvo
								.get(top_itemid);
						UFDouble money_de_src = payBillItemVO_src.getMoney_de();// 历史付款金额
						UFDouble subnum = new UFDouble(def12).add(money_de_src);
						// 设置新的剩余可开金额
						fukuandan_bVO.setDef12(subnum.toString());
						fukuandan_bVO.setDr(0);
						fkUpdateList.add(fukuandan_bVO);
					}
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
		return (AggPayBillVO) bill;
	}
}