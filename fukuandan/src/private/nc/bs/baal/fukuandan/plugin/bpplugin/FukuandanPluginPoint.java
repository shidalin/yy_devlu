package nc.bs.baal.fukuandan.plugin.bpplugin;

import nc.impl.pubapp.pattern.rule.plugin.IPluginPoint;

/**
 * ��׼���ݵ���չ�����
 * 
 */
public enum FukuandanPluginPoint implements IPluginPoint {
  /**
   * ����
   */
  APPROVE,
  /**
   * ɾ��
   */
  DELETE,
  /**
   * ����
   */
  INSERT,

  /**
   * ����
   */
  SEND_APPROVE,

  /**
   * ȡ�����
   */
  UNAPPROVE,

  /**
   * �ջ�
   */
  UNSEND_APPROVE,

  /**
   * ����
   */
  UPDATE,
  
  /**
   * �ű�ɾ��
   */
  SCRIPT_DELETE,
  /**
   * �ű�����
   */
  SCRIPT_INSERT,
  /**
   * �ű�����
   */
  SCRIPT_UPDATE;

  @Override
  public String getComponent() {
    return "fukuandan";
  }

  @Override
  public String getModule() {
    return "baal";
  }

  @Override
  public String getPoint() {
    return this.getClass().getName() + "." + this.name();
  }

}
