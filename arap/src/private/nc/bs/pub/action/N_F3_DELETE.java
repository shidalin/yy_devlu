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
	 * 备注：平台编写规则类 接口执行类
	 */
	public Object runComClass(PfParameterVO paraVo) throws BusinessException {
		try {

			if (paraVo.m_preValueVos == null)
				return null;
			Object obj = null;// paraVo.m_workFlow.getTaskInfo().getTask().setStatus(1);
			super.m_tmpVo = paraVo;
			// 批量操作
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

	// 删除回写上游单据操作
	private void reinfo(Object bill) throws BusinessException {
		// add-by-shidl-新增对上级数据校验和上级数据回写
		// 下游单据子表vdef11上游单据表体原始金额
		// 下游单据子表vdef12上游单据表体剩余金额
		// 上游单据子表vdef12单据表体剩余金额
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
				// 归置表体vdef12-没有下游单据记录
				for (PayBillItemVO payitem : topItemPK2Bvo.values()) {
					String def12 = payitem.getDef12();
					if (def12 == null || "".equals(def12.trim())) {
						payitem.setDef12(payitem.getDef11());
					}
				}
				StringBuffer message = new StringBuffer();
				ArrayList<Fukuandan_bVO> fkUpdateList = new ArrayList<Fukuandan_bVO>();
				// 数据回写
				for (String pk_item : topItemPK2Bvo.keySet()) {
					PayBillItemVO payBillItemVO = topItemPK2Bvo.get(pk_item);
					String def12 = payBillItemVO.getDef12();// 上游剩余金额
					UFDouble money_de = payBillItemVO.getMoney_de();// 当前付款金额
					UFDouble addnum = new UFDouble(def12).add(money_de);
					String top_itemid = payBillItemVO.getTop_itemid();
					Fukuandan_bVO fukuandan_bVO = fkItemPK2Bvo.get(top_itemid);
					// 设置新的剩余可开金额
					fukuandan_bVO.setDef12(addnum.toString());
					fukuandan_bVO.setDr(0);
					fkUpdateList.add(fukuandan_bVO);
				}
				if (message.length() > 0) {
					ExceptionUtils.wrappBusinessException("删除失败！\n"
							+ message.toString());
				}
				// 上游数据回写
				if (fkUpdateList.size() > 0) {
					baseDAO.updateVOList(fkUpdateList);
				}
			}
		}
	}

}