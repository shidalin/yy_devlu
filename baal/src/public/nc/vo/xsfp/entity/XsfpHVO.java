package nc.vo.xsfp.entity;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class XsfpHVO extends SuperVO {
/**
*�����
*/
public String approver;
/**
*���ʱ��
*/
public UFDateTime approvetime;
/**
*�Ƶ���
*/
public String billmaker;
/**
*ҵ������
*/
public String cbiztypeid;
/**
*�ͻ������˺�
*/
public String ccustbankaccid;
/**
*����
*/
public String corigcurrencyid;
/**
*����ʱ��
*/
public UFDateTime creationtime;
/**
*������
*/
public String creator;
/**
*��Ʊ��ʵ��
*/
public String csaleinvoiceid;
/**
*��Ʊ����
*/
public String ctrantypeid;
/**
*��Ʊ����
*/
public UFDate dbilldate;
/**
*�Ƶ�����
*/
public UFDate dmakedate;
/**
*����״̬
*/
public Integer fstatusflag;
/**
*����޸�ʱ��
*/
public UFDate modifiedtime;
/**
*����޸���
*/
public String modifier;
/**
*��˰�ϼ�
*/
public UFDouble ntotalorigmny;
/**
*����
*/
public String pk_group;
/**
*��Ʊ��֯
*/
public String pk_org;
/**
*��Ʊ��֯�汾
*/
public String pk_org_v;
/**
*ʱ���
*/
public UFDateTime ts;
/**
*��Ʊ��
*/
public String vbillcode;
/**
*�Զ�����1
*/
public String vdef1;
/**
*�Զ�����10
*/
public String vdef10;
/**
*�Զ�����2
*/
public String vdef2;
/**
*�Զ�����3
*/
public String vdef3;
/**
*�Զ�����4
*/
public String vdef4;
/**
*�Զ�����5
*/
public String vdef5;
/**
*�Զ�����6
*/
public String vdef6;
/**
*�Զ�����7
*/
public String vdef7;
/**
*�Զ�����8
*/
public String vdef8;
/**
*�Զ�����9
*/
public String vdef9;
/**
*��Ʊ���ͱ���
*/
public String vtrantypecode;
/** 
* ��ȡ�����
*
* @return �����
*/
public String getApprover () {
return this.approver;
 } 

/** 
* ���������
*
* @param approver �����
*/
public void setApprover ( String approver) {
this.approver=approver;
 } 

/** 
* ��ȡ���ʱ��
*
* @return ���ʱ��
*/
public UFDateTime getApprovetime () {
return this.approvetime;
 } 

/** 
* �������ʱ��
*
* @param approvetime ���ʱ��
*/
public void setApprovetime ( UFDateTime approvetime) {
this.approvetime=approvetime;
 } 

/** 
* ��ȡ�Ƶ���
*
* @return �Ƶ���
*/
public String getBillmaker () {
return this.billmaker;
 } 

/** 
* �����Ƶ���
*
* @param billmaker �Ƶ���
*/
public void setBillmaker ( String billmaker) {
this.billmaker=billmaker;
 } 

/** 
* ��ȡҵ������
*
* @return ҵ������
*/
public String getCbiztypeid () {
return this.cbiztypeid;
 } 

/** 
* ����ҵ������
*
* @param cbiztypeid ҵ������
*/
public void setCbiztypeid ( String cbiztypeid) {
this.cbiztypeid=cbiztypeid;
 } 

/** 
* ��ȡ�ͻ������˺�
*
* @return �ͻ������˺�
*/
public String getCcustbankaccid () {
return this.ccustbankaccid;
 } 

/** 
* ���ÿͻ������˺�
*
* @param ccustbankaccid �ͻ������˺�
*/
public void setCcustbankaccid ( String ccustbankaccid) {
this.ccustbankaccid=ccustbankaccid;
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getCorigcurrencyid () {
return this.corigcurrencyid;
 } 

/** 
* ���ñ���
*
* @param corigcurrencyid ����
*/
public void setCorigcurrencyid ( String corigcurrencyid) {
this.corigcurrencyid=corigcurrencyid;
 } 

/** 
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDateTime getCreationtime () {
return this.creationtime;
 } 

/** 
* ���ô���ʱ��
*
* @param creationtime ����ʱ��
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getCreator () {
return this.creator;
 } 

/** 
* ���ô�����
*
* @param creator ������
*/
public void setCreator ( String creator) {
this.creator=creator;
 } 

/** 
* ��ȡ��Ʊ��ʵ��
*
* @return ��Ʊ��ʵ��
*/
public String getCsaleinvoiceid () {
return this.csaleinvoiceid;
 } 

/** 
* ���÷�Ʊ��ʵ��
*
* @param csaleinvoiceid ��Ʊ��ʵ��
*/
public void setCsaleinvoiceid ( String csaleinvoiceid) {
this.csaleinvoiceid=csaleinvoiceid;
 } 

/** 
* ��ȡ��Ʊ����
*
* @return ��Ʊ����
*/
public String getCtrantypeid () {
return this.ctrantypeid;
 } 

/** 
* ���÷�Ʊ����
*
* @param ctrantypeid ��Ʊ����
*/
public void setCtrantypeid ( String ctrantypeid) {
this.ctrantypeid=ctrantypeid;
 } 

/** 
* ��ȡ��Ʊ����
*
* @return ��Ʊ����
*/
public UFDate getDbilldate () {
return this.dbilldate;
 } 

/** 
* ���ÿ�Ʊ����
*
* @param dbilldate ��Ʊ����
*/
public void setDbilldate ( UFDate dbilldate) {
this.dbilldate=dbilldate;
 } 

/** 
* ��ȡ�Ƶ�����
*
* @return �Ƶ�����
*/
public UFDate getDmakedate () {
return this.dmakedate;
 } 

/** 
* �����Ƶ�����
*
* @param dmakedate �Ƶ�����
*/
public void setDmakedate ( UFDate dmakedate) {
this.dmakedate=dmakedate;
 } 

/** 
* ��ȡ����״̬
*
* @return ����״̬
* @see String
*/
public Integer getFstatusflag () {
return this.fstatusflag;
 } 

/** 
* ���õ���״̬
*
* @param fstatusflag ����״̬
* @see String
*/
public void setFstatusflag ( Integer fstatusflag) {
this.fstatusflag=fstatusflag;
 } 

/** 
* ��ȡ����޸�ʱ��
*
* @return ����޸�ʱ��
*/
public UFDate getModifiedtime () {
return this.modifiedtime;
 } 

/** 
* ��������޸�ʱ��
*
* @param modifiedtime ����޸�ʱ��
*/
public void setModifiedtime ( UFDate modifiedtime) {
this.modifiedtime=modifiedtime;
 } 

/** 
* ��ȡ����޸���
*
* @return ����޸���
*/
public String getModifier () {
return this.modifier;
 } 

/** 
* ��������޸���
*
* @param modifier ����޸���
*/
public void setModifier ( String modifier) {
this.modifier=modifier;
 } 

/** 
* ��ȡ��˰�ϼ�
*
* @return ��˰�ϼ�
*/
public UFDouble getNtotalorigmny () {
return this.ntotalorigmny;
 } 

/** 
* ���ü�˰�ϼ�
*
* @param ntotalorigmny ��˰�ϼ�
*/
public void setNtotalorigmny ( UFDouble ntotalorigmny) {
this.ntotalorigmny=ntotalorigmny;
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPk_group () {
return this.pk_group;
 } 

/** 
* ���ü���
*
* @param pk_group ����
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
 } 

/** 
* ��ȡ��Ʊ��֯
*
* @return ��Ʊ��֯
*/
public String getPk_org () {
return this.pk_org;
 } 

/** 
* ���ÿ�Ʊ��֯
*
* @param pk_org ��Ʊ��֯
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
 } 

/** 
* ��ȡ��Ʊ��֯�汾
*
* @return ��Ʊ��֯�汾
*/
public String getPk_org_v () {
return this.pk_org_v;
 } 

/** 
* ���ÿ�Ʊ��֯�汾
*
* @param pk_org_v ��Ʊ��֯�汾
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
 } 

/** 
* ��ȡʱ���
*
* @return ʱ���
*/
public UFDateTime getTs () {
return this.ts;
 } 

/** 
* ����ʱ���
*
* @param ts ʱ���
*/
public void setTs ( UFDateTime ts) {
this.ts=ts;
 } 

/** 
* ��ȡ��Ʊ��
*
* @return ��Ʊ��
*/
public String getVbillcode () {
return this.vbillcode;
 } 

/** 
* ���÷�Ʊ��
*
* @param vbillcode ��Ʊ��
*/
public void setVbillcode ( String vbillcode) {
this.vbillcode=vbillcode;
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getVdef1 () {
return this.vdef1;
 } 

/** 
* �����Զ�����1
*
* @param vdef1 �Զ�����1
*/
public void setVdef1 ( String vdef1) {
this.vdef1=vdef1;
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getVdef10 () {
return this.vdef10;
 } 

/** 
* �����Զ�����10
*
* @param vdef10 �Զ�����10
*/
public void setVdef10 ( String vdef10) {
this.vdef10=vdef10;
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getVdef2 () {
return this.vdef2;
 } 

/** 
* �����Զ�����2
*
* @param vdef2 �Զ�����2
*/
public void setVdef2 ( String vdef2) {
this.vdef2=vdef2;
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getVdef3 () {
return this.vdef3;
 } 

/** 
* �����Զ�����3
*
* @param vdef3 �Զ�����3
*/
public void setVdef3 ( String vdef3) {
this.vdef3=vdef3;
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getVdef4 () {
return this.vdef4;
 } 

/** 
* �����Զ�����4
*
* @param vdef4 �Զ�����4
*/
public void setVdef4 ( String vdef4) {
this.vdef4=vdef4;
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getVdef5 () {
return this.vdef5;
 } 

/** 
* �����Զ�����5
*
* @param vdef5 �Զ�����5
*/
public void setVdef5 ( String vdef5) {
this.vdef5=vdef5;
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getVdef6 () {
return this.vdef6;
 } 

/** 
* �����Զ�����6
*
* @param vdef6 �Զ�����6
*/
public void setVdef6 ( String vdef6) {
this.vdef6=vdef6;
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getVdef7 () {
return this.vdef7;
 } 

/** 
* �����Զ�����7
*
* @param vdef7 �Զ�����7
*/
public void setVdef7 ( String vdef7) {
this.vdef7=vdef7;
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getVdef8 () {
return this.vdef8;
 } 

/** 
* �����Զ�����8
*
* @param vdef8 �Զ�����8
*/
public void setVdef8 ( String vdef8) {
this.vdef8=vdef8;
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getVdef9 () {
return this.vdef9;
 } 

/** 
* �����Զ�����9
*
* @param vdef9 �Զ�����9
*/
public void setVdef9 ( String vdef9) {
this.vdef9=vdef9;
 } 

/** 
* ��ȡ��Ʊ���ͱ���
*
* @return ��Ʊ���ͱ���
*/
public String getVtrantypecode () {
return this.vtrantypecode;
 } 

/** 
* ���÷�Ʊ���ͱ���
*
* @param vtrantypecode ��Ʊ���ͱ���
*/
public void setVtrantypecode ( String vtrantypecode) {
this.vtrantypecode=vtrantypecode;
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("devlu.xsfp");
  }
}