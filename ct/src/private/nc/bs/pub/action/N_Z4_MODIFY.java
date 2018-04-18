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
 * <b>������Ҫ������¹��ܣ�</b> ��������ͬ ��� ����
 * <ul>
 * <li>
 * </ul>
 * <p>
 * <p>
 * 
 * @version 6.0
 * @since 6.0
 * @author liuchx
 * @time 2010-5-18 ����02:16:53
 */
public class N_Z4_MODIFY extends AbstractCompiler2 {

	// private java.util.Hashtable m_methodReturnHas=new java.util.Hashtable();
	// private Hashtable m_keyHas=null;
	/**
	 * N_25_APPROVE ������ע�⡣
	 */
	public N_Z4_MODIFY() {
		super();
	}

	/*
	 * ��ע��ƽ̨��дԭʼ�ű�
	 */
	@Override
	public String getCodeRemark() {
		return "    nc.vo.ct.ap.entity.AggCtApVO inObject  =(nc.vo.ct.ap.entity.AggCtApVO) getVo();\n      setParameter(\"INVO\", inObject);\n return null;\n";
	}

	/*
	 * ��ע�����ýű�������HAS
	 */
	/*
	 * private void setParameter(String key,Object val) { if (m_keyHas==null){
	 * m_keyHas=new Hashtable(); } if (val!=null) { m_keyHas.put(key,val); } }
	 */
	@Override
	public Object runComClass(PfParameterVO vo) throws BusinessException {
		try {
			super.m_tmpVo = vo;

			/************* �����Ϊ����������������ʼ...���ܽ����޸� *********************/
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

	// ���У�����ε��ݺ͸������ε���
	private AggCtApVO[] processHandler(AggCtApVO[] vos) throws Exception {
		BaseDAO dao = new BaseDAO();
		nc.vo.ct.ap.entity.AggCtApVO[] vosold = (nc.vo.ct.ap.entity.AggCtApVO[]) this
				.getVos();
		HashMap<String,AggCtApVO> map = new HashMap<String,AggCtApVO>();
		for(AggCtApVO agg:vosold){
			map.put(agg.getParentVO().getPk_ct_ap(),agg);
		}
		for (AggCtApVO aggctap : vos) {
			// 1.��ѯԭ���ļ�˰�ϼ�ntotalorigmny
//			String querysql = "select t.ntotalorigmny from ct_ap t where nvl(t.dr,0)=0 and t.pk_ct_ap = '"
//					+ aggctap.getParentVO().getPk_ct_ap() + "'";
			// ��˰�ϼ�
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
			// ��˰�ϼƱ������
			if (ntotalorigmny_client.doubleValue() > ntotalorigmny_src
					.doubleValue()) {
				// ������
				Double changeValue = ntotalorigmny_client.doubleValue()
						- ntotalorigmny_src.doubleValue();
				Double updateValue = vdef4 - changeValue;
				Double updateValue1 = vdef1 + changeValue;
				Double updateValue2 = vdef2 + changeValue;
				// У�����Σ����������տɿ����vdef4,������vdef2
				if ("Z5".equals(bvo.getVsrctype())) {
					if (changeValue > vdef4) {
//						ExceptionUtils
//								.wrappBusinessException("��˰�ϼƱ���������βɹ���ͬ�ɿ�ʣ����");
					}
					// ������������
					String updatesql1 = "update ct_ar t set t.vdef2 = '"
							+ updateValue + "' where t.pk_ct_ar = '"
							+ bvo.getCsrcid() + "'";
					// ���±�������
					String updatesql2 = "update ct_ap t set t.vdef4 = '"
							+ updateValue + "' where t.pk_ct_ap = '"
							+ aggctap.getParentVO().getPk_ct_ap() + "'";
					aggctap.getParentVO().setVdef4(updateValue.toString());
					dao.executeUpdate(updatesql1);
					dao.executeUpdate(updatesql2);
				}
				// �������βɹ���Ʊ,�ɹ���Ʊ����z4ʣ���˰�ϼ�vdef2������vdef1
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
				// �������θ�������,��������vdef2,����vdef2
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
					.doubleValue()) {// ��˰�ϼƱ������
				// У������-�ɹ���Ʊ-��������
				// ���ٲ�����
				Double changeValue = ntotalorigmny_src.doubleValue()
						- ntotalorigmny_client.doubleValue();
				Double updateValue = vdef4 + changeValue;
				Double updateValue1 = vdef1 - changeValue;
				Double updateValue2 = vdef2 - changeValue;
				if ("Z5".equals(bvo.getVsrctype())) {
					// ������������
					String updatesql1 = "update ct_ar t set t.vdef2 = '"
							+ updateValue + "' where t.pk_ct_ar = '"
							+ bvo.getCsrcid() + "'";
					// ���±�������
					String updatesql2 = "update ct_ap t set t.vdef4 = '"
							+ updateValue + "' where t.pk_ct_ap = '"
							+ aggctap.getParentVO().getPk_ct_ap() + "'";
					aggctap.getParentVO().setVdef4(updateValue.toString());
					dao.executeUpdate(updatesql1);
					dao.executeUpdate(updatesql2);
				}
				// �������βɹ���Ʊ,�ɹ���Ʊ����z4ʣ���˰�ϼ�vdef2������vdef1
				if (count_cgfp > 0) {
					if (changeValue > vdef1) {
						ExceptionUtils
								.wrappBusinessException("��˰�ϼƱ���������βɹ���Ʊ�ɿ�ʣ����");
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
				// �������θ�������,��������vdef2,����vdef2
				if (count_fksq > 0) {
					if (changeValue > vdef2) {
						ExceptionUtils
								.wrappBusinessException("��˰�ϼƱ���������θ�������ɿ�ʣ����");
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
