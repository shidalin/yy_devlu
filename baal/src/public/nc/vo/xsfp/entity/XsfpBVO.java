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
*是否散户
*/
public static final String BFREECUSTFLAG="bfreecustflag";
/**
*应收组织原始版本
*/
public static final String CARORGID="carorgid";
/**
*应收组织
*/
public static final String CARORGVID="carorgvid";
/**
*单位
*/
public static final String CASTUNITID="castunitid";
/**
*销售渠道类型
*/
public static final String CCHANNELTYPEID="cchanneltypeid";
/**
*收支项目
*/
public static final String CCOSTSUBJID="ccostsubjid";
/**
*合同号
*/
public static final String CCTMANAGEID="cctmanageid";
/**
*客户物料码
*/
public static final String CCUSTMATERIALID="ccustmaterialid";
/**
*销售部门
*/
public static final String CDEPTID="cdeptid";
/**
*销售部门
*/
public static final String CDEPTVID="cdeptvid";
/**
*销售业务员
*/
public static final String CEMPLOYEEID="cemployeeid";
/**
*源头单据子表
*/
public static final String CFIRSTBID="cfirstbid";
/**
*源头单据主表
*/
public static final String CFIRSTID="cfirstid";
/**
*散户
*/
public static final String CFREECUSTID="cfreecustid";
/**
*cmarbascalssid（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String CMARBASCALSSID="cmarbascalssid";
/**
*物料编码原始版本
*/
public static final String CMATERIALID="cmaterialid";
/**
*物料编码
*/
public static final String CMATERIALVID="cmaterialvid";
/**
*对冲来源子表
*/
public static final String COPPOSESRCBID="copposesrcbid";
/**
*订单客户
*/
public static final String CORDERCUSTID="cordercustid";
/**
*产品线
*/
public static final String CPRODLINEID="cprodlineid";
/**
*利润中心
*/
public static final String CPROFITCENTERID="cprofitcenterid";
/**
*利润中心
*/
public static final String CPROFITCENTERVID="cprofitcentervid";
/**
*报价单位
*/
public static final String CQTUNITID="cqtunitid";
/**
*收货地址
*/
public static final String CRECEIVEADDRID="creceiveaddrid";
/**
*收货客户
*/
public static final String CRECEIVECUSTID="creceivecustid";
/**
*行号
*/
public static final String CROWNO="crowno";
/**
*发票子实体
*/
public String csaleinvoicebid;
/**
*上层单据主键
*/
public String csaleinvoiceid;
/**
*销售组织
*/
public static final String CSALEORGID="csaleorgid";
/**
*销售组织
*/
public static final String CSALEORGVID="csaleorgvid";
/**
*库存组织
*/
public static final String CSENDSTOCKORGID="csendstockorgid";
/**
*库存组织
*/
public static final String CSENDSTOCKORGVID="csendstockorgvid";
/**
*仓库
*/
public static final String CSENDSTORDOCID="csendstordocid";
/**
*来源单据子表
*/
public static final String CSRCBID="csrcbid";
/**
*来源单据主表
*/
public static final String CSRCID="csrcid";
/**
*消耗汇总主键
*/
public static final String CSUMID="csumid";
/**
*税码
*/
public static final String CTAXCODEID="ctaxcodeid";
/**
*运输方式
*/
public static final String CTRANSPORTTYPEID="ctransporttypeid";
/**
*主单位
*/
public static final String CUNITID="cunitid";
/**
*寄存供应商
*/
public static final String CVMIVENDERID="cvmivenderid";
/**
*开票日期
*/
public static final String DBILLDATE="dbilldate";
/**
*扣税类别
*/
public static final String FTAXTYPEFLAG="ftaxtypeflag";
/**
*数量
*/
public static final String NASTNUM="nastnum";
/**
*计税金额
*/
public static final String NCALTAXMNY="ncaltaxmny";
/**
*ncanoutnum（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String NCANOUTNUM="ncanoutnum";
/**
*本币折扣额
*/
public static final String NDISCOUNT="ndiscount";
/**
*整单折扣
*/
public static final String NDISCOUNTRATE="ndiscountrate";
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
*发票折扣
*/
public static final String NINVOICEDISRATE="ninvoicedisrate";
/**
*单品折扣
*/
public static final String NITEMDISCOUNTRATE="nitemdiscountrate";
/**
*本币无税金额
*/
public static final String NMNY="nmny";
/**
*主本币无税净价
*/
public static final String NNETPRICE="nnetprice";
/**
*主数量
*/
public static final String NNUM="nnum";
/**
*折扣额
*/
public static final String NORIGDISCOUNT="norigdiscount";
/**
*无税金额
*/
public static final String NORIGMNY="norigmny";
/**
*主无税净价
*/
public static final String NORIGNETPRICE="norignetprice";
/**
*主无税单价
*/
public static final String NORIGPRICE="norigprice";
/**
*费用冲抵金额
*/
public static final String NORIGSUBMNY="norigsubmny";
/**
*价税合计
*/
public static final String NORIGTAXMNY="norigtaxmny";
/**
*主含税净价
*/
public static final String NORIGTAXNETPRICE="norigtaxnetprice";
/**
*主含税单价
*/
public static final String NORIGTAXPRICE="norigtaxprice";
/**
*主本币无税单价
*/
public static final String NPRICE="nprice";
/**
*本币无税净价
*/
public static final String NQTNETPRICE="nqtnetprice";
/**
*无税净价
*/
public static final String NQTORIGNETPRICE="nqtorignetprice";
/**
*无税单价
*/
public static final String NQTORIGPRICE="nqtorigprice";
/**
*含税净价
*/
public static final String NQTORIGTAXNETPRC="nqtorigtaxnetprc";
/**
*含税单价
*/
public static final String NQTORIGTAXPRICE="nqtorigtaxprice";
/**
*本币无税单价
*/
public static final String NQTPRICE="nqtprice";
/**
*本币含税净价
*/
public static final String NQTTAXNETPRICE="nqttaxnetprice";
/**
*本币含税单价
*/
public static final String NQTTAXPRICE="nqttaxprice";
/**
*报价数量
*/
public static final String NQTUNITNUM="nqtunitnum";
/**
*累计应发未出库数量
*/
public static final String NSHOULDOUTNUM="nshouldoutnum";
/**
*nsrcnum（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String NSRCNUM="nsrcnum";
/**
*税额
*/
public static final String NTAX="ntax";
/**
*本币价税合计
*/
public static final String NTAXMNY="ntaxmny";
/**
*主本币含税净价
*/
public static final String NTAXNETPRICE="ntaxnetprice";
/**
*主本币含税单价
*/
public static final String NTAXPRICE="ntaxprice";
/**
*税率
*/
public static final String NTAXRATE="ntaxrate";
/**
*累计成本结算数量
*/
public static final String NTOTALCOSTNUM="ntotalcostnum";
/**
*累计确认应收金额
*/
public static final String NTOTALINCOMEMNY="ntotalincomemny";
/**
*累计确认应收数量
*/
public static final String NTOTALINCOMENUM="ntotalincomenum";
/**
*累计出库数量
*/
public static final String NTOTALOUTNUM="ntotaloutnum";
/**
*累计收款金额
*/
public static final String NTOTALPAYMNY="ntotalpaymny";
/**
*批次档案
*/
public static final String PK_BATCHCODE="pk_batchcode";
/**
*集团
*/
public String pk_group;
/**
*开票组织
*/
public String pk_org;
/**
*srcbts（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String SRCBTS="srcbts";
/**
*srcts（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String SRCTS="srcts";
/**
*时间戳
*/
public UFDateTime ts;
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
*源头单据类型
*/
public static final String VFIRSTTYPE="vfirsttype";
/**
*物料辅助属性1
*/
public static final String VFREE1="vfree1";
/**
*物料辅助属性10
*/
public static final String VFREE10="vfree10";
/**
*物料辅助属性2
*/
public static final String VFREE2="vfree2";
/**
*物料辅助属性3
*/
public static final String VFREE3="vfree3";
/**
*物料辅助属性4
*/
public static final String VFREE4="vfree4";
/**
*物料辅助属性5
*/
public static final String VFREE5="vfree5";
/**
*物料辅助属性6
*/
public static final String VFREE6="vfree6";
/**
*物料辅助属性7
*/
public static final String VFREE7="vfree7";
/**
*物料辅助属性8
*/
public static final String VFREE8="vfree8";
/**
*物料辅助属性9
*/
public static final String VFREE9="vfree9";
/**
*报价换算率
*/
public static final String VQTUNITRATE="vqtunitrate";
/**
*备注
*/
public static final String VROWNOTE="vrownote";
/**
*来源单据号
*/
public static final String VSRCCODE="vsrccode";
/**
*来源单据行号
*/
public static final String VSRCROWNO="vsrcrowno";
/**
*来源交易类型
*/
public static final String VSRCTRANTYPE="vsrctrantype";
/**
*来源单据类型
*/
public static final String VSRCTYPE="vsrctype";
/**
*消耗汇总号
*/
public static final String VSUMCODE="vsumcode";
/** 
* 获取是否散户
*
* @return 是否散户
*/
public UFBoolean getBfreecustflag () {
return (UFBoolean) this.getAttributeValue( XsfpBVO.BFREECUSTFLAG);
 } 

