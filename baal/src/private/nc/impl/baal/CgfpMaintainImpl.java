package nc.impl.baal;

import nc.impl.pub.ace.AceCgfpPubServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.cgfp.entity.AggCgfpVO;
import nc.vo.pub.BusinessException;

public class CgfpMaintainImpl extends AceCgfpPubServiceImpl implements nc.itf.baal.ICgfpMaintain {

      @Override
    public void delete(AggCgfpVO[] clientFullVOs,AggCgfpVO[] originBills) throws BusinessException {
        super.pubdeleteBills(clientFullVOs,originBills);
    }
  
      @Override
    public AggCgfpVO[] insert(AggCgfpVO[] clientFullVOs,AggCgfpVO[] originBills) throws BusinessException {
        return super.pubinsertBills(clientFullVOs,originBills);
    }
    
      @Override
    public AggCgfpVO[] update(AggCgfpVO[] clientFullVOs,AggCgfpVO[] originBills) throws BusinessException {
        return super.pubupdateBills(clientFullVOs,originBills);    
    }
  

  @Override
  public AggCgfpVO[] query(IQueryScheme queryScheme)
      throws BusinessException {
      return super.pubquerybills(queryScheme);
  }



  @Override
  public AggCgfpVO[] save(AggCgfpVO[] clientFullVOs,AggCgfpVO[] originBills)
      throws BusinessException {
      return super.pubsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public AggCgfpVO[] unsave(AggCgfpVO[] clientFullVOs,AggCgfpVO[] originBills)
      throws BusinessException {
      return super.pubunsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public AggCgfpVO[] approve(AggCgfpVO[] clientFullVOs,AggCgfpVO[] originBills)
      throws BusinessException {
      return super.pubapprovebills(clientFullVOs,originBills);
  }

  @Override
  public AggCgfpVO[] unapprove(AggCgfpVO[] clientFullVOs,AggCgfpVO[] originBills)
      throws BusinessException {
      return super.pubunapprovebills(clientFullVOs,originBills);
  }

}
