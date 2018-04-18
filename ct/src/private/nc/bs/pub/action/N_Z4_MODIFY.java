package nc.bs.pub.action;

import java.util.HashMap;

import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.itf.ct.ap.IApApprove;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.ct.ap.entity.AggCtApVO;
import nc.vo.ct.ap.entity.CtApBVO;
import nc.vo.ct.ap.entity.CtApVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.compiler.PfParameterVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pflow.PfUserObject;
import nc.vo.uap.pf.PFBusinessException;

/**
 * <p>
 * <b>本类主要完成以下功能：</b> 其它付合同 变更 操作
 * <ul>
 * <li>
 * </ul>
 * <p>
 * <p>
 * 
 * @version 6.0
 * @since 6.0
 * @author liuchx
 * @time 2010-5-18 下午02:16:53
 */
public class N_Z4_MODIFY extends AbstractCompiler2 {

	// private java.util.Hashtable m_methodReturnHas=new java.util.Hashtable();
	// private Hashtable m_keyHas=null;
	/**
	 * N_25_APPROVE 构造子注解。
	 */
	public N_Z4_MODIFY() {
		super();
	}

	/*
	 * 备注：平台编写原始脚本
	 */
	@Override
	public String getCodeRemark() {
		return "    nc.vo.ct.ap.entity.AggCtApVO inObject  =(nc.vo.ct.ap.entity.AggCtApVO) getVo();\n      setParameter(\"INVO\", inObject);\n return null;\n";
	}

	/*
	 * 备注：设置脚本变量的HAS
	 */
	/*
	 * private void setParameter(String key,Object val) { if (m_keyHas==null){
	 * m_keyHas=new Hashtable(); } if (val!=null) { m_keyHas.put(key,val); } }
	 */
	@Override
	public Object runComClass(PfParameterVO vo) throws BusinessException {
		try {
			super.m_tmpVo = vo;

			/************* 该组件为批动作工作流处理开始...不能进行修改 *********************/
			Object retValue = null;
			PfUserObject userConfirm = (PfUserObject) this.getUserObj();
			nc.vo.ct.ap.entity.AggCtApVO[] vos = (nc.vo.ct.ap.entity.AggCtApVO[]) this
					.getVos();
			retValue = NCLocator.getInstance().lookup(IApApprove.class)
					.modify(vos, userConfirm);
			AggCtApVO[] vosnew =  processHandler((AggCtApVO[])retValue);
//			retValue = NCLocator.getInstance().lookup(IApApprove.class)
//					.modify(vos, userConfirm);
			return vosnew;
			/**************************************************************************/

		} catch (Exception ex) {
			if (ex instanceof BusinessException) {
				throw (BusinessException) ex;
			}
			throw new PFBusinessException(ex.getMessage(), ex);

		}
	}

