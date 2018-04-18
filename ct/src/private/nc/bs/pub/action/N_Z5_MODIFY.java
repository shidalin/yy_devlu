package nc.bs.pub.action;

import java.util.HashMap;

import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.itf.ct.ar.IArApprove;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.ct.ar.entity.AggCtArVO;
import nc.vo.ct.ar.entity.CtArVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pflow.PfUserObject;
import nc.vo.uap.pf.PFBusinessException;

/**
 * <p>
 * <b>������Ҫ������¹��ܣ�</b> �����պ�ͬ ��� ����
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
public class N_Z5_MODIFY extends AbstractCompiler2 {

	// private java.util.Hashtable m_methodReturnHas=new java.util.Hashtable();
	// private Hashtable m_keyHas=null;
	/**
	 * N_Z5_MODIFY ������ע�⡣
	 */
	public N_Z5_MODIFY() {
		super();
	}

	/*
	 * ��ע��ƽ̨��дԭʼ�ű�
	 */
	@Override
	public String getCodeRemark() {
		return "    nc.vo.ct.ar.entity.AggCtArVO inObject  =(nc.vo.ct.ar.entity.AggCtArVO) getVo();\n     setParameter(\"INVO\", inObject);\n return null;\n";
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
			nc.vo.ct.ar.entity.AggCtArVO[] vos = (nc.vo.ct.ar.entity.AggCtArVO[]) this
					.getVos();
			retValue = NCLocator.getInstance().lookup(IArApprove.class)
					.modify(vos, userConfirm);
			AggCtArVO[] vosnew = processHandler((AggCtArVO[]) retValue);
			return vosnew;
			/**************************************************************************/

		} catch (Exception ex) {
			if (ex instanceof BusinessException) {
				throw (BusinessException) ex;
			}
			throw new PFBusinessException(ex.getMessage(), ex);

		}
	}

	private AggCtArVO[] processHandler(AggCtArVO[] vos) throws Exception {
		// 1.���βɹ���ͬvdef4,����vdef2
		// 2.�������۷�Ʊvdef2,����vdef1
		BaseDAO dao = new BaseDAO();
		nc.vo.ct.ar.entity.AggCtArVO[] vosold = (nc.vo.ct.ar.entity.AggCtArVO[]) this
				.getVos();
		HashMap<String,AggCtArVO> map = new HashMap<String,AggCtArVO>();
		for (AggCtArVO aggctar : vosold) {
			map.put(aggctar.getParentVO().getPk_ct_ar(), aggctar);
		}
		for (AggCtArVO aggctar : vos) {
			// 1.��ѯԭ���ļ�˰�ϼ�ntotalorigmny
//			String querysql = "select t.ntotalorigmny from ct_ar t where nvl(t.dr,0)=0 and t.pk_ct_ar = '"
//					+ aggctar.getParentVO().getPk_ct_ar() + "'";
			// ��˰�ϼ�
//			Object obj = dao.executeQuery(querysql, new ColumnProcessor());
//			UFDouble ntotalorigmny_src = new UFDouble(obj == null ? "0"
//					: obj.toString());
			UFDouble ntotalorigmny_src = map.get(aggctar.getParentVO().getPk_ct_ar()).getParentVO()
					.getNtotalorigmny();
			UFDouble ntotalorigmny_client = aggctar.getParentVO()
					.getNtotalorigmny();
			Double vdef1 = aggctar.getParentVO().getVdef1() == null ? new Double(
					"0") : new Double(aggctar.getParentVO().getVdef1());
			Double vdef2 = aggctar.getParentVO().getVdef2() == null ? new Double(
					"0") : new Double(aggctar.getParentVO().getVdef2());
			String query_cght = "select count(*) from ct_ap_b t where nvl(t.dr,0)=0 and t.csrcid = '"
					+ aggctar.getParentVO().getPk_ct_ar() + "'";
			String query_xsfp = "select count(*) from xsfp_b  t where nvl(t.dr,0)=0 and t.csrcid = '"
					+ aggctar.getParentVO().getPk_ct_ar() + "'";
			Integer count_cght = Integer.parseInt(dao.executeQuery(query_cght,
					new ColumnProcessor()).toString());
			Integer count_sxfp = Integer.parseInt(dao.executeQuery(query_xsfp,
					new ColumnProcessor()).toString());
			// ��������У��
			if (ntotalorigmny_client.doubleValue() > ntotalorigmny_src
					.doubleValue()) {
				// ������
				Double changeValue = ntotalorigmny_client.doubleValue()
						- ntotalorigmny_src.doubleValue();
				// ���۷�Ʊ
				Double updateValue1 = vdef1 + changeValue;
				// �ɹ���ͬ
				Double updateValue2 = vdef2 + changeValue;
				if (count_cght > 0) {
					// �ɹ���ͬ
					String updatesql1 = "update ct_ap t set t.vdef4 = '"
							+ updateValue2
							+ "'  where nvl(t.dr,0)=0 and t.pk_ct_ap in ( select t1.pk_ct_ap from ct_ap_b t1 where nvl(t1.dr,0)=0 and t1.csrcid = '"
							+ aggctar.getParentVO().getPk_ct_ar() + "' )";
					// ����
					String updatesql2 = "update ct_ar t set  t.vdef2 = '"
							+ updateValue2
							+ "' where nvl(t.dr,0)=0  and t.pk_ct_ar = '"
							+ aggctar.getParentVO().getPk_ct_ar() + "'";
					aggctar.getParentVO().setVdef2(updateValue2.toString());
					dao.executeUpdate(updatesql1);
					dao.executeUpdate(updatesql2);
				}
				if (count_sxfp > 0) {
					// ���۷�Ʊ
					String updatesql1 = "update xsfp t set t.vdef2 = '"
							+ updateValue1
							+ "' where nvl(t.dr,0)=0 and t.csaleinvoiceid in ( select t1.csaleinvoiceid from xsfp_b t1 where nvl(t1.dr,0)=0 and t1.csrcid = '"
							+ aggctar.getParentVO().getPk_ct_ar() + "' )";
					// ����
					String updatesql2 = "update ct_ar t set  t.vdef1 = '"
							+ updateValue1
							+ "' where nvl(t.dr,0)=0  and t.pk_ct_ar = '"
							+ aggctar.getParentVO().getPk_ct_ar() + "'";
					aggctar.getParentVO().setVdef1(updateValue1.toString());
					dao.executeUpdate(updatesql1);
					dao.executeUpdate(updatesql2);
				}
			}
			// ������ҪУ��
			if (ntotalorigmny_client.doubleValue() < ntotalorigmny_src
					.doubleValue()) {
				// ������
				Double changeValue = ntotalorigmny_src.doubleValue()
						- ntotalorigmny_client.doubleValue();
				// ���۷�Ʊ
				Double updateValue1 = vdef1 - changeValue;
				// �ɹ���ͬ
				Double updateValue2 = vdef2 - changeValue;
				if (count_cght > 0) {
					if (updateValue2 < 0) {
//						ExceptionUtils
//								.wrappBusinessException("��˰�ϼƱ���������βɹ���ͬ�ɿ�ʣ����");
					}
					// �ɹ���ͬ
					String updatesql1 = "update ct_ap t set t.vdef4 = '"
							+ updateValue2
							+ "'  where nvl(t.dr,0)=0 and t.pk_ct_ap in ( select t1.pk_ct_ap from ct_ap_b t1 where nvl(t1.dr,0)=0 and t1.csrcid = '"
							+ aggctar.getParentVO().getPk_ct_ar() + "' )";
					// ����
					String updatesql2 = "update ct_ar t set  t.vdef2 = '"
							+ updateValue2
							+ "' where nvl(t.dr,0)=0  and t.pk_ct_ar = '"
							+ aggctar.getParentVO().getPk_ct_ar() + "'";
					aggctar.getParentVO().setVdef2(updateValue2.toString());
					dao.executeUpdate(updatesql1);
					dao.executeUpdate(updatesql2);
				}
				if (count_sxfp > 0) {
					if (updateValue1 < 0) {
						ExceptionUtils
								.wrappBusinessException("��˰�ϼƱ�������������۷�Ʊ�ɿ�ʣ����");
					}
					// ���۷�Ʊ
					String updatesql1 = "update xsfp t set t.vdef2 = '"
							+ updateValue1
							+ "' where nvl(t.dr,0)=0 and t.csaleinvoiceid in ( select t1.csaleinvoiceid from xsfp_b t1 where nvl(t1.dr,0)=0 and t1.csrcid = '"
							+ aggctar.getParentVO().getPk_ct_ar() + "' )";
					// ����
					String updatesql2 = "update ct_ar t set  t.vdef1 = '"
							+ updateValue1
							+ "' where nvl(t.dr,0)=0  and t.pk_ct_ar = '"
							+ aggctar.getParentVO().getPk_ct_ar() + "'";
					aggctar.getParentVO().setVdef1(updateValue1.toString());
					dao.executeUpdate(updatesql1);
					dao.executeUpdate(updatesql2);
				}
			}
			if (ntotalorigmny_client.doubleValue() == ntotalorigmny_src
					.doubleValue()) {
				return vos;
			}
			String queryagg="select * from ct_ar t where nvl(t.dr,0)=0 and t.pk_ct_ar = '"
					+ aggctar.getParentVO().getPk_ct_ar() + "'";
			CtArVO  hvo = (CtArVO)dao.executeQuery(queryagg,new nc.jdbc.framework.processor.BeanProcessor(CtArVO.class));
			aggctar.setParentVO(hvo);
		}
		return vos;
	}
}
