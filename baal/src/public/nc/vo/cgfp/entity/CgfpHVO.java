package nc.vo.cgfp.entity;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class CgfpHVO extends SuperVO {
/**
*������
*/
public static final String APPROVER="approver";
/**
*�Ѵ�Ӧ����־
*/
public static final String BAPFLAG="bapflag";
/**
*���÷�Ʊ
*/
public static final String BFEE="bfee";
/**
*����
*/
public static final String BFROZEN="bfrozen";
/**
*�Ƶ���
*/
public static final String BILLMAKER="billmaker";
/**
*�Ƿ��ڳ���Ʊ
*/
public static final String BINITIAL="binitial";
/**
*������˰
*/
public static final String BOPPTAXFLAG="bopptaxflag";
/**
*����ó��
*/
public static final String BTRIATRADEFLAG="btriatradeflag";
/**
*���ⷢƱ��־
*/
public static final String BVIRTUAL="bvirtual";
/**
*���ұ���
*/
public static final String CCURRENCYID="ccurrencyid";
/**
*����
*/
public static final String CORIGCURRENCYID="corigcurrencyid";
/**
*����ʱ��
*/
public static final String CREATIONTIME="creationtime";
/**
*������
*/
public static final String CREATOR="creator";
/**
*�ջ�����/����
*/
public static final String CRECECOUNTRYID="crececountryid";
/**
*��������/����
*/
public static final String CSENDCOUNTRYID="csendcountryid";
/**
*��˰����/����
*/
public static final String CTAXCOUNTRYID="ctaxcountryid";
/**
*ó������
*/
public static final String CTRADEWORDID="ctradewordid";
/**
*��Ʊ����
*/
public static final String CTRANTYPEID="ctrantypeid";
/**
*Ʊ������
*/
public static final String DARRIVEDATE="darrivedate";
/**
*��Ʊ����
*/
public static final String DBILLDATE="dbilldate";
/**
*�Ƶ�����
*/
public static final String DMAKEDATE="dmakedate";
/**
*����״̬
*/
public static final String FBILLSTATUS="fbillstatus";
/**
*��������
*/
public static final String FBUYSELLFLAG="fbuysellflag";
/**
*��Ʊ����
*/
public static final String FINVOICECLASS="finvoiceclass";
/**
*������˰���
*/
public static final String FTAXTYPEFLAGH="ftaxtypeflagh";
/**
*��ӡ����
*/
public static final String IPRINTCOUNT="iprintcount";
/**
*����޸�ʱ��
*/
public static final String MODIFIEDTIME="modifiedtime";
/**
*����޸���
*/
public static final String MODIFIER="modifier";
/**
*����
*/
public static final String NEXCHANGERATE="nexchangerate";
/**
*ȫ�ֱ�λ�һ���
*/
public static final String NGLOBALEXCHGRATE="nglobalexchgrate";
/**
*���ű�λ�һ���
*/
public static final String NGROUPEXCHGRATE="ngroupexchgrate";
/**
*����˰��
*/
public static final String NTAXRATEH="ntaxrateh";
/**
*��������
*/
public static final String NTOTALASTNUM="ntotalastnum";
/**
*������˰�ϼ�
*/
public static final String NTOTALORIGMNY="ntotalorigmny";
/**
*�����˻�
*/
public static final String PK_BANKACCBAS="pk_bankaccbas";
/**
*ҵ��Ա
*/
public static final String PK_BIZPSN="pk_bizpsn";
/**
*ҵ������
*/
public static final String PK_BUSITYPE="pk_busitype";
/**
*�ɹ���Ʊ
*/
public static final String PK_CGFP="pk_cgfp";
/**
*�ɹ�����
*/
public static final String PK_DEPT="pk_dept";
/**
*�ɹ�����
*/
public static final String PK_DEPT_V="pk_dept_v";
/**
*ɢ��
*/
public static final String PK_FREECUST="pk_freecust";
/**
*������
*/
public static final String PK_FROZENUSER="pk_frozenuser";
/**
*��������
*/
public static final String PK_GROUP="pk_group";
/**
*������֯
*/
public static final String PK_ORG="pk_org";
/**
*������֯
*/
public static final String PK_ORG_V="pk_org_v";
/**
*���÷�Ʊ��Ӧ���﷢Ʊ
*/
public static final String PK_PARENTINVOICE="pk_parentinvoice";
/**
*����Э��
*/
public static final String PK_PAYTERM="pk_payterm";
/**
*���λ
*/
public static final String PK_PAYTOSUPPLIER="pk_paytosupplier";
/**
*�ɹ���֯
*/
public static final String PK_PURCHASEORG="pk_purchaseorg";
/**
*�ɹ���֯
*/
public static final String PK_PURCHASEORG_V="pk_purchaseorg_v";
/**
*�����֯
*/
public static final String PK_STOCKORG="pk_stockorg";
/**
*�����֯
*/
public static final String PK_STOCKORG_V="pk_stockorg_v";
/**
*��Ӧ��
*/
public static final String PK_SUPPLIER="pk_supplier";
/**
*��������
*/
public static final String TAUDITTIME="taudittime";
/**
*��������
*/
public static final String TFROZENTIME="tfrozentime";
/**
*ʱ���
*/
public static final String TS="ts";
/**
*vbankaccount���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String VBANKACCOUNT="vbankaccount";
/**
*��Ʊ��
*/
public static final String VBILLCODE="vbillcode";
/**
*�Զ�����1
*/
public static final String VDEF1="vdef1";
/**
*�Զ�����10
*/
public static final String VDEF10="vdef10";
/**
*�Զ�����11
*/
public static final String VDEF11="vdef11";
/**
*�Զ�����12
*/
public static final String VDEF12="vdef12";
/**
*�Զ�����13
*/
public static final String VDEF13="vdef13";
/**
*�Զ�����14
*/
public static final String VDEF14="vdef14";
/**
*�Զ�����15
*/
public static final String VDEF15="vdef15";
/**
*�Զ�����16
*/
public static final String VDEF16="vdef16";
/**
*�Զ�����17
*/
public static final String VDEF17="vdef17";
/**
*�Զ�����18
*/
public static final String VDEF18="vdef18";
/**
*�Զ�����19
*/
public static final String VDEF19="vdef19";
/**
*�Զ�����2
*/
public static final String VDEF2="vdef2";
/**
*�Զ�����20
*/
public static final String VDEF20="vdef20";
/**
*�Զ�����3
*/
public static final String VDEF3="vdef3";
/**
*�Զ�����4
*/
public static final String VDEF4="vdef4";
/**
*�Զ�����5
*/
public static final String VDEF5="vdef5";
/**
*�Զ�����6
*/
public static final String VDEF6="vdef6";
/**
*�Զ�����7
*/
public static final String VDEF7="vdef7";
/**
*�Զ�����8
*/
public static final String VDEF8="vdef8";
/**
*�Զ�����9
*/
public static final String VDEF9="vdef9";
/**
*��󶳽�ԭ��
*/
public static final String VFROZENREASON="vfrozenreason";
/**
*��ע
*/
public static final String VMEMO="vmemo";
/**
*��Ʊ���ͱ���
*/
public static final String VTRANTYPECODE="vtrantypecode";
/**
*VATע����
*/
public static final String VVATCODE="vvatcode";
/**
*��Ӧ��VATע����
*/
public static final String VVENDORVATCODE="vvendorvatcode";
/** 
* ��ȡ������
*
* @return ������
*/
public String getApprover () {
return (String) this.getAttributeValue( CgfpHVO.APPROVER);
 } 

/** 
* ����������
*
* @param approver ������
*/
public void setApprover ( String approver) {
this.setAttributeValue( CgfpHVO.APPROVER,approver);
 } 

/** 
* ��ȡ�Ѵ�Ӧ����־
*
* @return �Ѵ�Ӧ����־
*/
public UFBoolean getBapflag () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BAPFLAG);
 } 