	// 变更校验下游单据和更新下游单据
	private AggCtApVO[] processHandler(AggCtApVO[] vos) throws Exception {
		BaseDAO dao = new BaseDAO();
		nc.vo.ct.ap.entity.AggCtApVO[] vosold = (nc.vo.ct.ap.entity.AggCtApVO[]) this
				.getVos();
		HashMap<String,AggCtApVO> map = new HashMap<String,AggCtApVO>();
		for(AggCtApVO agg:vosold){
			map.put(agg.getParentVO().getPk_ct_ap(),agg);
		}
		for (AggCtApVO aggctap : vos) {
			// 1.查询原来的价税合计ntotalorigmny
//			String querysql = "select t.ntotalorigmny from ct_ap t where nvl(t.dr,0)=0 and t.pk_ct_ap = '"
//					+ aggctap.getParentVO().getPk_ct_ap() + "'";
			// 价税合计
//			Object obj = dao.executeQuery(querysql, new ColumnProcessor());
//			UFDouble ntotalorigmny_src = new UFDouble(obj == null ? "0"
//					: obj.toString());
			UFDouble ntotalorigmny_src = map.get(aggctap.getParentVO().getPk_ct_ap()).getParentVO().getNtotalorigmny();
			UFDouble ntotalorigmny_client = aggctap.getParentVO().getNtotalorigmny();
//			for (CircularlyAccessibleValueObject cavo : aggctap.getChildrenVO()) {
//				ntotalorigmny_client = ntotalorigmny_client
//						.add(((CtApBVO) cavo).getNorigtaxmny());
//			}
			CtApBVO bvo = (CtApBVO) aggctap.getAllChildrenVO()[0];
			Double vdef4 = aggctap.getParentVO().getVdef4() == null ? new Double(
					"0") : new Double(aggctap.getParentVO().getVdef4());
			Double vdef1 = aggctap.getParentVO().getVdef1() == null ? new Double(
					"0") : new Double(aggctap.getParentVO().getVdef1());
			Double vdef2 = aggctap.getParentVO().getVdef2() == null ? new Double(
					"0") : new Double(aggctap.getParentVO().getVdef2());
			String querycgfp = "select count(*) from cgfp_b t where nvl(t.dr,0)=0 and t.csourceid = '"
					+ aggctap.getParentVO().getPk_ct_ap() + "'";
			String queryfksq = "select count(*) from fukuandan_b t where nvl(t.dr,0)=0 and t.top_billid = '"
					+ aggctap.getParentVO().getPk_ct_ap() + "'";
			Integer count_cgfp = Integer.parseInt(dao.executeQuery(querycgfp,
					new ColumnProcessor()).toString());
			Integer count_fksq = Integer.parseInt(dao.executeQuery(queryfksq,
					new ColumnProcessor()).toString());
			// 价税合计变更增加
			if (ntotalorigmny_client.doubleValue() > ntotalorigmny_src
					.doubleValue()) {
				// 差异量
				Double changeValue = ntotalorigmny_client.doubleValue()
						- ntotalorigmny_src.doubleValue();
				Double updateValue = vdef4 - changeValue;
				Double updateValue1 = vdef1 + changeValue;
				Double updateValue2 = vdef2 + changeValue;
				// 校验上游，上游其他收可开金额vdef4,其他收vdef2
				if ("Z5".equals(bvo.getVsrctype())) {
					if (changeValue > vdef4) {
//						ExceptionUtils
//								.wrappBusinessException("价税合计变更金额超过上游采购合同可开剩余金额");
					}
					// 更新上游数据
					String updatesql1 = "update ct_ar t set t.vdef2 = '"
							+ updateValue + "' where t.pk_ct_ar = '"
							+ bvo.getCsrcid() + "'";
					// 更新本身数据
					String updatesql2 = "update ct_ap t set t.vdef4 = '"
							+ updateValue + "' where t.pk_ct_ap = '"
							+ aggctap.getParentVO().getPk_ct_ap() + "'";
					aggctap.getParentVO().setVdef4(updateValue.toString());
					dao.executeUpdate(updatesql1);
					dao.executeUpdate(updatesql2);
				}
				// 更新下游采购发票,采购发票上游z4剩余价税合计vdef2，本身vdef1
				if (count_cgfp > 0) {
					String updatesql1 = "update cgfp t set t.vdef2='"
							+ updateValue1
							+ "' where nvl(t.dr,0)=0 and t.pk_cgfp in ( select t1.pk_cgfp from cgfp_b t1 where nvl(t1.dr,0)=0 and t1.csourceid = '"
							+ aggctap.getParentVO().getPk_ct_ap() + "' )";
					String updatesql2 = "update ct_ap t set t.vdef1 = '"
							+ updateValue1 + "' where t.pk_ct_ap = '"
							+ aggctap.getParentVO().getPk_ct_ap() + "'";
					aggctap.getParentVO().setVdef1(updateValue1.toString());
					dao.executeUpdate(updatesql1);
					dao.executeUpdate(updatesql2);
				}
				// 更新下游付款申请,付款申请vdef2,自身vdef2
				if (count_fksq > 0) {
					String updatesql1 = "update fukuandan t set t.def2 = '"
							+ updateValue2
							+ "' where nvl(t.dr,0)=0 and t.pk_fukuandan in ( select t1.pk_fukuandan from fukuandan_b t1 where nvl(t1.dr,0)=0 and t1.top_billid = '"
							+ aggctap.getParentVO().getPk_ct_ap() + "')";
					String updatesql2 = "update ct_ap t set t.vdef2 = '"
							+ updateValue2 + "' where t.pk_ct_ap = '"
							+ aggctap.getParentVO().getPk_ct_ap() + "'";
					aggctap.getParentVO().setVdef2(updateValue2.toString());
					dao.executeUpdate(updatesql1);
					dao.executeUpdate(updatesql2);
				}

			} else if (ntotalorigmny_client.doubleValue() < ntotalorigmny_src
					.doubleValue()) {// 价税合计变更减少
				// 校验下游-采购发票-付款申请
				// 减少差异量
				Double changeValue = ntotalorigmny_src.doubleValue()
						- ntotalorigmny_client.doubleValue();
				Double updateValue = vdef4 + changeValue;
				Double updateValue1 = vdef1 - changeValue;
				Double updateValue2 = vdef2 - changeValue;
				if ("Z5".equals(bvo.getVsrctype())) {
					// 更新上游数据
					String updatesql1 = "update ct_ar t set t.vdef2 = '"
							+ updateValue + "' where t.pk_ct_ar = '"
							+ bvo.getCsrcid() + "'";
					// 更新本身数据
					String updatesql2 = "update ct_ap t set t.vdef4 = '"
							+ updateValue + "' where t.pk_ct_ap = '"
							+ aggctap.getParentVO().getPk_ct_ap() + "'";
					aggctap.getParentVO().setVdef4(updateValue.toString());
					dao.executeUpdate(updatesql1);
					dao.executeUpdate(updatesql2);
				}
				// 更新下游采购发票,采购发票上游z4剩余价税合计vdef2，本身vdef1
				if (count_cgfp > 0) {
					if (changeValue > vdef1) {
						ExceptionUtils
								.wrappBusinessException("价税合计变更金额超过下游采购发票可开剩余金额");
					}
					String updatesql1 = "update cgfp t set t.vdef2='"
							+ updateValue1
							+ "' where nvl(t.dr,0)=0 and t.pk_cgfp in ( select t1.pk_cgfp from cgfp_b t1 where nvl(t1.dr,0)=0 and t1.csourceid = '"
							+ aggctap.getParentVO().getPk_ct_ap() + "' )";
					String updatesql2 = "update ct_ap t set t.vdef1 = '"
							+ updateValue1 + "' where t.pk_ct_ap = '"
							+ aggctap.getParentVO().getPk_ct_ap() + "'";
					aggctap.getParentVO().setVdef1(updateValue1.toString());
					dao.executeUpdate(updatesql1);
					dao.executeUpdate(updatesql2);
				}
				// 更新下游付款申请,付款申请vdef2,自身vdef2
				if (count_fksq > 0) {
					if (changeValue > vdef2) {
						ExceptionUtils
								.wrappBusinessException("价税合计变更金额超过下游付款申请可开剩余金额");
					}
					String updatesql1 = "update fukuandan t set t.def2 = '"
							+ updateValue2
							+ "' where nvl(t.dr,0)=0 and t.pk_fukuandan in ( select t1.pk_fukuandan from fukuandan_b t1 where nvl(t1.dr,0)=0 and t1.top_billid = '"
							+ aggctap.getParentVO().getPk_ct_ap() + "')";
					String updatesql2 = "update ct_ap t set t.vdef2 = '"
							+ updateValue2 + "' where t.pk_ct_ap = '"
							+ aggctap.getParentVO().getPk_ct_ap() + "'";
					aggctap.getParentVO().setVdef2(updateValue2.toString());
					dao.executeUpdate(updatesql1);
					dao.executeUpdate(updatesql2);
				}

			} else if (ntotalorigmny_client.doubleValue() == ntotalorigmny_src
					.doubleValue()) {
				return vos;
			}
			String queryagg="select * from ct_ap t where nvl(t.dr,0)=0 and t.pk_ct_ap = '"
							+ aggctap.getParentVO().getPk_ct_ap() + "'";
			CtApVO hvo = (CtApVO)dao.executeQuery(queryagg,new nc.jdbc.framework.processor.BeanProcessor(CtApVO.class));
			aggctap.setParentVO(hvo);
		}
		return vos;
	}
}
