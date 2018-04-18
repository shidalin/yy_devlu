package nc.ui.baal.xsfp.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.vo.xsfp.entity.AggXsfpVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.ui.pubapp.uif2app.actions.IDataOperationService;
import nc.ui.pubapp.uif2app.query2.model.IQueryService;
import nc.ui.uif2.components.pagination.IPaginationQueryService;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * 示例单据的操作代理
 * 
 * @since 6.0
 * @version 2011-7-6 上午08:31:09
 * @author duy
 */
public class AceXsfpMaintainProxy 
             implements 
                  IQueryService 
                     {
    @Override
    public Object[] queryByQueryScheme(IQueryScheme queryScheme) throws Exception {
        nc.itf.baal.IXsfpMaintain query = NCLocator.getInstance().lookup(nc.itf.baal.IXsfpMaintain.class);
        return query.query(queryScheme);
    }
    
}
