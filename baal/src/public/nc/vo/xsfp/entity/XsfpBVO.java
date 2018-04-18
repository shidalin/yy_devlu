package nc.vo.xsfp.entity;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class XsfpBVO extends SuperVO {
/**
*�Ƿ�ɢ��
*/
public static final String BFREECUSTFLAG="bfreecustflag";
/**
*Ӧ����֯ԭʼ�汾
*/
public static final String CARORGID="carorgid";
/**
*Ӧ����֯
*/
public static final String CARORGVID="carorgvid";
/**
*��λ
*/
public static final String CASTUNITID="castunitid";
/**
*������������
*/
public static final String CCHANNELTYPEID="cchanneltypeid";
/**
*��֧��Ŀ
*/
public static final String CCOSTSUBJID="ccostsubjid";
/**
*��ͬ��
*/
public static final String CCTMANAGEID="cctmanageid";
/**
*�ͻ�������
*/
public static final String CCUSTMATERIALID="ccustmaterialid";
/**
*���۲���
*/
public static final String CDEPTID="cdeptid";
/**
*���۲���
*/
public static final String CDEPTVID="cdeptvid";
/**
*����ҵ��Ա
*/
public static final String CEMPLOYEEID="cemployeeid";
/**
*Դͷ�����ӱ�
*/
public static final String CFIRSTBID="cfirstbid";
/**
*Դͷ��������
*/
public static final String CFIRSTID="cfirstid";
/**
*ɢ��
*/
public static final String CFREECUSTID="cfreecustid";
/**
*cmarbascalssid���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String CMARBASCALSSID="cmarbascalssid";
/**
*���ϱ���ԭʼ�汾
*/
public static final String CMATERIALID="cmaterialid";
/**
*���ϱ���
*/
public static final String CMATERIALVID="cmaterialvid";
/**
*�Գ���Դ�ӱ�
*/
public static final String COPPOSESRCBID="copposesrcbid";
/**
*�����ͻ�
*/
public static final String CORDERCUSTID="cordercustid";
/**
*��Ʒ��
*/
public static final String CPRODLINEID="cprodlineid";
/**
*��������
*/
public static final String CPROFITCENTERID="cprofitcenterid";
/**
*��������
*/
public static final String CPROFITCENTERVID="cprofitcentervid";
/**
*���۵�λ
*/
public static final String CQTUNITID="cqtunitid";
/**
*�ջ���ַ
*/
public static final String CRECEIVEADDRID="creceiveaddrid";
/**
*�ջ��ͻ�
*/
public static final String CRECEIVECUSTID="creceivecustid";
/**
*�к�
*/
public static final String CROWNO="crowno";
/**
*��Ʊ��ʵ��
*/
public String csaleinvoicebid;
/**
*�ϲ㵥������
*/
public String csaleinvoiceid;
/**
*������֯
*/
public static final String CSALEORGID="csaleorgid";
/**
*������֯
*/
public static final String CSALEORGVID="csaleorgvid";
/**
*�����֯
*/
public static final String CSENDSTOCKORGID="csendstockorgid";
/**
*�����֯
*/
public static final String CSENDSTOCKORGVID="csendstockorgvid";
/**
*�ֿ�
*/
public static final String CSENDSTORDOCID="csendstordocid";
/**
*��Դ�����ӱ�
*/
public static final String CSRCBID="csrcbid";
/**
*��Դ��������
*/
public static final String CSRCID="csrcid";
/**
*���Ļ�������
*/
public static final String CSUMID="csumid";
/**
*˰��
*/
public static final String CTAXCODEID="ctaxcodeid";
/**
*���䷽ʽ
*/
public static final String CTRANSPORTTYPEID="ctransporttypeid";
/**
*����λ
*/
public static final String CUNITID="cunitid";
/**
*�Ĵ湩Ӧ��
*/
public static final String CVMIVENDERID="cvmivenderid";
/**
*��Ʊ����
*/
public static final String DBILLDATE="dbilldate";
/**
*��˰���
*/
public static final String FTAXTYPEFLAG="ftaxtypeflag";
/**
*����
*/
public static final String NASTNUM="nastnum";
/**
*��˰���
*/
public static final String NCALTAXMNY="ncaltaxmny";
/**
*ncanoutnum���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String NCANOUTNUM="ncanoutnum";
/**
*�����ۿ۶�
*/
public static final String NDISCOUNT="ndiscount";
/**
*�����ۿ�
*/
public static final String NDISCOUNTRATE="ndiscountrate";
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
*��Ʊ�ۿ�
*/
public static final String NINVOICEDISRATE="ninvoicedisrate";
/**
*��Ʒ�ۿ�
*/
public static final String NITEMDISCOUNTRATE="nitemdiscountrate";
/**
*������˰���
*/
public static final String NMNY="nmny";
/**
*��������˰����
*/
public static final String NNETPRICE="nnetprice";
/**
*������
*/
public static final String NNUM="nnum";
/**
*�ۿ۶�
*/
public static final String NORIGDISCOUNT="norigdiscount";
/**
*��˰���
*/
public static final String NORIGMNY="norigmny";
/**
*����˰����
*/
public static final String NORIGNETPRICE="norignetprice";
/**
*����˰����
*/
public static final String NORIGPRICE="norigprice";
/**
*���ó�ֽ��
*/
public static final String NORIGSUBMNY="norigsubmny";
/**
*��˰�ϼ�
*/
public static final String NORIGTAXMNY="norigtaxmny";
/**
*����˰����
*/
public static final String NORIGTAXNETPRICE="norigtaxnetprice";
/**
*����˰����
*/
public static final String NORIGTAXPRICE="norigtaxprice";
/**
*��������˰����
*/
public static final String NPRICE="nprice";
/**
*������˰����
*/
public static final String NQTNETPRICE="nqtnetprice";
/**
*��˰����
*/
public static final String NQTORIGNETPRICE="nqtorignetprice";
/**
*��˰����
*/
public static final String NQTORIGPRICE="nqtorigprice";
/**
*��˰����
*/
public static final String NQTORIGTAXNETPRC="nqtorigtaxnetprc";
/**
*��˰����
*/
public static final String NQTORIGTAXPRICE="nqtorigtaxprice";
/**
*������˰����
*/
public static final String NQTPRICE="nqtprice";
/**
*���Һ�˰����
*/
public static final String NQTTAXNETPRICE="nqttaxnetprice";
/**
*���Һ�˰����
*/
public static final String NQTTAXPRICE="nqttaxprice";
/**
*��������
*/
public static final String NQTUNITNUM="nqtunitnum";
/**
*�ۼ�Ӧ��δ��������
*/
public static final String NSHOULDOUTNUM="nshouldoutnum";
/**
*nsrcnum���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String NSRCNUM="nsrcnum";
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
public static final String NTAXNETPRICE="ntaxnetprice";
/**
*�����Һ�˰����
*/
public static final String NTAXPRICE="ntaxprice";
/**
*˰��
*/
public static final String NTAXRATE="ntaxrate";
/**
*�ۼƳɱ���������
*/
public static final String NTOTALCOSTNUM="ntotalcostnum";
/**
*�ۼ�ȷ��Ӧ�ս��
*/
public static final String NTOTALINCOMEMNY="ntotalincomemny";
/**
*�ۼ�ȷ��Ӧ������
*/
public static final String NTOTALINCOMENUM="ntotalincomenum";
/**
*�ۼƳ�������
*/
public static final String NTOTALOUTNUM="ntotaloutnum";
/**
*�ۼ��տ���
*/
public static final String NTOTALPAYMNY="ntotalpaymny";
/**
*���ε���
*/
public static final String PK_BATCHCODE="pk_batchcode";
/**
*����
*/
public String pk_group;
/**
*��Ʊ��֯
*/
public String pk_org;
/**
*srcbts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String SRCBTS="srcbts";
/**
*srcts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*/
public static final String SRCTS="srcts";
/**
*ʱ���
*/
public UFDateTime ts;
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
*Դͷ��������
*/
public static final String VFIRSTTYPE="vfirsttype";
/**
*���ϸ�������1
*/
public static final String VFREE1="vfree1";
/**
*���ϸ�������10
*/
public static final String VFREE10="vfree10";
/**
*���ϸ�������2
*/
public static final String VFREE2="vfree2";
/**
*���ϸ�������3
*/
public static final String VFREE3="vfree3";
/**
*���ϸ�������4
*/
public static final String VFREE4="vfree4";
/**
*���ϸ�������5
*/
public static final String VFREE5="vfree5";
/**
*���ϸ�������6
*/
public static final String VFREE6="vfree6";
/**
*���ϸ�������7
*/
public static final String VFREE7="vfree7";
/**
*���ϸ�������8
*/
public static final String VFREE8="vfree8";
/**
*���ϸ�������9
*/
public static final String VFREE9="vfree9";
/**
*���ۻ�����
*/
public static final String VQTUNITRATE="vqtunitrate";
/**
*��ע
*/
public static final String VROWNOTE="vrownote";
/**
*��Դ���ݺ�
*/
public static final String VSRCCODE="vsrccode";
/**
*��Դ�����к�
*/
public static final String VSRCROWNO="vsrcrowno";
/**
*��Դ��������
*/
public static final String VSRCTRANTYPE="vsrctrantype";
/**
*��Դ��������
*/
public static final String VSRCTYPE="vsrctype";
/**
*���Ļ��ܺ�
*/
public static final String VSUMCODE="vsumcode";
/** 
* ��ȡ�Ƿ�ɢ��
*
* @return �Ƿ�ɢ��
*/
public UFBoolean getBfreecustflag () {
return (UFBoolean) this.getAttributeValue( XsfpBVO.BFREECUSTFLAG);
 } 

/** 
* �����Ƿ�ɢ��
*
* @param bfreecustflag �Ƿ�ɢ��
*/
public void setBfreecustflag ( UFBoolean bfreecustflag) {
this.setAttributeValue( XsfpBVO.BFREECUSTFLAG,bfreecustflag);
 } 

/** 
* ��ȡӦ����֯ԭʼ�汾
*
* @return Ӧ����֯ԭʼ�汾
*/
public String getCarorgid () {
return (String) this.getAttributeValue( XsfpBVO.CARORGID);
 } 

/** 
* ����Ӧ����֯ԭʼ�汾
*
* @param carorgid Ӧ����֯ԭʼ�汾
*/
public void setCarorgid ( String carorgid) {
this.setAttributeValue( XsfpBVO.CARORGID,carorgid);
 } 

/** 
* ��ȡӦ����֯
*
* @return Ӧ����֯
*/
public String getCarorgvid () {
return (String) this.getAttributeValue( XsfpBVO.CARORGVID);
 } 

/** 
* ����Ӧ����֯
*
* @param carorgvid Ӧ����֯
*/
public void setCarorgvid ( String carorgvid) {
this.setAttributeValue( XsfpBVO.CARORGVID,carorgvid);
 } 

/** 
* ��ȡ��λ
*
* @return ��λ
*/
public String getCastunitid () {
return (String) this.getAttributeValue( XsfpBVO.CASTUNITID);
 } 

/** 
* ���õ�λ
*
* @param castunitid ��λ
*/
public void setCastunitid ( String castunitid) {
this.setAttributeValue( XsfpBVO.CASTUNITID,castunitid);
 } 

/** 
* ��ȡ������������
*
* @return ������������
*/
public String getCchanneltypeid () {
return (String) this.getAttributeValue( XsfpBVO.CCHANNELTYPEID);
 } 

/** 
* ����������������
*
* @param cchanneltypeid ������������
*/
public void setCchanneltypeid ( String cchanneltypeid) {
this.setAttributeValue( XsfpBVO.CCHANNELTYPEID,cchanneltypeid);
 } 

/** 
* ��ȡ��֧��Ŀ
*
* @return ��֧��Ŀ
*/
public String getCcostsubjid () {
return (String) this.getAttributeValue( XsfpBVO.CCOSTSUBJID);
 } 

/** 
* ������֧��Ŀ
*
* @param ccostsubjid ��֧��Ŀ
*/
public void setCcostsubjid ( String ccostsubjid) {
this.setAttributeValue( XsfpBVO.CCOSTSUBJID,ccostsubjid);
 } 

/** 
* ��ȡ��ͬ��
*
* @return ��ͬ��
*/
public String getCctmanageid () {
return (String) this.getAttributeValue( XsfpBVO.CCTMANAGEID);
 } 

/** 
* ���ú�ͬ��
*
* @param cctmanageid ��ͬ��
*/
public void setCctmanageid ( String cctmanageid) {
this.setAttributeValue( XsfpBVO.CCTMANAGEID,cctmanageid);
 } 

/** 
* ��ȡ�ͻ�������
*
* @return �ͻ�������
*/
public String getCcustmaterialid () {
return (String) this.getAttributeValue( XsfpBVO.CCUSTMATERIALID);
 } 

/** 
* ���ÿͻ�������
*
* @param ccustmaterialid �ͻ�������
*/
public void setCcustmaterialid ( String ccustmaterialid) {
this.setAttributeValue( XsfpBVO.CCUSTMATERIALID,ccustmaterialid);
 } 

/** 
* ��ȡ���۲���
*
* @return ���۲���
*/
public String getCdeptid () {
return (String) this.getAttributeValue( XsfpBVO.CDEPTID);
 } 

/** 
* �������۲���
*
* @param cdeptid ���۲���
*/
public void setCdeptid ( String cdeptid) {
this.setAttributeValue( XsfpBVO.CDEPTID,cdeptid);
 } 

/** 
* ��ȡ���۲���
*
* @return ���۲���
*/
public String getCdeptvid () {
return (String) this.getAttributeValue( XsfpBVO.CDEPTVID);
 } 

/** 
* �������۲���
*
* @param cdeptvid ���۲���
*/
public void setCdeptvid ( String cdeptvid) {
this.setAttributeValue( XsfpBVO.CDEPTVID,cdeptvid);
 } 

/** 
* ��ȡ����ҵ��Ա
*
* @return ����ҵ��Ա
*/
public String getCemployeeid () {
return (String) this.getAttributeValue( XsfpBVO.CEMPLOYEEID);
 } 

/** 
* ��������ҵ��Ա
*
* @param cemployeeid ����ҵ��Ա
*/
public void setCemployeeid ( String cemployeeid) {
this.setAttributeValue( XsfpBVO.CEMPLOYEEID,cemployeeid);
 } 

/** 
* ��ȡԴͷ�����ӱ�
*
* @return Դͷ�����ӱ�
*/
public String getCfirstbid () {
return (String) this.getAttributeValue( XsfpBVO.CFIRSTBID);
 } 

/** 
* ����Դͷ�����ӱ�
*
* @param cfirstbid Դͷ�����ӱ�
*/
public void setCfirstbid ( String cfirstbid) {
this.setAttributeValue( XsfpBVO.CFIRSTBID,cfirstbid);
 } 

/** 
* ��ȡԴͷ��������
*
* @return Դͷ��������
*/
public String getCfirstid () {
return (String) this.getAttributeValue( XsfpBVO.CFIRSTID);
 } 

/** 
* ����Դͷ��������
*
* @param cfirstid Դͷ��������
*/
public void setCfirstid ( String cfirstid) {
this.setAttributeValue( XsfpBVO.CFIRSTID,cfirstid);
 } 

/** 
* ��ȡɢ��
*
* @return ɢ��
*/
public String getCfreecustid () {
return (String) this.getAttributeValue( XsfpBVO.CFREECUSTID);
 } 

/** 
* ����ɢ��
*
* @param cfreecustid ɢ��
*/
public void setCfreecustid ( String cfreecustid) {
this.setAttributeValue( XsfpBVO.CFREECUSTID,cfreecustid);
 } 

/** 
* ��ȡcmarbascalssid���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return cmarbascalssid
*/
public String getCmarbascalssid () {
return (String) this.getAttributeValue( XsfpBVO.CMARBASCALSSID);
 } 

/** 
* ����cmarbascalssid���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param cmarbascalssid cmarbascalssid
*/
public void setCmarbascalssid ( String cmarbascalssid) {
this.setAttributeValue( XsfpBVO.CMARBASCALSSID,cmarbascalssid);
 } 

/** 
* ��ȡ���ϱ���ԭʼ�汾
*
* @return ���ϱ���ԭʼ�汾
*/
public String getCmaterialid () {
return (String) this.getAttributeValue( XsfpBVO.CMATERIALID);
 } 

/** 
* �������ϱ���ԭʼ�汾
*
* @param cmaterialid ���ϱ���ԭʼ�汾
*/
public void setCmaterialid ( String cmaterialid) {
this.setAttributeValue( XsfpBVO.CMATERIALID,cmaterialid);
 } 

/** 
* ��ȡ���ϱ���
*
* @return ���ϱ���
*/
public String getCmaterialvid () {
return (String) this.getAttributeValue( XsfpBVO.CMATERIALVID);
 } 

/** 
* �������ϱ���
*
* @param cmaterialvid ���ϱ���
*/
public void setCmaterialvid ( String cmaterialvid) {
this.setAttributeValue( XsfpBVO.CMATERIALVID,cmaterialvid);
 } 

/** 
* ��ȡ�Գ���Դ�ӱ�
*
* @return �Գ���Դ�ӱ�
*/
public String getCopposesrcbid () {
return (String) this.getAttributeValue( XsfpBVO.COPPOSESRCBID);
 } 

/** 
* ���öԳ���Դ�ӱ�
*
* @param copposesrcbid �Գ���Դ�ӱ�
*/
public void setCopposesrcbid ( String copposesrcbid) {
this.setAttributeValue( XsfpBVO.COPPOSESRCBID,copposesrcbid);
 } 

/** 
* ��ȡ�����ͻ�
*
* @return �����ͻ�
*/
public String getCordercustid () {
return (String) this.getAttributeValue( XsfpBVO.CORDERCUSTID);
 } 

/** 
* ���ö����ͻ�
*
* @param cordercustid �����ͻ�
*/
public void setCordercustid ( String cordercustid) {
this.setAttributeValue( XsfpBVO.CORDERCUSTID,cordercustid);
 } 

/** 
* ��ȡ��Ʒ��
*
* @return ��Ʒ��
*/
public String getCprodlineid () {
return (String) this.getAttributeValue( XsfpBVO.CPRODLINEID);
 } 

/** 
* ���ò�Ʒ��
*
* @param cprodlineid ��Ʒ��
*/
public void setCprodlineid ( String cprodlineid) {
this.setAttributeValue( XsfpBVO.CPRODLINEID,cprodlineid);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getCprofitcenterid () {
return (String) this.getAttributeValue( XsfpBVO.CPROFITCENTERID);
 } 

/** 
* ������������
*
* @param cprofitcenterid ��������
*/
public void setCprofitcenterid ( String cprofitcenterid) {
this.setAttributeValue( XsfpBVO.CPROFITCENTERID,cprofitcenterid);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getCprofitcentervid () {
return (String) this.getAttributeValue( XsfpBVO.CPROFITCENTERVID);
 } 

/** 
* ������������
*
* @param cprofitcentervid ��������
*/
public void setCprofitcentervid ( String cprofitcentervid) {
this.setAttributeValue( XsfpBVO.CPROFITCENTERVID,cprofitcentervid);
 } 

/** 
* ��ȡ���۵�λ
*
* @return ���۵�λ
*/
public String getCqtunitid () {
return (String) this.getAttributeValue( XsfpBVO.CQTUNITID);
 } 

/** 
* ���ñ��۵�λ
*
* @param cqtunitid ���۵�λ
*/
public void setCqtunitid ( String cqtunitid) {
this.setAttributeValue( XsfpBVO.CQTUNITID,cqtunitid);
 } 

/** 
* ��ȡ�ջ���ַ
*
* @return �ջ���ַ
*/
public String getCreceiveaddrid () {
return (String) this.getAttributeValue( XsfpBVO.CRECEIVEADDRID);
 } 

/** 
* �����ջ���ַ
*
* @param creceiveaddrid �ջ���ַ
*/
public void setCreceiveaddrid ( String creceiveaddrid) {
this.setAttributeValue( XsfpBVO.CRECEIVEADDRID,creceiveaddrid);
 } 

/** 
* ��ȡ�ջ��ͻ�
*
* @return �ջ��ͻ�
*/
public String getCreceivecustid () {
return (String) this.getAttributeValue( XsfpBVO.CRECEIVECUSTID);
 } 

/** 
* �����ջ��ͻ�
*
* @param creceivecustid �ջ��ͻ�
*/
public void setCreceivecustid ( String creceivecustid) {
this.setAttributeValue( XsfpBVO.CRECEIVECUSTID,creceivecustid);
 } 

/** 
* ��ȡ�к�
*
* @return �к�
*/
public String getCrowno () {
return (String) this.getAttributeValue( XsfpBVO.CROWNO);
 } 

/** 
* �����к�
*
* @param crowno �к�
*/
public void setCrowno ( String crowno) {
this.setAttributeValue( XsfpBVO.CROWNO,crowno);
 } 

/** 
* ��ȡ��Ʊ��ʵ��
*
* @return ��Ʊ��ʵ��
*/
public String getCsaleinvoicebid () {
return this.csaleinvoicebid;
 } 

/** 
* ���÷�Ʊ��ʵ��
*
* @param csaleinvoicebid ��Ʊ��ʵ��
*/
public void setCsaleinvoicebid ( String csaleinvoicebid) {
this.csaleinvoicebid=csaleinvoicebid;
 } 

/** 
* ��ȡ�ϲ㵥������
*
* @return �ϲ㵥������
*/
public String getCsaleinvoiceid () {
return this.csaleinvoiceid;
 } 

/** 
* �����ϲ㵥������
*
* @param csaleinvoiceid �ϲ㵥������
*/
public void setCsaleinvoiceid ( String csaleinvoiceid) {
this.csaleinvoiceid=csaleinvoiceid;
 } 

/** 
* ��ȡ������֯
*
* @return ������֯
*/
public String getCsaleorgid () {
return (String) this.getAttributeValue( XsfpBVO.CSALEORGID);
 } 

/** 
* ����������֯
*
* @param csaleorgid ������֯
*/
public void setCsaleorgid ( String csaleorgid) {
this.setAttributeValue( XsfpBVO.CSALEORGID,csaleorgid);
 } 

/** 
* ��ȡ������֯
*
* @return ������֯
*/
public String getCsaleorgvid () {
return (String) this.getAttributeValue( XsfpBVO.CSALEORGVID);
 } 

/** 
* ����������֯
*
* @param csaleorgvid ������֯
*/
public void setCsaleorgvid ( String csaleorgvid) {
this.setAttributeValue( XsfpBVO.CSALEORGVID,csaleorgvid);
 } 

/** 
* ��ȡ�����֯
*
* @return �����֯
*/
public String getCsendstockorgid () {
return (String) this.getAttributeValue( XsfpBVO.CSENDSTOCKORGID);
 } 

/** 
* ���ÿ����֯
*
* @param csendstockorgid �����֯
*/
public void setCsendstockorgid ( String csendstockorgid) {
this.setAttributeValue( XsfpBVO.CSENDSTOCKORGID,csendstockorgid);
 } 

/** 
* ��ȡ�����֯
*
* @return �����֯
*/
public String getCsendstockorgvid () {
return (String) this.getAttributeValue( XsfpBVO.CSENDSTOCKORGVID);
 } 

/** 
* ���ÿ����֯
*
* @param csendstockorgvid �����֯
*/
public void setCsendstockorgvid ( String csendstockorgvid) {
this.setAttributeValue( XsfpBVO.CSENDSTOCKORGVID,csendstockorgvid);
 } 

/** 
* ��ȡ�ֿ�
*
* @return �ֿ�
*/
public String getCsendstordocid () {
return (String) this.getAttributeValue( XsfpBVO.CSENDSTORDOCID);
 } 

/** 
* ���òֿ�
*
* @param csendstordocid �ֿ�
*/
public void setCsendstordocid ( String csendstordocid) {
this.setAttributeValue( XsfpBVO.CSENDSTORDOCID,csendstordocid);
 } 

/** 
* ��ȡ��Դ�����ӱ�
*
* @return ��Դ�����ӱ�
*/
public String getCsrcbid () {
return (String) this.getAttributeValue( XsfpBVO.CSRCBID);
 } 

/** 
* ������Դ�����ӱ�
*
* @param csrcbid ��Դ�����ӱ�
*/
public void setCsrcbid ( String csrcbid) {
this.setAttributeValue( XsfpBVO.CSRCBID,csrcbid);
 } 

/** 
* ��ȡ��Դ��������
*
* @return ��Դ��������
*/
public String getCsrcid () {
return (String) this.getAttributeValue( XsfpBVO.CSRCID);
 } 

/** 
* ������Դ��������
*
* @param csrcid ��Դ��������
*/
public void setCsrcid ( String csrcid) {
this.setAttributeValue( XsfpBVO.CSRCID,csrcid);
 } 

/** 
* ��ȡ���Ļ�������
*
* @return ���Ļ�������
*/
public String getCsumid () {
return (String) this.getAttributeValue( XsfpBVO.CSUMID);
 } 

/** 
* �������Ļ�������
*
* @param csumid ���Ļ�������
*/
public void setCsumid ( String csumid) {
this.setAttributeValue( XsfpBVO.CSUMID,csumid);
 } 

/** 
* ��ȡ˰��
*
* @return ˰��
*/
public String getCtaxcodeid () {
return (String) this.getAttributeValue( XsfpBVO.CTAXCODEID);
 } 

/** 
* ����˰��
*
* @param ctaxcodeid ˰��
*/
public void setCtaxcodeid ( String ctaxcodeid) {
this.setAttributeValue( XsfpBVO.CTAXCODEID,ctaxcodeid);
 } 

/** 
* ��ȡ���䷽ʽ
*
* @return ���䷽ʽ
*/
public String getCtransporttypeid () {
return (String) this.getAttributeValue( XsfpBVO.CTRANSPORTTYPEID);
 } 

/** 
* �������䷽ʽ
*
* @param ctransporttypeid ���䷽ʽ
*/
public void setCtransporttypeid ( String ctransporttypeid) {
this.setAttributeValue( XsfpBVO.CTRANSPORTTYPEID,ctransporttypeid);
 } 

/** 
* ��ȡ����λ
*
* @return ����λ
*/
public String getCunitid () {
return (String) this.getAttributeValue( XsfpBVO.CUNITID);
 } 

/** 
* ��������λ
*
* @param cunitid ����λ
*/
public void setCunitid ( String cunitid) {
this.setAttributeValue( XsfpBVO.CUNITID,cunitid);
 } 

/** 
* ��ȡ�Ĵ湩Ӧ��
*
* @return �Ĵ湩Ӧ��
*/
public String getCvmivenderid () {
return (String) this.getAttributeValue( XsfpBVO.CVMIVENDERID);
 } 

/** 
* ���üĴ湩Ӧ��
*
* @param cvmivenderid �Ĵ湩Ӧ��
*/
public void setCvmivenderid ( String cvmivenderid) {
this.setAttributeValue( XsfpBVO.CVMIVENDERID,cvmivenderid);
 } 

/** 
* ��ȡ��Ʊ����
*
* @return ��Ʊ����
*/
public UFDate getDbilldate () {
return (UFDate) this.getAttributeValue( XsfpBVO.DBILLDATE);
 } 

/** 
* ���ÿ�Ʊ����
*
* @param dbilldate ��Ʊ����
*/
public void setDbilldate ( UFDate dbilldate) {
this.setAttributeValue( XsfpBVO.DBILLDATE,dbilldate);
 } 

/** 
* ��ȡ��˰���
*
* @return ��˰���
* @see String
*/
public Integer getFtaxtypeflag () {
return (Integer) this.getAttributeValue( XsfpBVO.FTAXTYPEFLAG);
 } 

/** 
* ���ÿ�˰���
*
* @param ftaxtypeflag ��˰���
* @see String
*/
public void setFtaxtypeflag ( Integer ftaxtypeflag) {
this.setAttributeValue( XsfpBVO.FTAXTYPEFLAG,ftaxtypeflag);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public UFDouble getNastnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NASTNUM);
 } 

/** 
* ��������
*
* @param nastnum ����
*/
public void setNastnum ( UFDouble nastnum) {
this.setAttributeValue( XsfpBVO.NASTNUM,nastnum);
 } 

/** 
* ��ȡ��˰���
*
* @return ��˰���
*/
public UFDouble getNcaltaxmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NCALTAXMNY);
 } 

