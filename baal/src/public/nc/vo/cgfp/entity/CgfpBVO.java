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
*客户
*/
public static final String CASSCUSTID="casscustid";
/**
*单位
*/
public static final String CASTUNITID="castunitid";
/**
*源头单据行主键
*/
public static final String CFIRSTBID="cfirstbid";
/**
*源头单据主键
*/
public static final String CFIRSTID="cfirstid";
/**
*源头单据类型
*/
public static final String CFIRSTTYPECODE="cfirsttypecode";
/**
*生产厂商
*/
public static final String CPRODUCTORID="cproductorid";
/**
*项目
*/
public static final String CPROJECTID="cprojectid";
/**
*项目任务
*/
public static final String CPROJECTTASKID="cprojecttaskid";
/**
*质量等级
*/
public static final String CQUALITYLEVELID="cqualitylevelid";
/**
*行号
*/
public static final String CROWNO="crowno";
/**
*来源单据行主键
*/
public static final String CSOURCEBID="csourcebid";
/**
*来源单据主键
*/
public static final String CSOURCEID="csourceid";
/**
*来源单据类型
*/
public static final String CSOURCETYPECODE="csourcetypecode";
/**
*税码
*/
public static final String CTAXCODEID="ctaxcodeid";
/**
*主单位
*/
public static final String CUNITID="cunitid";
/**
*发票日期
*/
public static final String DBILLDATE="dbilldate";
/**
*来源单据日期
*/
public static final String DSOURCEDATE="dsourcedate";
/**
*firstbts（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String FIRSTBTS="firstbts";
/**
*firstts（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String FIRSTTS="firstts";
/**
*行类型
*/
public static final String FROWTYPE="frowtype";
/**
*扣税类别
*/
public static final String FTAXTYPEFLAG="ftaxtypeflag";
/**
*累计本币结算金额
*/
public static final String NACCUMSETTMNY="naccumsettmny";
/**
*累计结算主数量
*/
public static final String NACCUMSETTNUM="naccumsettnum";
/**
*数量
*/
public static final String NASTNUM="nastnum";
/**
*无税单价
*/
public static final String NASTORIGPRICE="nastorigprice";
/**
*含税单价
*/
public static final String NASTORIGTAXPRICE="nastorigtaxprice";
/**
*本币无税单价
*/
public static final String NASTPRICE="nastprice";
/**
*本币含税单价
*/
public static final String NASTTAXPRICE="nasttaxprice";
/**
*计成本金额
*/
public static final String NCALCOSTMNY="ncalcostmny";
/**
*计税金额
*/
public static final String NCALTAXMNY="ncaltaxmny";
/**
*全局本币无税金额
*/
public static final String NGLOBALMNY="nglobalmny";
/**
*全局本币价税合计
*/
public static final String NGLOBALTAXMNY="nglobaltaxmny";
/**
*集团本币无税金额
*/
public static final String NGROUPMNY="ngroupmny";
/**
*集团本币价税合计
*/
public static final String NGROUPTAXMNY="ngrouptaxmny";
/**
*本币无税金额
*/
public static final String NMNY="nmny";
/**
*不可抵扣税额
*/
public static final String NNOSUBTAX="nnosubtax";
/**
*不可抵扣税率
*/
public static final String NNOSUBTAXRATE="nnosubtaxrate";
/**
*主数量
*/
public static final String NNUM="nnum";
/**
*nnumwrbck（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String NNUMWRBCK="nnumwrbck";
/**
*无税金额
*/
public static final String NORIGMNY="norigmny";
/**
*主无税单价
*/
public static final String NORIGPRICE="norigprice";
/**
*价税合计
*/
public static final String NORIGTAXMNY="norigtaxmny";
/**
*主含税单价
*/
public static final String NORIGTAXPRICE="norigtaxprice";
/**
*nplanprice（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String NPLANPRICE="nplanprice";
/**
*主本币无税单价
*/
public static final String NPRICE="nprice";
/**
*合理损耗主数量
*/
public static final String NREASONWASTENUM="nreasonwastenum";
/**
*nsourcenum（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String NSOURCENUM="nsourcenum";
/**
*税额
*/
public static final String NTAX="ntax";
/**
*本币价税合计
*/
public static final String NTAXMNY="ntaxmny";
/**
*主本币含税单价
*/
public static final String NTAXPRICE="ntaxprice";
/**
*税率
*/
public static final String NTAXRATE="ntaxrate";
/**
*应付财务组织
*/
public static final String PK_APFINANCEORG="pk_apfinanceorg";
/**
*应付财务组织
*/
public static final String PK_APFINANCEORG_V="pk_apfinanceorg_v";
/**
*利润中心
*/
public static final String PK_APLIABCENTER="pk_apliabcenter";
/**
*利润中心
*/
public static final String PK_APLIABCENTER_V="pk_apliabcenter_v";
/**
*批次档案
*/
public static final String PK_BATCHCODE="pk_batchcode";
/**
*上层单据主键
*/
public static final String PK_CGFP="pk_cgfp";
/**
*采购发票明细
*/
public static final String PK_CGFP_B="pk_cgfp_b";
/**
*收支项目
*/
public static final String PK_COSTSUBJ="pk_costsubj";
/**
*所属集团
*/
public static final String PK_GROUP="pk_group";
/**
*物料版本
*/
public static final String PK_MATERIAL="pk_material";
/**
*订单主键
*/
public static final String PK_ORDER="pk_order";
/**
*订单行主键
*/
public static final String PK_ORDER_B="pk_order_b";
/**
*财务组织
*/
public static final String PK_ORG="pk_org";
/**
*财务组织
*/
public static final String PK_ORG_V="pk_org_v";
/**
*物料
*/
public static final String PK_SRCMATERIAL="pk_srcmaterial";
/**
*pk_stockps_b（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String PK_STOCKPS_B="pk_stockps_b";
/**
*仓库
*/
public static final String PK_STORDOC="pk_stordoc";
/**
*供应商
*/
public static final String PK_SUPPLIER="pk_supplier";
/**
*使用部门最新版本
*/
public static final String PK_USEDEPT="pk_usedept";
/**
*使用部门
*/
public static final String PK_USEDEPT_V="pk_usedept_v";
/**
*sourcebts（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String SOURCEBTS="sourcebts";
/**
*sourcets（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String SOURCETS="sourcets";
/**
*时间戳
*/
public static final String TS="ts";
/**
*批次号
*/
public static final String VBATCHCODE="vbatchcode";
/**
*自定义项1
*/
public static final String VBDEF1="vbdef1";
/**
*自定义项10
*/
public static final String VBDEF10="vbdef10";
/**
*自定义项11
*/
public static final String VBDEF11="vbdef11";
/**
*自定义项12
*/
public static final String VBDEF12="vbdef12";
/**
*自定义项13
*/
public static final String VBDEF13="vbdef13";
/**
*自定义项14
*/
public static final String VBDEF14="vbdef14";
/**
*自定义项15
*/
public static final String VBDEF15="vbdef15";
/**
*自定义项16
*/
public static final String VBDEF16="vbdef16";
/**
*自定义项17
*/
public static final String VBDEF17="vbdef17";
/**
*自定义项18
*/
public static final String VBDEF18="vbdef18";
/**
*自定义项19
*/
public static final String VBDEF19="vbdef19";
/**
*自定义项2
*/
public static final String VBDEF2="vbdef2";
/**
*自定义项20
*/
public static final String VBDEF20="vbdef20";
/**
*自定义项3
*/
public static final String VBDEF3="vbdef3";
/**
*自定义项4
*/
public static final String VBDEF4="vbdef4";
/**
*自定义项5
*/
public static final String VBDEF5="vbdef5";
/**
*自定义项6
*/
public static final String VBDEF6="vbdef6";
/**
*自定义项7
*/
public static final String VBDEF7="vbdef7";
/**
*自定义项8
*/
public static final String VBDEF8="vbdef8";
/**
*自定义项9
*/
public static final String VBDEF9="vbdef9";
/**
*换算率
*/
public static final String VCHANGERATE="vchangerate";
/**
*合同号
*/
public static final String VCTCODE="vctcode";
/**
*源头单据号
*/
public static final String VFIRSTCODE="vfirstcode";
/**
*源头单据行号
*/
public static final String VFIRSTROWNO="vfirstrowno";
/**
*源头交易类型
*/
public static final String VFIRSTTRANTYPE="vfirsttrantype";
/**
*自由辅助属性1
*/
public static final String VFREE1="vfree1";
/**
*自由辅助属性10
*/
public static final String VFREE10="vfree10";
/**
*自由辅助属性2
*/
public static final String VFREE2="vfree2";
/**
*自由辅助属性3
*/
public static final String VFREE3="vfree3";
/**
*自由辅助属性4
*/
public static final String VFREE4="vfree4";
/**
*自由辅助属性5
*/
public static final String VFREE5="vfree5";
/**
*自由辅助属性6
*/
public static final String VFREE6="vfree6";
/**
*自由辅助属性7
*/
public static final String VFREE7="vfree7";
/**
*自由辅助属性8
*/
public static final String VFREE8="vfree8";
/**
*自由辅助属性9
*/
public static final String VFREE9="vfree9";
/**
*备注
*/
public static final String VMEMOB="vmemob";
/**
*订单号
*/
public static final String VORDERCODE="vordercode";
/**
*订单交易类型
*/
public static final String VORDERTRANTYPE="vordertrantype";
/**
*来源单据号
*/
public static final String VSOURCECODE="vsourcecode";
/**
*来源单据行号
*/
public static final String VSOURCEROWNO="vsourcerowno";
/**
*来源交易类型
*/
public static final String VSOURCETRANTYPE="vsourcetrantype";
/** 
* 获取客户
*
* @return 客户
*/
public String getCasscustid () {
return (String) this.getAttributeValue( CgfpBVO.CASSCUSTID);
 } 

