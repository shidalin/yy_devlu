package nc.impl.baal;

import nc.impl.pub.ace.AceXsfpPubServiceImpl;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.xsfp.entity.AggXsfpVO;

public class XsfpMaintainImpl extends AceXsfpPubServiceImpl implements nc.itf.baal.IXsfpMaintain {

      @Override
    public void delete(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills) throws BusinessException {
        super.pubdeleteBills(clientFullVOs,originBills);
    }
  
      @Override
    public AggXsfpVO[] insert(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills) throws BusinessException {
        return super.pubinsertBills(clientFullVOs,originBills);
    }
    
      @Override
    public AggXsfpVO[] update(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills) throws BusinessException {
        return super.pubupdateBills(clientFullVOs,originBills);    
    }
  

  @Override
  public AggXsfpVO[] query(IQueryScheme queryScheme)
      throws BusinessException {
      return super.pubquerybills(queryScheme);
  }



  @Override
  public AggXsfpVO[] save(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills)
      throws BusinessException {
      return super.pubsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public AggXsfpVO[] unsave(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills)
      throws BusinessException {
      return super.pubunsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public AggXsfpVO[] approve(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills)
      throws BusinessException {
      return super.pubapprovebills(clientFullVOs,originBills);
  }

  @Override
  public AggXsfpVO[] unapprove(AggXsfpVO[] clientFullVOs,AggXsfpVO[] originBills)
      throws BusinessException {
      return super.pubunapprovebills(clientFullVOs,originBills);
  }

}