/** 
* 设置是否散户
*
* @param bfreecustflag 是否散户
*/
public void setBfreecustflag ( UFBoolean bfreecustflag) {
this.setAttributeValue( XsfpBVO.BFREECUSTFLAG,bfreecustflag);
 } 

/** 
* 获取应收组织原始版本
*
* @return 应收组织原始版本
*/
public String getCarorgid () {
return (String) this.getAttributeValue( XsfpBVO.CARORGID);
 } 

/** 
* 设置应收组织原始版本
*
* @param carorgid 应收组织原始版本
*/
public void setCarorgid ( String carorgid) {
this.setAttributeValue( XsfpBVO.CARORGID,carorgid);
 } 

/** 
* 获取应收组织
*
* @return 应收组织
*/
public String getCarorgvid () {
return (String) this.getAttributeValue( XsfpBVO.CARORGVID);
 } 

/** 
* 设置应收组织
*
* @param carorgvid 应收组织
*/
public void setCarorgvid ( String carorgvid) {
this.setAttributeValue( XsfpBVO.CARORGVID,carorgvid);
 } 

/** 
* 获取单位
*
* @return 单位
*/
public String getCastunitid () {
return (String) this.getAttributeValue( XsfpBVO.CASTUNITID);
 } 

/** 
* 设置单位
*
* @param castunitid 单位
*/
public void setCastunitid ( String castunitid) {
this.setAttributeValue( XsfpBVO.CASTUNITID,castunitid);
 } 

/** 
* 获取销售渠道类型
*
* @return 销售渠道类型
*/
public String getCchanneltypeid () {
return (String) this.getAttributeValue( XsfpBVO.CCHANNELTYPEID);
 } 

/** 
* 设置销售渠道类型
*
* @param cchanneltypeid 销售渠道类型
*/
public void setCchanneltypeid ( String cchanneltypeid) {
this.setAttributeValue( XsfpBVO.CCHANNELTYPEID,cchanneltypeid);
 } 

/** 
* 获取收支项目
*
* @return 收支项目
*/
public String getCcostsubjid () {
return (String) this.getAttributeValue( XsfpBVO.CCOSTSUBJID);
 } 

/** 
* 设置收支项目
*
* @param ccostsubjid 收支项目
*/
public void setCcostsubjid ( String ccostsubjid) {
this.setAttributeValue( XsfpBVO.CCOSTSUBJID,ccostsubjid);
 } 

/** 
* 获取合同号
*
* @return 合同号
*/
public String getCctmanageid () {
return (String) this.getAttributeValue( XsfpBVO.CCTMANAGEID);
 } 

/** 
* 设置合同号
*
* @param cctmanageid 合同号
*/
public void setCctmanageid ( String cctmanageid) {
this.setAttributeValue( XsfpBVO.CCTMANAGEID,cctmanageid);
 } 

/** 
* 获取客户物料码
*
* @return 客户物料码
*/
public String getCcustmaterialid () {
return (String) this.getAttributeValue( XsfpBVO.CCUSTMATERIALID);
 } 

/** 
* 设置客户物料码
*
* @param ccustmaterialid 客户物料码
*/
public void setCcustmaterialid ( String ccustmaterialid) {
this.setAttributeValue( XsfpBVO.CCUSTMATERIALID,ccustmaterialid);
 } 

/** 
* 获取销售部门
*
* @return 销售部门
*/
public String getCdeptid () {
return (String) this.getAttributeValue( XsfpBVO.CDEPTID);
 } 

/** 
* 设置销售部门
*
* @param cdeptid 销售部门
*/
public void setCdeptid ( String cdeptid) {
this.setAttributeValue( XsfpBVO.CDEPTID,cdeptid);
 } 

/** 
* 获取销售部门
*
* @return 销售部门
*/
public String getCdeptvid () {
return (String) this.getAttributeValue( XsfpBVO.CDEPTVID);
 } 

/** 
* 设置销售部门
*
* @param cdeptvid 销售部门
*/
public void setCdeptvid ( String cdeptvid) {
this.setAttributeValue( XsfpBVO.CDEPTVID,cdeptvid);
 } 

/** 
* 获取销售业务员
*
* @return 销售业务员
*/
public String getCemployeeid () {
return (String) this.getAttributeValue( XsfpBVO.CEMPLOYEEID);
 } 

/** 
* 设置销售业务员
*
* @param cemployeeid 销售业务员
*/
public void setCemployeeid ( String cemployeeid) {
this.setAttributeValue( XsfpBVO.CEMPLOYEEID,cemployeeid);
 } 

/** 
* 获取源头单据子表
*
* @return 源头单据子表
*/
public String getCfirstbid () {
return (String) this.getAttributeValue( XsfpBVO.CFIRSTBID);
 } 

/** 
* 设置源头单据子表
*
* @param cfirstbid 源头单据子表
*/
public void setCfirstbid ( String cfirstbid) {
this.setAttributeValue( XsfpBVO.CFIRSTBID,cfirstbid);
 } 

/** 
* 获取源头单据主表
*
* @return 源头单据主表
*/
public String getCfirstid () {
return (String) this.getAttributeValue( XsfpBVO.CFIRSTID);
 } 

/** 
* 设置源头单据主表
*
* @param cfirstid 源头单据主表
*/
public void setCfirstid ( String cfirstid) {
this.setAttributeValue( XsfpBVO.CFIRSTID,cfirstid);
 } 

/** 
* 获取散户
*
* @return 散户
*/
public String getCfreecustid () {
return (String) this.getAttributeValue( XsfpBVO.CFREECUSTID);
 } 

/** 
* 设置散户
*
* @param cfreecustid 散户
*/
public void setCfreecustid ( String cfreecustid) {
this.setAttributeValue( XsfpBVO.CFREECUSTID,cfreecustid);
 } 

/** 
* 获取cmarbascalssid（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return cmarbascalssid
*/
public String getCmarbascalssid () {
return (String) this.getAttributeValue( XsfpBVO.CMARBASCALSSID);
 } 

/** 
* 设置cmarbascalssid（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param cmarbascalssid cmarbascalssid
*/
public void setCmarbascalssid ( String cmarbascalssid) {
this.setAttributeValue( XsfpBVO.CMARBASCALSSID,cmarbascalssid);
 } 