/** 
* 设置客户
*
* @param casscustid 客户
*/
public void setCasscustid ( String casscustid) {
this.setAttributeValue( CgfpBVO.CASSCUSTID,casscustid);
 } 

/** 
* 获取单位
*
* @return 单位
*/
public String getCastunitid () {
return (String) this.getAttributeValue( CgfpBVO.CASTUNITID);
 } 

/** 
* 设置单位
*
* @param castunitid 单位
*/
public void setCastunitid ( String castunitid) {
this.setAttributeValue( CgfpBVO.CASTUNITID,castunitid);
 } 

/** 
* 获取源头单据行主键
*
* @return 源头单据行主键
*/
public String getCfirstbid () {
return (String) this.getAttributeValue( CgfpBVO.CFIRSTBID);
 } 

/** 
* 设置源头单据行主键
*
* @param cfirstbid 源头单据行主键
*/
public void setCfirstbid ( String cfirstbid) {
this.setAttributeValue( CgfpBVO.CFIRSTBID,cfirstbid);
 } 

/** 
* 获取源头单据主键
*
* @return 源头单据主键
*/
public String getCfirstid () {
return (String) this.getAttributeValue( CgfpBVO.CFIRSTID);
 } 

/** 
* 设置源头单据主键
*
* @param cfirstid 源头单据主键
*/
public void setCfirstid ( String cfirstid) {
this.setAttributeValue( CgfpBVO.CFIRSTID,cfirstid);
 } 

/** 
* 获取源头单据类型
*
* @return 源头单据类型
*/
public String getCfirsttypecode () {
return (String) this.getAttributeValue( CgfpBVO.CFIRSTTYPECODE);
 } 

/** 
* 设置源头单据类型
*
* @param cfirsttypecode 源头单据类型
*/
public void setCfirsttypecode ( String cfirsttypecode) {
this.setAttributeValue( CgfpBVO.CFIRSTTYPECODE,cfirsttypecode);
 } 

/** 
* 获取生产厂商
*
* @return 生产厂商
*/
public String getCproductorid () {
return (String) this.getAttributeValue( CgfpBVO.CPRODUCTORID);
 } 

/** 
* 设置生产厂商
*
* @param cproductorid 生产厂商
*/
public void setCproductorid ( String cproductorid) {
this.setAttributeValue( CgfpBVO.CPRODUCTORID,cproductorid);
 } 

/** 
* 获取项目
*
* @return 项目
*/
public String getCprojectid () {
return (String) this.getAttributeValue( CgfpBVO.CPROJECTID);
 } 

/** 
* 设置项目
*
* @param cprojectid 项目
*/
public void setCprojectid ( String cprojectid) {
this.setAttributeValue( CgfpBVO.CPROJECTID,cprojectid);
 } 

/** 
* 获取项目任务
*
* @return 项目任务
*/
public String getCprojecttaskid () {
return (String) this.getAttributeValue( CgfpBVO.CPROJECTTASKID);
 } 

/** 
* 设置项目任务
*
* @param cprojecttaskid 项目任务
*/
public void setCprojecttaskid ( String cprojecttaskid) {
this.setAttributeValue( CgfpBVO.CPROJECTTASKID,cprojecttaskid);
 } 

/** 
* 获取质量等级
*
* @return 质量等级
*/
public String getCqualitylevelid () {
return (String) this.getAttributeValue( CgfpBVO.CQUALITYLEVELID);
 } 

/** 
* 设置质量等级
*
* @param cqualitylevelid 质量等级
*/
public void setCqualitylevelid ( String cqualitylevelid) {
this.setAttributeValue( CgfpBVO.CQUALITYLEVELID,cqualitylevelid);
 } 

/** 
* 获取行号
*
* @return 行号
*/
public String getCrowno () {
return (String) this.getAttributeValue( CgfpBVO.CROWNO);
 } 

/** 
* 设置行号
*
* @param crowno 行号
*/
public void setCrowno ( String crowno) {
this.setAttributeValue( CgfpBVO.CROWNO,crowno);
 } 