/** 
* �����Ѵ�Ӧ����־
*
* @param bapflag �Ѵ�Ӧ����־
*/
public void setBapflag ( UFBoolean bapflag) {
this.setAttributeValue( CgfpHVO.BAPFLAG,bapflag);
 } 

/** 
* ��ȡ���÷�Ʊ
*
* @return ���÷�Ʊ
*/
public UFBoolean getBfee () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BFEE);
 } 

/** 
* ���÷��÷�Ʊ
*
* @param bfee ���÷�Ʊ
*/
public void setBfee ( UFBoolean bfee) {
this.setAttributeValue( CgfpHVO.BFEE,bfee);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public UFBoolean getBfrozen () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BFROZEN);
 } 

/** 
* ���ö���
*
* @param bfrozen ����
*/
public void setBfrozen ( UFBoolean bfrozen) {
this.setAttributeValue( CgfpHVO.BFROZEN,bfrozen);
 } 

/** 
* ��ȡ�Ƶ���
*
* @return �Ƶ���
*/
public String getBillmaker () {
return (String) this.getAttributeValue( CgfpHVO.BILLMAKER);
 } 

/** 
* �����Ƶ���
*
* @param billmaker �Ƶ���
*/
public void setBillmaker ( String billmaker) {
this.setAttributeValue( CgfpHVO.BILLMAKER,billmaker);
 } 

/** 
* ��ȡ�Ƿ��ڳ���Ʊ
*
* @return �Ƿ��ڳ���Ʊ
*/
public UFBoolean getBinitial () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BINITIAL);
 } 

/** 
* �����Ƿ��ڳ���Ʊ
*
* @param binitial �Ƿ��ڳ���Ʊ
*/
public void setBinitial ( UFBoolean binitial) {
this.setAttributeValue( CgfpHVO.BINITIAL,binitial);
 } 

/** 
* ��ȡ������˰
*
* @return ������˰
*/
public UFBoolean getBopptaxflag () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BOPPTAXFLAG);
 } 