/** 
* 获取物料编码原始版本
*
* @return 物料编码原始版本
*/
public String getCmaterialid () {
return (String) this.getAttributeValue( XsfpBVO.CMATERIALID);
 } 

/** 
* 设置物料编码原始版本
*
* @param cmaterialid 物料编码原始版本
*/
public void setCmaterialid ( String cmaterialid) {
this.setAttributeValue( XsfpBVO.CMATERIALID,cmaterialid);
 } 

/** 
* 获取物料编码
*
* @return 物料编码
*/
public String getCmaterialvid () {
return (String) this.getAttributeValue( XsfpBVO.CMATERIALVID);
 } 

/** 
* 设置物料编码
*
* @param cmaterialvid 物料编码
*/
public void setCmaterialvid ( String cmaterialvid) {
this.setAttributeValue( XsfpBVO.CMATERIALVID,cmaterialvid);
 } 

/** 
* 获取对冲来源子表
*
* @return 对冲来源子表
*/
public String getCopposesrcbid () {
return (String) this.getAttributeValue( XsfpBVO.COPPOSESRCBID);
 } 

/** 
* 设置对冲来源子表
*
* @param copposesrcbid 对冲来源子表
*/
public void setCopposesrcbid ( String copposesrcbid) {
this.setAttributeValue( XsfpBVO.COPPOSESRCBID,copposesrcbid);
 } 

/** 
* 获取订单客户
*
* @return 订单客户
*/
public String getCordercustid () {
return (String) this.getAttributeValue( XsfpBVO.CORDERCUSTID);
 } 

/** 
* 设置订单客户
*
* @param cordercustid 订单客户
*/
public void setCordercustid ( String cordercustid) {
this.setAttributeValue( XsfpBVO.CORDERCUSTID,cordercustid);
 } 

/** 
* 获取产品线
*
* @return 产品线
*/
public String getCprodlineid () {
return (String) this.getAttributeValue( XsfpBVO.CPRODLINEID);
 } 

/** 
* 设置产品线
*
* @param cprodlineid 产品线
*/
public void setCprodlineid ( String cprodlineid) {
this.setAttributeValue( XsfpBVO.CPRODLINEID,cprodlineid);
 } 

/** 
* 获取利润中心
*
* @return 利润中心
*/
public String getCprofitcenterid () {
return (String) this.getAttributeValue( XsfpBVO.CPROFITCENTERID);
 } 

/** 
* 设置利润中心
*
* @param cprofitcenterid 利润中心
*/
public void setCprofitcenterid ( String cprofitcenterid) {
this.setAttributeValue( XsfpBVO.CPROFITCENTERID,cprofitcenterid);
 } 

/** 
* 获取利润中心
*
* @return 利润中心
*/
public String getCprofitcentervid () {
return (String) this.getAttributeValue( XsfpBVO.CPROFITCENTERVID);
 } 

/** 
* 设置利润中心
*
* @param cprofitcentervid 利润中心
*/
public void setCprofitcentervid ( String cprofitcentervid) {
this.setAttributeValue( XsfpBVO.CPROFITCENTERVID,cprofitcentervid);
 } 

/** 
* 获取报价单位
*
* @return 报价单位
*/
public String getCqtunitid () {
return (String) this.getAttributeValue( XsfpBVO.CQTUNITID);
 } 

/** 
* 设置报价单位
*
* @param cqtunitid 报价单位
*/
public void setCqtunitid ( String cqtunitid) {
this.setAttributeValue( XsfpBVO.CQTUNITID,cqtunitid);
 } 

/** 
* 获取收货地址
*
* @return 收货地址
*/
public String getCreceiveaddrid () {
return (String) this.getAttributeValue( XsfpBVO.CRECEIVEADDRID);
 } 

/** 
* 设置收货地址
*
* @param creceiveaddrid 收货地址
*/
public void setCreceiveaddrid ( String creceiveaddrid) {
this.setAttributeValue( XsfpBVO.CRECEIVEADDRID,creceiveaddrid);
 } 

/** 
* 获取收货客户
*
* @return 收货客户
*/
public String getCreceivecustid () {
return (String) this.getAttributeValue( XsfpBVO.CRECEIVECUSTID);
 } 

/** 
* 设置收货客户
*
* @param creceivecustid 收货客户
*/
public void setCreceivecustid ( String creceivecustid) {
this.setAttributeValue( XsfpBVO.CRECEIVECUSTID,creceivecustid);
 } 

/** 
* 获取行号
*
* @return 行号
*/
public String getCrowno () {
return (String) this.getAttributeValue( XsfpBVO.CROWNO);
 } 

/** 
* 设置行号
*
* @param crowno 行号
*/
public void setCrowno ( String crowno) {
this.setAttributeValue( XsfpBVO.CROWNO,crowno);
 } 

/** 
* 获取发票子实体
*
* @return 发票子实体
*/
public String getCsaleinvoicebid () {
return this.csaleinvoicebid;
 } 

/** 
* 设置发票子实体
*
* @param csaleinvoicebid 发票子实体
*/
public void setCsaleinvoicebid ( String csaleinvoicebid) {
this.csaleinvoicebid=csaleinvoicebid;
 } 

/** 
* 获取上层单据主键
*
* @return 上层单据主键
*/
public String getCsaleinvoiceid () {
return this.csaleinvoiceid;
 } 

/** 
* 设置上层单据主键
*
* @param csaleinvoiceid 上层单据主键
*/
public void setCsaleinvoiceid ( String csaleinvoiceid) {
this.csaleinvoiceid=csaleinvoiceid;
 } 

/** 
* 获取销售组织
*
* @return 销售组织
*/
public String getCsaleorgid () {
return (String) this.getAttributeValue( XsfpBVO.CSALEORGID);
 } 

/** 
* 设置销售组织
*
* @param csaleorgid 销售组织
*/
public void setCsaleorgid ( String csaleorgid) {
this.setAttributeValue( XsfpBVO.CSALEORGID,csaleorgid);
 } 

/** 
* 获取销售组织
*
* @return 销售组织
*/
public String getCsaleorgvid () {
return (String) this.getAttributeValue( XsfpBVO.CSALEORGVID);
 } 

/** 
* 设置销售组织
*
* @param csaleorgvid 销售组织
*/
public void setCsaleorgvid ( String csaleorgvid) {
this.setAttributeValue( XsfpBVO.CSALEORGVID,csaleorgvid);
 } 

/** 
* 获取库存组织
*
* @return 库存组织
*/
public String getCsendstockorgid () {
return (String) this.getAttributeValue( XsfpBVO.CSENDSTOCKORGID);
 } 

/** 
* 设置库存组织
*
* @param csendstockorgid 库存组织
*/
public void setCsendstockorgid ( String csendstockorgid) {
this.setAttributeValue( XsfpBVO.CSENDSTOCKORGID,csendstockorgid);
 } 

/** 
* 获取库存组织
*
* @return 库存组织
*/
public String getCsendstockorgvid () {
return (String) this.getAttributeValue( XsfpBVO.CSENDSTOCKORGVID);
 } 

/** 
* 设置库存组织
*
* @param csendstockorgvid 库存组织
*/
public void setCsendstockorgvid ( String csendstockorgvid) {
this.setAttributeValue( XsfpBVO.CSENDSTOCKORGVID,csendstockorgvid);
 } 

/** 
* 获取仓库
*
* @return 仓库
*/
public String getCsendstordocid () {
return (String) this.getAttributeValue( XsfpBVO.CSENDSTORDOCID);
 } 

/** 
* 设置仓库
*
* @param csendstordocid 仓库
*/
public void setCsendstordocid ( String csendstordocid) {
this.setAttributeValue( XsfpBVO.CSENDSTORDOCID,csendstordocid);
 } 

/** 
* 获取来源单据子表
*
* @return 来源单据子表
*/
public String getCsrcbid () {
return (String) this.getAttributeValue( XsfpBVO.CSRCBID);
 } 