/** 
* 获取来源单据行主键
*
* @return 来源单据行主键
*/
public String getCsourcebid () {
return (String) this.getAttributeValue( CgfpBVO.CSOURCEBID);
 } 

/** 
* 设置来源单据行主键
*
* @param csourcebid 来源单据行主键
*/
public void setCsourcebid ( String csourcebid) {
this.setAttributeValue( CgfpBVO.CSOURCEBID,csourcebid);
 } 

/** 
* 获取来源单据主键
*
* @return 来源单据主键
*/
public String getCsourceid () {
return (String) this.getAttributeValue( CgfpBVO.CSOURCEID);
 } 

/** 
* 设置来源单据主键
*
* @param csourceid 来源单据主键
*/
public void setCsourceid ( String csourceid) {
this.setAttributeValue( CgfpBVO.CSOURCEID,csourceid);
 } 

/** 
* 获取来源单据类型
*
* @return 来源单据类型
*/
public String getCsourcetypecode () {
return (String) this.getAttributeValue( CgfpBVO.CSOURCETYPECODE);
 } 

/** 
* 设置来源单据类型
*
* @param csourcetypecode 来源单据类型
*/
public void setCsourcetypecode ( String csourcetypecode) {
this.setAttributeValue( CgfpBVO.CSOURCETYPECODE,csourcetypecode);
 } 

/** 
* 获取税码
*
* @return 税码
*/
public String getCtaxcodeid () {
return (String) this.getAttributeValue( CgfpBVO.CTAXCODEID);
 } 

/** 
* 设置税码
*
* @param ctaxcodeid 税码
*/
public void setCtaxcodeid ( String ctaxcodeid) {
this.setAttributeValue( CgfpBVO.CTAXCODEID,ctaxcodeid);
 } 

/** 
* 获取主单位
*
* @return 主单位
*/
public String getCunitid () {
return (String) this.getAttributeValue( CgfpBVO.CUNITID);
 } 

/** 
* 设置主单位
*
* @param cunitid 主单位
*/
public void setCunitid ( String cunitid) {
this.setAttributeValue( CgfpBVO.CUNITID,cunitid);
 } 

/** 
* 获取发票日期
*
* @return 发票日期
*/
public UFDate getDbilldate () {
return (UFDate) this.getAttributeValue( CgfpBVO.DBILLDATE);
 } 

/** 
* 设置发票日期
*
* @param dbilldate 发票日期
*/
public void setDbilldate ( UFDate dbilldate) {
this.setAttributeValue( CgfpBVO.DBILLDATE,dbilldate);
 } 

/** 
* 获取来源单据日期
*
* @return 来源单据日期
*/
public UFDate getDsourcedate () {
return (UFDate) this.getAttributeValue( CgfpBVO.DSOURCEDATE);
 } 

/** 
* 设置来源单据日期
*
* @param dsourcedate 来源单据日期
*/
public void setDsourcedate ( UFDate dsourcedate) {
this.setAttributeValue( CgfpBVO.DSOURCEDATE,dsourcedate);
 } 

/** 
* 获取firstbts（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return firstbts
*/
public UFDateTime getFirstbts () {
return (UFDateTime) this.getAttributeValue( CgfpBVO.FIRSTBTS);
 } 

/** 
* 设置firstbts（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param firstbts firstbts
*/
public void setFirstbts ( UFDateTime firstbts) {
this.setAttributeValue( CgfpBVO.FIRSTBTS,firstbts);
 } 

/** 
* 获取firstts（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return firstts
*/
public UFDateTime getFirstts () {
return (UFDateTime) this.getAttributeValue( CgfpBVO.FIRSTTS);
 } 

/** 
* 设置firstts（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param firstts firstts
*/
public void setFirstts ( UFDateTime firstts) {
this.setAttributeValue( CgfpBVO.FIRSTTS,firstts);
 } 

/** 
* 获取行类型
*
* @return 行类型
* @see String
*/
public Integer getFrowtype () {
return (Integer) this.getAttributeValue( CgfpBVO.FROWTYPE);
 } 

/** 
* 设置行类型
*
* @param frowtype 行类型
* @see String
*/
public void setFrowtype ( Integer frowtype) {
this.setAttributeValue( CgfpBVO.FROWTYPE,frowtype);
 } 

/** 
* 获取扣税类别
*
* @return 扣税类别
* @see String
*/
public Integer getFtaxtypeflag () {
return (Integer) this.getAttributeValue( CgfpBVO.FTAXTYPEFLAG);
 } 

/** 
* 设置扣税类别
*
* @param ftaxtypeflag 扣税类别
* @see String
*/
public void setFtaxtypeflag ( Integer ftaxtypeflag) {
this.setAttributeValue( CgfpBVO.FTAXTYPEFLAG,ftaxtypeflag);
 } 

/** 
* 获取累计本币结算金额
*
* @return 累计本币结算金额
*/
public UFDouble getNaccumsettmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NACCUMSETTMNY);
 } 

/** 
* 设置累计本币结算金额
*
* @param naccumsettmny 累计本币结算金额
*/
public void setNaccumsettmny ( UFDouble naccumsettmny) {
this.setAttributeValue( CgfpBVO.NACCUMSETTMNY,naccumsettmny);
 } 

/** 
* 获取累计结算主数量
*
* @return 累计结算主数量
*/
public UFDouble getNaccumsettnum () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NACCUMSETTNUM);
 } 

/** 
* 设置累计结算主数量
*
* @param naccumsettnum 累计结算主数量
*/
public void setNaccumsettnum ( UFDouble naccumsettnum) {
this.setAttributeValue( CgfpBVO.NACCUMSETTNUM,naccumsettnum);
 } 

/** 
* 获取数量
*
* @return 数量
*/
public UFDouble getNastnum () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NASTNUM);
 } 

/** 
* 设置数量
*
* @param nastnum 数量
*/
public void setNastnum ( UFDouble nastnum) {
this.setAttributeValue( CgfpBVO.NASTNUM,nastnum);
 } 

/** 
* 获取无税单价
*
* @return 无税单价
*/
public UFDouble getNastorigprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NASTORIGPRICE);
 } 

/** 
* 设置无税单价
*
* @param nastorigprice 无税单价
*/
public void setNastorigprice ( UFDouble nastorigprice) {
this.setAttributeValue( CgfpBVO.NASTORIGPRICE,nastorigprice);
 } 

/** 
* 获取含税单价
*
* @return 含税单价
*/
public UFDouble getNastorigtaxprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NASTORIGTAXPRICE);
 } 

/** 
* 设置含税单价
*
* @param nastorigtaxprice 含税单价
*/
public void setNastorigtaxprice ( UFDouble nastorigtaxprice) {
this.setAttributeValue( CgfpBVO.NASTORIGTAXPRICE,nastorigtaxprice);
 } 