/** 
* ���ü�˰���
*
* @param ncaltaxmny ��˰���
*/
public void setNcaltaxmny ( UFDouble ncaltaxmny) {
this.setAttributeValue( XsfpBVO.NCALTAXMNY,ncaltaxmny);
 } 

/** 
* ��ȡncanoutnum���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return ncanoutnum
*/
public UFDouble getNcanoutnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NCANOUTNUM);
 } 

/** 
* ����ncanoutnum���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param ncanoutnum ncanoutnum
*/
public void setNcanoutnum ( UFDouble ncanoutnum) {
this.setAttributeValue( XsfpBVO.NCANOUTNUM,ncanoutnum);
 } 

/** 
* ��ȡ�����ۿ۶�
*
* @return �����ۿ۶�
*/
public UFDouble getNdiscount () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NDISCOUNT);
 } 

/** 
* ���ñ����ۿ۶�
*
* @param ndiscount �����ۿ۶�
*/
public void setNdiscount ( UFDouble ndiscount) {
this.setAttributeValue( XsfpBVO.NDISCOUNT,ndiscount);
 } 

/** 
* ��ȡ�����ۿ�
*
* @return �����ۿ�
*/
public UFDouble getNdiscountrate () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NDISCOUNTRATE);
 } 

/** 
* ���������ۿ�
*
* @param ndiscountrate �����ۿ�
*/
public void setNdiscountrate ( UFDouble ndiscountrate) {
this.setAttributeValue( XsfpBVO.NDISCOUNTRATE,ndiscountrate);
 } 

