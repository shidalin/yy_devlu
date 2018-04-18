package nc.vo.cgfp.entity;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class CgfpBVO extends SuperVO {
/**
*�ͻ�
*/
public static final String CASSCUSTID="casscustid";
/**
*��λ
*/
public static final String CASTUNITID="castunitid";
/**
*Դͷ����������
*/
public static final String CFIRSTBID="cfirstbid";
/**
*Դͷ��������
*/
public static final String CFIRSTID="cfirstid";
/**
*Դͷ��������
*/
public static final String CFIRSTTYPECODE="cfirsttypecode";
/**
*��������
*/
public static final String CPRODUCTORID="cproductorid";
/**
*��Ŀ
*/
public static final String CPROJECTID="cprojectid";
/**
*��Ŀ����
*/
public static final String CPROJECTTASKID="cprojecttaskid";
/**
*�����ȼ�
*/
public static final String CQUALITYLEVELID="cqualitylevelid";
/**
*�к�
*/
public static final String CROWNO="crowno";
/**
*��Դ����������
*/
public static final String CSOURCEBID="csourcebid";
/**
*��Դ��������
*/
public static final String CSOURCEID="csourceid";
/**
*��Դ��������
*/
public static final String CSOURCETYPECODE="csourcetypecode";
/**
*˰��
*/
public static final String CTAXCODEID="ctaxcodeid";
/**
*����λ
*/
public static final String CUNITID="cunitid";
/**
*��Ʊ����
*/
public static final String DBILLDATE="dbilldate";
/**
*��Դ��������
*/
public static final String DSOURCEDATE="dsourcedate";
/**
*firstbts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String FIRSTBTS="firstbts";
/**
*firstts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String FIRSTTS="firstts";
/**
*������
*/
public static final String FROWTYPE="frowtype";
/**
*��˰���
*/
public static final String FTAXTYPEFLAG="ftaxtypeflag";
/**
*�ۼƱ��ҽ�����
*/
public static final String NACCUMSETTMNY="naccumsettmny";
/**
*�ۼƽ���������
*/
public static final String NACCUMSETTNUM="naccumsettnum";
/**
*����
*/
public static final String NASTNUM="nastnum";
/**
*��˰����
*/
public static final String NASTORIGPRICE="nastorigprice";
/**
*��˰����
*/
public static final String NASTORIGTAXPRICE="nastorigtaxprice";
/**
*������˰����
*/
public static final String NASTPRICE="nastprice";
/**
*���Һ�˰����
*/
public static final String NASTTAXPRICE="nasttaxprice";
/**
*�Ƴɱ����
*/
public static final String NCALCOSTMNY="ncalcostmny";
/**
*��˰���
*/
public static final String NCALTAXMNY="ncaltaxmny";
/**
*ȫ�ֱ�����˰���
*/
public static final String NGLOBALMNY="nglobalmny";
/**
*ȫ�ֱ��Ҽ�˰�ϼ�
*/
public static final String NGLOBALTAXMNY="nglobaltaxmny";
/**
*���ű�����˰���
*/
public static final String NGROUPMNY="ngroupmny";
/**
*���ű��Ҽ�˰�ϼ�
*/
public static final String NGROUPTAXMNY="ngrouptaxmny";
/**
*������˰���
*/
public static final String NMNY="nmny";
/**
*���ɵֿ�˰��
*/
public static final String NNOSUBTAX="nnosubtax";
/**
*���ɵֿ�˰��
*/
public static final String NNOSUBTAXRATE="nnosubtaxrate";
/**
*������
*/
public static final String NNUM="nnum";
/**
*nnumwrbck���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String NNUMWRBCK="nnumwrbck";
/**
*��˰���
*/
public static final String NORIGMNY="norigmny";
/**
*����˰����
*/
public static final String NORIGPRICE="norigprice";
/**
*��˰�ϼ�
*/
public static final String NORIGTAXMNY="norigtaxmny";
/**
*����˰����
*/
public static final String NORIGTAXPRICE="norigtaxprice";
/**
*nplanprice���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String NPLANPRICE="nplanprice";
/**
*��������˰����
*/
public static final String NPRICE="nprice";
/**
*�������������
*/
public static final String NREASONWASTENUM="nreasonwastenum";
/**
*nsourcenum���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String NSOURCENUM="nsourcenum";
/**
*˰��
*/
public static final String NTAX="ntax";
/**
*���Ҽ�˰�ϼ�
*/
public static final String NTAXMNY="ntaxmny";
/**
*�����Һ�˰����
*/
public static final String NTAXPRICE="ntaxprice";
/**
*˰��
*/
public static final String NTAXRATE="ntaxrate";
/**
*Ӧ��������֯
*/
public static final String PK_APFINANCEORG="pk_apfinanceorg";
/**
*Ӧ��������֯
*/
public static final String PK_APFINANCEORG_V="pk_apfinanceorg_v";
/**
*��������
*/
public static final String PK_APLIABCENTER="pk_apliabcenter";
/**
*��������
*/
public static final String PK_APLIABCENTER_V="pk_apliabcenter_v";
/**
*���ε���
*/
public static final String PK_BATCHCODE="pk_batchcode";
/**
*�ϲ㵥������
*/
public static final String PK_CGFP="pk_cgfp";
/**
*�ɹ���Ʊ��ϸ
*/
public static final String PK_CGFP_B="pk_cgfp_b";
/**
*��֧��Ŀ
*/
public static final String PK_COSTSUBJ="pk_costsubj";
/**
*��������
*/
public static final String PK_GROUP="pk_group";
/**
*���ϰ汾
*/
public static final String PK_MATERIAL="pk_material";
/**
*��������
*/
public static final String PK_ORDER="pk_order";
/**
*����������
*/
public static final String PK_ORDER_B="pk_order_b";
/**
*������֯
*/
public static final String PK_ORG="pk_org";
/**
*������֯
*/
public static final String PK_ORG_V="pk_org_v";
/**
*����
*/
public static final String PK_SRCMATERIAL="pk_srcmaterial";
/**
*pk_stockps_b���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String PK_STOCKPS_B="pk_stockps_b";
/**
*�ֿ�
*/
public static final String PK_STORDOC="pk_stordoc";
/**
*��Ӧ��
*/
public static final String PK_SUPPLIER="pk_supplier";
/**
*ʹ�ò������°汾
*/
public static final String PK_USEDEPT="pk_usedept";
/**
*ʹ�ò���
*/
public static final String PK_USEDEPT_V="pk_usedept_v";
/**
*sourcebts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String SOURCEBTS="sourcebts";
/**
*sourcets���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String SOURCETS="sourcets";
/**
*ʱ���
*/
public static final String TS="ts";
/**
*���κ�
*/
public static final String VBATCHCODE="vbatchcode";
/**
*�Զ�����1
*/
public static final String VBDEF1="vbdef1";
/**
*�Զ�����10
*/
public static final String VBDEF10="vbdef10";
/**
*�Զ�����11
*/
public static final String VBDEF11="vbdef11";
/**
*�Զ�����12
*/
public static final String VBDEF12="vbdef12";
/**
*�Զ�����13
*/
public static final String VBDEF13="vbdef13";
/**
*�Զ�����14
*/
public static final String VBDEF14="vbdef14";
/**
*�Զ�����15
*/
public static final String VBDEF15="vbdef15";
/**
*�Զ�����16
*/
public static final String VBDEF16="vbdef16";
/**
*�Զ�����17
*/
public static final String VBDEF17="vbdef17";
/**
*�Զ�����18
*/
public static final String VBDEF18="vbdef18";
/**
*�Զ�����19
*/
public static final String VBDEF19="vbdef19";
/**
*�Զ�����2
*/
public static final String VBDEF2="vbdef2";
/**
*�Զ�����20
*/
public static final String VBDEF20="vbdef20";
/**
*�Զ�����3
*/
public static final String VBDEF3="vbdef3";
/**
*�Զ�����4
*/
public static final String VBDEF4="vbdef4";
/**
*�Զ�����5
*/
public static final String VBDEF5="vbdef5";
/**
*�Զ�����6
*/
public static final String VBDEF6="vbdef6";
/**
*�Զ�����7
*/
public static final String VBDEF7="vbdef7";
/**
*�Զ�����8
*/
public static final String VBDEF8="vbdef8";
/**
*�Զ�����9
*/
public static final String VBDEF9="vbdef9";
/**
*������
*/
public static final String VCHANGERATE="vchangerate";
/**
*��ͬ��
*/
public static final String VCTCODE="vctcode";
/**
*Դͷ���ݺ�
*/
public static final String VFIRSTCODE="vfirstcode";
/**
*Դͷ�����к�
*/
public static final String VFIRSTROWNO="vfirstrowno";
/**
*Դͷ��������
*/
public static final String VFIRSTTRANTYPE="vfirsttrantype";
/**
*���ɸ�������1
*/
public static final String VFREE1="vfree1";
/**
*���ɸ�������10
*/
public static final String VFREE10="vfree10";
/**
*���ɸ�������2
*/
public static final String VFREE2="vfree2";
/**
*���ɸ�������3
*/
public static final String VFREE3="vfree3";
/**
*���ɸ�������4
*/
public static final String VFREE4="vfree4";
/**
*���ɸ�������5
*/
public static final String VFREE5="vfree5";
/**
*���ɸ�������6
*/
public static final String VFREE6="vfree6";
/**
*���ɸ�������7
*/
public static final String VFREE7="vfree7";
/**
*���ɸ�������8
*/
public static final String VFREE8="vfree8";
/**
*���ɸ�������9
*/
public static final String VFREE9="vfree9";
/**
*��ע
*/
public static final String VMEMOB="vmemob";
/**
*������
*/
public static final String VORDERCODE="vordercode";
/**
*������������
*/
public static final String VORDERTRANTYPE="vordertrantype";
/**
*��Դ���ݺ�
*/
public static final String VSOURCECODE="vsourcecode";
/**
*��Դ�����к�
*/
public static final String VSOURCEROWNO="vsourcerowno";
/**
*��Դ��������
*/
public static final String VSOURCETRANTYPE="vsourcetrantype";
/** 
* ��ȡ�ͻ�
*
* @return �ͻ�
*/
public String getCasscustid () {
return (String) this.getAttributeValue( CgfpBVO.CASSCUSTID);
 } 

/** 
* ���ÿͻ�
*
* @param casscustid �ͻ�
*/
public void setCasscustid ( String casscustid) {
this.setAttributeValue( CgfpBVO.CASSCUSTID,casscustid);
 } 

/** 
* ��ȡ��λ
*
* @return ��λ
*/
public String getCastunitid () {
return (String) this.getAttributeValue( CgfpBVO.CASTUNITID);
 } 

/** 
* ���õ�λ
*
* @param castunitid ��λ
*/
public void setCastunitid ( String castunitid) {
this.setAttributeValue( CgfpBVO.CASTUNITID,castunitid);
 } 

/** 
* ��ȡԴͷ����������
*
* @return Դͷ����������
*/
public String getCfirstbid () {
return (String) this.getAttributeValue( CgfpBVO.CFIRSTBID);
 } 

/** 
* ����Դͷ����������
*
* @param cfirstbid Դͷ����������
*/
public void setCfirstbid ( String cfirstbid) {
this.setAttributeValue( CgfpBVO.CFIRSTBID,cfirstbid);
 } 

/** 
* ��ȡԴͷ��������
*
* @return Դͷ��������
*/
public String getCfirstid () {
return (String) this.getAttributeValue( CgfpBVO.CFIRSTID);
 } 

/** 
* ����Դͷ��������
*
* @param cfirstid Դͷ��������
*/
public void setCfirstid ( String cfirstid) {
this.setAttributeValue( CgfpBVO.CFIRSTID,cfirstid);
 } 

/** 
* ��ȡԴͷ��������
*
* @return Դͷ��������
*/
public String getCfirsttypecode () {
return (String) this.getAttributeValue( CgfpBVO.CFIRSTTYPECODE);
 } 

/** 
* ����Դͷ��������
*
* @param cfirsttypecode Դͷ��������
*/
public void setCfirsttypecode ( String cfirsttypecode) {
this.setAttributeValue( CgfpBVO.CFIRSTTYPECODE,cfirsttypecode);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getCproductorid () {
return (String) this.getAttributeValue( CgfpBVO.CPRODUCTORID);
 } 

/** 
* ������������
*
* @param cproductorid ��������
*/
public void setCproductorid ( String cproductorid) {
this.setAttributeValue( CgfpBVO.CPRODUCTORID,cproductorid);
 } 

/** 
* ��ȡ��Ŀ
*
* @return ��Ŀ
*/
public String getCprojectid () {
return (String) this.getAttributeValue( CgfpBVO.CPROJECTID);
 } 

/** 
* ������Ŀ
*
* @param cprojectid ��Ŀ
*/
public void setCprojectid ( String cprojectid) {
this.setAttributeValue( CgfpBVO.CPROJECTID,cprojectid);
 } 

/** 
* ��ȡ��Ŀ����
*
* @return ��Ŀ����
*/
public String getCprojecttaskid () {
return (String) this.getAttributeValue( CgfpBVO.CPROJECTTASKID);
 } 

/** 
* ������Ŀ����
*
* @param cprojecttaskid ��Ŀ����
*/
public void setCprojecttaskid ( String cprojecttaskid) {
this.setAttributeValue( CgfpBVO.CPROJECTTASKID,cprojecttaskid);
 } 

/** 
* ��ȡ�����ȼ�
*
* @return �����ȼ�
*/
public String getCqualitylevelid () {
return (String) this.getAttributeValue( CgfpBVO.CQUALITYLEVELID);
 } 

/** 
* ���������ȼ�
*
* @param cqualitylevelid �����ȼ�
*/
public void setCqualitylevelid ( String cqualitylevelid) {
this.setAttributeValue( CgfpBVO.CQUALITYLEVELID,cqualitylevelid);
 } 

/** 
* ��ȡ�к�
*
* @return �к�
*/
public String getCrowno () {
return (String) this.getAttributeValue( CgfpBVO.CROWNO);
 } 

/** 
* �����к�
*
* @param crowno �к�
*/
public void setCrowno ( String crowno) {
this.setAttributeValue( CgfpBVO.CROWNO,crowno);
 } 

/** 
* ��ȡ��Դ����������
*
* @return ��Դ����������
*/
public String getCsourcebid () {
return (String) this.getAttributeValue( CgfpBVO.CSOURCEBID);
 } 

/** 
* ������Դ����������
*
* @param csourcebid ��Դ����������
*/
public void setCsourcebid ( String csourcebid) {
this.setAttributeValue( CgfpBVO.CSOURCEBID,csourcebid);
 } 

/** 
* ��ȡ��Դ��������
*
* @return ��Դ��������
*/
public String getCsourceid () {
return (String) this.getAttributeValue( CgfpBVO.CSOURCEID);
 } 

/** 
* ������Դ��������
*
* @param csourceid ��Դ��������
*/
public void setCsourceid ( String csourceid) {
this.setAttributeValue( CgfpBVO.CSOURCEID,csourceid);
 } 

/** 
* ��ȡ��Դ��������
*
* @return ��Դ��������
*/
public String getCsourcetypecode () {
return (String) this.getAttributeValue( CgfpBVO.CSOURCETYPECODE);
 } 

/** 
* ������Դ��������
*
* @param csourcetypecode ��Դ��������
*/
public void setCsourcetypecode ( String csourcetypecode) {
this.setAttributeValue( CgfpBVO.CSOURCETYPECODE,csourcetypecode);
 } 

/** 
* ��ȡ˰��
*
* @return ˰��
*/
public String getCtaxcodeid () {
return (String) this.getAttributeValue( CgfpBVO.CTAXCODEID);
 } 

/** 
* ����˰��
*
* @param ctaxcodeid ˰��
*/
public void setCtaxcodeid ( String ctaxcodeid) {
this.setAttributeValue( CgfpBVO.CTAXCODEID,ctaxcodeid);
 } 

/** 
* ��ȡ����λ
*
* @return ����λ
*/
public String getCunitid () {
return (String) this.getAttributeValue( CgfpBVO.CUNITID);
 } 

/** 
* ��������λ
*
* @param cunitid ����λ
*/
public void setCunitid ( String cunitid) {
this.setAttributeValue( CgfpBVO.CUNITID,cunitid);
 } 

/** 
* ��ȡ��Ʊ����
*
* @return ��Ʊ����
*/
public UFDate getDbilldate () {
return (UFDate) this.getAttributeValue( CgfpBVO.DBILLDATE);
 } 

/** 
* ���÷�Ʊ����
*
* @param dbilldate ��Ʊ����
*/
public void setDbilldate ( UFDate dbilldate) {
this.setAttributeValue( CgfpBVO.DBILLDATE,dbilldate);
 } 

/** 
* ��ȡ��Դ��������
*
* @return ��Դ��������
*/
public UFDate getDsourcedate () {
return (UFDate) this.getAttributeValue( CgfpBVO.DSOURCEDATE);
 } 

/** 
* ������Դ��������
*
* @param dsourcedate ��Դ��������
*/
public void setDsourcedate ( UFDate dsourcedate) {
this.setAttributeValue( CgfpBVO.DSOURCEDATE,dsourcedate);
 } 

/** 
* ��ȡfirstbts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return firstbts
*/
public UFDateTime getFirstbts () {
return (UFDateTime) this.getAttributeValue( CgfpBVO.FIRSTBTS);
 } 

/** 
* ����firstbts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param firstbts firstbts
*/
public void setFirstbts ( UFDateTime firstbts) {
this.setAttributeValue( CgfpBVO.FIRSTBTS,firstbts);
 } 

/** 
* ��ȡfirstts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return firstts
*/
public UFDateTime getFirstts () {
return (UFDateTime) this.getAttributeValue( CgfpBVO.FIRSTTS);
 } 

/** 
* ����firstts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param firstts firstts
*/
public void setFirstts ( UFDateTime firstts) {
this.setAttributeValue( CgfpBVO.FIRSTTS,firstts);
 } 

/** 
* ��ȡ������
*
* @return ������
* @see String
*/
public Integer getFrowtype () {
return (Integer) this.getAttributeValue( CgfpBVO.FROWTYPE);
 } 

/** 
* ����������
*
* @param frowtype ������
* @see String
*/
public void setFrowtype ( Integer frowtype) {
this.setAttributeValue( CgfpBVO.FROWTYPE,frowtype);
 } 

/** 
* ��ȡ��˰���
*
* @return ��˰���
* @see String
*/
public Integer getFtaxtypeflag () {
return (Integer) this.getAttributeValue( CgfpBVO.FTAXTYPEFLAG);
 } 

/** 
* ���ÿ�˰���
*
* @param ftaxtypeflag ��˰���
* @see String
*/
public void setFtaxtypeflag ( Integer ftaxtypeflag) {
this.setAttributeValue( CgfpBVO.FTAXTYPEFLAG,ftaxtypeflag);
 } 

/** 
* ��ȡ�ۼƱ��ҽ�����
*
* @return �ۼƱ��ҽ�����
*/
public UFDouble getNaccumsettmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NACCUMSETTMNY);
 } 

