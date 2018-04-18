package nc.vo.fukuandan.entity;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class FukuandanVO extends SuperVO {
/**
*��������
*/
public Integer accessorynum;
/**
*�������
*/
public UFDateTime approvedate;
/**
*�������
*/
public UFDate approvedated;
/**
*�����
*/
public String approver;
/**
*����״̬
*/
public Integer approvestatus;
/**
*�ʽ�ƻ���Ŀ
*/
public String bankrollprojet;
/**
*���ݴ���
*/
public String billclass;
/**
*��������
*/
public UFDate billdate;
/**
*�Ƶ���
*/
public String billmaker;
/**
*���ݺ�
*/
public String billno;
/**
*���ݻ���ڼ�
*/
public String billperiod;
/**
*����״̬
*/
public Integer billstatus;
/**
*���ݻ�����
*/
public String billyear;
/**
*��������
*/
public UFDate busidate;
/**
*�ֽ��˻�
*/
public String cashaccount;
/**
*�ֽ�������Ŀ
*/
public String cashitem;
/**
*���κ���Ҫ��
*/
public String checkelement;
/**
*�и���ʼ����
*/
public UFDate commpaybegindate;
/**
*�и���ֹ����
*/
public UFDate commpayenddate;
/**
*����ȷ����
*/
public String confirmuser;
/**
*����Э���
*/
public String consignagreement;
/**
*����Эͬ��־
*/
public Integer coordflag;
/**
*�ɱ�����
*/
public String costcenter;
/**
*����ʱ��
*/
public UFDateTime creationtime;
/**
*������
*/
public String creator;
/**
*ծȨ�˲ο���
*/
public String creditorreference;
/**
*����������Ϣ��׼
*/
public String creditrefstd;
/**
*���浥λ
*/
public String custdelegate;
/**
*�ͻ�
*/
public String customer;
/**
*�Զ�����1
*/
public String def1;
/**
*�Զ�����10
*/
public String def10;
/**
*�Զ�����11
*/
public String def11;
/**
*�Զ�����12
*/
public String def12;
/**
*�Զ�����13
*/
public String def13;
/**
*�Զ�����14
*/
public String def14;
/**
*�Զ�����15
*/
public String def15;
/**
*�Զ�����16
*/
public String def16;
/**
*�Զ�����17
*/
public String def17;
/**
*�Զ�����18
*/
public String def18;
/**
*�Զ�����19
*/
public String def19;
/**
*�Զ�����2
*/
public String def2;
/**
*�Զ�����20
*/
public String def20;
/**
*�Զ�����21
*/
public String def21;
/**
*�Զ�����22
*/
public String def22;
/**
*�Զ�����23
*/
public String def23;
/**
*�Զ�����24
*/
public String def24;
/**
*�Զ�����25
*/
public String def25;
/**
*�Զ�����26
*/
public String def26;
/**
*�Զ�����27
*/
public String def27;
/**
*�Զ�����28
*/
public String def28;
/**
*�Զ�����29
*/
public String def29;
/**
*�Զ�����3
*/
public String def3;
/**
*�Զ�����30
*/
public String def30;
/**
*�Զ�����4
*/
public String def4;
/**
*�Զ�����5
*/
public String def5;
/**
*�Զ�����6
*/
public String def6;
/**
*�Զ�����7
*/
public String def7;
/**
*�Զ�����8
*/
public String def8;
/**
*�Զ�����9
*/
public String def9;
/**
*��Ч����
*/
public UFDate effectdate;
/**
*��Ч״̬
*/
public Integer effectstatus;
/**
*��Ч��
*/
public String effectuser;
/**
*����������
*/
public UFDate expectdealdate;
/**
*ʧ��ԭ��
*/
public String failurereason;
/**
*ȫ�ֱ��ҽ��
*/
public UFDouble globallocal;
/**
*ȫ�ֱ��һ���
*/
public UFDouble globalrate;
/**
*���ű��ҽ��
*/
public UFDouble grouplocal;
/**
*���ű��һ���
*/
public UFDouble grouprate;
/**
*��Ʊ��
*/
public String invoiceno;
/**
*�Ƿ����̵���
*/
public UFBoolean isflowbill;
/**
*�и�
*/
public UFBoolean isforce;
/**
*�Ƿ����������Ϣ
*/
public UFBoolean isfromindependent;
/**
*�ڳ���־
*/
public UFBoolean isinit;
/**
*�ύ�ʽ���֯����
*/
public UFBoolean ismandatepay;
/**
*�Ƿ��Ѿ���¼
*/
public UFBoolean isnetpayready;
/**
*�Ƿ�����֧��
*/
public UFBoolean isonlinepay;
/**
*����־
*/
public UFBoolean isreded;
/**
*���յ�����
*/
public String lastadjustuser;
/**
*����������
*/
public String lastapproveid;
/**
*��֯���ҽ��
*/
public UFDouble local_money;
/**
*����޸�ʱ��
*/
public UFDateTime modifiedtime;
/**
*����޸���
*/
public String modifier;
/**
*ԭ�ҽ��
*/
public UFDouble money;
/**
*��������
*/
public Integer objtype;
/**
*��ʽ��ӡ����
*/
public UFDate officialprintdate;
/**
*��ʽ��ӡ��
*/
public String officialprintuser;
/**
*��ϵͳҵ������
*/
public String outbusitype;
/**
*���������˻�
*/
public String payaccount;
/**
*֧������
*/
public UFDate paydate;
/**
*֧����
*/
public String payman;
/**
*֧��ԭ��
*/
public String payreason;
/**
*���㷽ʽ
*/
public String pk_balatype;
/**
*�������ͱ���
*/
public String pk_billtype;
/**
*ҵ������
*/
public String pk_busitype;
/**
*��λ����
*/
public String pk_corp;
/**
*����
*/
public String pk_currtype;
/**
*����
*/
public String pk_deptid;
/**
*�� ��
*/
public String pk_deptid_v;
/**
*������֯
*/
public String pk_fiorg;
/**
*������֯�汾����
*/
public String pk_fiorg_v;
/**
*�����ʶ
*/
public String pk_fukuandan;
/**
*��������
*/
public String pk_group;
/**
*���������֯
*/
public String pk_org;
/**
*���������֯�汾����
*/
public String pk_org_v;
/**
*��������
*/
public String pk_pcorg;
/**
*�������İ汾����
*/
public String pk_pcorg_v;
/**
*ҵ��Ա
*/
public String pk_psndoc;
/**
*��֧��Ŀ
*/
public String pk_subjcode;
/**
*��������code
*/
public String pk_tradetype;
/**
*��������
*/
public String pk_tradetypeid;
/**
*�ɹ�����
*/
public String pu_deptid;
/**
*�ɹ� ����
*/
public String pu_deptid_v;
/**
*�ɹ���֯
*/
public String pu_org;
/**
*�ɹ���֯�汾����
*/
public String pu_org_v;
/**
*�ɹ�ҵ��Ա
*/
public String pu_psndoc;
/**
*��֯���һ���
*/
public UFDouble rate;
/**
*�տ������˻�
*/
public String recaccount;
/**
*�˻�ԭ��
*/
public String reversalreason;
/**
*ժҪ
*/
public String scomment;
/**
*ֱ�ӽ���˻ر��
*/
public UFBoolean sddreversalflag;
/**
*���������֯
*/
public String sett_org;
/**
*���������֯�汾����
*/
public String sett_org_v;
/**
*����״̬
*/
public Integer settleflag;
/**
*�����
*/
public String settlenum;
/**
*��������
*/
public Integer settletype;
/**
*ǩ��ȷ������
*/
public UFDate signdate;
/**
*ǩ��ȷ���ڼ�
*/
public String signperiod;
/**
*ǩ��ȷ����
*/
public String signuser;
/**
*ǩ��ȷ�����
*/
public String signyear;
/**
*������Դϵͳ
*/
public Integer src_syscode;
/**
*��Ŀ
*/
public String subjcode;
/**
*��Ӧ��
*/
public String supplier;
/**
*��������ϵͳ
*/
public Integer syscode;
/**
*ʱ���
*/
public UFDateTime ts;
/** 
* ��ȡ��������
*
* @return ��������
*/
public Integer getAccessorynum () {
return this.accessorynum;
 } 

/** 
* ���ø�������
*
* @param accessorynum ��������
*/
public void setAccessorynum ( Integer accessorynum) {
this.accessorynum=accessorynum;
 } 

/** 
* ��ȡ�������
*
* @return �������
*/
public UFDateTime getApprovedate () {
return this.approvedate;
 } 

/** 
* �����������
*
* @param approvedate �������
*/
public void setApprovedate ( UFDateTime approvedate) {
this.approvedate=approvedate;
 } 

/** 
* ��ȡ�������
*
* @return �������
*/
public UFDate getApprovedated () {
return this.approvedated;
 } 

/** 
* �����������
*
* @param approvedated �������
*/
public void setApprovedated ( UFDate approvedated) {
this.approvedated=approvedated;
 } 

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
* ��ȡ����״̬
*
* @return ����״̬
* @see String
*/
public Integer getApprovestatus () {
return this.approvestatus;
 } 

/** 
* ��������״̬
*
* @param approvestatus ����״̬
* @see String
*/
public void setApprovestatus ( Integer approvestatus) {
this.approvestatus=approvestatus;
 } 

/** 
* ��ȡ�ʽ�ƻ���Ŀ
*
* @return �ʽ�ƻ���Ŀ
*/
public String getBankrollprojet () {
return this.bankrollprojet;
 } 

/** 
* �����ʽ�ƻ���Ŀ
*
* @param bankrollprojet �ʽ�ƻ���Ŀ
*/
public void setBankrollprojet ( String bankrollprojet) {
this.bankrollprojet=bankrollprojet;
 } 

/** 
* ��ȡ���ݴ���
*
* @return ���ݴ���
* @see String
*/
public String getBillclass () {
return this.billclass;
 } 

/** 
* ���õ��ݴ���
*
* @param billclass ���ݴ���
* @see String
*/
public void setBillclass ( String billclass) {
this.billclass=billclass;
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDate getBilldate () {
return this.billdate;
 } 

/** 
* ���õ�������
*
* @param billdate ��������
*/
public void setBilldate ( UFDate billdate) {
this.billdate=billdate;
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
* ��ȡ���ݺ�
*
* @return ���ݺ�
*/
public String getBillno () {
return this.billno;
 } 

/** 
* ���õ��ݺ�
*
* @param billno ���ݺ�
*/
public void setBillno ( String billno) {
this.billno=billno;
 } 

/** 
* ��ȡ���ݻ���ڼ�
*
* @return ���ݻ���ڼ�
*/
public String getBillperiod () {
return this.billperiod;
 } 

/** 
* ���õ��ݻ���ڼ�
*
* @param billperiod ���ݻ���ڼ�
*/
public void setBillperiod ( String billperiod) {
this.billperiod=billperiod;
 } 

/** 
* ��ȡ����״̬
*
* @return ����״̬
* @see String
*/
public Integer getBillstatus () {
return this.billstatus;
 } 

/** 
* ���õ���״̬
*
* @param billstatus ����״̬
* @see String
*/
public void setBillstatus ( Integer billstatus) {
this.billstatus=billstatus;
 } 

/** 
* ��ȡ���ݻ�����
*
* @return ���ݻ�����
*/
public String getBillyear () {
return this.billyear;
 } 

/** 
* ���õ��ݻ�����
*
* @param billyear ���ݻ�����
*/
public void setBillyear ( String billyear) {
this.billyear=billyear;
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDate getBusidate () {
return this.busidate;
 } 

/** 
* ������������
*
* @param busidate ��������
*/
public void setBusidate ( UFDate busidate) {
this.busidate=busidate;
 } 

/** 
* ��ȡ�ֽ��˻�
*
* @return �ֽ��˻�
*/
public String getCashaccount () {
return this.cashaccount;
 } 

/** 
* �����ֽ��˻�
*
* @param cashaccount �ֽ��˻�
*/
public void setCashaccount ( String cashaccount) {
this.cashaccount=cashaccount;
 } 

/** 
* ��ȡ�ֽ�������Ŀ
*
* @return �ֽ�������Ŀ
*/
public String getCashitem () {
return this.cashitem;
 } 

/** 
* �����ֽ�������Ŀ
*
* @param cashitem �ֽ�������Ŀ
*/
public void setCashitem ( String cashitem) {
this.cashitem=cashitem;
 } 

/** 
* ��ȡ���κ���Ҫ��
*
* @return ���κ���Ҫ��
*/
public String getCheckelement () {
return this.checkelement;
 } 

/** 
* �������κ���Ҫ��
*
* @param checkelement ���κ���Ҫ��
*/
public void setCheckelement ( String checkelement) {
this.checkelement=checkelement;
 } 

/** 
* ��ȡ�и���ʼ����
*
* @return �и���ʼ����
*/
public UFDate getCommpaybegindate () {
return this.commpaybegindate;
 } 

/** 
* ���óи���ʼ����
*
* @param commpaybegindate �и���ʼ����
*/
public void setCommpaybegindate ( UFDate commpaybegindate) {
this.commpaybegindate=commpaybegindate;
 } 

/** 
* ��ȡ�и���ֹ����
*
* @return �и���ֹ����
*/
public UFDate getCommpayenddate () {
return this.commpayenddate;
 } 

/** 
* ���óи���ֹ����
*
* @param commpayenddate �и���ֹ����
*/
public void setCommpayenddate ( UFDate commpayenddate) {
this.commpayenddate=commpayenddate;
 } 

/** 
* ��ȡ����ȷ����
*
* @return ����ȷ����
*/
public String getConfirmuser () {
return this.confirmuser;
 } 

/** 
* ���õ���ȷ����
*
* @param confirmuser ����ȷ����
*/
public void setConfirmuser ( String confirmuser) {
this.confirmuser=confirmuser;
 } 

/** 
* ��ȡ����Э���
*
* @return ����Э���
*/
public String getConsignagreement () {
return this.consignagreement;
 } 

/** 
* ��������Э���
*
* @param consignagreement ����Э���
*/
public void setConsignagreement ( String consignagreement) {
this.consignagreement=consignagreement;
 } 

/** 
* ��ȡ����Эͬ��־
*
* @return ����Эͬ��־
* @see String
*/
public Integer getCoordflag () {
return this.coordflag;
 } 

/** 
* ���õ���Эͬ��־
*
* @param coordflag ����Эͬ��־
* @see String
*/
public void setCoordflag ( Integer coordflag) {
this.coordflag=coordflag;
 } 

/** 
* ��ȡ�ɱ�����
*
* @return �ɱ�����
*/
public String getCostcenter () {
return this.costcenter;
 } 

/** 
* ���óɱ�����
*
* @param costcenter �ɱ�����
*/
public void setCostcenter ( String costcenter) {
this.costcenter=costcenter;
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
* ��ȡծȨ�˲ο���
*
* @return ծȨ�˲ο���
*/
public String getCreditorreference () {
return this.creditorreference;
 } 

/** 
* ����ծȨ�˲ο���
*
* @param creditorreference ծȨ�˲ο���
*/
public void setCreditorreference ( String creditorreference) {
this.creditorreference=creditorreference;
 } 

/** 
* ��ȡ����������Ϣ��׼
*
* @return ����������Ϣ��׼
* @see String
*/
public String getCreditrefstd () {
return this.creditrefstd;
 } 

/** 
* ���ô���������Ϣ��׼
*
* @param creditrefstd ����������Ϣ��׼
* @see String
*/
public void setCreditrefstd ( String creditrefstd) {
this.creditrefstd=creditrefstd;
 } 

/** 
* ��ȡ���浥λ
*
* @return ���浥λ
*/
public String getCustdelegate () {
return this.custdelegate;
 } 

/** 
* ���ô��浥λ
*
* @param custdelegate ���浥λ
*/
public void setCustdelegate ( String custdelegate) {
this.custdelegate=custdelegate;
 } 

/** 
* ��ȡ�ͻ�
*
* @return �ͻ�
*/
public String getCustomer () {
return this.customer;
 } 

/** 
* ���ÿͻ�
*
* @param customer �ͻ�
*/
public void setCustomer ( String customer) {
this.customer=customer;
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getDef1 () {
return this.def1;
 } 

/** 
* �����Զ�����1
*
* @param def1 �Զ�����1
*/
public void setDef1 ( String def1) {
this.def1=def1;
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getDef10 () {
return this.def10;
 } 

/** 
* �����Զ�����10
*
* @param def10 �Զ�����10
*/
public void setDef10 ( String def10) {
this.def10=def10;
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public String getDef11 () {
return this.def11;
 } 

/** 
* �����Զ�����11
*
* @param def11 �Զ�����11
*/
public void setDef11 ( String def11) {
this.def11=def11;
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getDef12 () {
return this.def12;
 } 

/** 
* �����Զ�����12
*
* @param def12 �Զ�����12
*/
public void setDef12 ( String def12) {
this.def12=def12;
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getDef13 () {
return this.def13;
 } 

/** 
* �����Զ�����13
*
* @param def13 �Զ�����13
*/
public void setDef13 ( String def13) {
this.def13=def13;
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getDef14 () {
return this.def14;
 } 

/** 
* �����Զ�����14
*
* @param def14 �Զ�����14
*/
public void setDef14 ( String def14) {
this.def14=def14;
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public String getDef15 () {
return this.def15;
 } 

/** 
* �����Զ�����15
*
* @param def15 �Զ�����15
*/
public void setDef15 ( String def15) {
this.def15=def15;
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getDef16 () {
return this.def16;
 } 

/** 
* �����Զ�����16
*
* @param def16 �Զ�����16
*/
public void setDef16 ( String def16) {
this.def16=def16;
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getDef17 () {
return this.def17;
 } 

/** 
* �����Զ�����17
*
* @param def17 �Զ�����17
*/
public void setDef17 ( String def17) {
this.def17=def17;
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getDef18 () {
return this.def18;
 } 

/** 
* �����Զ�����18
*
* @param def18 �Զ�����18
*/
public void setDef18 ( String def18) {
this.def18=def18;
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getDef19 () {
return this.def19;
 } 

/** 
* �����Զ�����19
*
* @param def19 �Զ�����19
*/
public void setDef19 ( String def19) {
this.def19=def19;
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getDef2 () {
return this.def2;
 } 

/** 
* �����Զ�����2
*
* @param def2 �Զ�����2
*/
public void setDef2 ( String def2) {
this.def2=def2;
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getDef20 () {
return this.def20;
 } 

/** 
* �����Զ�����20
*
* @param def20 �Զ�����20
*/
public void setDef20 ( String def20) {
this.def20=def20;
 } 

/** 
* ��ȡ�Զ�����21
*
* @return �Զ�����21
*/
public String getDef21 () {
return this.def21;
 } 

/** 
* �����Զ�����21
*
* @param def21 �Զ�����21
*/
public void setDef21 ( String def21) {
this.def21=def21;
 } 

/** 
* ��ȡ�Զ�����22
*
* @return �Զ�����22
*/
public String getDef22 () {
return this.def22;
 } 

/** 
* �����Զ�����22
*
* @param def22 �Զ�����22
*/
public void setDef22 ( String def22) {
this.def22=def22;
 } 

/** 
* ��ȡ�Զ�����23
*
* @return �Զ�����23
*/
public String getDef23 () {
return this.def23;
 } 

/** 
* �����Զ�����23
*
* @param def23 �Զ�����23
*/
public void setDef23 ( String def23) {
this.def23=def23;
 } 

/** 
* ��ȡ�Զ�����24
*
* @return �Զ�����24
*/
public String getDef24 () {
return this.def24;
 } 

/** 
* �����Զ�����24
*
* @param def24 �Զ�����24
*/
public void setDef24 ( String def24) {
this.def24=def24;
 } 

/** 
* ��ȡ�Զ�����25
*
* @return �Զ�����25
*/
public String getDef25 () {
return this.def25;
 } 

/** 
* �����Զ�����25
*
* @param def25 �Զ�����25
*/
public void setDef25 ( String def25) {
this.def25=def25;
 } 

/** 
* ��ȡ�Զ�����26
*
* @return �Զ�����26
*/
public String getDef26 () {
return this.def26;
 } 

/** 
* �����Զ�����26
*
* @param def26 �Զ�����26
*/
public void setDef26 ( String def26) {
this.def26=def26;
 } 

/** 
* ��ȡ�Զ�����27
*
* @return �Զ�����27
*/
public String getDef27 () {
return this.def27;
 } 

/** 
* �����Զ�����27
*
* @param def27 �Զ�����27
*/
public void setDef27 ( String def27) {
this.def27=def27;
 } 

/** 
* ��ȡ�Զ�����28
*
* @return �Զ�����28
*/
public String getDef28 () {
return this.def28;
 } 

/** 
* �����Զ�����28
*
* @param def28 �Զ�����28
*/
public void setDef28 ( String def28) {
this.def28=def28;
 } 

/** 
* ��ȡ�Զ�����29
*
* @return �Զ�����29
*/
public String getDef29 () {
return this.def29;
 } 

/** 
* �����Զ�����29
*
* @param def29 �Զ�����29
*/
public void setDef29 ( String def29) {
this.def29=def29;
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getDef3 () {
return this.def3;
 } 

/** 
* �����Զ�����3
*
* @param def3 �Զ�����3
*/
public void setDef3 ( String def3) {
this.def3=def3;
 } 

/** 
* ��ȡ�Զ�����30
*
* @return �Զ�����30
*/
public String getDef30 () {
return this.def30;
 } 

/** 
* �����Զ�����30
*
* @param def30 �Զ�����30
*/
public void setDef30 ( String def30) {
this.def30=def30;
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getDef4 () {
return this.def4;
 } 

/** 
* �����Զ�����4
*
* @param def4 �Զ�����4
*/
public void setDef4 ( String def4) {
this.def4=def4;
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getDef5 () {
return this.def5;
 } 

/** 
* �����Զ�����5
*
* @param def5 �Զ�����5
*/
public void setDef5 ( String def5) {
this.def5=def5;
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getDef6 () {
return this.def6;
 } 

/** 
* �����Զ�����6
*
* @param def6 �Զ�����6
*/
public void setDef6 ( String def6) {
this.def6=def6;
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getDef7 () {
return this.def7;
 } 

/** 
* �����Զ�����7
*
* @param def7 �Զ�����7
*/
public void setDef7 ( String def7) {
this.def7=def7;
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getDef8 () {
return this.def8;
 } 

/** 
* �����Զ�����8
*
* @param def8 �Զ�����8
*/
public void setDef8 ( String def8) {
this.def8=def8;
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getDef9 () {
return this.def9;
 } 

/** 
* �����Զ�����9
*
* @param def9 �Զ�����9
*/
public void setDef9 ( String def9) {
this.def9=def9;
 } 

/** 
* ��ȡ��Ч����
*
* @return ��Ч����
*/
public UFDate getEffectdate () {
return this.effectdate;
 } 

/** 
* ������Ч����
*
* @param effectdate ��Ч����
*/
public void setEffectdate ( UFDate effectdate) {
this.effectdate=effectdate;
 } 

/** 
* ��ȡ��Ч״̬
*
* @return ��Ч״̬
* @see String
*/
public Integer getEffectstatus () {
return this.effectstatus;
 } 

/** 
* ������Ч״̬
*
* @param effectstatus ��Ч״̬
* @see String
*/
public void setEffectstatus ( Integer effectstatus) {
this.effectstatus=effectstatus;
 } 

/** 
* ��ȡ��Ч��
*
* @return ��Ч��
*/
public String getEffectuser () {
return this.effectuser;
 } 

/** 
* ������Ч��
*
* @param effectuser ��Ч��
*/
public void setEffectuser ( String effectuser) {
this.effectuser=effectuser;
 } 

/** 
* ��ȡ����������
*
* @return ����������
*/
public UFDate getExpectdealdate () {
return this.expectdealdate;
 } 

/** 
* ��������������
*
* @param expectdealdate ����������
*/
public void setExpectdealdate ( UFDate expectdealdate) {
this.expectdealdate=expectdealdate;
 } 

/** 
* ��ȡʧ��ԭ��
*
* @return ʧ��ԭ��
*/
public String getFailurereason () {
return this.failurereason;
 } 

/** 
* ����ʧ��ԭ��
*
* @param failurereason ʧ��ԭ��
*/
public void setFailurereason ( String failurereason) {
this.failurereason=failurereason;
 } 

/** 
* ��ȡȫ�ֱ��ҽ��
*
* @return ȫ�ֱ��ҽ��
*/
public UFDouble getGloballocal () {
return this.globallocal;
 } 

/** 
* ����ȫ�ֱ��ҽ��
*
* @param globallocal ȫ�ֱ��ҽ��
*/
public void setGloballocal ( UFDouble globallocal) {
this.globallocal=globallocal;
 } 

/** 
* ��ȡȫ�ֱ��һ���
*
* @return ȫ�ֱ��һ���
*/
public UFDouble getGlobalrate () {
return this.globalrate;
 } 

/** 
* ����ȫ�ֱ��һ���
*
* @param globalrate ȫ�ֱ��һ���
*/
public void setGlobalrate ( UFDouble globalrate) {
this.globalrate=globalrate;
 } 

/** 
* ��ȡ���ű��ҽ��
*
* @return ���ű��ҽ��
*/
public UFDouble getGrouplocal () {
return this.grouplocal;
 } 

/** 
* ���ü��ű��ҽ��
*
* @param grouplocal ���ű��ҽ��
*/
public void setGrouplocal ( UFDouble grouplocal) {
this.grouplocal=grouplocal;
 } 

/** 
* ��ȡ���ű��һ���
*
* @return ���ű��һ���
*/
public UFDouble getGrouprate () {
return this.grouprate;
 } 

/** 
* ���ü��ű��һ���
*
* @param grouprate ���ű��һ���
*/
public void setGrouprate ( UFDouble grouprate) {
this.grouprate=grouprate;
 } 

/** 
* ��ȡ��Ʊ��
*
* @return ��Ʊ��
*/
public String getInvoiceno () {
return this.invoiceno;
 } 

/** 
* ���÷�Ʊ��
*
* @param invoiceno ��Ʊ��
*/
public void setInvoiceno ( String invoiceno) {
this.invoiceno=invoiceno;
 } 

/** 
* ��ȡ�Ƿ����̵���
*
* @return �Ƿ����̵���
*/
public UFBoolean getIsflowbill () {
return this.isflowbill;
 } 

/** 
* �����Ƿ����̵���
*
* @param isflowbill �Ƿ����̵���
*/
public void setIsflowbill ( UFBoolean isflowbill) {
this.isflowbill=isflowbill;
 } 

/** 
* ��ȡ�и�
*
* @return �и�
*/
public UFBoolean getIsforce () {
return this.isforce;
 } 

/** 
* ���óи�
*
* @param isforce �и�
*/
public void setIsforce ( UFBoolean isforce) {
this.isforce=isforce;
 } 

/** 
* ��ȡ�Ƿ����������Ϣ
*
* @return �Ƿ����������Ϣ
*/
public UFBoolean getIsfromindependent () {
return this.isfromindependent;
 } 

/** 
* �����Ƿ����������Ϣ
*
* @param isfromindependent �Ƿ����������Ϣ
*/
public void setIsfromindependent ( UFBoolean isfromindependent) {
this.isfromindependent=isfromindependent;
 } 

/** 
* ��ȡ�ڳ���־
*
* @return �ڳ���־
*/
public UFBoolean getIsinit () {
return this.isinit;
 } 

/** 
* �����ڳ���־
*
* @param isinit �ڳ���־
*/
public void setIsinit ( UFBoolean isinit) {
this.isinit=isinit;
 } 

/** 
* ��ȡ�ύ�ʽ���֯����
*
* @return �ύ�ʽ���֯����
*/
public UFBoolean getIsmandatepay () {
return this.ismandatepay;
 } 

/** 
* �����ύ�ʽ���֯����
*
* @param ismandatepay �ύ�ʽ���֯����
*/
public void setIsmandatepay ( UFBoolean ismandatepay) {
this.ismandatepay=ismandatepay;
 } 

/** 
* ��ȡ�Ƿ��Ѿ���¼
*
* @return �Ƿ��Ѿ���¼
*/
public UFBoolean getIsnetpayready () {
return this.isnetpayready;
 } 

/** 
* �����Ƿ��Ѿ���¼
*
* @param isnetpayready �Ƿ��Ѿ���¼
*/
public void setIsnetpayready ( UFBoolean isnetpayready) {
this.isnetpayready=isnetpayready;
 } 

/** 
* ��ȡ�Ƿ�����֧��
*
* @return �Ƿ�����֧��
*/
public UFBoolean getIsonlinepay () {
return this.isonlinepay;
 } 

/** 
* �����Ƿ�����֧��
*
* @param isonlinepay �Ƿ�����֧��
*/
public void setIsonlinepay ( UFBoolean isonlinepay) {
this.isonlinepay=isonlinepay;
 } 

/** 
* ��ȡ����־
*
* @return ����־
*/
public UFBoolean getIsreded () {
return this.isreded;
 } 

/** 
* ���ú���־
*
* @param isreded ����־
*/
public void setIsreded ( UFBoolean isreded) {
this.isreded=isreded;
 } 

/** 
* ��ȡ���յ�����
*
* @return ���յ�����
*/
public String getLastadjustuser () {
return this.lastadjustuser;
 } 

/** 
* �������յ�����
*
* @param lastadjustuser ���յ�����
*/
public void setLastadjustuser ( String lastadjustuser) {
this.lastadjustuser=lastadjustuser;
 } 

/** 
* ��ȡ����������
*
* @return ����������
*/
public String getLastapproveid () {
return this.lastapproveid;
 } 

/** 
* ��������������
*
* @param lastapproveid ����������
*/
public void setLastapproveid ( String lastapproveid) {
this.lastapproveid=lastapproveid;
 } 

/** 
* ��ȡ��֯���ҽ��
*
* @return ��֯���ҽ��
*/
public UFDouble getLocal_money () {
return this.local_money;
 } 

/** 
* ������֯���ҽ��
*
* @param local_money ��֯���ҽ��
*/
public void setLocal_money ( UFDouble local_money) {
this.local_money=local_money;
 } 

/** 
* ��ȡ����޸�ʱ��
*
* @return ����޸�ʱ��
*/
public UFDateTime getModifiedtime () {
return this.modifiedtime;
 } 

/** 
* ��������޸�ʱ��
*
* @param modifiedtime ����޸�ʱ��
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
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
* ��ȡԭ�ҽ��
*
* @return ԭ�ҽ��
*/
public UFDouble getMoney () {
return this.money;
 } 

/** 
* ����ԭ�ҽ��
*
* @param money ԭ�ҽ��
*/
public void setMoney ( UFDouble money) {
this.money=money;
 } 

/** 
* ��ȡ��������
*
* @return ��������
* @see String
*/
public Integer getObjtype () {
return this.objtype;
 } 

/** 
* ������������
*
* @param objtype ��������
* @see String
*/
public void setObjtype ( Integer objtype) {
this.objtype=objtype;
 } 

/** 
* ��ȡ��ʽ��ӡ����
*
* @return ��ʽ��ӡ����
*/
public UFDate getOfficialprintdate () {
return this.officialprintdate;
 } 

/** 
* ������ʽ��ӡ����
*
* @param officialprintdate ��ʽ��ӡ����
*/
public void setOfficialprintdate ( UFDate officialprintdate) {
this.officialprintdate=officialprintdate;
 } 

/** 
* ��ȡ��ʽ��ӡ��
*
* @return ��ʽ��ӡ��
*/
public String getOfficialprintuser () {
return this.officialprintuser;
 } 

/** 
* ������ʽ��ӡ��
*
* @param officialprintuser ��ʽ��ӡ��
*/
public void setOfficialprintuser ( String officialprintuser) {
this.officialprintuser=officialprintuser;
 } 

/** 
* ��ȡ��ϵͳҵ������
*
* @return ��ϵͳҵ������
*/
public String getOutbusitype () {
return this.outbusitype;
 } 

/** 
* ������ϵͳҵ������
*
* @param outbusitype ��ϵͳҵ������
*/
public void setOutbusitype ( String outbusitype) {
this.outbusitype=outbusitype;
 } 

/** 
* ��ȡ���������˻�
*
* @return ���������˻�
*/
public String getPayaccount () {
return this.payaccount;
 } 

/** 
* ���ø��������˻�
*
* @param payaccount ���������˻�
*/
public void setPayaccount ( String payaccount) {
this.payaccount=payaccount;
 } 

/** 
* ��ȡ֧������
*
* @return ֧������
*/
public UFDate getPaydate () {
return this.paydate;
 } 

/** 
* ����֧������
*
* @param paydate ֧������
*/
public void setPaydate ( UFDate paydate) {
this.paydate=paydate;
 } 

/** 
* ��ȡ֧����
*
* @return ֧����
*/
public String getPayman () {
return this.payman;
 } 

/** 
* ����֧����
*
* @param payman ֧����
*/
public void setPayman ( String payman) {
this.payman=payman;
 } 

/** 
* ��ȡ֧��ԭ��
*
* @return ֧��ԭ��
* @see String
*/
public String getPayreason () {
return this.payreason;
 } 

/** 
* ����֧��ԭ��
*
* @param payreason ֧��ԭ��
* @see String
*/
public void setPayreason ( String payreason) {
this.payreason=payreason;
 } 

/** 
* ��ȡ���㷽ʽ
*
* @return ���㷽ʽ
*/
public String getPk_balatype () {
return this.pk_balatype;
 } 

/** 
* ���ý��㷽ʽ
*
* @param pk_balatype ���㷽ʽ
*/
public void setPk_balatype ( String pk_balatype) {
this.pk_balatype=pk_balatype;
 } 

/** 
* ��ȡ�������ͱ���
*
* @return �������ͱ���
*/
public String getPk_billtype () {
return this.pk_billtype;
 } 

/** 
* ���õ������ͱ���
*
* @param pk_billtype �������ͱ���
*/
public void setPk_billtype ( String pk_billtype) {
this.pk_billtype=pk_billtype;
 } 

/** 
* ��ȡҵ������
*
* @return ҵ������
*/
public String getPk_busitype () {
return this.pk_busitype;
 } 

/** 
* ����ҵ������
*
* @param pk_busitype ҵ������
*/
public void setPk_busitype ( String pk_busitype) {
this.pk_busitype=pk_busitype;
 } 

/** 
* ��ȡ��λ����
*
* @return ��λ����
*/
public String getPk_corp () {
return this.pk_corp;
 } 

/** 
* ���õ�λ����
*
* @param pk_corp ��λ����
*/
public void setPk_corp ( String pk_corp) {
this.pk_corp=pk_corp;
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPk_currtype () {
return this.pk_currtype;
 } 

/** 
* ���ñ���
*
* @param pk_currtype ����
*/
public void setPk_currtype ( String pk_currtype) {
this.pk_currtype=pk_currtype;
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPk_deptid () {
return this.pk_deptid;
 } 

/** 
* ���ò���
*
* @param pk_deptid ����
*/
public void setPk_deptid ( String pk_deptid) {
this.pk_deptid=pk_deptid;
 } 

/** 
* ��ȡ�� ��
*
* @return �� ��
*/
public String getPk_deptid_v () {
return this.pk_deptid_v;
 } 

/** 
* ���ò� ��
*
* @param pk_deptid_v �� ��
*/
public void setPk_deptid_v ( String pk_deptid_v) {
this.pk_deptid_v=pk_deptid_v;
 } 

/** 
* ��ȡ������֯
*
* @return ������֯
*/
public String getPk_fiorg () {
return this.pk_fiorg;
 } 

/** 
* ���ò�����֯
*
* @param pk_fiorg ������֯
*/
public void setPk_fiorg ( String pk_fiorg) {
this.pk_fiorg=pk_fiorg;
 } 

/** 
* ��ȡ������֯�汾����
*
* @return ������֯�汾����
*/
public String getPk_fiorg_v () {
return this.pk_fiorg_v;
 } 

/** 
* ���ò�����֯�汾����
*
* @param pk_fiorg_v ������֯�汾����
*/
public void setPk_fiorg_v ( String pk_fiorg_v) {
this.pk_fiorg_v=pk_fiorg_v;
 } 

/** 
* ��ȡ�����ʶ
*
* @return �����ʶ
*/
public String getPk_fukuandan () {
return this.pk_fukuandan;
 } 

/** 
* ���ø����ʶ
*
* @param pk_fukuandan �����ʶ
*/
public void setPk_fukuandan ( String pk_fukuandan) {
this.pk_fukuandan=pk_fukuandan;
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getPk_group () {
return this.pk_group;
 } 

/** 
* ������������
*
* @param pk_group ��������
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
 } 

/** 
* ��ȡ���������֯
*
* @return ���������֯
*/
public String getPk_org () {
return this.pk_org;
 } 

/** 
* ���ø��������֯
*
* @param pk_org ���������֯
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
 } 

/** 
* ��ȡ���������֯�汾����
*
* @return ���������֯�汾����
*/
public String getPk_org_v () {
return this.pk_org_v;
 } 

/** 
* ���ø��������֯�汾����
*
* @param pk_org_v ���������֯�汾����
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getPk_pcorg () {
return this.pk_pcorg;
 } 

/** 
* ������������
*
* @param pk_pcorg ��������
*/
public void setPk_pcorg ( String pk_pcorg) {
this.pk_pcorg=pk_pcorg;
 } 

/** 
* ��ȡ�������İ汾����
*
* @return �������İ汾����
*/
public String getPk_pcorg_v () {
return this.pk_pcorg_v;
 } 

/** 
* �����������İ汾����
*
* @param pk_pcorg_v �������İ汾����
*/
public void setPk_pcorg_v ( String pk_pcorg_v) {
this.pk_pcorg_v=pk_pcorg_v;
 } 

/** 
* ��ȡҵ��Ա
*
* @return ҵ��Ա
*/
public String getPk_psndoc () {
return this.pk_psndoc;
 } 

/** 
* ����ҵ��Ա
*
* @param pk_psndoc ҵ��Ա
*/
public void setPk_psndoc ( String pk_psndoc) {
this.pk_psndoc=pk_psndoc;
 } 

/** 
* ��ȡ��֧��Ŀ
*
* @return ��֧��Ŀ
*/
public String getPk_subjcode () {
return this.pk_subjcode;
 } 

/** 
* ������֧��Ŀ
*
* @param pk_subjcode ��֧��Ŀ
*/
public void setPk_subjcode ( String pk_subjcode) {
this.pk_subjcode=pk_subjcode;
 } 

/** 
* ��ȡ��������code
*
* @return ��������code
*/
public String getPk_tradetype () {
return this.pk_tradetype;
 } 

/** 
* ���ø�������code
*
* @param pk_tradetype ��������code
*/
public void setPk_tradetype ( String pk_tradetype) {
this.pk_tradetype=pk_tradetype;
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getPk_tradetypeid () {
return this.pk_tradetypeid;
 } 

/** 
* ���ø�������
*
* @param pk_tradetypeid ��������
*/
public void setPk_tradetypeid ( String pk_tradetypeid) {
this.pk_tradetypeid=pk_tradetypeid;
 } 

/** 
* ��ȡ�ɹ�����
*
* @return �ɹ�����
*/
public String getPu_deptid () {
return this.pu_deptid;
 } 

/** 
* ���òɹ�����
*
* @param pu_deptid �ɹ�����
*/
public void setPu_deptid ( String pu_deptid) {
this.pu_deptid=pu_deptid;
 } 

/** 
* ��ȡ�ɹ� ����
*
* @return �ɹ� ����
*/
public String getPu_deptid_v () {
return this.pu_deptid_v;
 } 

/** 
* ���òɹ� ����
*
* @param pu_deptid_v �ɹ� ����
*/
public void setPu_deptid_v ( String pu_deptid_v) {
this.pu_deptid_v=pu_deptid_v;
 } 

/** 
* ��ȡ�ɹ���֯
*
* @return �ɹ���֯
*/
public String getPu_org () {
return this.pu_org;
 } 

/** 
* ���òɹ���֯
*
* @param pu_org �ɹ���֯
*/
public void setPu_org ( String pu_org) {
this.pu_org=pu_org;
 } 

/** 
* ��ȡ�ɹ���֯�汾����
*
* @return �ɹ���֯�汾����
*/
public String getPu_org_v () {
return this.pu_org_v;
 } 

/** 
* ���òɹ���֯�汾����
*
* @param pu_org_v �ɹ���֯�汾����
*/
public void setPu_org_v ( String pu_org_v) {
this.pu_org_v=pu_org_v;
 } 

/** 
* ��ȡ�ɹ�ҵ��Ա
*
* @return �ɹ�ҵ��Ա
*/
public String getPu_psndoc () {
return this.pu_psndoc;
 } 

/** 
* ���òɹ�ҵ��Ա
*
* @param pu_psndoc �ɹ�ҵ��Ա
*/
public void setPu_psndoc ( String pu_psndoc) {
this.pu_psndoc=pu_psndoc;
 } 

/** 
* ��ȡ��֯���һ���
*
* @return ��֯���һ���
*/
public UFDouble getRate () {
return this.rate;
 } 

/** 
* ������֯���һ���
*
* @param rate ��֯���һ���
*/
public void setRate ( UFDouble rate) {
this.rate=rate;
 } 

/** 
* ��ȡ�տ������˻�
*
* @return �տ������˻�
*/
public String getRecaccount () {
return this.recaccount;
 } 

/** 
* �����տ������˻�
*
* @param recaccount �տ������˻�
*/
public void setRecaccount ( String recaccount) {
this.recaccount=recaccount;
 } 

/** 
* ��ȡ�˻�ԭ��
*
* @return �˻�ԭ��
* @see String
*/
public String getReversalreason () {
return this.reversalreason;
 } 

/** 
* �����˻�ԭ��
*
* @param reversalreason �˻�ԭ��
* @see String
*/
public void setReversalreason ( String reversalreason) {
this.reversalreason=reversalreason;
 } 

/** 
* ��ȡժҪ
*
* @return ժҪ
*/
public String getScomment () {
return this.scomment;
 } 

/** 
* ����ժҪ
*
* @param scomment ժҪ
*/
public void setScomment ( String scomment) {
this.scomment=scomment;
 } 

/** 
* ��ȡֱ�ӽ���˻ر��
*
* @return ֱ�ӽ���˻ر��
*/
public UFBoolean getSddreversalflag () {
return this.sddreversalflag;
 } 

/** 
* ����ֱ�ӽ���˻ر��
*
* @param sddreversalflag ֱ�ӽ���˻ر��
*/
public void setSddreversalflag ( UFBoolean sddreversalflag) {
this.sddreversalflag=sddreversalflag;
 } 

/** 
* ��ȡ���������֯
*
* @return ���������֯
*/
public String getSett_org () {
return this.sett_org;
 } 

/** 
* ���ý��������֯
*
* @param sett_org ���������֯
*/
public void setSett_org ( String sett_org) {
this.sett_org=sett_org;
 } 

/** 
* ��ȡ���������֯�汾����
*
* @return ���������֯�汾����
*/
public String getSett_org_v () {
return this.sett_org_v;
 } 

/** 
* ���ý��������֯�汾����
*
* @param sett_org_v ���������֯�汾����
*/
public void setSett_org_v ( String sett_org_v) {
this.sett_org_v=sett_org_v;
 } 

/** 
* ��ȡ����״̬
*
* @return ����״̬
* @see String
*/
public Integer getSettleflag () {
return this.settleflag;
 } 

/** 
* ���ý���״̬
*
* @param settleflag ����״̬
* @see String
*/
public void setSettleflag ( Integer settleflag) {
this.settleflag=settleflag;
 } 

/** 
* ��ȡ�����
*
* @return �����
*/
public String getSettlenum () {
return this.settlenum;
 } 

/** 
* ���ý����
*
* @param settlenum �����
*/
public void setSettlenum ( String settlenum) {
this.settlenum=settlenum;
 } 

/** 
* ��ȡ��������
*
* @return ��������
* @see String
*/
public Integer getSettletype () {
return this.settletype;
 } 

/** 
* ���ý�������
*
* @param settletype ��������
* @see String
*/
public void setSettletype ( Integer settletype) {
this.settletype=settletype;
 } 

/** 
* ��ȡǩ��ȷ������
*
* @return ǩ��ȷ������
*/
public UFDate getSigndate () {
return this.signdate;
 } 

/** 
* ����ǩ��ȷ������
*
* @param signdate ǩ��ȷ������
*/
public void setSigndate ( UFDate signdate) {
this.signdate=signdate;
 } 

/** 
* ��ȡǩ��ȷ���ڼ�
*
* @return ǩ��ȷ���ڼ�
*/
public String getSignperiod () {
return this.signperiod;
 } 

/** 
* ����ǩ��ȷ���ڼ�
*
* @param signperiod ǩ��ȷ���ڼ�
*/
public void setSignperiod ( String signperiod) {
this.signperiod=signperiod;
 } 

/** 
* ��ȡǩ��ȷ����
*
* @return ǩ��ȷ����
*/
public String getSignuser () {
return this.signuser;
 } 

/** 
* ����ǩ��ȷ����
*
* @param signuser ǩ��ȷ����
*/
public void setSignuser ( String signuser) {
this.signuser=signuser;
 } 

/** 
* ��ȡǩ��ȷ�����
*
* @return ǩ��ȷ�����
*/
public String getSignyear () {
return this.signyear;
 } 

/** 
* ����ǩ��ȷ�����
*
* @param signyear ǩ��ȷ�����
*/
public void setSignyear ( String signyear) {
this.signyear=signyear;
 } 

/** 
* ��ȡ������Դϵͳ
*
* @return ������Դϵͳ
* @see String
*/
public Integer getSrc_syscode () {
return this.src_syscode;
 } 

/** 
* ���õ�����Դϵͳ
*
* @param src_syscode ������Դϵͳ
* @see String
*/
public void setSrc_syscode ( Integer src_syscode) {
this.src_syscode=src_syscode;
 } 

/** 
* ��ȡ��Ŀ
*
* @return ��Ŀ
*/
public String getSubjcode () {
return this.subjcode;
 } 

/** 
* ���ÿ�Ŀ
*
* @param subjcode ��Ŀ
*/
public void setSubjcode ( String subjcode) {
this.subjcode=subjcode;
 } 

/** 
* ��ȡ��Ӧ��
*
* @return ��Ӧ��
*/
public String getSupplier () {
return this.supplier;
 } 

/** 
* ���ù�Ӧ��
*
* @param supplier ��Ӧ��
*/
public void setSupplier ( String supplier) {
this.supplier=supplier;
 } 

/** 
* ��ȡ��������ϵͳ
*
* @return ��������ϵͳ
* @see String
*/
public Integer getSyscode () {
return this.syscode;
 } 

/** 
* ���õ�������ϵͳ
*
* @param syscode ��������ϵͳ
* @see String
*/
public void setSyscode ( Integer syscode) {
this.syscode=syscode;
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


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("baal.fukuandan");
  }
}