/** 
* ��ȡȫ�ֱ�����˰���
*
* @return ȫ�ֱ�����˰���
*/
public UFDouble getNglobalmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NGLOBALMNY);
 } 

/** 
* ����ȫ�ֱ�����˰���
*
* @param nglobalmny ȫ�ֱ�����˰���
*/
public void setNglobalmny ( UFDouble nglobalmny) {
this.setAttributeValue( XsfpBVO.NGLOBALMNY,nglobalmny);
 } 

/** 
* ��ȡȫ�ֱ��Ҽ�˰�ϼ�
*
* @return ȫ�ֱ��Ҽ�˰�ϼ�
*/
public UFDouble getNglobaltaxmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NGLOBALTAXMNY);
 } 

/** 
* ����ȫ�ֱ��Ҽ�˰�ϼ�
*
* @param nglobaltaxmny ȫ�ֱ��Ҽ�˰�ϼ�
*/
public void setNglobaltaxmny ( UFDouble nglobaltaxmny) {
this.setAttributeValue( XsfpBVO.NGLOBALTAXMNY,nglobaltaxmny);
 } 

/** 
* ��ȡ���ű�����˰���
*
* @return ���ű�����˰���
*/
public UFDouble getNgroupmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NGROUPMNY);
 } 

/** 
* ���ü��ű�����˰���
*
* @param ngroupmny ���ű�����˰���
*/
public void setNgroupmny ( UFDouble ngroupmny) {
this.setAttributeValue( XsfpBVO.NGROUPMNY,ngroupmny);
 } 