/** 
* �����ۼƱ��ҽ�����
*
* @param naccumsettmny �ۼƱ��ҽ�����
*/
public void setNaccumsettmny ( UFDouble naccumsettmny) {
this.setAttributeValue( CgfpBVO.NACCUMSETTMNY,naccumsettmny);
 } 

/** 
* ��ȡ�ۼƽ���������
*
* @return �ۼƽ���������
*/
public UFDouble getNaccumsettnum () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NACCUMSETTNUM);
 } 

/** 
* �����ۼƽ���������
*
* @param naccumsettnum �ۼƽ���������
*/
public void setNaccumsettnum ( UFDouble naccumsettnum) {
this.setAttributeValue( CgfpBVO.NACCUMSETTNUM,naccumsettnum);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public UFDouble getNastnum () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NASTNUM);
 } 

/** 
* ��������
*
* @param nastnum ����
*/
public void setNastnum ( UFDouble nastnum) {
this.setAttributeValue( CgfpBVO.NASTNUM,nastnum);
 } 

/** 
* ��ȡ��˰����
*
* @return ��˰����
*/
public UFDouble getNastorigprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NASTORIGPRICE);
 } 

/** 
* ������˰����
*
* @param nastorigprice ��˰����
*/
public void setNastorigprice ( UFDouble nastorigprice) {
this.setAttributeValue( CgfpBVO.NASTORIGPRICE,nastorigprice);
 } 