/** 
* 设置来源单据子表
*
* @param csrcbid 来源单据子表
*/
public void setCsrcbid ( String csrcbid) {
this.setAttributeValue( XsfpBVO.CSRCBID,csrcbid);
 } 

/** 
* 获取来源单据主表
*
* @return 来源单据主表
*/
public String getCsrcid () {
return (String) this.getAttributeValue( XsfpBVO.CSRCID);
 } 

/** 
* 设置来源单据主表
*
* @param csrcid 来源单据主表
*/
public void setCsrcid ( String csrcid) {
this.setAttributeValue( XsfpBVO.CSRCID,csrcid);
 } 

/** 
* 获取消耗汇总主键
*
* @return 消耗汇总主键
*/
public String getCsumid () {
return (String) this.getAttributeValue( XsfpBVO.CSUMID);
 } 

/** 
* 设置消耗汇总主键
*
* @param csumid 消耗汇总主键
*/
public void setCsumid ( String csumid) {
this.setAttributeValue( XsfpBVO.CSUMID,csumid);
 } 

/** 
* 获取税码
*
* @return 税码
*/
public String getCtaxcodeid () {
return (String) this.getAttributeValue( XsfpBVO.CTAXCODEID);
 } 

/** 
* 设置税码
*
* @param ctaxcodeid 税码
*/
public void setCtaxcodeid ( String ctaxcodeid) {
this.setAttributeValue( XsfpBVO.CTAXCODEID,ctaxcodeid);
 } 

/** 
* 获取运输方式
*
* @return 运输方式
*/
public String getCtransporttypeid () {
return (String) this.getAttributeValue( XsfpBVO.CTRANSPORTTYPEID);
 } 

/** 
* 设置运输方式
*
* @param ctransporttypeid 运输方式
*/
public void setCtransporttypeid ( String ctransporttypeid) {
this.setAttributeValue( XsfpBVO.CTRANSPORTTYPEID,ctransporttypeid);
 } 

/** 
* 获取主单位
*
* @return 主单位
*/
public String getCunitid () {
return (String) this.getAttributeValue( XsfpBVO.CUNITID);
 } 

/** 
* 设置主单位
*
* @param cunitid 主单位
*/
public void setCunitid ( String cunitid) {
this.setAttributeValue( XsfpBVO.CUNITID,cunitid);
 } 

/** 
* 获取寄存供应商
*
* @return 寄存供应商
*/
public String getCvmivenderid () {
return (String) this.getAttributeValue( XsfpBVO.CVMIVENDERID);
 } 

/** 
* 设置寄存供应商
*
* @param cvmivenderid 寄存供应商
*/
public void setCvmivenderid ( String cvmivenderid) {
this.setAttributeValue( XsfpBVO.CVMIVENDERID,cvmivenderid);
 } 

/** 
* 获取开票日期
*
* @return 开票日期
*/
public UFDate getDbilldate () {
return (UFDate) this.getAttributeValue( XsfpBVO.DBILLDATE);
 } 

/** 
* 设置开票日期
*
* @param dbilldate 开票日期
*/
public void setDbilldate ( UFDate dbilldate) {
this.setAttributeValue( XsfpBVO.DBILLDATE,dbilldate);
 } 

/** 
* 获取扣税类别
*
* @return 扣税类别
* @see String
*/
public Integer getFtaxtypeflag () {
return (Integer) this.getAttributeValue( XsfpBVO.FTAXTYPEFLAG);
 } 

/** 
* 设置扣税类别
*
* @param ftaxtypeflag 扣税类别
* @see String
*/
public void setFtaxtypeflag ( Integer ftaxtypeflag) {
this.setAttributeValue( XsfpBVO.FTAXTYPEFLAG,ftaxtypeflag);
 } 

/** 
* 获取数量
*
* @return 数量
*/
public UFDouble getNastnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NASTNUM);
 } 

/** 
* 设置数量
*
* @param nastnum 数量
*/
public void setNastnum ( UFDouble nastnum) {
this.setAttributeValue( XsfpBVO.NASTNUM,nastnum);
 } 

/** 
* 获取计税金额
*
* @return 计税金额
*/
public UFDouble getNcaltaxmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NCALTAXMNY);
 } 

/** 
* 设置计税金额
*
* @param ncaltaxmny 计税金额
*/
public void setNcaltaxmny ( UFDouble ncaltaxmny) {
this.setAttributeValue( XsfpBVO.NCALTAXMNY,ncaltaxmny);
 } 

/** 
* 获取ncanoutnum（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return ncanoutnum
*/
public UFDouble getNcanoutnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NCANOUTNUM);
 } 

/** 
* 设置ncanoutnum（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param ncanoutnum ncanoutnum
*/
public void setNcanoutnum ( UFDouble ncanoutnum) {
this.setAttributeValue( XsfpBVO.NCANOUTNUM,ncanoutnum);
 } 

/** 
* 获取本币折扣额
*
* @return 本币折扣额
*/
public UFDouble getNdiscount () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NDISCOUNT);
 } 

/** 
* 设置本币折扣额
*
* @param ndiscount 本币折扣额
*/
public void setNdiscount ( UFDouble ndiscount) {
this.setAttributeValue( XsfpBVO.NDISCOUNT,ndiscount);
 } 

/** 
* 获取整单折扣
*
* @return 整单折扣
*/
public UFDouble getNdiscountrate () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NDISCOUNTRATE);
 } 

/** 
* 设置整单折扣
*
* @param ndiscountrate 整单折扣
*/
public void setNdiscountrate ( UFDouble ndiscountrate) {
this.setAttributeValue( XsfpBVO.NDISCOUNTRATE,ndiscountrate);
 } 

/** 
* 获取全局本币无税金额
*
* @return 全局本币无税金额
*/
public UFDouble getNglobalmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NGLOBALMNY);
 } 

/** 
* 设置全局本币无税金额
*
* @param nglobalmny 全局本币无税金额
*/
public void setNglobalmny ( UFDouble nglobalmny) {
this.setAttributeValue( XsfpBVO.NGLOBALMNY,nglobalmny);
 } 

/** 
* 获取全局本币价税合计
*
* @return 全局本币价税合计
*/
public UFDouble getNglobaltaxmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NGLOBALTAXMNY);
 } 

/** 
* 设置全局本币价税合计
*
* @param nglobaltaxmny 全局本币价税合计
*/
public void setNglobaltaxmny ( UFDouble nglobaltaxmny) {
this.setAttributeValue( XsfpBVO.NGLOBALTAXMNY,nglobaltaxmny);
 } 

/** 
* 获取集团本币无税金额
*
* @return 集团本币无税金额
*/
public UFDouble getNgroupmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NGROUPMNY);
 } 

/** 
* 设置集团本币无税金额
*
* @param ngroupmny 集团本币无税金额
*/
public void setNgroupmny ( UFDouble ngroupmny) {
this.setAttributeValue( XsfpBVO.NGROUPMNY,ngroupmny);
 } 

/** 
* 获取集团本币价税合计
*
* @return 集团本币价税合计
*/
public UFDouble getNgrouptaxmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NGROUPTAXMNY);
 } 

/** 
* 设置集团本币价税合计
*
* @param ngrouptaxmny 集团本币价税合计
*/
public void setNgrouptaxmny ( UFDouble ngrouptaxmny) {
this.setAttributeValue( XsfpBVO.NGROUPTAXMNY,ngrouptaxmny);
 } 

/** 
* 获取发票折扣
*
* @return 发票折扣
*/
public UFDouble getNinvoicedisrate () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NINVOICEDISRATE);
 } 

/** 
* 设置发票折扣
*
* @param ninvoicedisrate 发票折扣
*/
public void setNinvoicedisrate ( UFDouble ninvoicedisrate) {
this.setAttributeValue( XsfpBVO.NINVOICEDISRATE,ninvoicedisrate);
 } 