/** 
* ����������˰
*
* @param bopptaxflag ������˰
*/
public void setBopptaxflag ( UFBoolean bopptaxflag) {
this.setAttributeValue( CgfpHVO.BOPPTAXFLAG,bopptaxflag);
 } 

/** 
* ��ȡ����ó��
*
* @return ����ó��
*/
public UFBoolean getBtriatradeflag () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BTRIATRADEFLAG);
 } 

/** 
* ��������ó��
*
* @param btriatradeflag ����ó��
*/
public void setBtriatradeflag ( UFBoolean btriatradeflag) {
this.setAttributeValue( CgfpHVO.BTRIATRADEFLAG,btriatradeflag);
 } 

/** 
* ��ȡ���ⷢƱ��־
*
* @return ���ⷢƱ��־
*/
public UFBoolean getBvirtual () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BVIRTUAL);
 } 

/** 
* �������ⷢƱ��־
*
* @param bvirtual ���ⷢƱ��־
*/
public void setBvirtual ( UFBoolean bvirtual) {
this.setAttributeValue( CgfpHVO.BVIRTUAL,bvirtual);
 } 

/** 
* ��ȡ���ұ���
*
* @return ���ұ���
*/
public String getCcurrencyid () {
return (String) this.getAttributeValue( CgfpHVO.CCURRENCYID);
 } 