/** 
* ��ȡ��˰����
*
* @return ��˰����
*/
public UFDouble getNastorigtaxprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NASTORIGTAXPRICE);
 } 

/** 
* ���ú�˰����
*
* @param nastorigtaxprice ��˰����
*/
public void setNastorigtaxprice ( UFDouble nastorigtaxprice) {
this.setAttributeValue( CgfpBVO.NASTORIGTAXPRICE,nastorigtaxprice);
 } 

/** 
* ��ȡ������˰����
*
* @return ������˰����
*/
public UFDouble getNastprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NASTPRICE);
 } 

/** 
* ���ñ�����˰����
*
* @param nastprice ������˰����
*/
public void setNastprice ( UFDouble nastprice) {
this.setAttributeValue( CgfpBVO.NASTPRICE,nastprice);
 } 

/** 
* ��ȡ���Һ�˰����
*
* @return ���Һ�˰����
*/
public UFDouble getNasttaxprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NASTTAXPRICE);
 } 

/** 
* ���ñ��Һ�˰����
*
* @param nasttaxprice ���Һ�˰����
*/
public void setNasttaxprice ( UFDouble nasttaxprice) {
this.setAttributeValue( CgfpBVO.NASTTAXPRICE,nasttaxprice);
 } 

/** 
* ��ȡ�Ƴɱ����
*
* @return �Ƴɱ����
*/
public UFDouble getNcalcostmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NCALCOSTMNY);
 } 