/** 
* 获取本币无税单价
*
* @return 本币无税单价
*/
public UFDouble getNastprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NASTPRICE);
 } 

/** 
* 设置本币无税单价
*
* @param nastprice 本币无税单价
*/
public void setNastprice ( UFDouble nastprice) {
this.setAttributeValue( CgfpBVO.NASTPRICE,nastprice);
 } 

/** 
* 获取本币含税单价
*
* @return 本币含税单价
*/
public UFDouble getNasttaxprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NASTTAXPRICE);
 } 

/** 
* 设置本币含税单价
*
* @param nasttaxprice 本币含税单价
*/
public void setNasttaxprice ( UFDouble nasttaxprice) {
this.setAttributeValue( CgfpBVO.NASTTAXPRICE,nasttaxprice);
 } 

/** 
* 获取计成本金额
*
* @return 计成本金额
*/
public UFDouble getNcalcostmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NCALCOSTMNY);
 } 

/** 
* 设置计成本金额
*
* @param ncalcostmny 计成本金额
*/
public void setNcalcostmny ( UFDouble ncalcostmny) {
this.setAttributeValue( CgfpBVO.NCALCOSTMNY,ncalcostmny);
 } 

/** 
* 获取计税金额
*
* @return 计税金额
*/
public UFDouble getNcaltaxmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NCALTAXMNY);
 } 

/** 
* 设置计税金额
*
* @param ncaltaxmny 计税金额
*/
public void setNcaltaxmny ( UFDouble ncaltaxmny) {
this.setAttributeValue( CgfpBVO.NCALTAXMNY,ncaltaxmny);
 } 

/** 
* 获取全局本币无税金额
*
* @return 全局本币无税金额
*/
public UFDouble getNglobalmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NGLOBALMNY);
 } 

/** 
* 设置全局本币无税金额
*
* @param nglobalmny 全局本币无税金额
*/
public void setNglobalmny ( UFDouble nglobalmny) {
this.setAttributeValue( CgfpBVO.NGLOBALMNY,nglobalmny);
 } 

/** 
* 获取全局本币价税合计
*
* @return 全局本币价税合计
*/
public UFDouble getNglobaltaxmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NGLOBALTAXMNY);
 } 

/** 
* 设置全局本币价税合计
*
* @param nglobaltaxmny 全局本币价税合计
*/
public void setNglobaltaxmny ( UFDouble nglobaltaxmny) {
this.setAttributeValue( CgfpBVO.NGLOBALTAXMNY,nglobaltaxmny);
 } 

/** 
* 获取集团本币无税金额
*
* @return 集团本币无税金额
*/
public UFDouble getNgroupmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NGROUPMNY);
 } 

/** 
* 设置集团本币无税金额
*
* @param ngroupmny 集团本币无税金额
*/
public void setNgroupmny ( UFDouble ngroupmny) {
this.setAttributeValue( CgfpBVO.NGROUPMNY,ngroupmny);
 } 

/** 
* 获取集团本币价税合计
*
* @return 集团本币价税合计
*/
public UFDouble getNgrouptaxmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NGROUPTAXMNY);
 } 

/** 
* 设置集团本币价税合计
*
* @param ngrouptaxmny 集团本币价税合计
*/
public void setNgrouptaxmny ( UFDouble ngrouptaxmny) {
this.setAttributeValue( CgfpBVO.NGROUPTAXMNY,ngrouptaxmny);
 } 

/** 
* 获取本币无税金额
*
* @return 本币无税金额
*/
public UFDouble getNmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NMNY);
 } 

/** 
* 设置本币无税金额
*
* @param nmny 本币无税金额
*/
public void setNmny ( UFDouble nmny) {
this.setAttributeValue( CgfpBVO.NMNY,nmny);
 } 

/** 
* 获取不可抵扣税额
*
* @return 不可抵扣税额
*/
public UFDouble getNnosubtax () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NNOSUBTAX);
 } 

/** 
* 设置不可抵扣税额
*
* @param nnosubtax 不可抵扣税额
*/
public void setNnosubtax ( UFDouble nnosubtax) {
this.setAttributeValue( CgfpBVO.NNOSUBTAX,nnosubtax);
 } 

/** 
* 获取不可抵扣税率
*
* @return 不可抵扣税率
*/
public UFDouble getNnosubtaxrate () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NNOSUBTAXRATE);
 } 

/** 
* 设置不可抵扣税率
*
* @param nnosubtaxrate 不可抵扣税率
*/
public void setNnosubtaxrate ( UFDouble nnosubtaxrate) {
this.setAttributeValue( CgfpBVO.NNOSUBTAXRATE,nnosubtaxrate);
 } 

/** 
* 获取主数量
*
* @return 主数量
*/
public UFDouble getNnum () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NNUM);
 } 

/** 
* 设置主数量
*
* @param nnum 主数量
*/
public void setNnum ( UFDouble nnum) {
this.setAttributeValue( CgfpBVO.NNUM,nnum);
 } 

/** 
* 获取nnumwrbck（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return nnumwrbck
*/
public UFDouble getNnumwrbck () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NNUMWRBCK);
 } 

/** 
* 设置nnumwrbck（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param nnumwrbck nnumwrbck
*/
public void setNnumwrbck ( UFDouble nnumwrbck) {
this.setAttributeValue( CgfpBVO.NNUMWRBCK,nnumwrbck);
 } 

/** 
* 获取无税金额
*
* @return 无税金额
*/
public UFDouble getNorigmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NORIGMNY);
 } 

/** 
* 设置无税金额
*
* @param norigmny 无税金额
*/
public void setNorigmny ( UFDouble norigmny) {
this.setAttributeValue( CgfpBVO.NORIGMNY,norigmny);
 } 

/** 
* 获取主无税单价
*
* @return 主无税单价
*/
public UFDouble getNorigprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NORIGPRICE);
 } 

/** 
* 设置主无税单价
*
* @param norigprice 主无税单价
*/
public void setNorigprice ( UFDouble norigprice) {
this.setAttributeValue( CgfpBVO.NORIGPRICE,norigprice);
 } 

/** 
* 获取价税合计
*
* @return 价税合计
*/
public UFDouble getNorigtaxmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NORIGTAXMNY);
 } 

/** 
* 设置价税合计
*
* @param norigtaxmny 价税合计
*/
public void setNorigtaxmny ( UFDouble norigtaxmny) {
this.setAttributeValue( CgfpBVO.NORIGTAXMNY,norigtaxmny);
 } 

/** 
* 获取主含税单价
*
* @return 主含税单价
*/
public UFDouble getNorigtaxprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NORIGTAXPRICE);
 } 

/** 
* 设置主含税单价
*
* @param norigtaxprice 主含税单价
*/
public void setNorigtaxprice ( UFDouble norigtaxprice) {
this.setAttributeValue( CgfpBVO.NORIGTAXPRICE,norigtaxprice);
 } 

/** 
* 获取nplanprice（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return nplanprice
*/
public UFDouble getNplanprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NPLANPRICE);
 } 

