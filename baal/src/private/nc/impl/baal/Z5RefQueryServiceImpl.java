package nc.impl.baal;

/**
 * 销售发票转单实现类
 */
import java.util.ArrayList;
import java.util.List;

import nc.impl.pubapp.pattern.data.view.SchemeViewQuery;
import nc.itf.baal.Z5RefQueryService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.ct.ar.entity.AggCtArVO;
import nc.vo.ct.ar.entity.CtArBVO;
import nc.vo.ct.ar.entity.CtArVO;
import nc.vo.ct.ar.entity.CtArbillViewVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.pubapp.util.CombineViewToAggUtil;

import org.apache.commons.lang.ArrayUtils;

public class Z5RefQueryServiceImpl implements Z5RefQueryService {

	@Override
	public AggCtArVO[] queryZ5ForXsfp(IQueryScheme queryScheme)
			throws BusinessException {
		QuerySchemeProcessor processor = new QuerySchemeProcessor(queryScheme);
		// 过滤数据
		String whereSql = " and ct_ar.pk_ct_ar in (select t.pk_ct_ar from ct_ar t where nvl(t.dr,0)=0 and t.blatest = 'Y' and t.fstatusflag = '1' ) ";
		processor.appendWhere(whereSql);
		processor.appendRefTrantypeWhere("Z5", "XSFP", "vtrantypecode");
		SchemeViewQuery<CtArbillViewVO> query = new SchemeViewQuery<CtArbillViewVO>(
				CtArbillViewVO.class);
		CtArbillViewVO[] views = query.query(queryScheme, null);
		if (ArrayUtils.isEmpty(views)) {
			return null;
		}
		List<CtArbillViewVO> list = new ArrayList<CtArbillViewVO>();
		CtArbillViewVO[] views1 = null;
		for (CtArbillViewVO view : views) {
			CtArVO hvo = view.getHead();
			CtArBVO bvo = view.getItem();
			hvo.setPk_group(bvo.getPk_group());
			hvo.setPk_org(bvo.getPk_org());
			hvo.setPk_org_v(bvo.getPk_org_v());
			if (hvo.getVdef1() != null && !hvo.getVdef1().equals("")
					&& !hvo.getVdef1().equals("~")) {
				if (Double.parseDouble(hvo.getVdef1()) > 0)
					list.add(view);
			} else {
				list.add(view);
			}
		}
		if (list.size() > 0) {
			views1 = list.toArray(new CtArbillViewVO[list.size()]);
		} else {
			return null;
		}
		AggCtArVO[] aggvos = new CombineViewToAggUtil<AggCtArVO>(
				AggCtArVO.class, CtArVO.class, CtArBVO.class).combineViewToAgg(
				views1, CtArVO.PK_CT_AR);
		return aggvos;
	}

	@Override
	public AggCtArVO[] queryZ5ForZ4(IQueryScheme queryScheme)
			throws BusinessException {
		// TODO 自动生成的方法存根
		QuerySchemeProcessor processor = new QuerySchemeProcessor(queryScheme);
		// 过滤数据-未终止的合同（合同状态1：生效）
		String whereSql = " and ct_ar.pk_ct_ar in (select t.pk_ct_ar from ct_ar t where nvl(t.dr,0)=0 and t.blatest = 'Y' and t.fstatusflag = '1') ";
		processor.appendWhere(whereSql);
		processor.appendRefTrantypeWhere("Z5", "Z4", "vtrantypecode");
		SchemeViewQuery<CtArbillViewVO> query = new SchemeViewQuery<CtArbillViewVO>(
				CtArbillViewVO.class);
		CtArbillViewVO[] views = query.query(queryScheme, null);
		if (ArrayUtils.isEmpty(views)) {
			return null;
		}
//		List<CtArbillViewVO> list = new ArrayList<CtArbillViewVO>();
//		CtArbillViewVO[] views1 = null;
		for (CtArbillViewVO view : views) {
			CtArVO hvo = view.getHead();
			CtArBVO bvo = view.getItem();
			hvo.setPk_group(bvo.getPk_group());
			hvo.setPk_org(bvo.getPk_org());
			hvo.setPk_org_v(bvo.getPk_org_v());
		}
//		if (list.size() > 0) {
//			views1 = list.toArray(new CtArbillViewVO[list.size()]);
//		} else {
//			return null;
//		}
		AggCtArVO[] aggvos = new CombineViewToAggUtil<AggCtArVO>(
				AggCtArVO.class, CtArVO.class, CtArBVO.class).combineViewToAgg(
						views, CtArVO.PK_CT_AR);
		return aggvos;
	}

}