/** 
* 获取单品折扣
*
* @return 单品折扣
*/
public UFDouble getNitemdiscountrate () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NITEMDISCOUNTRATE);
 } 

/** 
* 设置单品折扣
*
* @param nitemdiscountrate 单品折扣
*/
public void setNitemdiscountrate ( UFDouble nitemdiscountrate) {
this.setAttributeValue( XsfpBVO.NITEMDISCOUNTRATE,nitemdiscountrate);
 } 

/** 
* 获取本币无税金额
*
* @return 本币无税金额
*/
public UFDouble getNmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NMNY);
 } 

/** 
* 设置本币无税金额
*
* @param nmny 本币无税金额
*/
public void setNmny ( UFDouble nmny) {
this.setAttributeValue( XsfpBVO.NMNY,nmny);
 } 

/** 
* 获取主本币无税净价
*
* @return 主本币无税净价
*/
public UFDouble getNnetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NNETPRICE);
 } 

/** 
* 设置主本币无税净价
*
* @param nnetprice 主本币无税净价
*/
public void setNnetprice ( UFDouble nnetprice) {
this.setAttributeValue( XsfpBVO.NNETPRICE,nnetprice);
 } 

/** 
* 获取主数量
*
* @return 主数量
*/
public UFDouble getNnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NNUM);
 } 

/** 
* 设置主数量
*
* @param nnum 主数量
*/
public void setNnum ( UFDouble nnum) {
this.setAttributeValue( XsfpBVO.NNUM,nnum);
 } 

/** 
* 获取折扣额
*
* @return 折扣额
*/
public UFDouble getNorigdiscount () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGDISCOUNT);
 } 

/** 
* 设置折扣额
*
* @param norigdiscount 折扣额
*/
public void setNorigdiscount ( UFDouble norigdiscount) {
this.setAttributeValue( XsfpBVO.NORIGDISCOUNT,norigdiscount);
 } 

/** 
* 获取无税金额
*
* @return 无税金额
*/
public UFDouble getNorigmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGMNY);
 } 

/** 
* 设置无税金额
*
* @param norigmny 无税金额
*/
public void setNorigmny ( UFDouble norigmny) {
this.setAttributeValue( XsfpBVO.NORIGMNY,norigmny);
 } 

/** 
* 获取主无税净价
*
* @return 主无税净价
*/
public UFDouble getNorignetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGNETPRICE);
 } 

/** 
* 设置主无税净价
*
* @param norignetprice 主无税净价
*/
public void setNorignetprice ( UFDouble norignetprice) {
this.setAttributeValue( XsfpBVO.NORIGNETPRICE,norignetprice);
 } 

/** 
* 获取主无税单价
*
* @return 主无税单价
*/
public UFDouble getNorigprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGPRICE);
 } 

/** 
* 设置主无税单价
*
* @param norigprice 主无税单价
*/
public void setNorigprice ( UFDouble norigprice) {
this.setAttributeValue( XsfpBVO.NORIGPRICE,norigprice);
 } 

/** 
* 获取费用冲抵金额
*
* @return 费用冲抵金额
*/
public UFDouble getNorigsubmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGSUBMNY);
 } 

/** 
* 设置费用冲抵金额
*
* @param norigsubmny 费用冲抵金额
*/
public void setNorigsubmny ( UFDouble norigsubmny) {
this.setAttributeValue( XsfpBVO.NORIGSUBMNY,norigsubmny);
 } 

/** 
* 获取价税合计
*
* @return 价税合计
*/
public UFDouble getNorigtaxmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGTAXMNY);
 } 

/** 
* 设置价税合计
*
* @param norigtaxmny 价税合计
*/
public void setNorigtaxmny ( UFDouble norigtaxmny) {
this.setAttributeValue( XsfpBVO.NORIGTAXMNY,norigtaxmny);
 } 

/** 
* 获取主含税净价
*
* @return 主含税净价
*/
public UFDouble getNorigtaxnetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGTAXNETPRICE);
 } 

/** 
* 设置主含税净价
*
* @param norigtaxnetprice 主含税净价
*/
public void setNorigtaxnetprice ( UFDouble norigtaxnetprice) {
this.setAttributeValue( XsfpBVO.NORIGTAXNETPRICE,norigtaxnetprice);
 } 

/** 
* 获取主含税单价
*
* @return 主含税单价
*/
public UFDouble getNorigtaxprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NORIGTAXPRICE);
 } 

/** 
* 设置主含税单价
*
* @param norigtaxprice 主含税单价
*/
public void setNorigtaxprice ( UFDouble norigtaxprice) {
this.setAttributeValue( XsfpBVO.NORIGTAXPRICE,norigtaxprice);
 } 

/** 
* 获取主本币无税单价
*
* @return 主本币无税单价
*/
public UFDouble getNprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NPRICE);
 } 

/** 
* 设置主本币无税单价
*
* @param nprice 主本币无税单价
*/
public void setNprice ( UFDouble nprice) {
this.setAttributeValue( XsfpBVO.NPRICE,nprice);
 } 

/** 
* 获取本币无税净价
*
* @return 本币无税净价
*/
public UFDouble getNqtnetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTNETPRICE);
 } 

/** 
* 设置本币无税净价
*
* @param nqtnetprice 本币无税净价
*/
public void setNqtnetprice ( UFDouble nqtnetprice) {
this.setAttributeValue( XsfpBVO.NQTNETPRICE,nqtnetprice);
 } 

/** 
* 获取无税净价
*
* @return 无税净价
*/
public UFDouble getNqtorignetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTORIGNETPRICE);
 } 

/** 
* 设置无税净价
*
* @param nqtorignetprice 无税净价
*/
public void setNqtorignetprice ( UFDouble nqtorignetprice) {
this.setAttributeValue( XsfpBVO.NQTORIGNETPRICE,nqtorignetprice);
 } 

/** 
* 获取无税单价
*
* @return 无税单价
*/
public UFDouble getNqtorigprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTORIGPRICE);
 } 

/** 
* 设置无税单价
*
* @param nqtorigprice 无税单价
*/
public void setNqtorigprice ( UFDouble nqtorigprice) {
this.setAttributeValue( XsfpBVO.NQTORIGPRICE,nqtorigprice);
 } 

/** 
* 获取含税净价
*
* @return 含税净价
*/
public UFDouble getNqtorigtaxnetprc () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTORIGTAXNETPRC);
 } 

/** 
* 设置含税净价
*
* @param nqtorigtaxnetprc 含税净价
*/
public void setNqtorigtaxnetprc ( UFDouble nqtorigtaxnetprc) {
this.setAttributeValue( XsfpBVO.NQTORIGTAXNETPRC,nqtorigtaxnetprc);
 } 

/** 
* 获取含税单价
*
* @return 含税单价
*/
public UFDouble getNqtorigtaxprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTORIGTAXPRICE);
 } 

/** 
* 设置含税单价
*
* @param nqtorigtaxprice 含税单价
*/
public void setNqtorigtaxprice ( UFDouble nqtorigtaxprice) {
this.setAttributeValue( XsfpBVO.NQTORIGTAXPRICE,nqtorigtaxprice);
 } 

/** 
* 获取本币无税单价
*
* @return 本币无税单价
*/
public UFDouble getNqtprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTPRICE);
 } 

/** 
* 设置本币无税单价
*
* @param nqtprice 本币无税单价
*/
public void setNqtprice ( UFDouble nqtprice) {
this.setAttributeValue( XsfpBVO.NQTPRICE,nqtprice);
 } 

/** 
* 获取本币含税净价
*
* @return 本币含税净价
*/
public UFDouble getNqttaxnetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTTAXNETPRICE);
 } 