/** 
* ���ñ��ұ���
*
* @param ccurrencyid ���ұ���
*/
public void setCcurrencyid ( String ccurrencyid) {
this.setAttributeValue( CgfpHVO.CCURRENCYID,ccurrencyid);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getCorigcurrencyid () {
return (String) this.getAttributeValue( CgfpHVO.CORIGCURRENCYID);
 } 

/** 
* ���ñ���
*
* @param corigcurrencyid ����
*/
public void setCorigcurrencyid ( String corigcurrencyid) {
this.setAttributeValue( CgfpHVO.CORIGCURRENCYID,corigcurrencyid);
 } 

/** 
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDateTime getCreationtime () {
return (UFDateTime) this.getAttributeValue( CgfpHVO.CREATIONTIME);
 } 

/** 
* ���ô���ʱ��
*
* @param creationtime ����ʱ��
*/
public void setCreationtime ( UFDateTime creationtime) {
this.setAttributeValue( CgfpHVO.CREATIONTIME,creationtime);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getCreator () {
return (String) this.getAttributeValue( CgfpHVO.CREATOR);
 } 

/** 
* ���ô�����
*
* @param creator ������
*/
public void setCreator ( String creator) {
this.setAttributeValue( CgfpHVO.CREATOR,creator);
 } 

/** 
* ��ȡ�ջ�����/����
*
* @return �ջ�����/����
*/
public String getCrececountryid () {
return (String) this.getAttributeValue( CgfpHVO.CRECECOUNTRYID);
 } 

/** 
* �����ջ�����/����
*
* @param crececountryid �ջ�����/����
*/
public void setCrececountryid ( String crececountryid) {
this.setAttributeValue( CgfpHVO.CRECECOUNTRYID,crececountryid);
 } 

/** 
* ��ȡ��������/����
*
* @return ��������/����
*/
public String getCsendcountryid () {
return (String) this.getAttributeValue( CgfpHVO.CSENDCOUNTRYID);
 } 

/** 
* ���÷�������/����
*
* @param csendcountryid ��������/����
*/
public void setCsendcountryid ( String csendcountryid) {
this.setAttributeValue( CgfpHVO.CSENDCOUNTRYID,csendcountryid);
 } 

/** 
* ��ȡ��˰����/����
*
* @return ��˰����/����
*/
public String getCtaxcountryid () {
return (String) this.getAttributeValue( CgfpHVO.CTAXCOUNTRYID);
 } 

/** 
* ���ñ�˰����/����
*
* @param ctaxcountryid ��˰����/����
*/
public void setCtaxcountryid ( String ctaxcountryid) {
this.setAttributeValue( CgfpHVO.CTAXCOUNTRYID,ctaxcountryid);
 } 

/** 
* ��ȡó������
*
* @return ó������
*/
public String getCtradewordid () {
return (String) this.getAttributeValue( CgfpHVO.CTRADEWORDID);
 } 

/** 
* ����ó������
*
* @param ctradewordid ó������
*/
public void setCtradewordid ( String ctradewordid) {
this.setAttributeValue( CgfpHVO.CTRADEWORDID,ctradewordid);
 } 

/** 
* ��ȡ��Ʊ����
*
* @return ��Ʊ����
*/
public String getCtrantypeid () {
return (String) this.getAttributeValue( CgfpHVO.CTRANTYPEID);
 } 

/** 
* ���÷�Ʊ����
*
* @param ctrantypeid ��Ʊ����
*/
public void setCtrantypeid ( String ctrantypeid) {
this.setAttributeValue( CgfpHVO.CTRANTYPEID,ctrantypeid);
 } 

/** 
* ��ȡƱ������
*
* @return Ʊ������
*/
public UFDate getDarrivedate () {
return (UFDate) this.getAttributeValue( CgfpHVO.DARRIVEDATE);
 } 

/** 
* ����Ʊ������
*
* @param darrivedate Ʊ������
*/
public void setDarrivedate ( UFDate darrivedate) {
this.setAttributeValue( CgfpHVO.DARRIVEDATE,darrivedate);
 } 

/** 
* ��ȡ��Ʊ����
*
* @return ��Ʊ����
*/
public UFDate getDbilldate () {
return (UFDate) this.getAttributeValue( CgfpHVO.DBILLDATE);
 } 

/** 
* ���÷�Ʊ����
*
* @param dbilldate ��Ʊ����
*/
public void setDbilldate ( UFDate dbilldate) {
this.setAttributeValue( CgfpHVO.DBILLDATE,dbilldate);
 } 

/** 
* ��ȡ�Ƶ�����
*
* @return �Ƶ�����
*/
public UFDate getDmakedate () {
return (UFDate) this.getAttributeValue( CgfpHVO.DMAKEDATE);
 } 

/** 
* �����Ƶ�����
*
* @param dmakedate �Ƶ�����
*/
public void setDmakedate ( UFDate dmakedate) {
this.setAttributeValue( CgfpHVO.DMAKEDATE,dmakedate);
 } 

/** 
* ��ȡ����״̬
*
* @return ����״̬
* @see String
*/
public Integer getFbillstatus () {
return (Integer) this.getAttributeValue( CgfpHVO.FBILLSTATUS);
 } 

/** 
* ���õ���״̬
*
* @param fbillstatus ����״̬
* @see String
*/
public void setFbillstatus ( Integer fbillstatus) {
this.setAttributeValue( CgfpHVO.FBILLSTATUS,fbillstatus);
 } 

/** 
* ��ȡ��������
*
* @return ��������
* @see String
*/
public Integer getFbuysellflag () {
return (Integer) this.getAttributeValue( CgfpHVO.FBUYSELLFLAG);
 } 

/** 
* ���ù�������
*
* @param fbuysellflag ��������
* @see String
*/
public void setFbuysellflag ( Integer fbuysellflag) {
this.setAttributeValue( CgfpHVO.FBUYSELLFLAG,fbuysellflag);
 } 

/** 
* ��ȡ��Ʊ����
*
* @return ��Ʊ����
* @see String
*/
public Integer getFinvoiceclass () {
return (Integer) this.getAttributeValue( CgfpHVO.FINVOICECLASS);
 } 

/** 
* ���÷�Ʊ����
*
* @param finvoiceclass ��Ʊ����
* @see String
*/
public void setFinvoiceclass ( Integer finvoiceclass) {
this.setAttributeValue( CgfpHVO.FINVOICECLASS,finvoiceclass);
 } 

/** 
* ��ȡ������˰���
*
* @return ������˰���
* @see String
*/
public Integer getFtaxtypeflagh () {
return (Integer) this.getAttributeValue( CgfpHVO.FTAXTYPEFLAGH);
 } 

/** 
* ����������˰���
*
* @param ftaxtypeflagh ������˰���
* @see String
*/
public void setFtaxtypeflagh ( Integer ftaxtypeflagh) {
this.setAttributeValue( CgfpHVO.FTAXTYPEFLAGH,ftaxtypeflagh);
 } 

/** 
* ��ȡ��ӡ����
*
* @return ��ӡ����
*/
public Integer getIprintcount () {
return (Integer) this.getAttributeValue( CgfpHVO.IPRINTCOUNT);
 } 

/** 
* ���ô�ӡ����
*
* @param iprintcount ��ӡ����
*/
public void setIprintcount ( Integer iprintcount) {
this.setAttributeValue( CgfpHVO.IPRINTCOUNT,iprintcount);
 } 

/** 
* ��ȡ����޸�ʱ��
*
* @return ����޸�ʱ��
*/
public UFDateTime getModifiedtime () {
return (UFDateTime) this.getAttributeValue( CgfpHVO.MODIFIEDTIME);
 } 

/** 
* ��������޸�ʱ��
*
* @param modifiedtime ����޸�ʱ��
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.setAttributeValue( CgfpHVO.MODIFIEDTIME,modifiedtime);
 } 

/** 
* ��ȡ����޸���
*
* @return ����޸���
*/
public String getModifier () {
return (String) this.getAttributeValue( CgfpHVO.MODIFIER);
 } 

/** 
* ��������޸���
*
* @param modifier ����޸���
*/
public void setModifier ( String modifier) {
this.setAttributeValue( CgfpHVO.MODIFIER,modifier);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public UFDouble getNexchangerate () {
return (UFDouble) this.getAttributeValue( CgfpHVO.NEXCHANGERATE);
 } 

/** 
* ���û���
*
* @param nexchangerate ����
*/
public void setNexchangerate ( UFDouble nexchangerate) {
this.setAttributeValue( CgfpHVO.NEXCHANGERATE,nexchangerate);
 } 

/** 
* ��ȡȫ�ֱ�λ�һ���
*
* @return ȫ�ֱ�λ�һ���
*/
public UFDouble getNglobalexchgrate () {
return (UFDouble) this.getAttributeValue( CgfpHVO.NGLOBALEXCHGRATE);
 } 

/** 
* ����ȫ�ֱ�λ�һ���
*
* @param nglobalexchgrate ȫ�ֱ�λ�һ���
*/
public void setNglobalexchgrate ( UFDouble nglobalexchgrate) {
this.setAttributeValue( CgfpHVO.NGLOBALEXCHGRATE,nglobalexchgrate);
 } 

/** 
* ��ȡ���ű�λ�һ���
*
* @return ���ű�λ�һ���
*/
public UFDouble getNgroupexchgrate () {
return (UFDouble) this.getAttributeValue( CgfpHVO.NGROUPEXCHGRATE);
 } 

/** 
* ���ü��ű�λ�һ���
*
* @param ngroupexchgrate ���ű�λ�һ���
*/
public void setNgroupexchgrate ( UFDouble ngroupexchgrate) {
this.setAttributeValue( CgfpHVO.NGROUPEXCHGRATE,ngroupexchgrate);
 } 

/** 
* ��ȡ����˰��
*
* @return ����˰��
*/
public UFDouble getNtaxrateh () {
return (UFDouble) this.getAttributeValue( CgfpHVO.NTAXRATEH);
 } 

/** 
* ��������˰��
*
* @param ntaxrateh ����˰��
*/
public void setNtaxrateh ( UFDouble ntaxrateh) {
this.setAttributeValue( CgfpHVO.NTAXRATEH,ntaxrateh);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDouble getNtotalastnum () {
return (UFDouble) this.getAttributeValue( CgfpHVO.NTOTALASTNUM);
 } 

/** 
* ������������
*
* @param ntotalastnum ��������
*/
public void setNtotalastnum ( UFDouble ntotalastnum) {
this.setAttributeValue( CgfpHVO.NTOTALASTNUM,ntotalastnum);
 } 

/** 
* ��ȡ������˰�ϼ�
*
* @return ������˰�ϼ�
*/
public UFDouble getNtotalorigmny () {
return (UFDouble) this.getAttributeValue( CgfpHVO.NTOTALORIGMNY);
 } 

/** 
* ����������˰�ϼ�
*
* @param ntotalorigmny ������˰�ϼ�
*/
public void setNtotalorigmny ( UFDouble ntotalorigmny) {
this.setAttributeValue( CgfpHVO.NTOTALORIGMNY,ntotalorigmny);
 } 

/** 
* ��ȡ�����˻�
*
* @return �����˻�
*/
public String getPk_bankaccbas () {
return (String) this.getAttributeValue( CgfpHVO.PK_BANKACCBAS);
 } 

/** 
* ���������˻�
*
* @param pk_bankaccbas �����˻�
*/
public void setPk_bankaccbas ( String pk_bankaccbas) {
this.setAttributeValue( CgfpHVO.PK_BANKACCBAS,pk_bankaccbas);
 } 

/** 
* ��ȡҵ��Ա
*
* @return ҵ��Ա
*/
public String getPk_bizpsn () {
return (String) this.getAttributeValue( CgfpHVO.PK_BIZPSN);
 } 

/** 
* ����ҵ��Ա
*
* @param pk_bizpsn ҵ��Ա
*/
public void setPk_bizpsn ( String pk_bizpsn) {
this.setAttributeValue( CgfpHVO.PK_BIZPSN,pk_bizpsn);
 } 

/** 
* ��ȡҵ������
*
* @return ҵ������
*/
public String getPk_busitype () {
return (String) this.getAttributeValue( CgfpHVO.PK_BUSITYPE);
 } 

/** 
* ����ҵ������
*
* @param pk_busitype ҵ������
*/
public void setPk_busitype ( String pk_busitype) {
this.setAttributeValue( CgfpHVO.PK_BUSITYPE,pk_busitype);
 } 

/** 
* ��ȡ�ɹ���Ʊ
*
* @return �ɹ���Ʊ
*/
public String getPk_cgfp () {
return (String) this.getAttributeValue( CgfpHVO.PK_CGFP);
 } 

/** 
* ���òɹ���Ʊ
*
* @param pk_cgfp �ɹ���Ʊ
*/
public void setPk_cgfp ( String pk_cgfp) {
this.setAttributeValue( CgfpHVO.PK_CGFP,pk_cgfp);
 } 

/** 
* ��ȡ�ɹ�����
*
* @return �ɹ�����
*/
public String getPk_dept () {
return (String) this.getAttributeValue( CgfpHVO.PK_DEPT);
 } 

/** 
* ���òɹ�����
*
* @param pk_dept �ɹ�����
*/
public void setPk_dept ( String pk_dept) {
this.setAttributeValue( CgfpHVO.PK_DEPT,pk_dept);
 } 

/** 
* ��ȡ�ɹ�����
*
* @return �ɹ�����
*/
public String getPk_dept_v () {
return (String) this.getAttributeValue( CgfpHVO.PK_DEPT_V);
 } 

/** 
* ���òɹ�����
*
* @param pk_dept_v �ɹ�����
*/
public void setPk_dept_v ( String pk_dept_v) {
this.setAttributeValue( CgfpHVO.PK_DEPT_V,pk_dept_v);
 } 

/** 
* ��ȡɢ��
*
* @return ɢ��
*/
public String getPk_freecust () {
return (String) this.getAttributeValue( CgfpHVO.PK_FREECUST);
 } 

/** 
* ����ɢ��
*
* @param pk_freecust ɢ��
*/
public void setPk_freecust ( String pk_freecust) {
this.setAttributeValue( CgfpHVO.PK_FREECUST,pk_freecust);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getPk_frozenuser () {
return (String) this.getAttributeValue( CgfpHVO.PK_FROZENUSER);
 } 

/** 
* ���ö�����
*
* @param pk_frozenuser ������
*/
public void setPk_frozenuser ( String pk_frozenuser) {
this.setAttributeValue( CgfpHVO.PK_FROZENUSER,pk_frozenuser);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getPk_group () {
return (String) this.getAttributeValue( CgfpHVO.PK_GROUP);
 } 

/** 
* ������������
*
* @param pk_group ��������
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( CgfpHVO.PK_GROUP,pk_group);
 } 

/** 
* ��ȡ������֯
*
* @return ������֯
*/
public String getPk_org () {
return (String) this.getAttributeValue( CgfpHVO.PK_ORG);
 } 

/** 
* ���ò�����֯
*
* @param pk_org ������֯
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( CgfpHVO.PK_ORG,pk_org);
 } 

/** 
* ��ȡ������֯
*
* @return ������֯
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( CgfpHVO.PK_ORG_V);
 } 

/** 
* ���ò�����֯
*
* @param pk_org_v ������֯
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( CgfpHVO.PK_ORG_V,pk_org_v);
 } 

/** 
* ��ȡ���÷�Ʊ��Ӧ���﷢Ʊ
*
* @return ���÷�Ʊ��Ӧ���﷢Ʊ
*/
public String getPk_parentinvoice () {
return (String) this.getAttributeValue( CgfpHVO.PK_PARENTINVOICE);
 } 

/** 
* ���÷��÷�Ʊ��Ӧ���﷢Ʊ
*
* @param pk_parentinvoice ���÷�Ʊ��Ӧ���﷢Ʊ
*/
public void setPk_parentinvoice ( String pk_parentinvoice) {
this.setAttributeValue( CgfpHVO.PK_PARENTINVOICE,pk_parentinvoice);
 } 

/** 
* ��ȡ����Э��
*
* @return ����Э��
*/
public String getPk_payterm () {
return (String) this.getAttributeValue( CgfpHVO.PK_PAYTERM);
 } 

/** 
* ���ø���Э��
*
* @param pk_payterm ����Э��
*/
public void setPk_payterm ( String pk_payterm) {
this.setAttributeValue( CgfpHVO.PK_PAYTERM,pk_payterm);
 } 

/** 
* ��ȡ���λ
*
* @return ���λ
*/
public String getPk_paytosupplier () {
return (String) this.getAttributeValue( CgfpHVO.PK_PAYTOSUPPLIER);
 } 

/** 
* ���ø��λ
*
* @param pk_paytosupplier ���λ
*/
public void setPk_paytosupplier ( String pk_paytosupplier) {
this.setAttributeValue( CgfpHVO.PK_PAYTOSUPPLIER,pk_paytosupplier);
 } 

/** 
* ��ȡ�ɹ���֯
*
* @return �ɹ���֯
*/
public String getPk_purchaseorg () {
return (String) this.getAttributeValue( CgfpHVO.PK_PURCHASEORG);
 } 

/** 
* ���òɹ���֯
*
* @param pk_purchaseorg �ɹ���֯
*/
public void setPk_purchaseorg ( String pk_purchaseorg) {
this.setAttributeValue( CgfpHVO.PK_PURCHASEORG,pk_purchaseorg);
 } 

/** 
* ��ȡ�ɹ���֯
*
* @return �ɹ���֯
*/
public String getPk_purchaseorg_v () {
return (String) this.getAttributeValue( CgfpHVO.PK_PURCHASEORG_V);
 } 

/** 
* ���òɹ���֯
*
* @param pk_purchaseorg_v �ɹ���֯
*/
public void setPk_purchaseorg_v ( String pk_purchaseorg_v) {
this.setAttributeValue( CgfpHVO.PK_PURCHASEORG_V,pk_purchaseorg_v);
 } 

/** 
* ��ȡ�����֯
*
* @return �����֯
*/
public String getPk_stockorg () {
return (String) this.getAttributeValue( CgfpHVO.PK_STOCKORG);
 } 

/** 
* ���ÿ����֯
*
* @param pk_stockorg �����֯
*/
public void setPk_stockorg ( String pk_stockorg) {
this.setAttributeValue( CgfpHVO.PK_STOCKORG,pk_stockorg);
 } 

/** 
* ��ȡ�����֯
*
* @return �����֯
*/
public String getPk_stockorg_v () {
return (String) this.getAttributeValue( CgfpHVO.PK_STOCKORG_V);
 } 

/** 
* ���ÿ����֯
*
* @param pk_stockorg_v �����֯
*/
public void setPk_stockorg_v ( String pk_stockorg_v) {
this.setAttributeValue( CgfpHVO.PK_STOCKORG_V,pk_stockorg_v);
 } 

/** 
* ��ȡ��Ӧ��
*
* @return ��Ӧ��
*/
public String getPk_supplier () {
return (String) this.getAttributeValue( CgfpHVO.PK_SUPPLIER);
 } 

/** 
* ���ù�Ӧ��
*
* @param pk_supplier ��Ӧ��
*/
public void setPk_supplier ( String pk_supplier) {
this.setAttributeValue( CgfpHVO.PK_SUPPLIER,pk_supplier);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDateTime getTaudittime () {
return (UFDateTime) this.getAttributeValue( CgfpHVO.TAUDITTIME);
 } 

/** 
* ������������
*
* @param taudittime ��������
*/
public void setTaudittime ( UFDateTime taudittime) {
this.setAttributeValue( CgfpHVO.TAUDITTIME,taudittime);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDate getTfrozentime () {
return (UFDate) this.getAttributeValue( CgfpHVO.TFROZENTIME);
 } 

/** 
* ���ö�������
*
* @param tfrozentime ��������
*/
public void setTfrozentime ( UFDate tfrozentime) {
this.setAttributeValue( CgfpHVO.TFROZENTIME,tfrozentime);
 } 

/** 
* ��ȡʱ���
*
* @return ʱ���
*/
public UFDateTime getTs () {
return (UFDateTime) this.getAttributeValue( CgfpHVO.TS);
 } 

/** 
* ����ʱ���
*
* @param ts ʱ���
*/
public void setTs ( UFDateTime ts) {
this.setAttributeValue( CgfpHVO.TS,ts);
 } 

/** 
* ��ȡvbankaccount���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return vbankaccount
*/
public String getVbankaccount () {
return (String) this.getAttributeValue( CgfpHVO.VBANKACCOUNT);
 } 

/** 
* ����vbankaccount���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param vbankaccount vbankaccount
*/
public void setVbankaccount ( String vbankaccount) {
this.setAttributeValue( CgfpHVO.VBANKACCOUNT,vbankaccount);
 } 

/** 
* ��ȡ��Ʊ��
*
* @return ��Ʊ��
*/
public String getVbillcode () {
return (String) this.getAttributeValue( CgfpHVO.VBILLCODE);
 } 

/** 
* ���÷�Ʊ��
*
* @param vbillcode ��Ʊ��
*/
public void setVbillcode ( String vbillcode) {
this.setAttributeValue( CgfpHVO.VBILLCODE,vbillcode);
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getVdef1 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF1);
 } 

/** 
* �����Զ�����1
*
* @param vdef1 �Զ�����1
*/
public void setVdef1 ( String vdef1) {
this.setAttributeValue( CgfpHVO.VDEF1,vdef1);
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getVdef10 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF10);
 } 

/** 
* �����Զ�����10
*
* @param vdef10 �Զ�����10
*/
public void setVdef10 ( String vdef10) {
this.setAttributeValue( CgfpHVO.VDEF10,vdef10);
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public String getVdef11 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF11);
 } 

/** 
* �����Զ�����11
*
* @param vdef11 �Զ�����11
*/
public void setVdef11 ( String vdef11) {
this.setAttributeValue( CgfpHVO.VDEF11,vdef11);
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getVdef12 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF12);
 } 

/** 
* �����Զ�����12
*
* @param vdef12 �Զ�����12
*/
public void setVdef12 ( String vdef12) {
this.setAttributeValue( CgfpHVO.VDEF12,vdef12);
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getVdef13 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF13);
 } 

/** 
* �����Զ�����13
*
* @param vdef13 �Զ�����13
*/
public void setVdef13 ( String vdef13) {
this.setAttributeValue( CgfpHVO.VDEF13,vdef13);
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getVdef14 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF14);
 } 

/** 
* �����Զ�����14
*
* @param vdef14 �Զ�����14
*/
public void setVdef14 ( String vdef14) {
this.setAttributeValue( CgfpHVO.VDEF14,vdef14);
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public String getVdef15 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF15);
 } 

/** 
* �����Զ�����15
*
* @param vdef15 �Զ�����15
*/
public void setVdef15 ( String vdef15) {
this.setAttributeValue( CgfpHVO.VDEF15,vdef15);
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getVdef16 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF16);
 } 