/** 
* ��ȡ���ű��Ҽ�˰�ϼ�
*
* @return ���ű��Ҽ�˰�ϼ�
*/
public UFDouble getNgrouptaxmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NGROUPTAXMNY);
 } 

/** 
* ���ü��ű��Ҽ�˰�ϼ�
*
* @param ngrouptaxmny ���ű��Ҽ�˰�ϼ�
*/
public void setNgrouptaxmny ( UFDouble ngrouptaxmny) {
this.setAttributeValue( XsfpBVO.NGROUPTAXMNY,ngrouptaxmny);
 } 

/** 
* ��ȡ��Ʊ�ۿ�
*
* @return ��Ʊ�ۿ�
*/
public UFDouble getNinvoicedisrate () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NINVOICEDISRATE);
 } 

/** 
* ���÷�Ʊ�ۿ�
*
* @param ninvoicedisrate ��Ʊ�ۿ�
*/
public void setNinvoicedisrate ( UFDouble ninvoicedisrate) {
this.setAttributeValue( XsfpBVO.NINVOICEDISRATE,ninvoicedisrate);
 } 

/** 
* ��ȡ��Ʒ�ۿ�
*
* @return ��Ʒ�ۿ�
*/
public UFDouble getNitemdiscountrate () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NITEMDISCOUNTRATE);
 } 