/** 
* ���üƳɱ����
*
* @param ncalcostmny �Ƴɱ����
*/
public void setNcalcostmny ( UFDouble ncalcostmny) {
this.setAttributeValue( CgfpBVO.NCALCOSTMNY,ncalcostmny);
 } 

/** 
* ��ȡ��˰���
*
* @return ��˰���
*/
public UFDouble getNcaltaxmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NCALTAXMNY);
 } 

/** 
* ���ü�˰���
*
* @param ncaltaxmny ��˰���
*/
public void setNcaltaxmny ( UFDouble ncaltaxmny) {
this.setAttributeValue( CgfpBVO.NCALTAXMNY,ncaltaxmny);
 } 

/** 
* ��ȡȫ�ֱ�����˰���
*
* @return ȫ�ֱ�����˰���
*/
public UFDouble getNglobalmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NGLOBALMNY);
 } 

/** 
* ����ȫ�ֱ�����˰���
*
* @param nglobalmny ȫ�ֱ�����˰���
*/
public void setNglobalmny ( UFDouble nglobalmny) {
this.setAttributeValue( CgfpBVO.NGLOBALMNY,nglobalmny);
 } 

/** 
* ��ȡȫ�ֱ��Ҽ�˰�ϼ�
*
* @return ȫ�ֱ��Ҽ�˰�ϼ�
*/
public UFDouble getNglobaltaxmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NGLOBALTAXMNY);
 } 

/** 
* ����ȫ�ֱ��Ҽ�˰�ϼ�
*
* @param nglobaltaxmny ȫ�ֱ��Ҽ�˰�ϼ�
*/
public void setNglobaltaxmny ( UFDouble nglobaltaxmny) {
this.setAttributeValue( CgfpBVO.NGLOBALTAXMNY,nglobaltaxmny);
 } 

/** 
* ��ȡ���ű�����˰���
*
* @return ���ű�����˰���
*/
public UFDouble getNgroupmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NGROUPMNY);
 } 

/** 
* ���ü��ű�����˰���
*
* @param ngroupmny ���ű�����˰���
*/
public void setNgroupmny ( UFDouble ngroupmny) {
this.setAttributeValue( CgfpBVO.NGROUPMNY,ngroupmny);
 } 

/** 
* ��ȡ���ű��Ҽ�˰�ϼ�
*
* @return ���ű��Ҽ�˰�ϼ�
*/
public UFDouble getNgrouptaxmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NGROUPTAXMNY);
 } 

/** 
* ���ü��ű��Ҽ�˰�ϼ�
*
* @param ngrouptaxmny ���ű��Ҽ�˰�ϼ�
*/
public void setNgrouptaxmny ( UFDouble ngrouptaxmny) {
this.setAttributeValue( CgfpBVO.NGROUPTAXMNY,ngrouptaxmny);
 } 

/** 
* ��ȡ������˰���
*
* @return ������˰���
*/
public UFDouble getNmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NMNY);
 } 

/** 
* ���ñ�����˰���
*
* @param nmny ������˰���
*/
public void setNmny ( UFDouble nmny) {
this.setAttributeValue( CgfpBVO.NMNY,nmny);
 } 

/** 
* ��ȡ���ɵֿ�˰��
*
* @return ���ɵֿ�˰��
*/
public UFDouble getNnosubtax () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NNOSUBTAX);
 } 

/** 
* ���ò��ɵֿ�˰��
*
* @param nnosubtax ���ɵֿ�˰��
*/
public void setNnosubtax ( UFDouble nnosubtax) {
this.setAttributeValue( CgfpBVO.NNOSUBTAX,nnosubtax);
 } 

/** 
* ��ȡ���ɵֿ�˰��
*
* @return ���ɵֿ�˰��
*/
public UFDouble getNnosubtaxrate () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NNOSUBTAXRATE);
 } 

/** 
* ���ò��ɵֿ�˰��
*
* @param nnosubtaxrate ���ɵֿ�˰��
*/
public void setNnosubtaxrate ( UFDouble nnosubtaxrate) {
this.setAttributeValue( CgfpBVO.NNOSUBTAXRATE,nnosubtaxrate);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public UFDouble getNnum () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NNUM);
 } 

/** 
* ����������
*
* @param nnum ������
*/
public void setNnum ( UFDouble nnum) {
this.setAttributeValue( CgfpBVO.NNUM,nnum);
 } 

/** 
* ��ȡnnumwrbck���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return nnumwrbck
*/
public UFDouble getNnumwrbck () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NNUMWRBCK);
 } 

/** 
* ����nnumwrbck���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param nnumwrbck nnumwrbck
*/
public void setNnumwrbck ( UFDouble nnumwrbck) {
this.setAttributeValue( CgfpBVO.NNUMWRBCK,nnumwrbck);
 } 

/** 
* ��ȡ��˰���
*
* @return ��˰���
*/
public UFDouble getNorigmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NORIGMNY);
 } 

/** 
* ������˰���
*
* @param norigmny ��˰���
*/
public void setNorigmny ( UFDouble norigmny) {
this.setAttributeValue( CgfpBVO.NORIGMNY,norigmny);
 } 

/** 
* ��ȡ����˰����
*
* @return ����˰����
*/
public UFDouble getNorigprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NORIGPRICE);
 } 

/** 
* ��������˰����
*
* @param norigprice ����˰����
*/
public void setNorigprice ( UFDouble norigprice) {
this.setAttributeValue( CgfpBVO.NORIGPRICE,norigprice);
 } 