/** 
* �����Զ�����16
*
* @param vdef16 �Զ�����16
*/
public void setVdef16 ( String vdef16) {
this.setAttributeValue( CgfpHVO.VDEF16,vdef16);
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getVdef17 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF17);
 } 

/** 
* �����Զ�����17
*
* @param vdef17 �Զ�����17
*/
public void setVdef17 ( String vdef17) {
this.setAttributeValue( CgfpHVO.VDEF17,vdef17);
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getVdef18 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF18);
 } 

/** 
* �����Զ�����18
*
* @param vdef18 �Զ�����18
*/
public void setVdef18 ( String vdef18) {
this.setAttributeValue( CgfpHVO.VDEF18,vdef18);
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getVdef19 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF19);
 } 

/** 
* �����Զ�����19
*
* @param vdef19 �Զ�����19
*/
public void setVdef19 ( String vdef19) {
this.setAttributeValue( CgfpHVO.VDEF19,vdef19);
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getVdef2 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF2);
 } 

/** 
* �����Զ�����2
*
* @param vdef2 �Զ�����2
*/
public void setVdef2 ( String vdef2) {
this.setAttributeValue( CgfpHVO.VDEF2,vdef2);
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getVdef20 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF20);
 } 

/** 
* �����Զ�����20
*
* @param vdef20 �Զ�����20
*/
public void setVdef20 ( String vdef20) {
this.setAttributeValue( CgfpHVO.VDEF20,vdef20);
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getVdef3 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF3);
 } 