/** 
* ���õ�Ʒ�ۿ�
*
* @param nitemdiscountrate ��Ʒ�ۿ�
*/
public void setNitemdiscountrate ( UFDouble nitemdiscountrate) {
this.setAttributeValue( XsfpBVO.NITEMDISCOUNTRATE,nitemdiscountrate);
 } 

/** 
* ��ȡ������˰���
*
* @return ������˰���
*/
public UFDouble getNmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NMNY);
 } 

/** 
* ���ñ�����˰���
*
* @param nmny ������˰���
*/
public void setNmny ( UFDouble nmny) {
this.setAttributeValue( XsfpBVO.NMNY,nmny);
 } 

/** 
* ��ȡ��������˰����
*
* @return ��������˰����
*/
public UFDouble getNnetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NNETPRICE);
 } 

/** 
* ������������˰����
*
* @param nnetprice ��������˰����
*/
public void setNnetprice ( UFDouble nnetprice) {
this.setAttributeValue( XsfpBVO.NNETPRICE,nnetprice);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public UFDouble getNnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NNUM);
 } 

/** 
* ����������
*
* @param nnum ������
*/
public void setNnum ( UFDouble nnum) {
this.setAttributeValue( XsfpBVO.NNUM,nnum);
 } 

/** 
* ��ȡ�ۿ۶�
*
* @return �ۿ۶�
*/
public UFDouble getNorigdiscount () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGDISCOUNT);
 } 

/** 
* �����ۿ۶�
*
* @param norigdiscount �ۿ۶�
*/
public void setNorigdiscount ( UFDouble norigdiscount) {
this.setAttributeValue( XsfpBVO.NORIGDISCOUNT,norigdiscount);
 } 

/** 
* ��ȡ��˰���
*
* @return ��˰���
*/
public UFDouble getNorigmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGMNY);
 } 

/** 
* ������˰���
*
* @param norigmny ��˰���
*/
public void setNorigmny ( UFDouble norigmny) {
this.setAttributeValue( XsfpBVO.NORIGMNY,norigmny);
 } 

/** 
* ��ȡ����˰����
*
* @return ����˰����
*/
public UFDouble getNorignetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGNETPRICE);
 } 

/** 
* ��������˰����
*
* @param norignetprice ����˰����
*/
public void setNorignetprice ( UFDouble norignetprice) {
this.setAttributeValue( XsfpBVO.NORIGNETPRICE,norignetprice);
 } 

/** 
* ��ȡ����˰����
*
* @return ����˰����
*/
public UFDouble getNorigprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGPRICE);
 } 

/** 
* ��������˰����
*
* @param norigprice ����˰����
*/
public void setNorigprice ( UFDouble norigprice) {
this.setAttributeValue( XsfpBVO.NORIGPRICE,norigprice);
 } 

/** 
* ��ȡ���ó�ֽ��
*
* @return ���ó�ֽ��
*/
public UFDouble getNorigsubmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGSUBMNY);
 } 

/** 
* ���÷��ó�ֽ��
*
* @param norigsubmny ���ó�ֽ��
*/
public void setNorigsubmny ( UFDouble norigsubmny) {
this.setAttributeValue( XsfpBVO.NORIGSUBMNY,norigsubmny);
 } 

/** 
* ��ȡ��˰�ϼ�
*
* @return ��˰�ϼ�
*/
public UFDouble getNorigtaxmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGTAXMNY);
 } 

/** 
* ���ü�˰�ϼ�
*
* @param norigtaxmny ��˰�ϼ�
*/
public void setNorigtaxmny ( UFDouble norigtaxmny) {
this.setAttributeValue( XsfpBVO.NORIGTAXMNY,norigtaxmny);
 } 

/** 
* ��ȡ����˰����
*
* @return ����˰����
*/
public UFDouble getNorigtaxnetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGTAXNETPRICE);
 } 

/** 
* ��������˰����
*
* @param norigtaxnetprice ����˰����
*/
public void setNorigtaxnetprice ( UFDouble norigtaxnetprice) {
this.setAttributeValue( XsfpBVO.NORIGTAXNETPRICE,norigtaxnetprice);
 } 

/** 
* ��ȡ����˰����
*
* @return ����˰����
*/
public UFDouble getNorigtaxprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGTAXPRICE);
 } 

/** 
* ��������˰����
*
* @param norigtaxprice ����˰����
*/
public void setNorigtaxprice ( UFDouble norigtaxprice) {
this.setAttributeValue( XsfpBVO.NORIGTAXPRICE,norigtaxprice);
 } 

/** 
* ��ȡ��������˰����
*
* @return ��������˰����
*/
public UFDouble getNprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NPRICE);
 } 

/** 
* ������������˰����
*
* @param nprice ��������˰����
*/
public void setNprice ( UFDouble nprice) {
this.setAttributeValue( XsfpBVO.NPRICE,nprice);
 } 

/** 
* ��ȡ������˰����
*
* @return ������˰����
*/
public UFDouble getNqtnetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTNETPRICE);
 } 

/** 
* ���ñ�����˰����
*
* @param nqtnetprice ������˰����
*/
public void setNqtnetprice ( UFDouble nqtnetprice) {
this.setAttributeValue( XsfpBVO.NQTNETPRICE,nqtnetprice);
 } 

/** 
* ��ȡ��˰����
*
* @return ��˰����
*/
public UFDouble getNqtorignetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTORIGNETPRICE);
 } 

/** 
* ������˰����
*
* @param nqtorignetprice ��˰����
*/
public void setNqtorignetprice ( UFDouble nqtorignetprice) {
this.setAttributeValue( XsfpBVO.NQTORIGNETPRICE,nqtorignetprice);
 } 

/** 
* ��ȡ��˰����
*
* @return ��˰����
*/
public UFDouble getNqtorigprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTORIGPRICE);
 } 

/** 
* ������˰����
*
* @param nqtorigprice ��˰����
*/
public void setNqtorigprice ( UFDouble nqtorigprice) {
this.setAttributeValue( XsfpBVO.NQTORIGPRICE,nqtorigprice);
 } 

/** 
* ��ȡ��˰����
*
* @return ��˰����
*/
public UFDouble getNqtorigtaxnetprc () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTORIGTAXNETPRC);
 } 