/** 
* ��ȡ��˰�ϼ�
*
* @return ��˰�ϼ�
*/
public UFDouble getNorigtaxmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NORIGTAXMNY);
 } 

/** 
* ���ü�˰�ϼ�
*
* @param norigtaxmny ��˰�ϼ�
*/
public void setNorigtaxmny ( UFDouble norigtaxmny) {
this.setAttributeValue( CgfpBVO.NORIGTAXMNY,norigtaxmny);
 } 

/** 
* ��ȡ����˰����
*
* @return ����˰����
*/
public UFDouble getNorigtaxprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NORIGTAXPRICE);
 } 

/** 
* ��������˰����
*
* @param norigtaxprice ����˰����
*/
public void setNorigtaxprice ( UFDouble norigtaxprice) {
this.setAttributeValue( CgfpBVO.NORIGTAXPRICE,norigtaxprice);
 } 

/** 
* ��ȡnplanprice���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return nplanprice
*/
public UFDouble getNplanprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NPLANPRICE);
 } 

/** 
* ����nplanprice���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param nplanprice nplanprice
*/
public void setNplanprice ( UFDouble nplanprice) {
this.setAttributeValue( CgfpBVO.NPLANPRICE,nplanprice);
 } 

/** 
* ��ȡ��������˰����
*
* @return ��������˰����
*/
public UFDouble getNprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NPRICE);
 } 

/** 
* ������������˰����
*
* @param nprice ��������˰����
*/
public void setNprice ( UFDouble nprice) {
this.setAttributeValue( CgfpBVO.NPRICE,nprice);
 } 

/** 
* ��ȡ�������������
*
* @return �������������
*/
public UFDouble getNreasonwastenum () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NREASONWASTENUM);
 } 

/** 
* ���ú������������
*
* @param nreasonwastenum �������������
*/
public void setNreasonwastenum ( UFDouble nreasonwastenum) {
this.setAttributeValue( CgfpBVO.NREASONWASTENUM,nreasonwastenum);
 } 

/** 
* ��ȡnsourcenum���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return nsourcenum
*/
public UFDouble getNsourcenum () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NSOURCENUM);
 } 

/** 
* ����nsourcenum���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param nsourcenum nsourcenum
*/
public void setNsourcenum ( UFDouble nsourcenum) {
this.setAttributeValue( CgfpBVO.NSOURCENUM,nsourcenum);
 } 

/** 
* ��ȡ˰��
*
* @return ˰��
*/
public UFDouble getNtax () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NTAX);
 } 

/** 
* ����˰��
*
* @param ntax ˰��
*/
public void setNtax ( UFDouble ntax) {
this.setAttributeValue( CgfpBVO.NTAX,ntax);
 } 

/** 
* ��ȡ���Ҽ�˰�ϼ�
*
* @return ���Ҽ�˰�ϼ�
*/
public UFDouble getNtaxmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NTAXMNY);
 } 

/** 
* ���ñ��Ҽ�˰�ϼ�
*
* @param ntaxmny ���Ҽ�˰�ϼ�
*/
public void setNtaxmny ( UFDouble ntaxmny) {
this.setAttributeValue( CgfpBVO.NTAXMNY,ntaxmny);
 } 

/** 
* ��ȡ�����Һ�˰����
*
* @return �����Һ�˰����
*/
public UFDouble getNtaxprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NTAXPRICE);
 } 

/** 
* ���������Һ�˰����
*
* @param ntaxprice �����Һ�˰����
*/
public void setNtaxprice ( UFDouble ntaxprice) {
this.setAttributeValue( CgfpBVO.NTAXPRICE,ntaxprice);
 } 

/** 
* ��ȡ˰��
*
* @return ˰��
*/
public UFDouble getNtaxrate () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NTAXRATE);
 } 

/** 
* ����˰��
*
* @param ntaxrate ˰��
*/
public void setNtaxrate ( UFDouble ntaxrate) {
this.setAttributeValue( CgfpBVO.NTAXRATE,ntaxrate);
 } 

/** 
* ��ȡӦ��������֯
*
* @return Ӧ��������֯
*/
public String getPk_apfinanceorg () {
return (String) this.getAttributeValue( CgfpBVO.PK_APFINANCEORG);
 } 

/** 
* ����Ӧ��������֯
*
* @param pk_apfinanceorg Ӧ��������֯
*/
public void setPk_apfinanceorg ( String pk_apfinanceorg) {
this.setAttributeValue( CgfpBVO.PK_APFINANCEORG,pk_apfinanceorg);
 } 

/** 
* ��ȡӦ��������֯
*
* @return Ӧ��������֯
*/
public String getPk_apfinanceorg_v () {
return (String) this.getAttributeValue( CgfpBVO.PK_APFINANCEORG_V);
 } 

