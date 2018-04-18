package nc.impl.baal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.bs.dao.BaseDAO;
import nc.impl.pub.ace.AceFukuandanPubServiceImpl;
import nc.impl.pubapp.pattern.data.view.SchemeViewQuery;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.ct.ap.entity.AggCtApVO;
import nc.vo.ct.ap.entity.CtApBVO;
import nc.vo.ct.ap.entity.CtApVO;
import nc.vo.ct.ap.entity.CtApViewVO;
import nc.vo.fukuandan.entity.AggFukuadanVO;
import nc.vo.fukuandan.entity.FukuandanVO;
import nc.vo.fukuandan.entity.FukuandanViewVO;
import nc.vo.fukuandan.entity.Fukuandan_bVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.pubapp.util.CombineViewToAggUtil;

import org.apache.commons.lang.ArrayUtils;

public class FukuandanMaintainImpl extends AceFukuandanPubServiceImpl implements
		nc.itf.baal.IFukuandanMaintain {

	@Override
	public void delete(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		super.pubdeleteBills(clientFullVOs, originBills);
	}

	@Override
	public AggFukuadanVO[] insert(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		return super.pubinsertBills(clientFullVOs, originBills);
	}

	@Override
	public AggFukuadanVO[] update(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		return super.pubupdateBills(clientFullVOs, originBills);
	}

	@Override
	public AggFukuadanVO[] query(IQueryScheme queryScheme)
			throws BusinessException {
		return super.pubquerybills(queryScheme);
	}

	@Override
	public AggFukuadanVO[] save(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		return super.pubsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggFukuadanVO[] unsave(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		return super.pubunsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggFukuadanVO[] approve(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		return super.pubapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggFukuadanVO[] unapprove(AggFukuadanVO[] clientFullVOs,
			AggFukuadanVO[] originBills) throws BusinessException {
		return super.pubunapprovebills(clientFullVOs, originBills);
	}

	@Override
	public AggFukuadanVO[] queryFksqRefPaybill(IQueryScheme queryScheme)
			throws BusinessException {
		QuerySchemeProcessor processor = new QuerySchemeProcessor(queryScheme);
		// 过滤数据 def1和def2存储自身作为下游单据信息，def3存储自身作为上游单据信息
		String whereSql = " and fukuandan.pk_fukuandan in (select t.pk_fukuandan from fukuandan t where nvl(t.dr,0)=0 and t.billstatus = 1  ) ";
		processor.appendWhere(whereSql);
		processor.appendRefTrantypeWhere("FKSQ", "F3", "vtrantypecode");
		SchemeViewQuery<FukuandanViewVO> query = new SchemeViewQuery<FukuandanViewVO>(
				FukuandanViewVO.class);
		//查询viewvo
		FukuandanViewVO[] views = query.query(queryScheme, null);
		if (ArrayUtils.isEmpty(views)) {
			return null;
		}
		ArrayList<String> pklist = new ArrayList<String>();
		for (FukuandanViewVO view : views) {
			FukuandanVO hvo = view.getHead();
			String pk = hvo.getPk_fukuandan();
			pklist.add(pk);
		}
		BaseDAO dao = new BaseDAO();
		String queryParam = nc.ui.devlu.util.StrUtil.getUnionInSQL(
				"pk_fukuandan", pklist.toArray(new String[pklist.size()]));
		String querysql = "select * from fukuandan where nvl(dr,0)=0 and "
				+ queryParam;
		//查询headvo
		List<nc.vo.fukuandan.entity.FukuandanVO> fklist = (List<FukuandanVO>) dao
				.executeQuery(querysql, new BeanListProcessor(
						nc.vo.fukuandan.entity.FukuandanVO.class));
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		//构造索引
		for (FukuandanVO fkvo : fklist) {
			if (!map.keySet().contains(fkvo.getPk_fukuandan())) {
				map.put(fkvo.getPk_fukuandan(), fkvo.getDef3());
			}
			if (!map1.keySet().contains(fkvo.getPk_fukuandan())) {
				map1.put(fkvo.getPk_fukuandan(), fkvo.getBillno());
			}
			if (!map2.keySet().contains(fkvo.getPk_fukuandan())) {
				map2.put(fkvo.getPk_fukuandan(), fkvo.getBilldate());
			}
		}
		List<FukuandanViewVO> list = new ArrayList<FukuandanViewVO>();
		for (FukuandanViewVO view : views) {
			FukuandanVO hvo = view.getHead();
			Fukuandan_bVO bvo = view.getItem();
			hvo.setPk_group(bvo.getPk_group());
			hvo.setPk_org(bvo.getPk_org());
			hvo.setPk_org_v(bvo.getPk_org_v());
			hvo.setPk_deptid(bvo.getPk_deptid());
			hvo.setPk_deptid_v(bvo.getPk_deptid_v());
			hvo.setPk_psndoc(bvo.getPk_psndoc());
			hvo.setSupplier(bvo.getSupplier());
			hvo.setDef3(map.get(hvo.getPk_fukuandan()) == null ? null : map
					.get(hvo.getPk_fukuandan()).toString());
			hvo.setBillno(map1.get(hvo.getPk_fukuandan()) == null ? null : map1
					.get(hvo.getPk_fukuandan()).toString());
			hvo.setBilldate(map2.get(hvo.getPk_fukuandan()) == null ? null
					: (UFDate) map2.get(hvo.getPk_fukuandan()));
			String def3 = hvo.getDef3();
			if (def3 != null && !def3.equals("") && !def3.equals("~")) {
				if (Double.parseDouble(def3) > 0) {
					list.add(view);
				}
			} else {
				list.add(view);
			}
		}
		FukuandanViewVO[] views1 = null;
		if (list.size() > 0) {
			views1 = list.toArray(new FukuandanViewVO[list.size()]);
		} else {
			return null;
		}
		//视图VO按照表头主键转换成聚合VO
		AggFukuadanVO[] aggvos = new CombineViewToAggUtil<AggFukuadanVO>(
				AggFukuadanVO.class, FukuandanVO.class, Fukuandan_bVO.class)
				.combineViewToAgg(views1, "pk_fukuandan");
		for (AggFukuadanVO agg : aggvos) {
			FukuandanVO hvo = agg.getParentVO();
			hvo.setDef3(map.get(hvo.getPk_fukuandan()) == null ? null : map
					.get(hvo.getPk_fukuandan()).toString());
			hvo.setBillno(map1.get(hvo.getPk_fukuandan()) == null ? null : map1
					.get(hvo.getPk_fukuandan()).toString());
			hvo.setBilldate(map2.get(hvo.getPk_fukuandan()) == null ? null
					: (UFDate) map2.get(hvo.getPk_fukuandan()));

		}
		return aggvos;
	}

	@Override
	public AggCtApVO[] queryZ4ForFksq(IQueryScheme queryScheme)
			throws BusinessException {
		QuerySchemeProcessor processor = new QuerySchemeProcessor(queryScheme);
		// 过滤数据
		String whereSql = " and ct_ap.pk_ct_ap in ( select t.pk_ct_ap from ct_ap t where nvl(t.dr,0)=0 and t.blatest = 'Y' and t.fstatusflag = '1' )";
		processor.appendWhere(whereSql);
		processor.appendRefTrantypeWhere("Z4", "FKSQ", "vtrantypecode");
		SchemeViewQuery<CtApViewVO> query = new SchemeViewQuery<CtApViewVO>(
				CtApViewVO.class);
		CtApViewVO[] views = query.query(queryScheme, null);
		if (ArrayUtils.isEmpty(views)) {
			return null;
		}
		List<CtApViewVO> list = new ArrayList<CtApViewVO>();
		CtApViewVO[] views1 = null;
		for (CtApViewVO view : views) {
			CtApVO hvo = view.getHead();
			CtApBVO bvo = view.getItem();
			hvo.setPk_group(bvo.getPk_group());
			hvo.setPk_org(bvo.getPk_org());
			hvo.setPk_org_v(bvo.getPk_org_v());
			String def3 = hvo.getVdef2();
			if (def3 != null && !def3.equals("") && !def3.equals("~")&&!"null".equals(def3)) {
				try {
					if (Double.parseDouble(def3) > 0) {
						list.add(view);
					}
				} catch (Exception e) {
					// TODO: handle exception
					CtApVO hvo1 = view.getHead();
				}
			} else {
				list.add(view);
			}
		}
		if (list.size() > 0) {
			views1 = list.toArray(new CtApViewVO[list.size()]);
		} else {
			return null;
		}
		AggCtApVO[] aggvos = new CombineViewToAggUtil<AggCtApVO>(
				AggCtApVO.class, CtApVO.class, CtApBVO.class).combineViewToAgg(
				views1, CtApVO.PK_CT_AP);
		return aggvos;
	}

	@Override
	public void updateBySql(String sql) throws BusinessException {
		// TODO 自动生成的方法存根
		BaseDAO dao = new BaseDAO();
		dao.executeUpdate(sql);
	}
}