/** 
* ���ú�˰����
*
* @param nqtorigtaxnetprc ��˰����
*/
public void setNqtorigtaxnetprc ( UFDouble nqtorigtaxnetprc) {
this.setAttributeValue( XsfpBVO.NQTORIGTAXNETPRC,nqtorigtaxnetprc);
 } 

/** 
* ��ȡ��˰����
*
* @return ��˰����
*/
public UFDouble getNqtorigtaxprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTORIGTAXPRICE);
 } 

/** 
* ���ú�˰����
*
* @param nqtorigtaxprice ��˰����
*/
public void setNqtorigtaxprice ( UFDouble nqtorigtaxprice) {
this.setAttributeValue( XsfpBVO.NQTORIGTAXPRICE,nqtorigtaxprice);
 } 

/** 
* ��ȡ������˰����
*
* @return ������˰����
*/
public UFDouble getNqtprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTPRICE);
 } 

/** 
* ���ñ�����˰����
*
* @param nqtprice ������˰����
*/
public void setNqtprice ( UFDouble nqtprice) {
this.setAttributeValue( XsfpBVO.NQTPRICE,nqtprice);
 } 

/** 
* ��ȡ���Һ�˰����
*
* @return ���Һ�˰����
*/
public UFDouble getNqttaxnetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTTAXNETPRICE);
 } 

/** 
* ���ñ��Һ�˰����
*
* @param nqttaxnetprice ���Һ�˰����
*/
public void setNqttaxnetprice ( UFDouble nqttaxnetprice) {
this.setAttributeValue( XsfpBVO.NQTTAXNETPRICE,nqttaxnetprice);
 } 

/** 
* ��ȡ���Һ�˰����
*
* @return ���Һ�˰����
*/
public UFDouble getNqttaxprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTTAXPRICE);
 } 

/** 
* ���ñ��Һ�˰����
*
* @param nqttaxprice ���Һ�˰����
*/
public void setNqttaxprice ( UFDouble nqttaxprice) {
this.setAttributeValue( XsfpBVO.NQTTAXPRICE,nqttaxprice);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDouble getNqtunitnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTUNITNUM);
 } 

/** 
* ���ñ�������
*
* @param nqtunitnum ��������
*/
public void setNqtunitnum ( UFDouble nqtunitnum) {
this.setAttributeValue( XsfpBVO.NQTUNITNUM,nqtunitnum);
 } 

/** 
* ��ȡ�ۼ�Ӧ��δ��������
*
* @return �ۼ�Ӧ��δ��������
*/
public UFDouble getNshouldoutnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NSHOULDOUTNUM);
 } 

/** 
* �����ۼ�Ӧ��δ��������
*
* @param nshouldoutnum �ۼ�Ӧ��δ��������
*/
public void setNshouldoutnum ( UFDouble nshouldoutnum) {
this.setAttributeValue( XsfpBVO.NSHOULDOUTNUM,nshouldoutnum);
 } 

/** 
* ��ȡnsrcnum���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return nsrcnum
*/
public UFDouble getNsrcnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NSRCNUM);
 } 

/** 
* ����nsrcnum���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param nsrcnum nsrcnum
*/
public void setNsrcnum ( UFDouble nsrcnum) {
this.setAttributeValue( XsfpBVO.NSRCNUM,nsrcnum);
 } 

/** 
* ��ȡ˰��
*
* @return ˰��
*/
public UFDouble getNtax () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTAX);
 } 

/** 
* ����˰��
*
* @param ntax ˰��
*/
public void setNtax ( UFDouble ntax) {
this.setAttributeValue( XsfpBVO.NTAX,ntax);
 } 

/** 
* ��ȡ���Ҽ�˰�ϼ�
*
* @return ���Ҽ�˰�ϼ�
*/
public UFDouble getNtaxmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTAXMNY);
 } 

/** 
* ���ñ��Ҽ�˰�ϼ�
*
* @param ntaxmny ���Ҽ�˰�ϼ�
*/
public void setNtaxmny ( UFDouble ntaxmny) {
this.setAttributeValue( XsfpBVO.NTAXMNY,ntaxmny);
 } 

/** 
* ��ȡ�����Һ�˰����
*
* @return �����Һ�˰����
*/
public UFDouble getNtaxnetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTAXNETPRICE);
 } 

/** 
* ���������Һ�˰����
*
* @param ntaxnetprice �����Һ�˰����
*/
public void setNtaxnetprice ( UFDouble ntaxnetprice) {
this.setAttributeValue( XsfpBVO.NTAXNETPRICE,ntaxnetprice);
 } 

/** 
* ��ȡ�����Һ�˰����
*
* @return �����Һ�˰����
*/
public UFDouble getNtaxprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTAXPRICE);
 } 

/** 
* ���������Һ�˰����
*
* @param ntaxprice �����Һ�˰����
*/
public void setNtaxprice ( UFDouble ntaxprice) {
this.setAttributeValue( XsfpBVO.NTAXPRICE,ntaxprice);
 } 

/** 
* ��ȡ˰��
*
* @return ˰��
*/
public UFDouble getNtaxrate () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTAXRATE);
 } 

/** 
* ����˰��
*
* @param ntaxrate ˰��
*/
public void setNtaxrate ( UFDouble ntaxrate) {
this.setAttributeValue( XsfpBVO.NTAXRATE,ntaxrate);
 } 

/** 
* ��ȡ�ۼƳɱ���������
*
* @return �ۼƳɱ���������
*/
public UFDouble getNtotalcostnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTOTALCOSTNUM);
 } 

/** 
* �����ۼƳɱ���������
*
* @param ntotalcostnum �ۼƳɱ���������
*/
public void setNtotalcostnum ( UFDouble ntotalcostnum) {
this.setAttributeValue( XsfpBVO.NTOTALCOSTNUM,ntotalcostnum);
 } 

/** 
* ��ȡ�ۼ�ȷ��Ӧ�ս��
*
* @return �ۼ�ȷ��Ӧ�ս��
*/
public UFDouble getNtotalincomemny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTOTALINCOMEMNY);
 } 

/** 
* �����ۼ�ȷ��Ӧ�ս��
*
* @param ntotalincomemny �ۼ�ȷ��Ӧ�ս��
*/
public void setNtotalincomemny ( UFDouble ntotalincomemny) {
this.setAttributeValue( XsfpBVO.NTOTALINCOMEMNY,ntotalincomemny);
 } 

/** 
* ��ȡ�ۼ�ȷ��Ӧ������
*
* @return �ۼ�ȷ��Ӧ������
*/
public UFDouble getNtotalincomenum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTOTALINCOMENUM);
 } 

/** 
* �����ۼ�ȷ��Ӧ������
*
* @param ntotalincomenum �ۼ�ȷ��Ӧ������
*/
public void setNtotalincomenum ( UFDouble ntotalincomenum) {
this.setAttributeValue( XsfpBVO.NTOTALINCOMENUM,ntotalincomenum);
 } 

/** 
* ��ȡ�ۼƳ�������
*
* @return �ۼƳ�������
*/
public UFDouble getNtotaloutnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTOTALOUTNUM);
 } 

/** 
* �����ۼƳ�������
*
* @param ntotaloutnum �ۼƳ�������
*/
public void setNtotaloutnum ( UFDouble ntotaloutnum) {
this.setAttributeValue( XsfpBVO.NTOTALOUTNUM,ntotaloutnum);
 } 

/** 
* ��ȡ�ۼ��տ���
*
* @return �ۼ��տ���
*/
public UFDouble getNtotalpaymny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTOTALPAYMNY);
 } 

/** 
* �����ۼ��տ���
*
* @param ntotalpaymny �ۼ��տ���
*/
public void setNtotalpaymny ( UFDouble ntotalpaymny) {
this.setAttributeValue( XsfpBVO.NTOTALPAYMNY,ntotalpaymny);
 } 

/** 
* ��ȡ���ε���
*
* @return ���ε���
*/
public String getPk_batchcode () {
return (String) this.getAttributeValue( XsfpBVO.PK_BATCHCODE);
 } 