/** 
* ����Ӧ��������֯
*
* @param pk_apfinanceorg_v Ӧ��������֯
*/
public void setPk_apfinanceorg_v ( String pk_apfinanceorg_v) {
this.setAttributeValue( CgfpBVO.PK_APFINANCEORG_V,pk_apfinanceorg_v);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getPk_apliabcenter () {
return (String) this.getAttributeValue( CgfpBVO.PK_APLIABCENTER);
 } 

/** 
* ������������
*
* @param pk_apliabcenter ��������
*/
public void setPk_apliabcenter ( String pk_apliabcenter) {
this.setAttributeValue( CgfpBVO.PK_APLIABCENTER,pk_apliabcenter);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getPk_apliabcenter_v () {
return (String) this.getAttributeValue( CgfpBVO.PK_APLIABCENTER_V);
 } 

/** 
* ������������
*
* @param pk_apliabcenter_v ��������
*/
public void setPk_apliabcenter_v ( String pk_apliabcenter_v) {
this.setAttributeValue( CgfpBVO.PK_APLIABCENTER_V,pk_apliabcenter_v);
 } 

/** 
* ��ȡ���ε���
*
* @return ���ε���
*/
public String getPk_batchcode () {
return (String) this.getAttributeValue( CgfpBVO.PK_BATCHCODE);
 } 

/** 
* �������ε���
*
* @param pk_batchcode ���ε���
*/
public void setPk_batchcode ( String pk_batchcode) {
this.setAttributeValue( CgfpBVO.PK_BATCHCODE,pk_batchcode);
 } 

/** 
* ��ȡ�ϲ㵥������
*
* @return �ϲ㵥������
*/
public String getPk_cgfp () {
return (String) this.getAttributeValue( CgfpBVO.PK_CGFP);
 } 

/** 
* �����ϲ㵥������
*
* @param pk_cgfp �ϲ㵥������
*/
public void setPk_cgfp ( String pk_cgfp) {
this.setAttributeValue( CgfpBVO.PK_CGFP,pk_cgfp);
 } 

/** 
* ��ȡ�ɹ���Ʊ��ϸ
*
* @return �ɹ���Ʊ��ϸ
*/
public String getPk_cgfp_b () {
return (String) this.getAttributeValue( CgfpBVO.PK_CGFP_B);
 } 

/** 
* ���òɹ���Ʊ��ϸ
*
* @param pk_cgfp_b �ɹ���Ʊ��ϸ
*/
public void setPk_cgfp_b ( String pk_cgfp_b) {
this.setAttributeValue( CgfpBVO.PK_CGFP_B,pk_cgfp_b);
 } 

/** 
* ��ȡ��֧��Ŀ
*
* @return ��֧��Ŀ
*/
public String getPk_costsubj () {
return (String) this.getAttributeValue( CgfpBVO.PK_COSTSUBJ);
 } 

/** 
* ������֧��Ŀ
*
* @param pk_costsubj ��֧��Ŀ
*/
public void setPk_costsubj ( String pk_costsubj) {
this.setAttributeValue( CgfpBVO.PK_COSTSUBJ,pk_costsubj);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getPk_group () {
return (String) this.getAttributeValue( CgfpBVO.PK_GROUP);
 } 

/** 
* ������������
*
* @param pk_group ��������
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( CgfpBVO.PK_GROUP,pk_group);
 } 

/** 
* ��ȡ���ϰ汾
*
* @return ���ϰ汾
*/
public String getPk_material () {
return (String) this.getAttributeValue( CgfpBVO.PK_MATERIAL);
 } 

/** 
* �������ϰ汾
*
* @param pk_material ���ϰ汾
*/
public void setPk_material ( String pk_material) {
this.setAttributeValue( CgfpBVO.PK_MATERIAL,pk_material);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getPk_order () {
return (String) this.getAttributeValue( CgfpBVO.PK_ORDER);
 } 

/** 
* ���ö�������
*
* @param pk_order ��������
*/
public void setPk_order ( String pk_order) {
this.setAttributeValue( CgfpBVO.PK_ORDER,pk_order);
 } 

/** 
* ��ȡ����������
*
* @return ����������
*/
public String getPk_order_b () {
return (String) this.getAttributeValue( CgfpBVO.PK_ORDER_B);
 } 

/** 
* ���ö���������
*
* @param pk_order_b ����������
*/
public void setPk_order_b ( String pk_order_b) {
this.setAttributeValue( CgfpBVO.PK_ORDER_B,pk_order_b);
 } 

/** 
* ��ȡ������֯
*
* @return ������֯
*/
public String getPk_org () {
return (String) this.getAttributeValue( CgfpBVO.PK_ORG);
 } 

/** 
* ���ò�����֯
*
* @param pk_org ������֯
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( CgfpBVO.PK_ORG,pk_org);
 } 

/** 
* ��ȡ������֯
*
* @return ������֯
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( CgfpBVO.PK_ORG_V);
 } 

/** 
* ���ò�����֯
*
* @param pk_org_v ������֯
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( CgfpBVO.PK_ORG_V,pk_org_v);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPk_srcmaterial () {
return (String) this.getAttributeValue( CgfpBVO.PK_SRCMATERIAL);
 } 

/** 
* ��������
*
* @param pk_srcmaterial ����
*/
public void setPk_srcmaterial ( String pk_srcmaterial) {
this.setAttributeValue( CgfpBVO.PK_SRCMATERIAL,pk_srcmaterial);
 } 

/** 
* ��ȡpk_stockps_b���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return pk_stockps_b
*/
public String getPk_stockps_b () {
return (String) this.getAttributeValue( CgfpBVO.PK_STOCKPS_B);
 } 

/** 
* ����pk_stockps_b���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param pk_stockps_b pk_stockps_b
*/
public void setPk_stockps_b ( String pk_stockps_b) {
this.setAttributeValue( CgfpBVO.PK_STOCKPS_B,pk_stockps_b);
 } 

/** 
* ��ȡ�ֿ�
*
* @return �ֿ�
*/
public String getPk_stordoc () {
return (String) this.getAttributeValue( CgfpBVO.PK_STORDOC);
 } 

/** 
* ���òֿ�
*
* @param pk_stordoc �ֿ�
*/
public void setPk_stordoc ( String pk_stordoc) {
this.setAttributeValue( CgfpBVO.PK_STORDOC,pk_stordoc);
 } 

/** 
* ��ȡ��Ӧ��
*
* @return ��Ӧ��
*/
public String getPk_supplier () {
return (String) this.getAttributeValue( CgfpBVO.PK_SUPPLIER);
 } 

/** 
* ���ù�Ӧ��
*
* @param pk_supplier ��Ӧ��
*/
public void setPk_supplier ( String pk_supplier) {
this.setAttributeValue( CgfpBVO.PK_SUPPLIER,pk_supplier);
 } 

/** 
* ��ȡʹ�ò������°汾
*
* @return ʹ�ò������°汾
*/
public String getPk_usedept () {
return (String) this.getAttributeValue( CgfpBVO.PK_USEDEPT);
 } 

/** 
* ����ʹ�ò������°汾
*
* @param pk_usedept ʹ�ò������°汾
*/
public void setPk_usedept ( String pk_usedept) {
this.setAttributeValue( CgfpBVO.PK_USEDEPT,pk_usedept);
 } 

/** 
* ��ȡʹ�ò���
*
* @return ʹ�ò���
*/
public String getPk_usedept_v () {
return (String) this.getAttributeValue( CgfpBVO.PK_USEDEPT_V);
 } 

/** 
* ����ʹ�ò���
*
* @param pk_usedept_v ʹ�ò���
*/
public void setPk_usedept_v ( String pk_usedept_v) {
this.setAttributeValue( CgfpBVO.PK_USEDEPT_V,pk_usedept_v);
 } 

/** 
* ��ȡsourcebts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return sourcebts
*/
public UFDateTime getSourcebts () {
return (UFDateTime) this.getAttributeValue( CgfpBVO.SOURCEBTS);
 } 

/** 
* ����sourcebts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param sourcebts sourcebts
*/
public void setSourcebts ( UFDateTime sourcebts) {
this.setAttributeValue( CgfpBVO.SOURCEBTS,sourcebts);
 } 

/** 
* ��ȡsourcets���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return sourcets
*/
public UFDateTime getSourcets () {
return (UFDateTime) this.getAttributeValue( CgfpBVO.SOURCETS);
 } 

/** 
* ����sourcets���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param sourcets sourcets
*/
public void setSourcets ( UFDateTime sourcets) {
this.setAttributeValue( CgfpBVO.SOURCETS,sourcets);
 } 

/** 
* ��ȡʱ���
*
* @return ʱ���
*/
public UFDateTime getTs () {
return (UFDateTime) this.getAttributeValue( CgfpBVO.TS);
 } 

/** 
* ����ʱ���
*
* @param ts ʱ���
*/
public void setTs ( UFDateTime ts) {
this.setAttributeValue( CgfpBVO.TS,ts);
 } 

/** 
* ��ȡ���κ�
*
* @return ���κ�
*/
public String getVbatchcode () {
return (String) this.getAttributeValue( CgfpBVO.VBATCHCODE);
 } 

/** 
* �������κ�
*
* @param vbatchcode ���κ�
*/
public void setVbatchcode ( String vbatchcode) {
this.setAttributeValue( CgfpBVO.VBATCHCODE,vbatchcode);
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getVbdef1 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF1);
 } 

/** 
* �����Զ�����1
*
* @param vbdef1 �Զ�����1
*/
public void setVbdef1 ( String vbdef1) {
this.setAttributeValue( CgfpBVO.VBDEF1,vbdef1);
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getVbdef10 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF10);
 } 

/** 
* �����Զ�����10
*
* @param vbdef10 �Զ�����10
*/
public void setVbdef10 ( String vbdef10) {
this.setAttributeValue( CgfpBVO.VBDEF10,vbdef10);
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public String getVbdef11 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF11);
 } 

/** 
* �����Զ�����11
*
* @param vbdef11 �Զ�����11
*/
public void setVbdef11 ( String vbdef11) {
this.setAttributeValue( CgfpBVO.VBDEF11,vbdef11);
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getVbdef12 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF12);
 } 