/** 
* 设置本币含税净价
*
* @param nqttaxnetprice 本币含税净价
*/
public void setNqttaxnetprice ( UFDouble nqttaxnetprice) {
this.setAttributeValue( XsfpBVO.NQTTAXNETPRICE,nqttaxnetprice);
 } 

/** 
* 获取本币含税单价
*
* @return 本币含税单价
*/
public UFDouble getNqttaxprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTTAXPRICE);
 } 

/** 
* 设置本币含税单价
*
* @param nqttaxprice 本币含税单价
*/
public void setNqttaxprice ( UFDouble nqttaxprice) {
this.setAttributeValue( XsfpBVO.NQTTAXPRICE,nqttaxprice);
 } 

/** 
* 获取报价数量
*
* @return 报价数量
*/
public UFDouble getNqtunitnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NQTUNITNUM);
 } 

/** 
* 设置报价数量
*
* @param nqtunitnum 报价数量
*/
public void setNqtunitnum ( UFDouble nqtunitnum) {
this.setAttributeValue( XsfpBVO.NQTUNITNUM,nqtunitnum);
 } 

/** 
* 获取累计应发未出库数量
*
* @return 累计应发未出库数量
*/
public UFDouble getNshouldoutnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NSHOULDOUTNUM);
 } 

/** 
* 设置累计应发未出库数量
*
* @param nshouldoutnum 累计应发未出库数量
*/
public void setNshouldoutnum ( UFDouble nshouldoutnum) {
this.setAttributeValue( XsfpBVO.NSHOULDOUTNUM,nshouldoutnum);
 } 

/** 
* 获取nsrcnum（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return nsrcnum
*/
public UFDouble getNsrcnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NSRCNUM);
 } 

/** 
* 设置nsrcnum（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param nsrcnum nsrcnum
*/
public void setNsrcnum ( UFDouble nsrcnum) {
this.setAttributeValue( XsfpBVO.NSRCNUM,nsrcnum);
 } 

/** 
* 获取税额
*
* @return 税额
*/
public UFDouble getNtax () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTAX);
 } 

/** 
* 设置税额
*
* @param ntax 税额
*/
public void setNtax ( UFDouble ntax) {
this.setAttributeValue( XsfpBVO.NTAX,ntax);
 } 

/** 
* 获取本币价税合计
*
* @return 本币价税合计
*/
public UFDouble getNtaxmny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTAXMNY);
 } 

/** 
* 设置本币价税合计
*
* @param ntaxmny 本币价税合计
*/
public void setNtaxmny ( UFDouble ntaxmny) {
this.setAttributeValue( XsfpBVO.NTAXMNY,ntaxmny);
 } 

/** 
* 获取主本币含税净价
*
* @return 主本币含税净价
*/
public UFDouble getNtaxnetprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTAXNETPRICE);
 } 

/** 
* 设置主本币含税净价
*
* @param ntaxnetprice 主本币含税净价
*/
public void setNtaxnetprice ( UFDouble ntaxnetprice) {
this.setAttributeValue( XsfpBVO.NTAXNETPRICE,ntaxnetprice);
 } 

/** 
* 获取主本币含税单价
*
* @return 主本币含税单价
*/
public UFDouble getNtaxprice () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTAXPRICE);
 } 

/** 
* 设置主本币含税单价
*
* @param ntaxprice 主本币含税单价
*/
public void setNtaxprice ( UFDouble ntaxprice) {
this.setAttributeValue( XsfpBVO.NTAXPRICE,ntaxprice);
 } 

/** 
* 获取税率
*
* @return 税率
*/
public UFDouble getNtaxrate () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTAXRATE);
 } 

/** 
* 设置税率
*
* @param ntaxrate 税率
*/
public void setNtaxrate ( UFDouble ntaxrate) {
this.setAttributeValue( XsfpBVO.NTAXRATE,ntaxrate);
 } 

/** 
* 获取累计成本结算数量
*
* @return 累计成本结算数量
*/
public UFDouble getNtotalcostnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTOTALCOSTNUM);
 } 

/** 
* 设置累计成本结算数量
*
* @param ntotalcostnum 累计成本结算数量
*/
public void setNtotalcostnum ( UFDouble ntotalcostnum) {
this.setAttributeValue( XsfpBVO.NTOTALCOSTNUM,ntotalcostnum);
 } 

/** 
* 获取累计确认应收金额
*
* @return 累计确认应收金额
*/
public UFDouble getNtotalincomemny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTOTALINCOMEMNY);
 } 

/** 
* 设置累计确认应收金额
*
* @param ntotalincomemny 累计确认应收金额
*/
public void setNtotalincomemny ( UFDouble ntotalincomemny) {
this.setAttributeValue( XsfpBVO.NTOTALINCOMEMNY,ntotalincomemny);
 } 

/** 
* 获取累计确认应收数量
*
* @return 累计确认应收数量
*/
public UFDouble getNtotalincomenum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTOTALINCOMENUM);
 } 

/** 
* 设置累计确认应收数量
*
* @param ntotalincomenum 累计确认应收数量
*/
public void setNtotalincomenum ( UFDouble ntotalincomenum) {
this.setAttributeValue( XsfpBVO.NTOTALINCOMENUM,ntotalincomenum);
 } 

/** 
* 获取累计出库数量
*
* @return 累计出库数量
*/
public UFDouble getNtotaloutnum () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTOTALOUTNUM);
 } 

/** 
* 设置累计出库数量
*
* @param ntotaloutnum 累计出库数量
*/
public void setNtotaloutnum ( UFDouble ntotaloutnum) {
this.setAttributeValue( XsfpBVO.NTOTALOUTNUM,ntotaloutnum);
 } 

/** 
* 获取累计收款金额
*
* @return 累计收款金额
*/
public UFDouble getNtotalpaymny () {
return (UFDouble) this.getAttributeValue( XsfpBVO.NTOTALPAYMNY);
 } 

/** 
* 设置累计收款金额
*
* @param ntotalpaymny 累计收款金额
*/
public void setNtotalpaymny ( UFDouble ntotalpaymny) {
this.setAttributeValue( XsfpBVO.NTOTALPAYMNY,ntotalpaymny);
 } 

/** 
* 获取批次档案
*
* @return 批次档案
*/
public String getPk_batchcode () {
return (String) this.getAttributeValue( XsfpBVO.PK_BATCHCODE);
 } 

/** 
* 设置批次档案
*
* @param pk_batchcode 批次档案
*/
public void setPk_batchcode ( String pk_batchcode) {
this.setAttributeValue( XsfpBVO.PK_BATCHCODE,pk_batchcode);
 } 

/** 
* 获取集团
*
* @return 集团
*/
public String getPk_group () {
return this.pk_group;
 } 

/** 
* 设置集团
*
* @param pk_group 集团
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
 } 

/** 
* 获取开票组织
*
* @return 开票组织
*/
public String getPk_org () {
return this.pk_org;
 } 

/** 
* 设置开票组织
*
* @param pk_org 开票组织
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
 } 

/** 
* 获取srcbts（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return srcbts
*/
public UFDateTime getSrcbts () {
return (UFDateTime) this.getAttributeValue( XsfpBVO.SRCBTS);
 } 

/** 
* 设置srcbts（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param srcbts srcbts
*/
public void setSrcbts ( UFDateTime srcbts) {
this.setAttributeValue( XsfpBVO.SRCBTS,srcbts);
 } 

/** 
* 获取srcts（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return srcts
*/
public UFDateTime getSrcts () {
return (UFDateTime) this.getAttributeValue( XsfpBVO.SRCTS);
 } 

/** 
* 设置srcts（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param srcts srcts
*/
public void setSrcts ( UFDateTime srcts) {
this.setAttributeValue( XsfpBVO.SRCTS,srcts);
 } 