/** 
* �������ε���
*
* @param pk_batchcode ���ε���
*/
public void setPk_batchcode ( String pk_batchcode) {
this.setAttributeValue( XsfpBVO.PK_BATCHCODE,pk_batchcode);
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
* ��ȡsrcbts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return srcbts
*/
public UFDateTime getSrcbts () {
return (UFDateTime) this.getAttributeValue( XsfpBVO.SRCBTS);
 } 

/** 
* ����srcbts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param srcbts srcbts
*/
public void setSrcbts ( UFDateTime srcbts) {
this.setAttributeValue( XsfpBVO.SRCBTS,srcbts);
 } 

/** 
* ��ȡsrcts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @return srcts
*/
public UFDateTime getSrcts () {
return (UFDateTime) this.getAttributeValue( XsfpBVO.SRCTS);
 } 

/** 
* ����srcts���ɳ������ֶΣ�����Զ�̴���ֵ�������ܱ��浽���ݿ⣩
*
* @param srcts srcts
*/
public void setSrcts ( UFDateTime srcts) {
this.setAttributeValue( XsfpBVO.SRCTS,srcts);
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
* ��ȡ���κ�
*
* @return ���κ�
*/
public String getVbatchcode () {
return (String) this.getAttributeValue( XsfpBVO.VBATCHCODE);
 } 

/** 
* �������κ�
*
* @param vbatchcode ���κ�
*/
public void setVbatchcode ( String vbatchcode) {
this.setAttributeValue( XsfpBVO.VBATCHCODE,vbatchcode);
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getVbdef1 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF1);
 } 

/** 
* �����Զ�����1
*
* @param vbdef1 �Զ�����1
*/
public void setVbdef1 ( String vbdef1) {
this.setAttributeValue( XsfpBVO.VBDEF1,vbdef1);
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getVbdef10 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF10);
 } 

/** 
* �����Զ�����10
*
* @param vbdef10 �Զ�����10
*/
public void setVbdef10 ( String vbdef10) {
this.setAttributeValue( XsfpBVO.VBDEF10,vbdef10);
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public String getVbdef11 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF11);
 } 

/** 
* �����Զ�����11
*
* @param vbdef11 �Զ�����11
*/
public void setVbdef11 ( String vbdef11) {
this.setAttributeValue( XsfpBVO.VBDEF11,vbdef11);
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getVbdef12 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF12);
 } 

/** 
* �����Զ�����12
*
* @param vbdef12 �Զ�����12
*/
public void setVbdef12 ( String vbdef12) {
this.setAttributeValue( XsfpBVO.VBDEF12,vbdef12);
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getVbdef13 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF13);
 } 

/** 
* �����Զ�����13
*
* @param vbdef13 �Զ�����13
*/
public void setVbdef13 ( String vbdef13) {
this.setAttributeValue( XsfpBVO.VBDEF13,vbdef13);
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getVbdef14 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF14);
 } 

/** 
* �����Զ�����14
*
* @param vbdef14 �Զ�����14
*/
public void setVbdef14 ( String vbdef14) {
this.setAttributeValue( XsfpBVO.VBDEF14,vbdef14);
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public String getVbdef15 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF15);
 } 

/** 
* �����Զ�����15
*
* @param vbdef15 �Զ�����15
*/
public void setVbdef15 ( String vbdef15) {
this.setAttributeValue( XsfpBVO.VBDEF15,vbdef15);
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getVbdef16 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF16);
 } 

/** 
* �����Զ�����16
*
* @param vbdef16 �Զ�����16
*/
public void setVbdef16 ( String vbdef16) {
this.setAttributeValue( XsfpBVO.VBDEF16,vbdef16);
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getVbdef17 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF17);
 } 

/** 
* �����Զ�����17
*
* @param vbdef17 �Զ�����17
*/
public void setVbdef17 ( String vbdef17) {
this.setAttributeValue( XsfpBVO.VBDEF17,vbdef17);
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getVbdef18 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF18);
 } 

/** 
* �����Զ�����18
*
* @param vbdef18 �Զ�����18
*/
public void setVbdef18 ( String vbdef18) {
this.setAttributeValue( XsfpBVO.VBDEF18,vbdef18);
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getVbdef19 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF19);
 } 

/** 
* �����Զ�����19
*
* @param vbdef19 �Զ�����19
*/
public void setVbdef19 ( String vbdef19) {
this.setAttributeValue( XsfpBVO.VBDEF19,vbdef19);
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getVbdef2 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF2);
 } 

/** 
* �����Զ�����2
*
* @param vbdef2 �Զ�����2
*/
public void setVbdef2 ( String vbdef2) {
this.setAttributeValue( XsfpBVO.VBDEF2,vbdef2);
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getVbdef20 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF20);
 } 

/** 
* �����Զ�����20
*
* @param vbdef20 �Զ�����20
*/
public void setVbdef20 ( String vbdef20) {
this.setAttributeValue( XsfpBVO.VBDEF20,vbdef20);
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getVbdef3 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF3);
 } 

/** 
* �����Զ�����3
*
* @param vbdef3 �Զ�����3
*/
public void setVbdef3 ( String vbdef3) {
this.setAttributeValue( XsfpBVO.VBDEF3,vbdef3);
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getVbdef4 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF4);
 } 

/** 
* �����Զ�����4
*
* @param vbdef4 �Զ�����4
*/
public void setVbdef4 ( String vbdef4) {
this.setAttributeValue( XsfpBVO.VBDEF4,vbdef4);
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getVbdef5 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF5);
 } 

/** 
* �����Զ�����5
*
* @param vbdef5 �Զ�����5
*/
public void setVbdef5 ( String vbdef5) {
this.setAttributeValue( XsfpBVO.VBDEF5,vbdef5);
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getVbdef6 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF6);
 } 

/** 
* �����Զ�����6
*
* @param vbdef6 �Զ�����6
*/
public void setVbdef6 ( String vbdef6) {
this.setAttributeValue( XsfpBVO.VBDEF6,vbdef6);
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getVbdef7 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF7);
 } 

/** 
* �����Զ�����7
*
* @param vbdef7 �Զ�����7
*/
public void setVbdef7 ( String vbdef7) {
this.setAttributeValue( XsfpBVO.VBDEF7,vbdef7);
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getVbdef8 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF8);
 } 

/** 
* �����Զ�����8
*
* @param vbdef8 �Զ�����8
*/
public void setVbdef8 ( String vbdef8) {
this.setAttributeValue( XsfpBVO.VBDEF8,vbdef8);
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getVbdef9 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF9);
 } 

/** 
* �����Զ�����9
*
* @param vbdef9 �Զ�����9
*/
public void setVbdef9 ( String vbdef9) {
this.setAttributeValue( XsfpBVO.VBDEF9,vbdef9);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getVchangerate () {
return (String) this.getAttributeValue( XsfpBVO.VCHANGERATE);
 } 

/** 
* ���û�����
*
* @param vchangerate ������
*/
public void setVchangerate ( String vchangerate) {
this.setAttributeValue( XsfpBVO.VCHANGERATE,vchangerate);
 } 

/** 
* ��ȡԴͷ���ݺ�
*
* @return Դͷ���ݺ�
*/
public String getVfirstcode () {
return (String) this.getAttributeValue( XsfpBVO.VFIRSTCODE);
 } 

/** 
* ����Դͷ���ݺ�
*
* @param vfirstcode Դͷ���ݺ�
*/
public void setVfirstcode ( String vfirstcode) {
this.setAttributeValue( XsfpBVO.VFIRSTCODE,vfirstcode);
 } 

/** 
* ��ȡԴͷ�����к�
*
* @return Դͷ�����к�
*/
public String getVfirstrowno () {
return (String) this.getAttributeValue( XsfpBVO.VFIRSTROWNO);
 } 

/** 
* ����Դͷ�����к�
*
* @param vfirstrowno Դͷ�����к�
*/
public void setVfirstrowno ( String vfirstrowno) {
this.setAttributeValue( XsfpBVO.VFIRSTROWNO,vfirstrowno);
 } 

/** 
* ��ȡԴͷ��������
*
* @return Դͷ��������
*/
public String getVfirsttrantype () {
return (String) this.getAttributeValue( XsfpBVO.VFIRSTTRANTYPE);
 } 

/** 
* ����Դͷ��������
*
* @param vfirsttrantype Դͷ��������
*/
public void setVfirsttrantype ( String vfirsttrantype) {
this.setAttributeValue( XsfpBVO.VFIRSTTRANTYPE,vfirsttrantype);
 } 

/** 
* ��ȡԴͷ��������
*
* @return Դͷ��������
*/
public String getVfirsttype () {
return (String) this.getAttributeValue( XsfpBVO.VFIRSTTYPE);
 } 

/** 
* ����Դͷ��������
*
* @param vfirsttype Դͷ��������
*/
public void setVfirsttype ( String vfirsttype) {
this.setAttributeValue( XsfpBVO.VFIRSTTYPE,vfirsttype);
 } 

/** 
* ��ȡ���ϸ�������1
*
* @return ���ϸ�������1
*/
public String getVfree1 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE1);
 } 