/** 
* �����Զ�����12
*
* @param vbdef12 �Զ�����12
*/
public void setVbdef12 ( String vbdef12) {
this.setAttributeValue( CgfpBVO.VBDEF12,vbdef12);
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getVbdef13 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF13);
 } 

/** 
* �����Զ�����13
*
* @param vbdef13 �Զ�����13
*/
public void setVbdef13 ( String vbdef13) {
this.setAttributeValue( CgfpBVO.VBDEF13,vbdef13);
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getVbdef14 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF14);
 } 

/** 
* �����Զ�����14
*
* @param vbdef14 �Զ�����14
*/
public void setVbdef14 ( String vbdef14) {
this.setAttributeValue( CgfpBVO.VBDEF14,vbdef14);
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public String getVbdef15 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF15);
 } 

/** 
* �����Զ�����15
*
* @param vbdef15 �Զ�����15
*/
public void setVbdef15 ( String vbdef15) {
this.setAttributeValue( CgfpBVO.VBDEF15,vbdef15);
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getVbdef16 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF16);
 } 

/** 
* �����Զ�����16
*
* @param vbdef16 �Զ�����16
*/
public void setVbdef16 ( String vbdef16) {
this.setAttributeValue( CgfpBVO.VBDEF16,vbdef16);
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getVbdef17 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF17);
 } 

/** 
* �����Զ�����17
*
* @param vbdef17 �Զ�����17
*/
public void setVbdef17 ( String vbdef17) {
this.setAttributeValue( CgfpBVO.VBDEF17,vbdef17);
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getVbdef18 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF18);
 } 

/** 
* �����Զ�����18
*
* @param vbdef18 �Զ�����18
*/
public void setVbdef18 ( String vbdef18) {
this.setAttributeValue( CgfpBVO.VBDEF18,vbdef18);
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getVbdef19 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF19);
 } 

/** 
* �����Զ�����19
*
* @param vbdef19 �Զ�����19
*/
public void setVbdef19 ( String vbdef19) {
this.setAttributeValue( CgfpBVO.VBDEF19,vbdef19);
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getVbdef2 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF2);
 } 

/** 
* �����Զ�����2
*
* @param vbdef2 �Զ�����2
*/
public void setVbdef2 ( String vbdef2) {
this.setAttributeValue( CgfpBVO.VBDEF2,vbdef2);
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getVbdef20 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF20);
 } 

/** 
* �����Զ�����20
*
* @param vbdef20 �Զ�����20
*/
public void setVbdef20 ( String vbdef20) {
this.setAttributeValue( CgfpBVO.VBDEF20,vbdef20);
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getVbdef3 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF3);
 } 

/** 
* �����Զ�����3
*
* @param vbdef3 �Զ�����3
*/
public void setVbdef3 ( String vbdef3) {
this.setAttributeValue( CgfpBVO.VBDEF3,vbdef3);
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getVbdef4 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF4);
 } 

/** 
* �����Զ�����4
*
* @param vbdef4 �Զ�����4
*/
public void setVbdef4 ( String vbdef4) {
this.setAttributeValue( CgfpBVO.VBDEF4,vbdef4);
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getVbdef5 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF5);
 } 

/** 
* �����Զ�����5
*
* @param vbdef5 �Զ�����5
*/
public void setVbdef5 ( String vbdef5) {
this.setAttributeValue( CgfpBVO.VBDEF5,vbdef5);
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getVbdef6 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF6);
 } 

/** 
* �����Զ�����6
*
* @param vbdef6 �Զ�����6
*/
public void setVbdef6 ( String vbdef6) {
this.setAttributeValue( CgfpBVO.VBDEF6,vbdef6);
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getVbdef7 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF7);
 } 

/** 
* �����Զ�����7
*
* @param vbdef7 �Զ�����7
*/
public void setVbdef7 ( String vbdef7) {
this.setAttributeValue( CgfpBVO.VBDEF7,vbdef7);
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getVbdef8 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF8);
 } 

/** 
* �����Զ�����8
*
* @param vbdef8 �Զ�����8
*/
public void setVbdef8 ( String vbdef8) {
this.setAttributeValue( CgfpBVO.VBDEF8,vbdef8);
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getVbdef9 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF9);
 } 

/** 
* �����Զ�����9
*
* @param vbdef9 �Զ�����9
*/
public void setVbdef9 ( String vbdef9) {
this.setAttributeValue( CgfpBVO.VBDEF9,vbdef9);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getVchangerate () {
return (String) this.getAttributeValue( CgfpBVO.VCHANGERATE);
 } 

/** 
* ���û�����
*
* @param vchangerate ������
*/
public void setVchangerate ( String vchangerate) {
this.setAttributeValue( CgfpBVO.VCHANGERATE,vchangerate);
 } 

/** 
* ��ȡ��ͬ��
*
* @return ��ͬ��
*/
public String getVctcode () {
return (String) this.getAttributeValue( CgfpBVO.VCTCODE);
 } 

/** 
* ���ú�ͬ��
*
* @param vctcode ��ͬ��
*/
public void setVctcode ( String vctcode) {
this.setAttributeValue( CgfpBVO.VCTCODE,vctcode);
 } 

/** 
* ��ȡԴͷ���ݺ�
*
* @return Դͷ���ݺ�
*/
public String getVfirstcode () {
return (String) this.getAttributeValue( CgfpBVO.VFIRSTCODE);
 } 

/** 
* ����Դͷ���ݺ�
*
* @param vfirstcode Դͷ���ݺ�
*/
public void setVfirstcode ( String vfirstcode) {
this.setAttributeValue( CgfpBVO.VFIRSTCODE,vfirstcode);
 } 

/** 
* ��ȡԴͷ�����к�
*
* @return Դͷ�����к�
*/
public String getVfirstrowno () {
return (String) this.getAttributeValue( CgfpBVO.VFIRSTROWNO);
 } 

/** 
* ����Դͷ�����к�
*
* @param vfirstrowno Դͷ�����к�
*/
public void setVfirstrowno ( String vfirstrowno) {
this.setAttributeValue( CgfpBVO.VFIRSTROWNO,vfirstrowno);
 } 

/** 
* ��ȡԴͷ��������
*
* @return Դͷ��������
*/
public String getVfirsttrantype () {
return (String) this.getAttributeValue( CgfpBVO.VFIRSTTRANTYPE);
 } 

/** 
* ����Դͷ��������
*
* @param vfirsttrantype Դͷ��������
*/
public void setVfirsttrantype ( String vfirsttrantype) {
this.setAttributeValue( CgfpBVO.VFIRSTTRANTYPE,vfirsttrantype);
 } 

/** 
* ��ȡ���ɸ�������1
*
* @return ���ɸ�������1
*/
public String getVfree1 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE1);
 } 