/** 
* 获取时间戳
*
* @return 时间戳
*/
public UFDateTime getTs () {
return this.ts;
 } 

/** 
* 设置时间戳
*
* @param ts 时间戳
*/
public void setTs ( UFDateTime ts) {
this.ts=ts;
 } 

/** 
* 获取批次号
*
* @return 批次号
*/
public String getVbatchcode () {
return (String) this.getAttributeValue( XsfpBVO.VBATCHCODE);
 } 

/** 
* 设置批次号
*
* @param vbatchcode 批次号
*/
public void setVbatchcode ( String vbatchcode) {
this.setAttributeValue( XsfpBVO.VBATCHCODE,vbatchcode);
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getVbdef1 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF1);
 } 

/** 
* 设置自定义项1
*
* @param vbdef1 自定义项1
*/
public void setVbdef1 ( String vbdef1) {
this.setAttributeValue( XsfpBVO.VBDEF1,vbdef1);
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public String getVbdef10 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF10);
 } 

/** 
* 设置自定义项10
*
* @param vbdef10 自定义项10
*/
public void setVbdef10 ( String vbdef10) {
this.setAttributeValue( XsfpBVO.VBDEF10,vbdef10);
 } 

/** 
* 获取自定义项11
*
* @return 自定义项11
*/
public String getVbdef11 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF11);
 } 

/** 
* 设置自定义项11
*
* @param vbdef11 自定义项11
*/
public void setVbdef11 ( String vbdef11) {
this.setAttributeValue( XsfpBVO.VBDEF11,vbdef11);
 } 

/** 
* 获取自定义项12
*
* @return 自定义项12
*/
public String getVbdef12 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF12);
 } 

/** 
* 设置自定义项12
*
* @param vbdef12 自定义项12
*/
public void setVbdef12 ( String vbdef12) {
this.setAttributeValue( XsfpBVO.VBDEF12,vbdef12);
 } 

/** 
* 获取自定义项13
*
* @return 自定义项13
*/
public String getVbdef13 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF13);
 } 

/** 
* 设置自定义项13
*
* @param vbdef13 自定义项13
*/
public void setVbdef13 ( String vbdef13) {
this.setAttributeValue( XsfpBVO.VBDEF13,vbdef13);
 } 

/** 
* 获取自定义项14
*
* @return 自定义项14
*/
public String getVbdef14 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF14);
 } 

/** 
* 设置自定义项14
*
* @param vbdef14 自定义项14
*/
public void setVbdef14 ( String vbdef14) {
this.setAttributeValue( XsfpBVO.VBDEF14,vbdef14);
 } 

/** 
* 获取自定义项15
*
* @return 自定义项15
*/
public String getVbdef15 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF15);
 } 

/** 
* 设置自定义项15
*
* @param vbdef15 自定义项15
*/
public void setVbdef15 ( String vbdef15) {
this.setAttributeValue( XsfpBVO.VBDEF15,vbdef15);
 } 

/** 
* 获取自定义项16
*
* @return 自定义项16
*/
public String getVbdef16 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF16);
 } 

/** 
* 设置自定义项16
*
* @param vbdef16 自定义项16
*/
public void setVbdef16 ( String vbdef16) {
this.setAttributeValue( XsfpBVO.VBDEF16,vbdef16);
 } 

/** 
* 获取自定义项17
*
* @return 自定义项17
*/
public String getVbdef17 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF17);
 } 

/** 
* 设置自定义项17
*
* @param vbdef17 自定义项17
*/
public void setVbdef17 ( String vbdef17) {
this.setAttributeValue( XsfpBVO.VBDEF17,vbdef17);
 } 

/** 
* 获取自定义项18
*
* @return 自定义项18
*/
public String getVbdef18 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF18);
 } 

/** 
* 设置自定义项18
*
* @param vbdef18 自定义项18
*/
public void setVbdef18 ( String vbdef18) {
this.setAttributeValue( XsfpBVO.VBDEF18,vbdef18);
 } 

/** 
* 获取自定义项19
*
* @return 自定义项19
*/
public String getVbdef19 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF19);
 } 

/** 
* 设置自定义项19
*
* @param vbdef19 自定义项19
*/
public void setVbdef19 ( String vbdef19) {
this.setAttributeValue( XsfpBVO.VBDEF19,vbdef19);
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getVbdef2 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF2);
 } 

/** 
* 设置自定义项2
*
* @param vbdef2 自定义项2
*/
public void setVbdef2 ( String vbdef2) {
this.setAttributeValue( XsfpBVO.VBDEF2,vbdef2);
 } 

/** 
* 获取自定义项20
*
* @return 自定义项20
*/
public String getVbdef20 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF20);
 } 

/** 
* 设置自定义项20
*
* @param vbdef20 自定义项20
*/
public void setVbdef20 ( String vbdef20) {
this.setAttributeValue( XsfpBVO.VBDEF20,vbdef20);
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getVbdef3 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF3);
 } 

/** 
* 设置自定义项3
*
* @param vbdef3 自定义项3
*/
public void setVbdef3 ( String vbdef3) {
this.setAttributeValue( XsfpBVO.VBDEF3,vbdef3);
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getVbdef4 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF4);
 } 

/** 
* 设置自定义项4
*
* @param vbdef4 自定义项4
*/
public void setVbdef4 ( String vbdef4) {
this.setAttributeValue( XsfpBVO.VBDEF4,vbdef4);
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getVbdef5 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF5);
 } 

/** 
* 设置自定义项5
*
* @param vbdef5 自定义项5
*/
public void setVbdef5 ( String vbdef5) {
this.setAttributeValue( XsfpBVO.VBDEF5,vbdef5);
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public String getVbdef6 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF6);
 } 

/** 
* 设置自定义项6
*
* @param vbdef6 自定义项6
*/
public void setVbdef6 ( String vbdef6) {
this.setAttributeValue( XsfpBVO.VBDEF6,vbdef6);
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public String getVbdef7 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF7);
 } 

/** 
* 设置自定义项7
*
* @param vbdef7 自定义项7
*/
public void setVbdef7 ( String vbdef7) {
this.setAttributeValue( XsfpBVO.VBDEF7,vbdef7);
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public String getVbdef8 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF8);
 } 

/** 
* 设置自定义项8
*
* @param vbdef8 自定义项8
*/
public void setVbdef8 ( String vbdef8) {
this.setAttributeValue( XsfpBVO.VBDEF8,vbdef8);
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public String getVbdef9 () {
return (String) this.getAttributeValue( XsfpBVO.VBDEF9);
 } 

/** 
* 设置自定义项9
*
* @param vbdef9 自定义项9
*/
public void setVbdef9 ( String vbdef9) {
this.setAttributeValue( XsfpBVO.VBDEF9,vbdef9);
 } 

/** 
* 获取换算率
*
* @return 换算率
*/
public String getVchangerate () {
return (String) this.getAttributeValue( XsfpBVO.VCHANGERATE);
 } 

/** 
* 设置换算率
*
* @param vchangerate 换算率
*/
public void setVchangerate ( String vchangerate) {
this.setAttributeValue( XsfpBVO.VCHANGERATE,vchangerate);
 } 

/** 
* 获取源头单据号
*
* @return 源头单据号
*/
public String getVfirstcode () {
return (String) this.getAttributeValue( XsfpBVO.VFIRSTCODE);
 } 

/** 
* 设置源头单据号
*
* @param vfirstcode 源头单据号
*/
public void setVfirstcode ( String vfirstcode) {
this.setAttributeValue( XsfpBVO.VFIRSTCODE,vfirstcode);
 } 

/** 
* 获取源头单据行号
*
* @return 源头单据行号
*/
public String getVfirstrowno () {
return (String) this.getAttributeValue( XsfpBVO.VFIRSTROWNO);
 } 

/** 
* 设置源头单据行号
*
* @param vfirstrowno 源头单据行号
*/
public void setVfirstrowno ( String vfirstrowno) {
this.setAttributeValue( XsfpBVO.VFIRSTROWNO,vfirstrowno);
 } 

/** 
* 获取源头交易类型
*
* @return 源头交易类型
*/
public String getVfirsttrantype () {
return (String) this.getAttributeValue( XsfpBVO.VFIRSTTRANTYPE);
 } 

/** 
* 设置源头交易类型
*
* @param vfirsttrantype 源头交易类型
*/
public void setVfirsttrantype ( String vfirsttrantype) {
this.setAttributeValue( XsfpBVO.VFIRSTTRANTYPE,vfirsttrantype);
 } 

/** 
* 获取源头单据类型
*
* @return 源头单据类型
*/
public String getVfirsttype () {
return (String) this.getAttributeValue( XsfpBVO.VFIRSTTYPE);
 } 

/** 
* 设置源头单据类型
*
* @param vfirsttype 源头单据类型
*/
public void setVfirsttype ( String vfirsttype) {
this.setAttributeValue( XsfpBVO.VFIRSTTYPE,vfirsttype);
 } 

/** 
* 获取物料辅助属性1
*
* @return 物料辅助属性1
*/
public String getVfree1 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE1);
 } 

