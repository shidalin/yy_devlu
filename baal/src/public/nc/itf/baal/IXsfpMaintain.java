package nc.itf.baal;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.xsfp.entity.AggXsfpVO;
import nc.vo.pub.BusinessException;

public interface IXsfpMaintain {

    public void delete(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills) throws BusinessException;

    public AggXsfpVO[] insert(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills) throws BusinessException;
  
    public AggXsfpVO[] update(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills) throws BusinessException;


    public AggXsfpVO[] query(IQueryScheme queryScheme)
      throws BusinessException;

  public AggXsfpVO[] save(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills)
      throws BusinessException ;

  public AggXsfpVO[] unsave(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills)
      throws BusinessException ;

  public AggXsfpVO[] approve(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills)
      throws BusinessException ;

  public AggXsfpVO[] unapprove(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills)
      throws BusinessException ;
}