/** 
* �������ϸ�������1
*
* @param vfree1 ���ϸ�������1
*/
public void setVfree1 ( String vfree1) {
this.setAttributeValue( XsfpBVO.VFREE1,vfree1);
 } 

/** 
* ��ȡ���ϸ�������10
*
* @return ���ϸ�������10
*/
public String getVfree10 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE10);
 } 

/** 
* �������ϸ�������10
*
* @param vfree10 ���ϸ�������10
*/
public void setVfree10 ( String vfree10) {
this.setAttributeValue( XsfpBVO.VFREE10,vfree10);
 } 

/** 
* ��ȡ���ϸ�������2
*
* @return ���ϸ�������2
*/
public String getVfree2 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE2);
 } 

/** 
* �������ϸ�������2
*
* @param vfree2 ���ϸ�������2
*/
public void setVfree2 ( String vfree2) {
this.setAttributeValue( XsfpBVO.VFREE2,vfree2);
 } 

/** 
* ��ȡ���ϸ�������3
*
* @return ���ϸ�������3
*/
public String getVfree3 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE3);
 } 

/** 
* �������ϸ�������3
*
* @param vfree3 ���ϸ�������3
*/
public void setVfree3 ( String vfree3) {
this.setAttributeValue( XsfpBVO.VFREE3,vfree3);
 } 

/** 
* ��ȡ���ϸ�������4
*
* @return ���ϸ�������4
*/
public String getVfree4 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE4);
 } 

/** 
* �������ϸ�������4
*
* @param vfree4 ���ϸ�������4
*/
public void setVfree4 ( String vfree4) {
this.setAttributeValue( XsfpBVO.VFREE4,vfree4);
 } 

/** 
* ��ȡ���ϸ�������5
*
* @return ���ϸ�������5
*/
public String getVfree5 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE5);
 } 

/** 
* �������ϸ�������5
*
* @param vfree5 ���ϸ�������5
*/
public void setVfree5 ( String vfree5) {
this.setAttributeValue( XsfpBVO.VFREE5,vfree5);
 } 

/** 
* ��ȡ���ϸ�������6
*
* @return ���ϸ�������6
*/
public String getVfree6 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE6);
 } 

/** 
* �������ϸ�������6
*
* @param vfree6 ���ϸ�������6
*/
public void setVfree6 ( String vfree6) {
this.setAttributeValue( XsfpBVO.VFREE6,vfree6);
 } 

/** 
* ��ȡ���ϸ�������7
*
* @return ���ϸ�������7
*/
public String getVfree7 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE7);
 } 

/** 
* �������ϸ�������7
*
* @param vfree7 ���ϸ�������7
*/
public void setVfree7 ( String vfree7) {
this.setAttributeValue( XsfpBVO.VFREE7,vfree7);
 } 

/** 
* ��ȡ���ϸ�������8
*
* @return ���ϸ�������8
*/
public String getVfree8 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE8);
 } 

/** 
* �������ϸ�������8
*
* @param vfree8 ���ϸ�������8
*/
public void setVfree8 ( String vfree8) {
this.setAttributeValue( XsfpBVO.VFREE8,vfree8);
 } 

/** 
* ��ȡ���ϸ�������9
*
* @return ���ϸ�������9
*/
public String getVfree9 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE9);
 } 

/** 
* �������ϸ�������9
*
* @param vfree9 ���ϸ�������9
*/
public void setVfree9 ( String vfree9) {
this.setAttributeValue( XsfpBVO.VFREE9,vfree9);
 } 

/** 
* ��ȡ���ۻ�����
*
* @return ���ۻ�����
*/
public String getVqtunitrate () {
return (String) this.getAttributeValue( XsfpBVO.VQTUNITRATE);
 } 

/** 
* ���ñ��ۻ�����
*
* @param vqtunitrate ���ۻ�����
*/
public void setVqtunitrate ( String vqtunitrate) {
this.setAttributeValue( XsfpBVO.VQTUNITRATE,vqtunitrate);
 } 

/** 
* ��ȡ��ע
*
* @return ��ע
*/
public String getVrownote () {
return (String) this.getAttributeValue( XsfpBVO.VROWNOTE);
 } 

/** 
* ���ñ�ע
*
* @param vrownote ��ע
*/
public void setVrownote ( String vrownote) {
this.setAttributeValue( XsfpBVO.VROWNOTE,vrownote);
 } 

/** 
* ��ȡ��Դ���ݺ�
*
* @return ��Դ���ݺ�
*/
public String getVsrccode () {
return (String) this.getAttributeValue( XsfpBVO.VSRCCODE);
 } 

/** 
* ������Դ���ݺ�
*
* @param vsrccode ��Դ���ݺ�
*/
public void setVsrccode ( String vsrccode) {
this.setAttributeValue( XsfpBVO.VSRCCODE,vsrccode);
 } 

/** 
* ��ȡ��Դ�����к�
*
* @return ��Դ�����к�
*/
public String getVsrcrowno () {
return (String) this.getAttributeValue( XsfpBVO.VSRCROWNO);
 } 

/** 
* ������Դ�����к�
*
* @param vsrcrowno ��Դ�����к�
*/
public void setVsrcrowno ( String vsrcrowno) {
this.setAttributeValue( XsfpBVO.VSRCROWNO,vsrcrowno);
 } 

/** 
* ��ȡ��Դ��������
*
* @return ��Դ��������
*/
public String getVsrctrantype () {
return (String) this.getAttributeValue( XsfpBVO.VSRCTRANTYPE);
 } 

/** 
* ������Դ��������
*
* @param vsrctrantype ��Դ��������
*/
public void setVsrctrantype ( String vsrctrantype) {
this.setAttributeValue( XsfpBVO.VSRCTRANTYPE,vsrctrantype);
 } 

/** 
* ��ȡ��Դ��������
*
* @return ��Դ��������
*/
public String getVsrctype () {
return (String) this.getAttributeValue( XsfpBVO.VSRCTYPE);
 } 

/** 
* ������Դ��������
*
* @param vsrctype ��Դ��������
*/
public void setVsrctype ( String vsrctype) {
this.setAttributeValue( XsfpBVO.VSRCTYPE,vsrctype);
 } 

/** 
* ��ȡ���Ļ��ܺ�
*
* @return ���Ļ��ܺ�
*/
public String getVsumcode () {
return (String) this.getAttributeValue( XsfpBVO.VSUMCODE);
 } 

/** 
* �������Ļ��ܺ�
*
* @param vsumcode ���Ļ��ܺ�
*/
public void setVsumcode ( String vsumcode) {
this.setAttributeValue( XsfpBVO.VSUMCODE,vsumcode);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("devlu.xsfp_b");
  }
}