/** 
* 设置物料辅助属性1
*
* @param vfree1 物料辅助属性1
*/
public void setVfree1 ( String vfree1) {
this.setAttributeValue( XsfpBVO.VFREE1,vfree1);
 } 

/** 
* 获取物料辅助属性10
*
* @return 物料辅助属性10
*/
public String getVfree10 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE10);
 } 

/** 
* 设置物料辅助属性10
*
* @param vfree10 物料辅助属性10
*/
public void setVfree10 ( String vfree10) {
this.setAttributeValue( XsfpBVO.VFREE10,vfree10);
 } 

/** 
* 获取物料辅助属性2
*
* @return 物料辅助属性2
*/
public String getVfree2 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE2);
 } 

/** 
* 设置物料辅助属性2
*
* @param vfree2 物料辅助属性2
*/
public void setVfree2 ( String vfree2) {
this.setAttributeValue( XsfpBVO.VFREE2,vfree2);
 } 

/** 
* 获取物料辅助属性3
*
* @return 物料辅助属性3
*/
public String getVfree3 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE3);
 } 

/** 
* 设置物料辅助属性3
*
* @param vfree3 物料辅助属性3
*/
public void setVfree3 ( String vfree3) {
this.setAttributeValue( XsfpBVO.VFREE3,vfree3);
 } 

/** 
* 获取物料辅助属性4
*
* @return 物料辅助属性4
*/
public String getVfree4 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE4);
 } 

/** 
* 设置物料辅助属性4
*
* @param vfree4 物料辅助属性4
*/
public void setVfree4 ( String vfree4) {
this.setAttributeValue( XsfpBVO.VFREE4,vfree4);
 } 

/** 
* 获取物料辅助属性5
*
* @return 物料辅助属性5
*/
public String getVfree5 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE5);
 } 

/** 
* 设置物料辅助属性5
*
* @param vfree5 物料辅助属性5
*/
public void setVfree5 ( String vfree5) {
this.setAttributeValue( XsfpBVO.VFREE5,vfree5);
 } 

/** 
* 获取物料辅助属性6
*
* @return 物料辅助属性6
*/
public String getVfree6 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE6);
 } 

/** 
* 设置物料辅助属性6
*
* @param vfree6 物料辅助属性6
*/
public void setVfree6 ( String vfree6) {
this.setAttributeValue( XsfpBVO.VFREE6,vfree6);
 } 

/** 
* 获取物料辅助属性7
*
* @return 物料辅助属性7
*/
public String getVfree7 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE7);
 } 

/** 
* 设置物料辅助属性7
*
* @param vfree7 物料辅助属性7
*/
public void setVfree7 ( String vfree7) {
this.setAttributeValue( XsfpBVO.VFREE7,vfree7);
 } 

/** 
* 获取物料辅助属性8
*
* @return 物料辅助属性8
*/
public String getVfree8 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE8);
 } 

/** 
* 设置物料辅助属性8
*
* @param vfree8 物料辅助属性8
*/
public void setVfree8 ( String vfree8) {
this.setAttributeValue( XsfpBVO.VFREE8,vfree8);
 } 

/** 
* 获取物料辅助属性9
*
* @return 物料辅助属性9
*/
public String getVfree9 () {
return (String) this.getAttributeValue( XsfpBVO.VFREE9);
 } 

/** 
* 设置物料辅助属性9
*
* @param vfree9 物料辅助属性9
*/
public void setVfree9 ( String vfree9) {
this.setAttributeValue( XsfpBVO.VFREE9,vfree9);
 } 

/** 
* 获取报价换算率
*
* @return 报价换算率
*/
public String getVqtunitrate () {
return (String) this.getAttributeValue( XsfpBVO.VQTUNITRATE);
 } 

/** 
* 设置报价换算率
*
* @param vqtunitrate 报价换算率
*/
public void setVqtunitrate ( String vqtunitrate) {
this.setAttributeValue( XsfpBVO.VQTUNITRATE,vqtunitrate);
 } 

/** 
* 获取备注
*
* @return 备注
*/
public String getVrownote () {
return (String) this.getAttributeValue( XsfpBVO.VROWNOTE);
 } 

/** 
* 设置备注
*
* @param vrownote 备注
*/
public void setVrownote ( String vrownote) {
this.setAttributeValue( XsfpBVO.VROWNOTE,vrownote);
 } 

/** 
* 获取来源单据号
*
* @return 来源单据号
*/
public String getVsrccode () {
return (String) this.getAttributeValue( XsfpBVO.VSRCCODE);
 } 

/** 
* 设置来源单据号
*
* @param vsrccode 来源单据号
*/
public void setVsrccode ( String vsrccode) {
this.setAttributeValue( XsfpBVO.VSRCCODE,vsrccode);
 } 

/** 
* 获取来源单据行号
*
* @return 来源单据行号
*/
public String getVsrcrowno () {
return (String) this.getAttributeValue( XsfpBVO.VSRCROWNO);
 } 

/** 
* 设置来源单据行号
*
* @param vsrcrowno 来源单据行号
*/
public void setVsrcrowno ( String vsrcrowno) {
this.setAttributeValue( XsfpBVO.VSRCROWNO,vsrcrowno);
 } 

/** 
* 获取来源交易类型
*
* @return 来源交易类型
*/
public String getVsrctrantype () {
return (String) this.getAttributeValue( XsfpBVO.VSRCTRANTYPE);
 } 

/** 
* 设置来源交易类型
*
* @param vsrctrantype 来源交易类型
*/
public void setVsrctrantype ( String vsrctrantype) {
this.setAttributeValue( XsfpBVO.VSRCTRANTYPE,vsrctrantype);
 } 

/** 
* 获取来源单据类型
*
* @return 来源单据类型
*/
public String getVsrctype () {
return (String) this.getAttributeValue( XsfpBVO.VSRCTYPE);
 } 

/** 
* 设置来源单据类型
*
* @param vsrctype 来源单据类型
*/
public void setVsrctype ( String vsrctype) {
this.setAttributeValue( XsfpBVO.VSRCTYPE,vsrctype);
 } 

/** 
* 获取消耗汇总号
*
* @return 消耗汇总号
*/
public String getVsumcode () {
return (String) this.getAttributeValue( XsfpBVO.VSUMCODE);
 } 

/** 
* 设置消耗汇总号
*
* @param vsumcode 消耗汇总号
*/
public void setVsumcode ( String vsumcode) {
this.setAttributeValue( XsfpBVO.VSUMCODE,vsumcode);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("devlu.xsfp_b");
  }
}