/** 
* �������ɸ�������1
*
* @param vfree1 ���ɸ�������1
*/
public void setVfree1 ( String vfree1) {
this.setAttributeValue( CgfpBVO.VFREE1,vfree1);
 } 

/** 
* ��ȡ���ɸ�������10
*
* @return ���ɸ�������10
*/
public String getVfree10 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE10);
 } 

/** 
* �������ɸ�������10
*
* @param vfree10 ���ɸ�������10
*/
public void setVfree10 ( String vfree10) {
this.setAttributeValue( CgfpBVO.VFREE10,vfree10);
 } 

/** 
* ��ȡ���ɸ�������2
*
* @return ���ɸ�������2
*/
public String getVfree2 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE2);
 } 

/** 
* �������ɸ�������2
*
* @param vfree2 ���ɸ�������2
*/
public void setVfree2 ( String vfree2) {
this.setAttributeValue( CgfpBVO.VFREE2,vfree2);
 } 

/** 
* ��ȡ���ɸ�������3
*
* @return ���ɸ�������3
*/
public String getVfree3 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE3);
 } 

/** 
* �������ɸ�������3
*
* @param vfree3 ���ɸ�������3
*/
public void setVfree3 ( String vfree3) {
this.setAttributeValue( CgfpBVO.VFREE3,vfree3);
 } 

/** 
* ��ȡ���ɸ�������4
*
* @return ���ɸ�������4
*/
public String getVfree4 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE4);
 } 

/** 
* �������ɸ�������4
*
* @param vfree4 ���ɸ�������4
*/
public void setVfree4 ( String vfree4) {
this.setAttributeValue( CgfpBVO.VFREE4,vfree4);
 } 

/** 
* ��ȡ���ɸ�������5
*
* @return ���ɸ�������5
*/
public String getVfree5 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE5);
 } 

/** 
* �������ɸ�������5
*
* @param vfree5 ���ɸ�������5
*/
public void setVfree5 ( String vfree5) {
this.setAttributeValue( CgfpBVO.VFREE5,vfree5);
 } 

/** 
* ��ȡ���ɸ�������6
*
* @return ���ɸ�������6
*/
public String getVfree6 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE6);
 } 

/** 
* �������ɸ�������6
*
* @param vfree6 ���ɸ�������6
*/
public void setVfree6 ( String vfree6) {
this.setAttributeValue( CgfpBVO.VFREE6,vfree6);
 } 

/** 
* ��ȡ���ɸ�������7
*
* @return ���ɸ�������7
*/
public String getVfree7 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE7);
 } 

/** 
* �������ɸ�������7
*
* @param vfree7 ���ɸ�������7
*/
public void setVfree7 ( String vfree7) {
this.setAttributeValue( CgfpBVO.VFREE7,vfree7);
 } 

/** 
* ��ȡ���ɸ�������8
*
* @return ���ɸ�������8
*/
public String getVfree8 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE8);
 } 

/** 
* �������ɸ�������8
*
* @param vfree8 ���ɸ�������8
*/
public void setVfree8 ( String vfree8) {
this.setAttributeValue( CgfpBVO.VFREE8,vfree8);
 } 

/** 
* ��ȡ���ɸ�������9
*
* @return ���ɸ�������9
*/
public String getVfree9 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE9);
 } 

/** 
* �������ɸ�������9
*
* @param vfree9 ���ɸ�������9
*/
public void setVfree9 ( String vfree9) {
this.setAttributeValue( CgfpBVO.VFREE9,vfree9);
 } 

/** 
* ��ȡ��ע
*
* @return ��ע
*/
public String getVmemob () {
return (String) this.getAttributeValue( CgfpBVO.VMEMOB);
 } 

/** 
* ���ñ�ע
*
* @param vmemob ��ע
*/
public void setVmemob ( String vmemob) {
this.setAttributeValue( CgfpBVO.VMEMOB,vmemob);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getVordercode () {
return (String) this.getAttributeValue( CgfpBVO.VORDERCODE);
 } 

/** 
* ���ö�����
*
* @param vordercode ������
*/
public void setVordercode ( String vordercode) {
this.setAttributeValue( CgfpBVO.VORDERCODE,vordercode);
 } 

/** 
* ��ȡ������������
*
* @return ������������
*/
public String getVordertrantype () {
return (String) this.getAttributeValue( CgfpBVO.VORDERTRANTYPE);
 } 

/** 
* ���ö�����������
*
* @param vordertrantype ������������
*/
public void setVordertrantype ( String vordertrantype) {
this.setAttributeValue( CgfpBVO.VORDERTRANTYPE,vordertrantype);
 } 

/** 
* ��ȡ��Դ���ݺ�
*
* @return ��Դ���ݺ�
*/
public String getVsourcecode () {
return (String) this.getAttributeValue( CgfpBVO.VSOURCECODE);
 } 

/** 
* ������Դ���ݺ�
*
* @param vsourcecode ��Դ���ݺ�
*/
public void setVsourcecode ( String vsourcecode) {
this.setAttributeValue( CgfpBVO.VSOURCECODE,vsourcecode);
 } 

/** 
* ��ȡ��Դ�����к�
*
* @return ��Դ�����к�
*/
public String getVsourcerowno () {
return (String) this.getAttributeValue( CgfpBVO.VSOURCEROWNO);
 } 

/** 
* ������Դ�����к�
*
* @param vsourcerowno ��Դ�����к�
*/
public void setVsourcerowno ( String vsourcerowno) {
this.setAttributeValue( CgfpBVO.VSOURCEROWNO,vsourcerowno);
 } 

/** 
* ��ȡ��Դ��������
*
* @return ��Դ��������
*/
public String getVsourcetrantype () {
return (String) this.getAttributeValue( CgfpBVO.VSOURCETRANTYPE);
 } 

/** 
* ������Դ��������
*
* @param vsourcetrantype ��Դ��������
*/
public void setVsourcetrantype ( String vsourcetrantype) {
this.setAttributeValue( CgfpBVO.VSOURCETRANTYPE,vsourcetrantype);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("devlu.cgfp_b");
  }
}