/** 
* �����Զ�����3
*
* @param vdef3 �Զ�����3
*/
public void setVdef3 ( String vdef3) {
this.setAttributeValue( CgfpHVO.VDEF3,vdef3);
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getVdef4 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF4);
 } 

/** 
* �����Զ�����4
*
* @param vdef4 �Զ�����4
*/
public void setVdef4 ( String vdef4) {
this.setAttributeValue( CgfpHVO.VDEF4,vdef4);
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getVdef5 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF5);
 } 

/** 
* �����Զ�����5
*
* @param vdef5 �Զ�����5
*/
public void setVdef5 ( String vdef5) {
this.setAttributeValue( CgfpHVO.VDEF5,vdef5);
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getVdef6 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF6);
 } 

/** 
* �����Զ�����6
*
* @param vdef6 �Զ�����6
*/
public void setVdef6 ( String vdef6) {
this.setAttributeValue( CgfpHVO.VDEF6,vdef6);
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getVdef7 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF7);
 } 

/** 
* �����Զ�����7
*
* @param vdef7 �Զ�����7
*/
public void setVdef7 ( String vdef7) {
this.setAttributeValue( CgfpHVO.VDEF7,vdef7);
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getVdef8 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF8);
 } 

/** 
* �����Զ�����8
*
* @param vdef8 �Զ�����8
*/
public void setVdef8 ( String vdef8) {
this.setAttributeValue( CgfpHVO.VDEF8,vdef8);
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getVdef9 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF9);
 } 

