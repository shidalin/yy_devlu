package nc.impl.baal;

import java.util.ArrayList;
import java.util.List;

import nc.impl.pubapp.pattern.data.view.SchemeViewQuery;
import nc.itf.baal.Z4RefQueryService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.ct.ap.entity.AggCtApVO;
import nc.vo.ct.ap.entity.CtApBVO;
import nc.vo.ct.ap.entity.CtApVO;
import nc.vo.ct.ap.entity.CtApViewVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.pubapp.util.CombineViewToAggUtil;

import org.apache.commons.lang.ArrayUtils;

public class Z4RefQueryServiceImpl implements Z4RefQueryService {

	@Override
	public AggCtApVO[] queryZ4ForCgfp(IQueryScheme queryScheme)
			throws BusinessException {
		QuerySchemeProcessor processor = new QuerySchemeProcessor(queryScheme);
		// ¹ýÂËÊý¾Ý
		String whereSql = " and ct_ap.pk_ct_ap in (select t.pk_ct_ap from ct_ap t where nvl(t.dr,0)=0 and t.blatest = 'Y' and t.fstatusflag = '1' ) ";
		processor.appendWhere(whereSql);
		processor.appendRefTrantypeWhere("Z4", "CGFP", "vtrantypecode");
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
			if (hvo.getVdef1() != null && !hvo.getVdef1().equals("")
					&& !hvo.getVdef1().equals("~")) {
				if (Double.parseDouble(hvo.getVdef1()) > 0)
					list.add(view);
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

}