/** 
* 设置nplanprice（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param nplanprice nplanprice
*/
public void setNplanprice ( UFDouble nplanprice) {
this.setAttributeValue( CgfpBVO.NPLANPRICE,nplanprice);
 } 

/** 
* 获取主本币无税单价
*
* @return 主本币无税单价
*/
public UFDouble getNprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NPRICE);
 } 

/** 
* 设置主本币无税单价
*
* @param nprice 主本币无税单价
*/
public void setNprice ( UFDouble nprice) {
this.setAttributeValue( CgfpBVO.NPRICE,nprice);
 } 

/** 
* 获取合理损耗主数量
*
* @return 合理损耗主数量
*/
public UFDouble getNreasonwastenum () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NREASONWASTENUM);
 } 

/** 
* 设置合理损耗主数量
*
* @param nreasonwastenum 合理损耗主数量
*/
public void setNreasonwastenum ( UFDouble nreasonwastenum) {
this.setAttributeValue( CgfpBVO.NREASONWASTENUM,nreasonwastenum);
 } 

/** 
* 获取nsourcenum（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return nsourcenum
*/
public UFDouble getNsourcenum () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NSOURCENUM);
 } 

/** 
* 设置nsourcenum（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param nsourcenum nsourcenum
*/
public void setNsourcenum ( UFDouble nsourcenum) {
this.setAttributeValue( CgfpBVO.NSOURCENUM,nsourcenum);
 } 

/** 
* 获取税额
*
* @return 税额
*/
public UFDouble getNtax () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NTAX);
 } 

/** 
* 设置税额
*
* @param ntax 税额
*/
public void setNtax ( UFDouble ntax) {
this.setAttributeValue( CgfpBVO.NTAX,ntax);
 } 

/** 
* 获取本币价税合计
*
* @return 本币价税合计
*/
public UFDouble getNtaxmny () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NTAXMNY);
 } 

/** 
* 设置本币价税合计
*
* @param ntaxmny 本币价税合计
*/
public void setNtaxmny ( UFDouble ntaxmny) {
this.setAttributeValue( CgfpBVO.NTAXMNY,ntaxmny);
 } 

/** 
* 获取主本币含税单价
*
* @return 主本币含税单价
*/
public UFDouble getNtaxprice () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NTAXPRICE);
 } 

/** 
* 设置主本币含税单价
*
* @param ntaxprice 主本币含税单价
*/
public void setNtaxprice ( UFDouble ntaxprice) {
this.setAttributeValue( CgfpBVO.NTAXPRICE,ntaxprice);
 } 

/** 
* 获取税率
*
* @return 税率
*/
public UFDouble getNtaxrate () {
return (UFDouble) this.getAttributeValue( CgfpBVO.NTAXRATE);
 } 

/** 
* 设置税率
*
* @param ntaxrate 税率
*/
public void setNtaxrate ( UFDouble ntaxrate) {
this.setAttributeValue( CgfpBVO.NTAXRATE,ntaxrate);
 } 

/** 
* 获取应付财务组织
*
* @return 应付财务组织
*/
public String getPk_apfinanceorg () {
return (String) this.getAttributeValue( CgfpBVO.PK_APFINANCEORG);
 } 

/** 
* 设置应付财务组织
*
* @param pk_apfinanceorg 应付财务组织
*/
public void setPk_apfinanceorg ( String pk_apfinanceorg) {
this.setAttributeValue( CgfpBVO.PK_APFINANCEORG,pk_apfinanceorg);
 } 

/** 
* 获取应付财务组织
*
* @return 应付财务组织
*/
public String getPk_apfinanceorg_v () {
return (String) this.getAttributeValue( CgfpBVO.PK_APFINANCEORG_V);
 } 

/** 
* 设置应付财务组织
*
* @param pk_apfinanceorg_v 应付财务组织
*/
public void setPk_apfinanceorg_v ( String pk_apfinanceorg_v) {
this.setAttributeValue( CgfpBVO.PK_APFINANCEORG_V,pk_apfinanceorg_v);
 } 

/** 
* 获取利润中心
*
* @return 利润中心
*/
public String getPk_apliabcenter () {
return (String) this.getAttributeValue( CgfpBVO.PK_APLIABCENTER);
 } 

/** 
* 设置利润中心
*
* @param pk_apliabcenter 利润中心
*/
public void setPk_apliabcenter ( String pk_apliabcenter) {
this.setAttributeValue( CgfpBVO.PK_APLIABCENTER,pk_apliabcenter);
 } 

/** 
* 获取利润中心
*
* @return 利润中心
*/
public String getPk_apliabcenter_v () {
return (String) this.getAttributeValue( CgfpBVO.PK_APLIABCENTER_V);
 } 

/** 
* 设置利润中心
*
* @param pk_apliabcenter_v 利润中心
*/
public void setPk_apliabcenter_v ( String pk_apliabcenter_v) {
this.setAttributeValue( CgfpBVO.PK_APLIABCENTER_V,pk_apliabcenter_v);
 } 

/** 
* 获取批次档案
*
* @return 批次档案
*/
public String getPk_batchcode () {
return (String) this.getAttributeValue( CgfpBVO.PK_BATCHCODE);
 } 

/** 
* 设置批次档案
*
* @param pk_batchcode 批次档案
*/
public void setPk_batchcode ( String pk_batchcode) {
this.setAttributeValue( CgfpBVO.PK_BATCHCODE,pk_batchcode);
 } 

/** 
* 获取上层单据主键
*
* @return 上层单据主键
*/
public String getPk_cgfp () {
return (String) this.getAttributeValue( CgfpBVO.PK_CGFP);
 } 

/** 
* 设置上层单据主键
*
* @param pk_cgfp 上层单据主键
*/
public void setPk_cgfp ( String pk_cgfp) {
this.setAttributeValue( CgfpBVO.PK_CGFP,pk_cgfp);
 } 

/** 
* 获取采购发票明细
*
* @return 采购发票明细
*/
public String getPk_cgfp_b () {
return (String) this.getAttributeValue( CgfpBVO.PK_CGFP_B);
 } 

/** 
* 设置采购发票明细
*
* @param pk_cgfp_b 采购发票明细
*/
public void setPk_cgfp_b ( String pk_cgfp_b) {
this.setAttributeValue( CgfpBVO.PK_CGFP_B,pk_cgfp_b);
 } 

/** 
* 获取收支项目
*
* @return 收支项目
*/
public String getPk_costsubj () {
return (String) this.getAttributeValue( CgfpBVO.PK_COSTSUBJ);
 } 

/** 
* 设置收支项目
*
* @param pk_costsubj 收支项目
*/
public void setPk_costsubj ( String pk_costsubj) {
this.setAttributeValue( CgfpBVO.PK_COSTSUBJ,pk_costsubj);
 } 

/** 
* 获取所属集团
*
* @return 所属集团
*/
public String getPk_group () {
return (String) this.getAttributeValue( CgfpBVO.PK_GROUP);
 } 