/** 
* �����Զ�����9
*
* @param vdef9 �Զ�����9
*/
public void setVdef9 ( String vdef9) {
this.setAttributeValue( CgfpHVO.VDEF9,vdef9);
 } 

/** 
* ��ȡ��󶳽�ԭ��
*
* @return ��󶳽�ԭ��
*/
public String getVfrozenreason () {
return (String) this.getAttributeValue( CgfpHVO.VFROZENREASON);
 } 

/** 
* ������󶳽�ԭ��
*
* @param vfrozenreason ��󶳽�ԭ��
*/
public void setVfrozenreason ( String vfrozenreason) {
this.setAttributeValue( CgfpHVO.VFROZENREASON,vfrozenreason);
 } 

/** 
* ��ȡ��ע
*
* @return ��ע
*/
public String getVmemo () {
return (String) this.getAttributeValue( CgfpHVO.VMEMO);
 } 

/** 
* ���ñ�ע
*
* @param vmemo ��ע
*/
public void setVmemo ( String vmemo) {
this.setAttributeValue( CgfpHVO.VMEMO,vmemo);
 } 

/** 
* ��ȡ��Ʊ���ͱ���
*
* @return ��Ʊ���ͱ���
*/
public String getVtrantypecode () {
return (String) this.getAttributeValue( CgfpHVO.VTRANTYPECODE);
 } 

/** 
* ���÷�Ʊ���ͱ���
*
* @param vtrantypecode ��Ʊ���ͱ���
*/
public void setVtrantypecode ( String vtrantypecode) {
this.setAttributeValue( CgfpHVO.VTRANTYPECODE,vtrantypecode);
 } 

/** 
* ��ȡVATע����
*
* @return VATע����
*/
public String getVvatcode () {
return (String) this.getAttributeValue( CgfpHVO.VVATCODE);
 } 

/** 
* ����VATע����
*
* @param vvatcode VATע����
*/
public void setVvatcode ( String vvatcode) {
this.setAttributeValue( CgfpHVO.VVATCODE,vvatcode);
 } 

/** 
* ��ȡ��Ӧ��VATע����
*
* @return ��Ӧ��VATע����
*/
public String getVvendorvatcode () {
return (String) this.getAttributeValue( CgfpHVO.VVENDORVATCODE);
 } 

/** 
* ���ù�Ӧ��VATע����
*
* @param vvendorvatcode ��Ӧ��VATע����
*/
public void setVvendorvatcode ( String vvendorvatcode) {
this.setAttributeValue( CgfpHVO.VVENDORVATCODE,vvendorvatcode);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("devlu.cgfp");
  }
}