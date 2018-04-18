package nc.ui.baal.xsfp.ace.handler;

import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyBeforeEditEvent;
import nc.vo.xsfp.entity.XsfpBVO;
/**
 * �����ֶα༭ǰ�¼�������
 * 
 * @since 6.0
 * @version 2011-7-7 ����02:52:57
 * @author duy
 */
public class AceBodyBeforeEditHandler implements IAppEventHandler<CardBodyBeforeEditEvent> {

    @Override
    public void handleAppEvent(CardBodyBeforeEditEvent e) {
        e.setReturnValue(Boolean.TRUE);
         // ����
        String key = e.getKey();
        if (key.equals("cmaterialvid")) {
            nc.ui.baal.xsfp.handler.MaterialHandler handler = new nc.ui.baal.xsfp.handler.MaterialHandler();
            handler.beforeEdit(e);
        }
    }

}