/** 
* 设置所属集团
*
* @param pk_group 所属集团
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( CgfpBVO.PK_GROUP,pk_group);
 } 

/** 
* 获取物料版本
*
* @return 物料版本
*/
public String getPk_material () {
return (String) this.getAttributeValue( CgfpBVO.PK_MATERIAL);
 } 

/** 
* 设置物料版本
*
* @param pk_material 物料版本
*/
public void setPk_material ( String pk_material) {
this.setAttributeValue( CgfpBVO.PK_MATERIAL,pk_material);
 } 

/** 
* 获取订单主键
*
* @return 订单主键
*/
public String getPk_order () {
return (String) this.getAttributeValue( CgfpBVO.PK_ORDER);
 } 

/** 
* 设置订单主键
*
* @param pk_order 订单主键
*/
public void setPk_order ( String pk_order) {
this.setAttributeValue( CgfpBVO.PK_ORDER,pk_order);
 } 

/** 
* 获取订单行主键
*
* @return 订单行主键
*/
public String getPk_order_b () {
return (String) this.getAttributeValue( CgfpBVO.PK_ORDER_B);
 } 

/** 
* 设置订单行主键
*
* @param pk_order_b 订单行主键
*/
public void setPk_order_b ( String pk_order_b) {
this.setAttributeValue( CgfpBVO.PK_ORDER_B,pk_order_b);
 } 

/** 
* 获取财务组织
*
* @return 财务组织
*/
public String getPk_org () {
return (String) this.getAttributeValue( CgfpBVO.PK_ORG);
 } 

/** 
* 设置财务组织
*
* @param pk_org 财务组织
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( CgfpBVO.PK_ORG,pk_org);
 } 

/** 
* 获取财务组织
*
* @return 财务组织
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( CgfpBVO.PK_ORG_V);
 } 

/** 
* 设置财务组织
*
* @param pk_org_v 财务组织
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( CgfpBVO.PK_ORG_V,pk_org_v);
 } 

/** 
* 获取物料
*
* @return 物料
*/
public String getPk_srcmaterial () {
return (String) this.getAttributeValue( CgfpBVO.PK_SRCMATERIAL);
 } 

/** 
* 设置物料
*
* @param pk_srcmaterial 物料
*/
public void setPk_srcmaterial ( String pk_srcmaterial) {
this.setAttributeValue( CgfpBVO.PK_SRCMATERIAL,pk_srcmaterial);
 } 

/** 
* 获取pk_stockps_b（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return pk_stockps_b
*/
public String getPk_stockps_b () {
return (String) this.getAttributeValue( CgfpBVO.PK_STOCKPS_B);
 } 

/** 
* 设置pk_stockps_b（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param pk_stockps_b pk_stockps_b
*/
public void setPk_stockps_b ( String pk_stockps_b) {
this.setAttributeValue( CgfpBVO.PK_STOCKPS_B,pk_stockps_b);
 } 

/** 
* 获取仓库
*
* @return 仓库
*/
public String getPk_stordoc () {
return (String) this.getAttributeValue( CgfpBVO.PK_STORDOC);
 } 

/** 
* 设置仓库
*
* @param pk_stordoc 仓库
*/
public void setPk_stordoc ( String pk_stordoc) {
this.setAttributeValue( CgfpBVO.PK_STORDOC,pk_stordoc);
 } 

/** 
* 获取供应商
*
* @return 供应商
*/
public String getPk_supplier () {
return (String) this.getAttributeValue( CgfpBVO.PK_SUPPLIER);
 } 

/** 
* 设置供应商
*
* @param pk_supplier 供应商
*/
public void setPk_supplier ( String pk_supplier) {
this.setAttributeValue( CgfpBVO.PK_SUPPLIER,pk_supplier);
 } 

/** 
* 获取使用部门最新版本
*
* @return 使用部门最新版本
*/
public String getPk_usedept () {
return (String) this.getAttributeValue( CgfpBVO.PK_USEDEPT);
 } 

/** 
* 设置使用部门最新版本
*
* @param pk_usedept 使用部门最新版本
*/
public void setPk_usedept ( String pk_usedept) {
this.setAttributeValue( CgfpBVO.PK_USEDEPT,pk_usedept);
 } 

/** 
* 获取使用部门
*
* @return 使用部门
*/
public String getPk_usedept_v () {
return (String) this.getAttributeValue( CgfpBVO.PK_USEDEPT_V);
 } 

/** 
* 设置使用部门
*
* @param pk_usedept_v 使用部门
*/
public void setPk_usedept_v ( String pk_usedept_v) {
this.setAttributeValue( CgfpBVO.PK_USEDEPT_V,pk_usedept_v);
 } 

/** 
* 获取sourcebts（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return sourcebts
*/
public UFDateTime getSourcebts () {
return (UFDateTime) this.getAttributeValue( CgfpBVO.SOURCEBTS);
 } 

/** 
* 设置sourcebts（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param sourcebts sourcebts
*/
public void setSourcebts ( UFDateTime sourcebts) {
this.setAttributeValue( CgfpBVO.SOURCEBTS,sourcebts);
 } 

/** 
* 获取sourcets（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return sourcets
*/
public UFDateTime getSourcets () {
return (UFDateTime) this.getAttributeValue( CgfpBVO.SOURCETS);
 } 

/** 
* 设置sourcets（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param sourcets sourcets
*/
public void setSourcets ( UFDateTime sourcets) {
this.setAttributeValue( CgfpBVO.SOURCETS,sourcets);
 } 

/** 
* 获取时间戳
*
* @return 时间戳
*/
public UFDateTime getTs () {
return (UFDateTime) this.getAttributeValue( CgfpBVO.TS);
 } 

/** 
* 设置时间戳
*
* @param ts 时间戳
*/
public void setTs ( UFDateTime ts) {
this.setAttributeValue( CgfpBVO.TS,ts);
 } 

/** 
* 获取批次号
*
* @return 批次号
*/
public String getVbatchcode () {
return (String) this.getAttributeValue( CgfpBVO.VBATCHCODE);
 } 

/** 
* 设置批次号
*
* @param vbatchcode 批次号
*/
public void setVbatchcode ( String vbatchcode) {
this.setAttributeValue( CgfpBVO.VBATCHCODE,vbatchcode);
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getVbdef1 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF1);
 } 

/** 
* 设置自定义项1
*
* @param vbdef1 自定义项1
*/
public void setVbdef1 ( String vbdef1) {
this.setAttributeValue( CgfpBVO.VBDEF1,vbdef1);
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public String getVbdef10 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF10);
 } 

/** 
* 设置自定义项10
*
* @param vbdef10 自定义项10
*/
public void setVbdef10 ( String vbdef10) {
this.setAttributeValue( CgfpBVO.VBDEF10,vbdef10);
 } 

/** 
* 获取自定义项11
*
* @return 自定义项11
*/
public String getVbdef11 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF11);
 } 

