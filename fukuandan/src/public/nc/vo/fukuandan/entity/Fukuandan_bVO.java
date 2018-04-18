package nc.vo.fukuandan.entity;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class Fukuandan_bVO extends SuperVO {
/**
*������֯����
*/
public UFDouble agentreceivelocal;
/**
*����ԭ�ҽ��
*/
public UFDouble agentreceiveprimal;
/**
*�ʲ���ͬ��
*/
public String assetpactno;
/**
*���˱�ʶ��
*/
public String bankrelated_code;
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
*���ݺ�
*/
public String billno;
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
*Ʊ�ݷ���
*/
public String checkdirection;
/**
*���κ���Ҫ��
*/
public String checkelement;
/**
*Ʊ�ݺ�
*/
public String checkno;
/**
*Ʊ������
*/
public String checktype;
/**
*�и���
*/
public String commpayer;
/**
*�и�״̬
*/
public Integer commpaystatus;
/**
*�и�����
*/
public Integer commpaytype;
/**
*�ڲ����׽����
*/
public String confernum;
/**
*��ͬ��
*/
public String contractno;
/**
*����Эͬ״̬
*/
public Integer coordflag;
/**
*�ɱ�����
*/
public String costcenter;
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
*����
*/
public Integer direction;
/**
*�豸����
*/
public String equipmentcode;
/**
*�̶��ʲ���Ƭ��
*/
public String facard;
/**
*ɢ��
*/
public String freecust;
/**
*����ȫ�ֱ���
*/
public UFDouble globalagentreceivelocal;
/**
*ȫ�ֱ������
*/
public UFDouble globalbalance;
/**
*ȫ�ֱ��ҽ��(�跽)
*/
public UFDouble globaldebit;
/**
*ȫ�ֱ�����˰���(�跽)
*/
public UFDouble globalnotax_de;
/**
*ȫ�ֱ��һ���
*/
public UFDouble globalrate;
/**
*���ռ��ű���
*/
public UFDouble groupagentreceivelocal;
/**
*���ű������
*/
public UFDouble groupbalance;
/**
*���ű��ҽ��(�跽)
*/
public UFDouble groupdebit;
/**
*���ű�����˰���(�跽)
*/
public UFDouble groupnotax_de;
/**
*���ű��һ���
*/
public UFDouble grouprate;
/**
*����������
*/
public String innerorderno;
/**
*��Ʊ��
*/
public String invoiceno;
/**
*�Ƿ�ֿ۽��
*/
public UFBoolean isdiscount;
/**
*�Ƿ񱻾ܸ�
*/
public UFBoolean isrefused;
/**
*��֯�������
*/
public UFDouble local_money_bal;
/**
*��֯���ҽ��(�跽)
*/
public UFDouble local_money_de;
/**
*��֯������˰���(�跽)
*/
public UFDouble local_notax_de;
/**
*���ҵ���
*/
public UFDouble local_price;
/**
*˰��
*/
public UFDouble local_tax_de;
/**
*���Һ�˰����
*/
public UFDouble local_taxprice;
/**
*����
*/
public String material;
/**
*ԭʼ����
*/
public String material_src;
/**
*ԭ�����
*/
public UFDouble money_bal;
/**
*�跽ԭ�ҽ��
*/
public UFDouble money_de;
/**
*�跽ԭ����˰���
*/
public UFDouble notax_de;
/**
*��������
*/
public Integer objtype;
/**
*Ԥռ�ú���ԭ�����
*/
public UFDouble occupationmny;
/**
*������Ӧ��
*/
public String ordercubasdoc;
/**
*���ⵥ��
*/
public String outstoreno;
/**
*�����־
*/
public UFBoolean pausetransact;
/**
*���������˻�
*/
public String payaccount;
/**
*ժҪ
*/
public String paycomment;
/**
*֧������
*/
public UFDate paydate;
/**
*֧��״̬
*/
public Integer payflag;
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
*����б�ʶ
*/
public String pk_fukuandan_b;
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
*����Э��
*/
public String pk_payterm;
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
*����ҵ������
*/
public String pk_recpaytype;
/**
*����������
*/
public String pk_ssitem;
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
*���۵�λ��˰����
*/
public UFDouble postprice;
/**
*���۵�λ��˰����
*/
public UFDouble postpricenotax;
/**
*���۵�λ����
*/
public UFDouble postquantity;
/**
*���ۼ�����λ
*/
public String postunit;
/**
*��������
*/
public Integer prepay;
/**
*����
*/
public UFDouble price;
/**
*��Ʒ��
*/
public String productline;
/**
*��Ŀ
*/
public String project;
/**
*��Ŀ����
*/
public String project_task;
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
*������
*/
public String purchaseorder;
/**
*�������
*/
public UFDouble quantity_bal;
/**
*��������
*/
public UFDouble quantity_cr;
/**
*�跽����
*/
public UFDouble quantity_de;
/**
*��֯���һ���
*/
public UFDouble rate;
/**
*�տ������˻�
*/
public String recaccount;
/**
*�ܸ�����
*/
public String refuse_reason;
/**
*���ݷ�¼��
*/
public Integer rowno;
/**
*������
*/
public Integer rowtype;
/**
*ժҪ
*/
public String scomment;
/**
*���������֯
*/
public String sett_org;
/**
*���������֯�汾����
*/
public String sett_org_v;
/**
*Ӧ������
*/
public String settlecurr;
/**
*Ӧ�����
*/
public UFDouble settlemoney;
/**
*Դͷ��������
*/
public String src_billid;
/**
*Դͷ��������
*/
public String src_billtype;
/**
*Դͷ����������
*/
public String src_itemid;
/**
*Դͷ��������
*/
public String src_tradetype;
/**
*��Ŀ
*/
public String subjcode;
/**
*��Ӧ��
*/
public String supplier;
/**
*˰��
*/
public String taxnum;
/**
*��˰����
*/
public UFDouble taxprice;
/**
*˰��
*/
public UFDouble taxrate;
/**
*�ϲ㵥������
*/
public String top_billid;
/**
*�ϲ㵥�ݺ�
*/
public String top_billno;
/**
*�ϲ㵥������
*/
public String top_billtype;
/**
*����ʱ��
*/
public UFDateTime top_changets;
/**
*�ϲ㵥��������
*/
public String top_itemid;
/**
*��Դ����Э����
*/
public String top_termch;
/**
*�ϲ㽻������
*/
public String top_tradetype;
/**
*ʱ���
*/
public UFDateTime ts;
/** 
* ��ȡ������֯����
*
* @return ������֯����
*/
public UFDouble getAgentreceivelocal () {
return this.agentreceivelocal;
 } 

/** 
* ����������֯����
*
* @param agentreceivelocal ������֯����
*/
public void setAgentreceivelocal ( UFDouble agentreceivelocal) {
this.agentreceivelocal=agentreceivelocal;
 } 

/** 
* ��ȡ����ԭ�ҽ��
*
* @return ����ԭ�ҽ��
*/
public UFDouble getAgentreceiveprimal () {
return this.agentreceiveprimal;
 } 

/** 
* ��������ԭ�ҽ��
*
* @param agentreceiveprimal ����ԭ�ҽ��
*/
public void setAgentreceiveprimal ( UFDouble agentreceiveprimal) {
this.agentreceiveprimal=agentreceiveprimal;
 } 

/** 
* ��ȡ�ʲ���ͬ��
*
* @return �ʲ���ͬ��
*/
public String getAssetpactno () {
return this.assetpactno;
 } 

/** 
* �����ʲ���ͬ��
*
* @param assetpactno �ʲ���ͬ��
*/
public void setAssetpactno ( String assetpactno) {
this.assetpactno=assetpactno;
 } 

/** 
* ��ȡ���˱�ʶ��
*
* @return ���˱�ʶ��
*/
public String getBankrelated_code () {
return this.bankrelated_code;
 } 

/** 
* ���ö��˱�ʶ��
*
* @param bankrelated_code ���˱�ʶ��
*/
public void setBankrelated_code ( String bankrelated_code) {
this.bankrelated_code=bankrelated_code;
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
* ��ȡƱ�ݷ���
*
* @return Ʊ�ݷ���
* @see String
*/
public String getCheckdirection () {
return this.checkdirection;
 } 

/** 
* ����Ʊ�ݷ���
*
* @param checkdirection Ʊ�ݷ���
* @see String
*/
public void setCheckdirection ( String checkdirection) {
this.checkdirection=checkdirection;
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
* ��ȡƱ�ݺ�
*
* @return Ʊ�ݺ�
*/
public String getCheckno () {
return this.checkno;
 } 

/** 
* ����Ʊ�ݺ�
*
* @param checkno Ʊ�ݺ�
*/
public void setCheckno ( String checkno) {
this.checkno=checkno;
 } 

/** 
* ��ȡƱ������
*
* @return Ʊ������
*/
public String getChecktype () {
return this.checktype;
 } 

/** 
* ����Ʊ������
*
* @param checktype Ʊ������
*/
public void setChecktype ( String checktype) {
this.checktype=checktype;
 } 

/** 
* ��ȡ�и���
*
* @return �и���
*/
public String getCommpayer () {
return this.commpayer;
 } 

/** 
* ���óи���
*
* @param commpayer �и���
*/
public void setCommpayer ( String commpayer) {
this.commpayer=commpayer;
 } 

/** 
* ��ȡ�и�״̬
*
* @return �и�״̬
* @see String
*/
public Integer getCommpaystatus () {
return this.commpaystatus;
 } 

/** 
* ���óи�״̬
*
* @param commpaystatus �и�״̬
* @see String
*/
public void setCommpaystatus ( Integer commpaystatus) {
this.commpaystatus=commpaystatus;
 } 

/** 
* ��ȡ�и�����
*
* @return �и�����
* @see String
*/
public Integer getCommpaytype () {
return this.commpaytype;
 } 

/** 
* ���óи�����
*
* @param commpaytype �и�����
* @see String
*/
public void setCommpaytype ( Integer commpaytype) {
this.commpaytype=commpaytype;
 } 

/** 
* ��ȡ�ڲ����׽����
*
* @return �ڲ����׽����
*/
public String getConfernum () {
return this.confernum;
 } 

/** 
* �����ڲ����׽����
*
* @param confernum �ڲ����׽����
*/
public void setConfernum ( String confernum) {
this.confernum=confernum;
 } 

/** 
* ��ȡ��ͬ��
*
* @return ��ͬ��
*/
public String getContractno () {
return this.contractno;
 } 

/** 
* ���ú�ͬ��
*
* @param contractno ��ͬ��
*/
public void setContractno ( String contractno) {
this.contractno=contractno;
 } 

/** 
* ��ȡ����Эͬ״̬
*
* @return ����Эͬ״̬
* @see String
*/
public Integer getCoordflag () {
return this.coordflag;
 } 

/** 
* ���õ���Эͬ״̬
*
* @param coordflag ����Эͬ״̬
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
* ��ȡ����
*
* @return ����
* @see String
*/
public Integer getDirection () {
return this.direction;
 } 

/** 
* ���÷���
*
* @param direction ����
* @see String
*/
public void setDirection ( Integer direction) {
this.direction=direction;
 } 

/** 
* ��ȡ�豸����
*
* @return �豸����
*/
public String getEquipmentcode () {
return this.equipmentcode;
 } 

/** 
* �����豸����
*
* @param equipmentcode �豸����
*/
public void setEquipmentcode ( String equipmentcode) {
this.equipmentcode=equipmentcode;
 } 

/** 
* ��ȡ�̶��ʲ���Ƭ��
*
* @return �̶��ʲ���Ƭ��
*/
public String getFacard () {
return this.facard;
 } 

/** 
* ���ù̶��ʲ���Ƭ��
*
* @param facard �̶��ʲ���Ƭ��
*/
public void setFacard ( String facard) {
this.facard=facard;
 } 

/** 
* ��ȡɢ��
*
* @return ɢ��
*/
public String getFreecust () {
return this.freecust;
 } 

/** 
* ����ɢ��
*
* @param freecust ɢ��
*/
public void setFreecust ( String freecust) {
this.freecust=freecust;
 } 

/** 
* ��ȡ����ȫ�ֱ���
*
* @return ����ȫ�ֱ���
*/
public UFDouble getGlobalagentreceivelocal () {
return this.globalagentreceivelocal;
 } 

/** 
* ��������ȫ�ֱ���
*
* @param globalagentreceivelocal ����ȫ�ֱ���
*/
public void setGlobalagentreceivelocal ( UFDouble globalagentreceivelocal) {
this.globalagentreceivelocal=globalagentreceivelocal;
 } 

/** 
* ��ȡȫ�ֱ������
*
* @return ȫ�ֱ������
*/
public UFDouble getGlobalbalance () {
return this.globalbalance;
 } 

/** 
* ����ȫ�ֱ������
*
* @param globalbalance ȫ�ֱ������
*/
public void setGlobalbalance ( UFDouble globalbalance) {
this.globalbalance=globalbalance;
 } 

/** 
* ��ȡȫ�ֱ��ҽ��(�跽)
*
* @return ȫ�ֱ��ҽ��(�跽)
*/
public UFDouble getGlobaldebit () {
return this.globaldebit;
 } 

/** 
* ����ȫ�ֱ��ҽ��(�跽)
*
* @param globaldebit ȫ�ֱ��ҽ��(�跽)
*/
public void setGlobaldebit ( UFDouble globaldebit) {
this.globaldebit=globaldebit;
 } 

/** 
* ��ȡȫ�ֱ�����˰���(�跽)
*
* @return ȫ�ֱ�����˰���(�跽)
*/
public UFDouble getGlobalnotax_de () {
return this.globalnotax_de;
 } 

/** 
* ����ȫ�ֱ�����˰���(�跽)
*
* @param globalnotax_de ȫ�ֱ�����˰���(�跽)
*/
public void setGlobalnotax_de ( UFDouble globalnotax_de) {
this.globalnotax_de=globalnotax_de;
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
* ��ȡ���ռ��ű���
*
* @return ���ռ��ű���
*/
public UFDouble getGroupagentreceivelocal () {
return this.groupagentreceivelocal;
 } 

/** 
* �������ռ��ű���
*
* @param groupagentreceivelocal ���ռ��ű���
*/
public void setGroupagentreceivelocal ( UFDouble groupagentreceivelocal) {
this.groupagentreceivelocal=groupagentreceivelocal;
 } 

/** 
* ��ȡ���ű������
*
* @return ���ű������
*/
public UFDouble getGroupbalance () {
return this.groupbalance;
 } 

/** 
* ���ü��ű������
*
* @param groupbalance ���ű������
*/
public void setGroupbalance ( UFDouble groupbalance) {
this.groupbalance=groupbalance;
 } 

/** 
* ��ȡ���ű��ҽ��(�跽)
*
* @return ���ű��ҽ��(�跽)
*/
public UFDouble getGroupdebit () {
return this.groupdebit;
 } 

/** 
* ���ü��ű��ҽ��(�跽)
*
* @param groupdebit ���ű��ҽ��(�跽)
*/
public void setGroupdebit ( UFDouble groupdebit) {
this.groupdebit=groupdebit;
 } 

/** 
* ��ȡ���ű�����˰���(�跽)
*
* @return ���ű�����˰���(�跽)
*/
public UFDouble getGroupnotax_de () {
return this.groupnotax_de;
 } 

/** 
* ���ü��ű�����˰���(�跽)
*
* @param groupnotax_de ���ű�����˰���(�跽)
*/
public void setGroupnotax_de ( UFDouble groupnotax_de) {
this.groupnotax_de=groupnotax_de;
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
* ��ȡ����������
*
* @return ����������
*/
public String getInnerorderno () {
return this.innerorderno;
 } 

/** 
* ���õ���������
*
* @param innerorderno ����������
*/
public void setInnerorderno ( String innerorderno) {
this.innerorderno=innerorderno;
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
* ��ȡ�Ƿ�ֿ۽��
*
* @return �Ƿ�ֿ۽��
*/
public UFBoolean getIsdiscount () {
return this.isdiscount;
 } 

/** 
* �����Ƿ�ֿ۽��
*
* @param isdiscount �Ƿ�ֿ۽��
*/
public void setIsdiscount ( UFBoolean isdiscount) {
this.isdiscount=isdiscount;
 } 

/** 
* ��ȡ�Ƿ񱻾ܸ�
*
* @return �Ƿ񱻾ܸ�
*/
public UFBoolean getIsrefused () {
return this.isrefused;
 } 

/** 
* �����Ƿ񱻾ܸ�
*
* @param isrefused �Ƿ񱻾ܸ�
*/
public void setIsrefused ( UFBoolean isrefused) {
this.isrefused=isrefused;
 } 

/** 
* ��ȡ��֯�������
*
* @return ��֯�������
*/
public UFDouble getLocal_money_bal () {
return this.local_money_bal;
 } 

/** 
* ������֯�������
*
* @param local_money_bal ��֯�������
*/
public void setLocal_money_bal ( UFDouble local_money_bal) {
this.local_money_bal=local_money_bal;
 } 

/** 
* ��ȡ��֯���ҽ��(�跽)
*
* @return ��֯���ҽ��(�跽)
*/
public UFDouble getLocal_money_de () {
return this.local_money_de;
 } 

/** 
* ������֯���ҽ��(�跽)
*
* @param local_money_de ��֯���ҽ��(�跽)
*/
public void setLocal_money_de ( UFDouble local_money_de) {
this.local_money_de=local_money_de;
 } 

/** 
* ��ȡ��֯������˰���(�跽)
*
* @return ��֯������˰���(�跽)
*/
public UFDouble getLocal_notax_de () {
return this.local_notax_de;
 } 

/** 
* ������֯������˰���(�跽)
*
* @param local_notax_de ��֯������˰���(�跽)
*/
public void setLocal_notax_de ( UFDouble local_notax_de) {
this.local_notax_de=local_notax_de;
 } 

/** 
* ��ȡ���ҵ���
*
* @return ���ҵ���
*/
public UFDouble getLocal_price () {
return this.local_price;
 } 

/** 
* ���ñ��ҵ���
*
* @param local_price ���ҵ���
*/
public void setLocal_price ( UFDouble local_price) {
this.local_price=local_price;
 } 

/** 
* ��ȡ˰��
*
* @return ˰��
*/
public UFDouble getLocal_tax_de () {
return this.local_tax_de;
 } 

/** 
* ����˰��
*
* @param local_tax_de ˰��
*/
public void setLocal_tax_de ( UFDouble local_tax_de) {
this.local_tax_de=local_tax_de;
 } 

/** 
* ��ȡ���Һ�˰����
*
* @return ���Һ�˰����
*/
public UFDouble getLocal_taxprice () {
return this.local_taxprice;
 } 

/** 
* ���ñ��Һ�˰����
*
* @param local_taxprice ���Һ�˰����
*/
public void setLocal_taxprice ( UFDouble local_taxprice) {
this.local_taxprice=local_taxprice;
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getMaterial () {
return this.material;
 } 

/** 
* ��������
*
* @param material ����
*/
public void setMaterial ( String material) {
this.material=material;
 } 

/** 
* ��ȡԭʼ����
*
* @return ԭʼ����
*/
public String getMaterial_src () {
return this.material_src;
 } 

/** 
* ����ԭʼ����
*
* @param material_src ԭʼ����
*/
public void setMaterial_src ( String material_src) {
this.material_src=material_src;
 } 

/** 
* ��ȡԭ�����
*
* @return ԭ�����
*/
public UFDouble getMoney_bal () {
return this.money_bal;
 } 

/** 
* ����ԭ�����
*
* @param money_bal ԭ�����
*/
public void setMoney_bal ( UFDouble money_bal) {
this.money_bal=money_bal;
 } 

/** 
* ��ȡ�跽ԭ�ҽ��
*
* @return �跽ԭ�ҽ��
*/
public UFDouble getMoney_de () {
return this.money_de;
 } 

/** 
* ���ý跽ԭ�ҽ��
*
* @param money_de �跽ԭ�ҽ��
*/
public void setMoney_de ( UFDouble money_de) {
this.money_de=money_de;
 } 

/** 
* ��ȡ�跽ԭ����˰���
*
* @return �跽ԭ����˰���
*/
public UFDouble getNotax_de () {
return this.notax_de;
 } 

/** 
* ���ý跽ԭ����˰���
*
* @param notax_de �跽ԭ����˰���
*/
public void setNotax_de ( UFDouble notax_de) {
this.notax_de=notax_de;
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
* ��ȡԤռ�ú���ԭ�����
*
* @return Ԥռ�ú���ԭ�����
*/
public UFDouble getOccupationmny () {
return this.occupationmny;
 } 

/** 
* ����Ԥռ�ú���ԭ�����
*
* @param occupationmny Ԥռ�ú���ԭ�����
*/
public void setOccupationmny ( UFDouble occupationmny) {
this.occupationmny=occupationmny;
 } 

/** 
* ��ȡ������Ӧ��
*
* @return ������Ӧ��
*/
public String getOrdercubasdoc () {
return this.ordercubasdoc;
 } 

/** 
* ���ö�����Ӧ��
*
* @param ordercubasdoc ������Ӧ��
*/
public void setOrdercubasdoc ( String ordercubasdoc) {
this.ordercubasdoc=ordercubasdoc;
 } 

/** 
* ��ȡ���ⵥ��
*
* @return ���ⵥ��
*/
public String getOutstoreno () {
return this.outstoreno;
 } 

/** 
* ���ó��ⵥ��
*
* @param outstoreno ���ⵥ��
*/
public void setOutstoreno ( String outstoreno) {
this.outstoreno=outstoreno;
 } 

/** 
* ��ȡ�����־
*
* @return �����־
*/
public UFBoolean getPausetransact () {
return this.pausetransact;
 } 

/** 
* ���ù����־
*
* @param pausetransact �����־
*/
public void setPausetransact ( UFBoolean pausetransact) {
this.pausetransact=pausetransact;
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
* ��ȡժҪ
*
* @return ժҪ
*/
public String getPaycomment () {
return this.paycomment;
 } 

/** 
* ����ժҪ
*
* @param paycomment ժҪ
*/
public void setPaycomment ( String paycomment) {
this.paycomment=paycomment;
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
* ��ȡ֧��״̬
*
* @return ֧��״̬
* @see String
*/
public Integer getPayflag () {
return this.payflag;
 } 

/** 
* ����֧��״̬
*
* @param payflag ֧��״̬
* @see String
*/
public void setPayflag ( Integer payflag) {
this.payflag=payflag;
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
* ��ȡ����б�ʶ
*
* @return ����б�ʶ
*/
public String getPk_fukuandan_b () {
return this.pk_fukuandan_b;
 } 

/** 
* ���ø���б�ʶ
*
* @param pk_fukuandan_b ����б�ʶ
*/
public void setPk_fukuandan_b ( String pk_fukuandan_b) {
this.pk_fukuandan_b=pk_fukuandan_b;
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
* ��ȡ����Э��
*
* @return ����Э��
*/
public String getPk_payterm () {
return this.pk_payterm;
 } 

/** 
* ���ø���Э��
*
* @param pk_payterm ����Э��
*/
public void setPk_payterm ( String pk_payterm) {
this.pk_payterm=pk_payterm;
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
* ��ȡ����ҵ������
*
* @return ����ҵ������
*/
public String getPk_recpaytype () {
return this.pk_recpaytype;
 } 

/** 
* ���ø���ҵ������
*
* @param pk_recpaytype ����ҵ������
*/
public void setPk_recpaytype ( String pk_recpaytype) {
this.pk_recpaytype=pk_recpaytype;
 } 

/** 
* ��ȡ����������
*
* @return ����������
*/
public String getPk_ssitem () {
return this.pk_ssitem;
 } 

/** 
* ��������������
*
* @param pk_ssitem ����������
*/
public void setPk_ssitem ( String pk_ssitem) {
this.pk_ssitem=pk_ssitem;
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
* ��ȡ���۵�λ��˰����
*
* @return ���۵�λ��˰����
*/
public UFDouble getPostprice () {
return this.postprice;
 } 

/** 
* ���ñ��۵�λ��˰����
*
* @param postprice ���۵�λ��˰����
*/
public void setPostprice ( UFDouble postprice) {
this.postprice=postprice;
 } 

/** 
* ��ȡ���۵�λ��˰����
*
* @return ���۵�λ��˰����
*/
public UFDouble getPostpricenotax () {
return this.postpricenotax;
 } 

/** 
* ���ñ��۵�λ��˰����
*
* @param postpricenotax ���۵�λ��˰����
*/
public void setPostpricenotax ( UFDouble postpricenotax) {
this.postpricenotax=postpricenotax;
 } 

/** 
* ��ȡ���۵�λ����
*
* @return ���۵�λ����
*/
public UFDouble getPostquantity () {
return this.postquantity;
 } 

/** 
* ���ñ��۵�λ����
*
* @param postquantity ���۵�λ����
*/
public void setPostquantity ( UFDouble postquantity) {
this.postquantity=postquantity;
 } 

/** 
* ��ȡ���ۼ�����λ
*
* @return ���ۼ�����λ
*/
public String getPostunit () {
return this.postunit;
 } 

/** 
* ���ñ��ۼ�����λ
*
* @param postunit ���ۼ�����λ
*/
public void setPostunit ( String postunit) {
this.postunit=postunit;
 } 

/** 
* ��ȡ��������
*
* @return ��������
* @see String
*/
public Integer getPrepay () {
return this.prepay;
 } 

/** 
* ���ø�������
*
* @param prepay ��������
* @see String
*/
public void setPrepay ( Integer prepay) {
this.prepay=prepay;
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public UFDouble getPrice () {
return this.price;
 } 

/** 
* ���õ���
*
* @param price ����
*/
public void setPrice ( UFDouble price) {
this.price=price;
 } 

/** 
* ��ȡ��Ʒ��
*
* @return ��Ʒ��
*/
public String getProductline () {
return this.productline;
 } 

/** 
* ���ò�Ʒ��
*
* @param productline ��Ʒ��
*/
public void setProductline ( String productline) {
this.productline=productline;
 } 

/** 
* ��ȡ��Ŀ
*
* @return ��Ŀ
*/
public String getProject () {
return this.project;
 } 

/** 
* ������Ŀ
*
* @param project ��Ŀ
*/
public void setProject ( String project) {
this.project=project;
 } 

/** 
* ��ȡ��Ŀ����
*
* @return ��Ŀ����
*/
public String getProject_task () {
return this.project_task;
 } 

/** 
* ������Ŀ����
*
* @param project_task ��Ŀ����
*/
public void setProject_task ( String project_task) {
this.project_task=project_task;
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
* ��ȡ������
*
* @return ������
*/
public String getPurchaseorder () {
return this.purchaseorder;
 } 

/** 
* ���ö�����
*
* @param purchaseorder ������
*/
public void setPurchaseorder ( String purchaseorder) {
this.purchaseorder=purchaseorder;
 } 

/** 
* ��ȡ�������
*
* @return �������
*/
public UFDouble getQuantity_bal () {
return this.quantity_bal;
 } 

/** 
* �����������
*
* @param quantity_bal �������
*/
public void setQuantity_bal ( UFDouble quantity_bal) {
this.quantity_bal=quantity_bal;
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDouble getQuantity_cr () {
return this.quantity_cr;
 } 

/** 
* ���ô�������
*
* @param quantity_cr ��������
*/
public void setQuantity_cr ( UFDouble quantity_cr) {
this.quantity_cr=quantity_cr;
 } 

/** 
* ��ȡ�跽����
*
* @return �跽����
*/
public UFDouble getQuantity_de () {
return this.quantity_de;
 } 

/** 
* ���ý跽����
*
* @param quantity_de �跽����
*/
public void setQuantity_de ( UFDouble quantity_de) {
this.quantity_de=quantity_de;
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
* ��ȡ�ܸ�����
*
* @return �ܸ�����
*/
public String getRefuse_reason () {
return this.refuse_reason;
 } 

/** 
* ���þܸ�����
*
* @param refuse_reason �ܸ�����
*/
public void setRefuse_reason ( String refuse_reason) {
this.refuse_reason=refuse_reason;
 } 

/** 
* ��ȡ���ݷ�¼��
*
* @return ���ݷ�¼��
*/
public Integer getRowno () {
return this.rowno;
 } 

/** 
* ���õ��ݷ�¼��
*
* @param rowno ���ݷ�¼��
*/
public void setRowno ( Integer rowno) {
this.rowno=rowno;
 } 

/** 
* ��ȡ������
*
* @return ������
* @see String
*/
public Integer getRowtype () {
return this.rowtype;
 } 

/** 
* ����������
*
* @param rowtype ������
* @see String
*/
public void setRowtype ( Integer rowtype) {
this.rowtype=rowtype;
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
* ��ȡӦ������
*
* @return Ӧ������
*/
public String getSettlecurr () {
return this.settlecurr;
 } 

/** 
* ����Ӧ������
*
* @param settlecurr Ӧ������
*/
public void setSettlecurr ( String settlecurr) {
this.settlecurr=settlecurr;
 } 

/** 
* ��ȡӦ�����
*
* @return Ӧ�����
*/
public UFDouble getSettlemoney () {
return this.settlemoney;
 } 

/** 
* ����Ӧ�����
*
* @param settlemoney Ӧ�����
*/
public void setSettlemoney ( UFDouble settlemoney) {
this.settlemoney=settlemoney;
 } 

/** 
* ��ȡԴͷ��������
*
* @return Դͷ��������
*/
public String getSrc_billid () {
return this.src_billid;
 } 

/** 
* ����Դͷ��������
*
* @param src_billid Դͷ��������
*/
public void setSrc_billid ( String src_billid) {
this.src_billid=src_billid;
 } 

/** 
* ��ȡԴͷ��������
*
* @return Դͷ��������
*/
public String getSrc_billtype () {
return this.src_billtype;
 } 

/** 
* ����Դͷ��������
*
* @param src_billtype Դͷ��������
*/
public void setSrc_billtype ( String src_billtype) {
this.src_billtype=src_billtype;
 } 

/** 
* ��ȡԴͷ����������
*
* @return Դͷ����������
*/
public String getSrc_itemid () {
return this.src_itemid;
 } 

/** 
* ����Դͷ����������
*
* @param src_itemid Դͷ����������
*/
public void setSrc_itemid ( String src_itemid) {
this.src_itemid=src_itemid;
 } 

/** 
* ��ȡԴͷ��������
*
* @return Դͷ��������
*/
public String getSrc_tradetype () {
return this.src_tradetype;
 } 

/** 
* ����Դͷ��������
*
* @param src_tradetype Դͷ��������
*/
public void setSrc_tradetype ( String src_tradetype) {
this.src_tradetype=src_tradetype;
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
* ��ȡ˰��
*
* @return ˰��
*/
public String getTaxnum () {
return this.taxnum;
 } 

/** 
* ����˰��
*
* @param taxnum ˰��
*/
public void setTaxnum ( String taxnum) {
this.taxnum=taxnum;
 } 

/** 
* ��ȡ��˰����
*
* @return ��˰����
*/
public UFDouble getTaxprice () {
return this.taxprice;
 } 

/** 
* ���ú�˰����
*
* @param taxprice ��˰����
*/
public void setTaxprice ( UFDouble taxprice) {
this.taxprice=taxprice;
 } 

/** 
* ��ȡ˰��
*
* @return ˰��
*/
public UFDouble getTaxrate () {
return this.taxrate;
 } 

/** 
* ����˰��
*
* @param taxrate ˰��
*/
public void setTaxrate ( UFDouble taxrate) {
this.taxrate=taxrate;
 } 

/** 
* ��ȡ�ϲ㵥������
*
* @return �ϲ㵥������
*/
public String getTop_billid () {
return this.top_billid;
 } 

/** 
* �����ϲ㵥������
*
* @param top_billid �ϲ㵥������
*/
public void setTop_billid ( String top_billid) {
this.top_billid=top_billid;
 } 

/** 
* ��ȡ�ϲ㵥�ݺ�
*
* @return �ϲ㵥�ݺ�
*/
public String getTop_billno () {
return this.top_billno;
 } 

/** 
* �����ϲ㵥�ݺ�
*
* @param top_billno �ϲ㵥�ݺ�
*/
public void setTop_billno ( String top_billno) {
this.top_billno=top_billno;
 } 

/** 
* ��ȡ�ϲ㵥������
*
* @return �ϲ㵥������
*/
public String getTop_billtype () {
return this.top_billtype;
 } 

/** 
* �����ϲ㵥������
*
* @param top_billtype �ϲ㵥������
*/
public void setTop_billtype ( String top_billtype) {
this.top_billtype=top_billtype;
 } 

/** 
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDateTime getTop_changets () {
return this.top_changets;
 } 

/** 
* ���ý���ʱ��
*
* @param top_changets ����ʱ��
*/
public void setTop_changets ( UFDateTime top_changets) {
this.top_changets=top_changets;
 } 

/** 
* ��ȡ�ϲ㵥��������
*
* @return �ϲ㵥��������
*/
public String getTop_itemid () {
return this.top_itemid;
 } 

/** 
* �����ϲ㵥��������
*
* @param top_itemid �ϲ㵥��������
*/
public void setTop_itemid ( String top_itemid) {
this.top_itemid=top_itemid;
 } 

/** 
* ��ȡ��Դ����Э����
*
* @return ��Դ����Э����
*/
public String getTop_termch () {
return this.top_termch;
 } 

/** 
* ������Դ����Э����
*
* @param top_termch ��Դ����Э����
*/
public void setTop_termch ( String top_termch) {
this.top_termch=top_termch;
 } 

/** 
* ��ȡ�ϲ㽻������
*
* @return �ϲ㽻������
*/
public String getTop_tradetype () {
return this.top_tradetype;
 } 

/** 
* �����ϲ㽻������
*
* @param top_tradetype �ϲ㽻������
*/
public void setTop_tradetype ( String top_tradetype) {
this.top_tradetype=top_tradetype;
 } 

/** 
* ��ȡʱ���
*
* @return ʱ���
*/
public UFDateTime getTs () {
return this.ts;
 } 
private Integer dr;


public Integer getDr() {
	return dr;
}

public void setDr(Integer dr) {
	this.dr = dr;
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
    return VOMetaFactory.getInstance().getVOMeta("baal.fukuandan_b");
  }
}