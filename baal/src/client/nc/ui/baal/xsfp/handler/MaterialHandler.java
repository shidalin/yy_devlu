package nc.ui.baal.xsfp.handler;

import nc.ui.pub.beans.UIRefPane;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent;
import nc.ui.pubapp.uif2app.event.card.CardBodyBeforeEditEvent;
import nc.ui.pubapp.uif2app.view.util.RefMoreSelectedUtils;

/**
 * ���ϵı༭�¼�������
 * 
 * @since 6.0
 * @version 2011-7-7 ����02:44:20
 * @author duy
 */
public class MaterialHandler {
    /**
     * ���ϵı༭���¼�����
     * 
     * @param e �༭���¼�
     */
    public void afterEdit(CardBodyAfterEditEvent e) {
    }
    /**
     * ���ϵı༭ǰ�¼�����
     * 
     * @param e �༭ǰ�¼�����
     */
    public void beforeEdit(CardBodyBeforeEditEvent e) {
        BillCardPanel panel = e.getBillCardPanel();
        // �������ϵĲ��������ѡ
        UIRefPane refPane = (UIRefPane) panel.getBodyItem(e.getKey()).getComponent();
        refPane.setMultiSelectedEnabled(true);
        e.setReturnValue(Boolean.TRUE);
    }

}