/** 
* 设置自定义项11
*
* @param vbdef11 自定义项11
*/
public void setVbdef11 ( String vbdef11) {
this.setAttributeValue( CgfpBVO.VBDEF11,vbdef11);
 } 

/** 
* 获取自定义项12
*
* @return 自定义项12
*/
public String getVbdef12 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF12);
 } 

/** 
* 设置自定义项12
*
* @param vbdef12 自定义项12
*/
public void setVbdef12 ( String vbdef12) {
this.setAttributeValue( CgfpBVO.VBDEF12,vbdef12);
 } 

/** 
* 获取自定义项13
*
* @return 自定义项13
*/
public String getVbdef13 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF13);
 } 

/** 
* 设置自定义项13
*
* @param vbdef13 自定义项13
*/
public void setVbdef13 ( String vbdef13) {
this.setAttributeValue( CgfpBVO.VBDEF13,vbdef13);
 } 

/** 
* 获取自定义项14
*
* @return 自定义项14
*/
public String getVbdef14 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF14);
 } 

/** 
* 设置自定义项14
*
* @param vbdef14 自定义项14
*/
public void setVbdef14 ( String vbdef14) {
this.setAttributeValue( CgfpBVO.VBDEF14,vbdef14);
 } 

/** 
* 获取自定义项15
*
* @return 自定义项15
*/
public String getVbdef15 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF15);
 } 

/** 
* 设置自定义项15
*
* @param vbdef15 自定义项15
*/
public void setVbdef15 ( String vbdef15) {
this.setAttributeValue( CgfpBVO.VBDEF15,vbdef15);
 } 

/** 
* 获取自定义项16
*
* @return 自定义项16
*/
public String getVbdef16 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF16);
 } 

/** 
* 设置自定义项16
*
* @param vbdef16 自定义项16
*/
public void setVbdef16 ( String vbdef16) {
this.setAttributeValue( CgfpBVO.VBDEF16,vbdef16);
 } 

/** 
* 获取自定义项17
*
* @return 自定义项17
*/
public String getVbdef17 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF17);
 } 

/** 
* 设置自定义项17
*
* @param vbdef17 自定义项17
*/
public void setVbdef17 ( String vbdef17) {
this.setAttributeValue( CgfpBVO.VBDEF17,vbdef17);
 } 

/** 
* 获取自定义项18
*
* @return 自定义项18
*/
public String getVbdef18 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF18);
 } 

/** 
* 设置自定义项18
*
* @param vbdef18 自定义项18
*/
public void setVbdef18 ( String vbdef18) {
this.setAttributeValue( CgfpBVO.VBDEF18,vbdef18);
 } 

/** 
* 获取自定义项19
*
* @return 自定义项19
*/
public String getVbdef19 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF19);
 } 

/** 
* 设置自定义项19
*
* @param vbdef19 自定义项19
*/
public void setVbdef19 ( String vbdef19) {
this.setAttributeValue( CgfpBVO.VBDEF19,vbdef19);
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getVbdef2 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF2);
 } 

/** 
* 设置自定义项2
*
* @param vbdef2 自定义项2
*/
public void setVbdef2 ( String vbdef2) {
this.setAttributeValue( CgfpBVO.VBDEF2,vbdef2);
 } 

/** 
* 获取自定义项20
*
* @return 自定义项20
*/
public String getVbdef20 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF20);
 } 

/** 
* 设置自定义项20
*
* @param vbdef20 自定义项20
*/
public void setVbdef20 ( String vbdef20) {
this.setAttributeValue( CgfpBVO.VBDEF20,vbdef20);
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getVbdef3 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF3);
 } 

/** 
* 设置自定义项3
*
* @param vbdef3 自定义项3
*/
public void setVbdef3 ( String vbdef3) {
this.setAttributeValue( CgfpBVO.VBDEF3,vbdef3);
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getVbdef4 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF4);
 } 

/** 
* 设置自定义项4
*
* @param vbdef4 自定义项4
*/
public void setVbdef4 ( String vbdef4) {
this.setAttributeValue( CgfpBVO.VBDEF4,vbdef4);
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getVbdef5 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF5);
 } 

/** 
* 设置自定义项5
*
* @param vbdef5 自定义项5
*/
public void setVbdef5 ( String vbdef5) {
this.setAttributeValue( CgfpBVO.VBDEF5,vbdef5);
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public String getVbdef6 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF6);
 } 

/** 
* 设置自定义项6
*
* @param vbdef6 自定义项6
*/
public void setVbdef6 ( String vbdef6) {
this.setAttributeValue( CgfpBVO.VBDEF6,vbdef6);
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public String getVbdef7 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF7);
 } 

/** 
* 设置自定义项7
*
* @param vbdef7 自定义项7
*/
public void setVbdef7 ( String vbdef7) {
this.setAttributeValue( CgfpBVO.VBDEF7,vbdef7);
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public String getVbdef8 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF8);
 } 

/** 
* 设置自定义项8
*
* @param vbdef8 自定义项8
*/
public void setVbdef8 ( String vbdef8) {
this.setAttributeValue( CgfpBVO.VBDEF8,vbdef8);
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public String getVbdef9 () {
return (String) this.getAttributeValue( CgfpBVO.VBDEF9);
 } 

/** 
* 设置自定义项9
*
* @param vbdef9 自定义项9
*/
public void setVbdef9 ( String vbdef9) {
this.setAttributeValue( CgfpBVO.VBDEF9,vbdef9);
 } 

/** 
* 获取换算率
*
* @return 换算率
*/
public String getVchangerate () {
return (String) this.getAttributeValue( CgfpBVO.VCHANGERATE);
 } 

/** 
* 设置换算率
*
* @param vchangerate 换算率
*/
public void setVchangerate ( String vchangerate) {
this.setAttributeValue( CgfpBVO.VCHANGERATE,vchangerate);
 } 

/** 
* 获取合同号
*
* @return 合同号
*/
public String getVctcode () {
return (String) this.getAttributeValue( CgfpBVO.VCTCODE);
 } 

/** 
* 设置合同号
*
* @param vctcode 合同号
*/
public void setVctcode ( String vctcode) {
this.setAttributeValue( CgfpBVO.VCTCODE,vctcode);
 } 

/** 
* 获取源头单据号
*
* @return 源头单据号
*/
public String getVfirstcode () {
return (String) this.getAttributeValue( CgfpBVO.VFIRSTCODE);
 } 

/** 
* 设置源头单据号
*
* @param vfirstcode 源头单据号
*/
public void setVfirstcode ( String vfirstcode) {
this.setAttributeValue( CgfpBVO.VFIRSTCODE,vfirstcode);
 } 

/** 
* 获取源头单据行号
*
* @return 源头单据行号
*/
public String getVfirstrowno () {
return (String) this.getAttributeValue( CgfpBVO.VFIRSTROWNO);
 } 

/** 
* 设置源头单据行号
*
* @param vfirstrowno 源头单据行号
*/
public void setVfirstrowno ( String vfirstrowno) {
this.setAttributeValue( CgfpBVO.VFIRSTROWNO,vfirstrowno);
 } 

/** 
* 获取源头交易类型
*
* @return 源头交易类型
*/
public String getVfirsttrantype () {
return (String) this.getAttributeValue( CgfpBVO.VFIRSTTRANTYPE);
 } 

/** 
* 设置源头交易类型
*
* @param vfirsttrantype 源头交易类型
*/
public void setVfirsttrantype ( String vfirsttrantype) {
this.setAttributeValue( CgfpBVO.VFIRSTTRANTYPE,vfirsttrantype);
 } 

/** 
* 获取自由辅助属性1
*
* @return 自由辅助属性1
*/
public String getVfree1 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE1);
 } 

/** 
* 设置自由辅助属性1
*
* @param vfree1 自由辅助属性1
*/
public void setVfree1 ( String vfree1) {
this.setAttributeValue( CgfpBVO.VFREE1,vfree1);
 } 

/** 
* 获取自由辅助属性10
*
* @return 自由辅助属性10
*/
public String getVfree10 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE10);
 } 

/** 
* 设置自由辅助属性10
*
* @param vfree10 自由辅助属性10
*/
public void setVfree10 ( String vfree10) {
this.setAttributeValue( CgfpBVO.VFREE10,vfree10);
 } 

/** 
* 获取自由辅助属性2
*
* @return 自由辅助属性2
*/
public String getVfree2 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE2);
 } 

/** 
* 设置自由辅助属性2
*
* @param vfree2 自由辅助属性2
*/
public void setVfree2 ( String vfree2) {
this.setAttributeValue( CgfpBVO.VFREE2,vfree2);
 } 

/** 
* 获取自由辅助属性3
*
* @return 自由辅助属性3
*/
public String getVfree3 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE3);
 } 

/** 
* 设置自由辅助属性3
*
* @param vfree3 自由辅助属性3
*/
public void setVfree3 ( String vfree3) {
this.setAttributeValue( CgfpBVO.VFREE3,vfree3);
 } 

/** 
* 获取自由辅助属性4
*
* @return 自由辅助属性4
*/
public String getVfree4 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE4);
 } 

/** 
* 设置自由辅助属性4
*
* @param vfree4 自由辅助属性4
*/
public void setVfree4 ( String vfree4) {
this.setAttributeValue( CgfpBVO.VFREE4,vfree4);
 } 

/** 
* 获取自由辅助属性5
*
* @return 自由辅助属性5
*/
public String getVfree5 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE5);
 } 

/** 
* 设置自由辅助属性5
*
* @param vfree5 自由辅助属性5
*/
public void setVfree5 ( String vfree5) {
this.setAttributeValue( CgfpBVO.VFREE5,vfree5);
 } 

/** 
* 获取自由辅助属性6
*
* @return 自由辅助属性6
*/
public String getVfree6 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE6);
 } 

/** 
* 设置自由辅助属性6
*
* @param vfree6 自由辅助属性6
*/
public void setVfree6 ( String vfree6) {
this.setAttributeValue( CgfpBVO.VFREE6,vfree6);
 } 

/** 
* 获取自由辅助属性7
*
* @return 自由辅助属性7
*/
public String getVfree7 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE7);
 } 

/** 
* 设置自由辅助属性7
*
* @param vfree7 自由辅助属性7
*/
public void setVfree7 ( String vfree7) {
this.setAttributeValue( CgfpBVO.VFREE7,vfree7);
 } 

/** 
* 获取自由辅助属性8
*
* @return 自由辅助属性8
*/
public String getVfree8 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE8);
 } 

/** 
* 设置自由辅助属性8
*
* @param vfree8 自由辅助属性8
*/
public void setVfree8 ( String vfree8) {
this.setAttributeValue( CgfpBVO.VFREE8,vfree8);
 } 

/** 
* 获取自由辅助属性9
*
* @return 自由辅助属性9
*/
public String getVfree9 () {
return (String) this.getAttributeValue( CgfpBVO.VFREE9);
 } 

/** 
* 设置自由辅助属性9
*
* @param vfree9 自由辅助属性9
*/
public void setVfree9 ( String vfree9) {
this.setAttributeValue( CgfpBVO.VFREE9,vfree9);
 } 

/** 
* 获取备注
*
* @return 备注
*/
public String getVmemob () {
return (String) this.getAttributeValue( CgfpBVO.VMEMOB);
 } 

/** 
* 设置备注
*
* @param vmemob 备注
*/
public void setVmemob ( String vmemob) {
this.setAttributeValue( CgfpBVO.VMEMOB,vmemob);
 } 

/** 
* 获取订单号
*
* @return 订单号
*/
public String getVordercode () {
return (String) this.getAttributeValue( CgfpBVO.VORDERCODE);
 } 

/** 
* 设置订单号
*
* @param vordercode 订单号
*/
public void setVordercode ( String vordercode) {
this.setAttributeValue( CgfpBVO.VORDERCODE,vordercode);
 } 

/** 
* 获取订单交易类型
*
* @return 订单交易类型
*/
public String getVordertrantype () {
return (String) this.getAttributeValue( CgfpBVO.VORDERTRANTYPE);
 } 

/** 
* 设置订单交易类型
*
* @param vordertrantype 订单交易类型
*/
public void setVordertrantype ( String vordertrantype) {
this.setAttributeValue( CgfpBVO.VORDERTRANTYPE,vordertrantype);
 } 

/** 
* 获取来源单据号
*
* @return 来源单据号
*/
public String getVsourcecode () {
return (String) this.getAttributeValue( CgfpBVO.VSOURCECODE);
 } 

/** 
* 设置来源单据号
*
* @param vsourcecode 来源单据号
*/
public void setVsourcecode ( String vsourcecode) {
this.setAttributeValue( CgfpBVO.VSOURCECODE,vsourcecode);
 } 

/** 
* 获取来源单据行号
*
* @return 来源单据行号
*/
public String getVsourcerowno () {
return (String) this.getAttributeValue( CgfpBVO.VSOURCEROWNO);
 } 

/** 
* 设置来源单据行号
*
* @param vsourcerowno 来源单据行号
*/
public void setVsourcerowno ( String vsourcerowno) {
this.setAttributeValue( CgfpBVO.VSOURCEROWNO,vsourcerowno);
 } 

/** 
* 获取来源交易类型
*
* @return 来源交易类型
*/
public String getVsourcetrantype () {
return (String) this.getAttributeValue( CgfpBVO.VSOURCETRANTYPE);
 } 

/** 
* 设置来源交易类型
*
* @param vsourcetrantype 来源交易类型
*/
public void setVsourcetrantype ( String vsourcetrantype) {
this.setAttributeValue( CgfpBVO.VSOURCETRANTYPE,vsourcetrantype);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("devlu.cgfp_b");
  }
}