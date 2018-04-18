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
*审批人
*/
public static final String APPROVER="approver";
/**
*已传应付标志
*/
public static final String BAPFLAG="bapflag";
/**
*费用发票
*/
public static final String BFEE="bfee";
/**
*冻结
*/
public static final String BFROZEN="bfrozen";
/**
*制单人
*/
public static final String BILLMAKER="billmaker";
/**
*是否期初发票
*/
public static final String BINITIAL="binitial";
/**
*逆向征税
*/
public static final String BOPPTAXFLAG="bopptaxflag";
/**
*三角贸易
*/
public static final String BTRIATRADEFLAG="btriatradeflag";
/**
*虚拟发票标志
*/
public static final String BVIRTUAL="bvirtual";
/**
*本币币种
*/
public static final String CCURRENCYID="ccurrencyid";
/**
*币种
*/
public static final String CORIGCURRENCYID="corigcurrencyid";
/**
*创建时间
*/
public static final String CREATIONTIME="creationtime";
/**
*创建人
*/
public static final String CREATOR="creator";
/**
*收货国家/地区
*/
public static final String CRECECOUNTRYID="crececountryid";
/**
*发货国家/地区
*/
public static final String CSENDCOUNTRYID="csendcountryid";
/**
*报税国家/地区
*/
public static final String CTAXCOUNTRYID="ctaxcountryid";
/**
*贸易术语
*/
public static final String CTRADEWORDID="ctradewordid";
/**
*发票类型
*/
public static final String CTRANTYPEID="ctrantypeid";
/**
*票到日期
*/
public static final String DARRIVEDATE="darrivedate";
/**
*发票日期
*/
public static final String DBILLDATE="dbilldate";
/**
*制单日期
*/
public static final String DMAKEDATE="dmakedate";
/**
*单据状态
*/
public static final String FBILLSTATUS="fbillstatus";
/**
*购销类型
*/
public static final String FBUYSELLFLAG="fbuysellflag";
/**
*发票分类
*/
public static final String FINVOICECLASS="finvoiceclass";
/**
*整单扣税类别
*/
public static final String FTAXTYPEFLAGH="ftaxtypeflagh";
/**
*打印次数
*/
public static final String IPRINTCOUNT="iprintcount";
/**
*最后修改时间
*/
public static final String MODIFIEDTIME="modifiedtime";
/**
*最后修改人
*/
public static final String MODIFIER="modifier";
/**
*汇率
*/
public static final String NEXCHANGERATE="nexchangerate";
/**
*全局本位币汇率
*/
public static final String NGLOBALEXCHGRATE="nglobalexchgrate";
/**
*集团本位币汇率
*/
public static final String NGROUPEXCHGRATE="ngroupexchgrate";
/**
*整单税率
*/
public static final String NTAXRATEH="ntaxrateh";
/**
*整单数量
*/
public static final String NTOTALASTNUM="ntotalastnum";
/**
*整单价税合计
*/
public static final String NTOTALORIGMNY="ntotalorigmny";
/**
*银行账户
*/
public static final String PK_BANKACCBAS="pk_bankaccbas";
/**
*业务员
*/
public static final String PK_BIZPSN="pk_bizpsn";
/**
*业务流程
*/
public static final String PK_BUSITYPE="pk_busitype";
/**
*采购发票
*/
public static final String PK_CGFP="pk_cgfp";
/**
*采购部门
*/
public static final String PK_DEPT="pk_dept";
/**
*采购部门
*/
public static final String PK_DEPT_V="pk_dept_v";
/**
*散户
*/
public static final String PK_FREECUST="pk_freecust";
/**
*冻结人
*/
public static final String PK_FROZENUSER="pk_frozenuser";
/**
*所属集团
*/
public static final String PK_GROUP="pk_group";
/**
*财务组织
*/
public static final String PK_ORG="pk_org";
/**
*财务组织
*/
public static final String PK_ORG_V="pk_org_v";
/**
*费用发票对应货物发票
*/
public static final String PK_PARENTINVOICE="pk_parentinvoice";
/**
*付款协议
*/
public static final String PK_PAYTERM="pk_payterm";
/**
*付款单位
*/
public static final String PK_PAYTOSUPPLIER="pk_paytosupplier";
/**
*采购组织
*/
public static final String PK_PURCHASEORG="pk_purchaseorg";
/**
*采购组织
*/
public static final String PK_PURCHASEORG_V="pk_purchaseorg_v";
/**
*库存组织
*/
public static final String PK_STOCKORG="pk_stockorg";
/**
*库存组织
*/
public static final String PK_STOCKORG_V="pk_stockorg_v";
/**
*供应商
*/
public static final String PK_SUPPLIER="pk_supplier";
/**
*审批日期
*/
public static final String TAUDITTIME="taudittime";
/**
*冻结日期
*/
public static final String TFROZENTIME="tfrozentime";
/**
*时间戳
*/
public static final String TS="ts";
/**
*vbankaccount（可持续化字段，可以远程传递值，但不能保存到数据库）
*/
public static final String VBANKACCOUNT="vbankaccount";
/**
*发票号
*/
public static final String VBILLCODE="vbillcode";
/**
*自定义项1
*/
public static final String VDEF1="vdef1";
/**
*自定义项10
*/
public static final String VDEF10="vdef10";
/**
*自定义项11
*/
public static final String VDEF11="vdef11";
/**
*自定义项12
*/
public static final String VDEF12="vdef12";
/**
*自定义项13
*/
public static final String VDEF13="vdef13";
/**
*自定义项14
*/
public static final String VDEF14="vdef14";
/**
*自定义项15
*/
public static final String VDEF15="vdef15";
/**
*自定义项16
*/
public static final String VDEF16="vdef16";
/**
*自定义项17
*/
public static final String VDEF17="vdef17";
/**
*自定义项18
*/
public static final String VDEF18="vdef18";
/**
*自定义项19
*/
public static final String VDEF19="vdef19";
/**
*自定义项2
*/
public static final String VDEF2="vdef2";
/**
*自定义项20
*/
public static final String VDEF20="vdef20";
/**
*自定义项3
*/
public static final String VDEF3="vdef3";
/**
*自定义项4
*/
public static final String VDEF4="vdef4";
/**
*自定义项5
*/
public static final String VDEF5="vdef5";
/**
*自定义项6
*/
public static final String VDEF6="vdef6";
/**
*自定义项7
*/
public static final String VDEF7="vdef7";
/**
*自定义项8
*/
public static final String VDEF8="vdef8";
/**
*自定义项9
*/
public static final String VDEF9="vdef9";
/**
*最后冻结原因
*/
public static final String VFROZENREASON="vfrozenreason";
/**
*备注
*/
public static final String VMEMO="vmemo";
/**
*发票类型编码
*/
public static final String VTRANTYPECODE="vtrantypecode";
/**
*VAT注册码
*/
public static final String VVATCODE="vvatcode";
/**
*供应商VAT注册码
*/
public static final String VVENDORVATCODE="vvendorvatcode";
/** 
* 获取审批人
*
* @return 审批人
*/
public String getApprover () {
return (String) this.getAttributeValue( CgfpHVO.APPROVER);
 } 

/** 
* 设置审批人
*
* @param approver 审批人
*/
public void setApprover ( String approver) {
this.setAttributeValue( CgfpHVO.APPROVER,approver);
 } 

/** 
* 获取已传应付标志
*
* @return 已传应付标志
*/
public UFBoolean getBapflag () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BAPFLAG);
 } 

/** 
* 设置已传应付标志
*
* @param bapflag 已传应付标志
*/
public void setBapflag ( UFBoolean bapflag) {
this.setAttributeValue( CgfpHVO.BAPFLAG,bapflag);
 } 

/** 
* 获取费用发票
*
* @return 费用发票
*/
public UFBoolean getBfee () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BFEE);
 } 

/** 
* 设置费用发票
*
* @param bfee 费用发票
*/
public void setBfee ( UFBoolean bfee) {
this.setAttributeValue( CgfpHVO.BFEE,bfee);
 } 

/** 
* 获取冻结
*
* @return 冻结
*/
public UFBoolean getBfrozen () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BFROZEN);
 } 

/** 
* 设置冻结
*
* @param bfrozen 冻结
*/
public void setBfrozen ( UFBoolean bfrozen) {
this.setAttributeValue( CgfpHVO.BFROZEN,bfrozen);
 } 

/** 
* 获取制单人
*
* @return 制单人
*/
public String getBillmaker () {
return (String) this.getAttributeValue( CgfpHVO.BILLMAKER);
 } 

/** 
* 设置制单人
*
* @param billmaker 制单人
*/
public void setBillmaker ( String billmaker) {
this.setAttributeValue( CgfpHVO.BILLMAKER,billmaker);
 } 

/** 
* 获取是否期初发票
*
* @return 是否期初发票
*/
public UFBoolean getBinitial () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BINITIAL);
 } 

/** 
* 设置是否期初发票
*
* @param binitial 是否期初发票
*/
public void setBinitial ( UFBoolean binitial) {
this.setAttributeValue( CgfpHVO.BINITIAL,binitial);
 } 

/** 
* 获取逆向征税
*
* @return 逆向征税
*/
public UFBoolean getBopptaxflag () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BOPPTAXFLAG);
 } 

/** 
* 设置逆向征税
*
* @param bopptaxflag 逆向征税
*/
public void setBopptaxflag ( UFBoolean bopptaxflag) {
this.setAttributeValue( CgfpHVO.BOPPTAXFLAG,bopptaxflag);
 } 

/** 
* 获取三角贸易
*
* @return 三角贸易
*/
public UFBoolean getBtriatradeflag () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BTRIATRADEFLAG);
 } 

/** 
* 设置三角贸易
*
* @param btriatradeflag 三角贸易
*/
public void setBtriatradeflag ( UFBoolean btriatradeflag) {
this.setAttributeValue( CgfpHVO.BTRIATRADEFLAG,btriatradeflag);
 } 

/** 
* 获取虚拟发票标志
*
* @return 虚拟发票标志
*/
public UFBoolean getBvirtual () {
return (UFBoolean) this.getAttributeValue( CgfpHVO.BVIRTUAL);
 } 

/** 
* 设置虚拟发票标志
*
* @param bvirtual 虚拟发票标志
*/
public void setBvirtual ( UFBoolean bvirtual) {
this.setAttributeValue( CgfpHVO.BVIRTUAL,bvirtual);
 } 

/** 
* 获取本币币种
*
* @return 本币币种
*/
public String getCcurrencyid () {
return (String) this.getAttributeValue( CgfpHVO.CCURRENCYID);
 } 

/** 
* 设置本币币种
*
* @param ccurrencyid 本币币种
*/
public void setCcurrencyid ( String ccurrencyid) {
this.setAttributeValue( CgfpHVO.CCURRENCYID,ccurrencyid);
 } 

/** 
* 获取币种
*
* @return 币种
*/
public String getCorigcurrencyid () {
return (String) this.getAttributeValue( CgfpHVO.CORIGCURRENCYID);
 } 

/** 
* 设置币种
*
* @param corigcurrencyid 币种
*/
public void setCorigcurrencyid ( String corigcurrencyid) {
this.setAttributeValue( CgfpHVO.CORIGCURRENCYID,corigcurrencyid);
 } 

/** 
* 获取创建时间
*
* @return 创建时间
*/
public UFDateTime getCreationtime () {
return (UFDateTime) this.getAttributeValue( CgfpHVO.CREATIONTIME);
 } 

/** 
* 设置创建时间
*
* @param creationtime 创建时间
*/
public void setCreationtime ( UFDateTime creationtime) {
this.setAttributeValue( CgfpHVO.CREATIONTIME,creationtime);
 } 

/** 
* 获取创建人
*
* @return 创建人
*/
public String getCreator () {
return (String) this.getAttributeValue( CgfpHVO.CREATOR);
 } 

/** 
* 设置创建人
*
* @param creator 创建人
*/
public void setCreator ( String creator) {
this.setAttributeValue( CgfpHVO.CREATOR,creator);
 } 

/** 
* 获取收货国家/地区
*
* @return 收货国家/地区
*/
public String getCrececountryid () {
return (String) this.getAttributeValue( CgfpHVO.CRECECOUNTRYID);
 } 

/** 
* 设置收货国家/地区
*
* @param crececountryid 收货国家/地区
*/
public void setCrececountryid ( String crececountryid) {
this.setAttributeValue( CgfpHVO.CRECECOUNTRYID,crececountryid);
 } 

/** 
* 获取发货国家/地区
*
* @return 发货国家/地区
*/
public String getCsendcountryid () {
return (String) this.getAttributeValue( CgfpHVO.CSENDCOUNTRYID);
 } 

/** 
* 设置发货国家/地区
*
* @param csendcountryid 发货国家/地区
*/
public void setCsendcountryid ( String csendcountryid) {
this.setAttributeValue( CgfpHVO.CSENDCOUNTRYID,csendcountryid);
 } 

/** 
* 获取报税国家/地区
*
* @return 报税国家/地区
*/
public String getCtaxcountryid () {
return (String) this.getAttributeValue( CgfpHVO.CTAXCOUNTRYID);
 } 

/** 
* 设置报税国家/地区
*
* @param ctaxcountryid 报税国家/地区
*/
public void setCtaxcountryid ( String ctaxcountryid) {
this.setAttributeValue( CgfpHVO.CTAXCOUNTRYID,ctaxcountryid);
 } 

/** 
* 获取贸易术语
*
* @return 贸易术语
*/
public String getCtradewordid () {
return (String) this.getAttributeValue( CgfpHVO.CTRADEWORDID);
 } 

/** 
* 设置贸易术语
*
* @param ctradewordid 贸易术语
*/
public void setCtradewordid ( String ctradewordid) {
this.setAttributeValue( CgfpHVO.CTRADEWORDID,ctradewordid);
 } 

/** 
* 获取发票类型
*
* @return 发票类型
*/
public String getCtrantypeid () {
return (String) this.getAttributeValue( CgfpHVO.CTRANTYPEID);
 } 

/** 
* 设置发票类型
*
* @param ctrantypeid 发票类型
*/
public void setCtrantypeid ( String ctrantypeid) {
this.setAttributeValue( CgfpHVO.CTRANTYPEID,ctrantypeid);
 } 

/** 
* 获取票到日期
*
* @return 票到日期
*/
public UFDate getDarrivedate () {
return (UFDate) this.getAttributeValue( CgfpHVO.DARRIVEDATE);
 } 

/** 
* 设置票到日期
*
* @param darrivedate 票到日期
*/
public void setDarrivedate ( UFDate darrivedate) {
this.setAttributeValue( CgfpHVO.DARRIVEDATE,darrivedate);
 } 

/** 
* 获取发票日期
*
* @return 发票日期
*/
public UFDate getDbilldate () {
return (UFDate) this.getAttributeValue( CgfpHVO.DBILLDATE);
 } 

/** 
* 设置发票日期
*
* @param dbilldate 发票日期
*/
public void setDbilldate ( UFDate dbilldate) {
this.setAttributeValue( CgfpHVO.DBILLDATE,dbilldate);
 } 

/** 
* 获取制单日期
*
* @return 制单日期
*/
public UFDate getDmakedate () {
return (UFDate) this.getAttributeValue( CgfpHVO.DMAKEDATE);
 } 

/** 
* 设置制单日期
*
* @param dmakedate 制单日期
*/
public void setDmakedate ( UFDate dmakedate) {
this.setAttributeValue( CgfpHVO.DMAKEDATE,dmakedate);
 } 

/** 
* 获取单据状态
*
* @return 单据状态
* @see String
*/
public Integer getFbillstatus () {
return (Integer) this.getAttributeValue( CgfpHVO.FBILLSTATUS);
 } 

/** 
* 设置单据状态
*
* @param fbillstatus 单据状态
* @see String
*/
public void setFbillstatus ( Integer fbillstatus) {
this.setAttributeValue( CgfpHVO.FBILLSTATUS,fbillstatus);
 } 

/** 
* 获取购销类型
*
* @return 购销类型
* @see String
*/
public Integer getFbuysellflag () {
return (Integer) this.getAttributeValue( CgfpHVO.FBUYSELLFLAG);
 } 

/** 
* 设置购销类型
*
* @param fbuysellflag 购销类型
* @see String
*/
public void setFbuysellflag ( Integer fbuysellflag) {
this.setAttributeValue( CgfpHVO.FBUYSELLFLAG,fbuysellflag);
 } 

/** 
* 获取发票分类
*
* @return 发票分类
* @see String
*/
public Integer getFinvoiceclass () {
return (Integer) this.getAttributeValue( CgfpHVO.FINVOICECLASS);
 } 

/** 
* 设置发票分类
*
* @param finvoiceclass 发票分类
* @see String
*/
public void setFinvoiceclass ( Integer finvoiceclass) {
this.setAttributeValue( CgfpHVO.FINVOICECLASS,finvoiceclass);
 } 

/** 
* 获取整单扣税类别
*
* @return 整单扣税类别
* @see String
*/
public Integer getFtaxtypeflagh () {
return (Integer) this.getAttributeValue( CgfpHVO.FTAXTYPEFLAGH);
 } 

/** 
* 设置整单扣税类别
*
* @param ftaxtypeflagh 整单扣税类别
* @see String
*/
public void setFtaxtypeflagh ( Integer ftaxtypeflagh) {
this.setAttributeValue( CgfpHVO.FTAXTYPEFLAGH,ftaxtypeflagh);
 } 

/** 
* 获取打印次数
*
* @return 打印次数
*/
public Integer getIprintcount () {
return (Integer) this.getAttributeValue( CgfpHVO.IPRINTCOUNT);
 } 

/** 
* 设置打印次数
*
* @param iprintcount 打印次数
*/
public void setIprintcount ( Integer iprintcount) {
this.setAttributeValue( CgfpHVO.IPRINTCOUNT,iprintcount);
 } 

/** 
* 获取最后修改时间
*
* @return 最后修改时间
*/
public UFDateTime getModifiedtime () {
return (UFDateTime) this.getAttributeValue( CgfpHVO.MODIFIEDTIME);
 } 

/** 
* 设置最后修改时间
*
* @param modifiedtime 最后修改时间
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.setAttributeValue( CgfpHVO.MODIFIEDTIME,modifiedtime);
 } 

/** 
* 获取最后修改人
*
* @return 最后修改人
*/
public String getModifier () {
return (String) this.getAttributeValue( CgfpHVO.MODIFIER);
 } 

/** 
* 设置最后修改人
*
* @param modifier 最后修改人
*/
public void setModifier ( String modifier) {
this.setAttributeValue( CgfpHVO.MODIFIER,modifier);
 } 

/** 
* 获取汇率
*
* @return 汇率
*/
public UFDouble getNexchangerate () {
return (UFDouble) this.getAttributeValue( CgfpHVO.NEXCHANGERATE);
 } 

/** 
* 设置汇率
*
* @param nexchangerate 汇率
*/
public void setNexchangerate ( UFDouble nexchangerate) {
this.setAttributeValue( CgfpHVO.NEXCHANGERATE,nexchangerate);
 } 

/** 
* 获取全局本位币汇率
*
* @return 全局本位币汇率
*/
public UFDouble getNglobalexchgrate () {
return (UFDouble) this.getAttributeValue( CgfpHVO.NGLOBALEXCHGRATE);
 } 

/** 
* 设置全局本位币汇率
*
* @param nglobalexchgrate 全局本位币汇率
*/
public void setNglobalexchgrate ( UFDouble nglobalexchgrate) {
this.setAttributeValue( CgfpHVO.NGLOBALEXCHGRATE,nglobalexchgrate);
 } 

/** 
* 获取集团本位币汇率
*
* @return 集团本位币汇率
*/
public UFDouble getNgroupexchgrate () {
return (UFDouble) this.getAttributeValue( CgfpHVO.NGROUPEXCHGRATE);
 } 

/** 
* 设置集团本位币汇率
*
* @param ngroupexchgrate 集团本位币汇率
*/
public void setNgroupexchgrate ( UFDouble ngroupexchgrate) {
this.setAttributeValue( CgfpHVO.NGROUPEXCHGRATE,ngroupexchgrate);
 } 

/** 
* 获取整单税率
*
* @return 整单税率
*/
public UFDouble getNtaxrateh () {
return (UFDouble) this.getAttributeValue( CgfpHVO.NTAXRATEH);
 } 

/** 
* 设置整单税率
*
* @param ntaxrateh 整单税率
*/
public void setNtaxrateh ( UFDouble ntaxrateh) {
this.setAttributeValue( CgfpHVO.NTAXRATEH,ntaxrateh);
 } 

/** 
* 获取整单数量
*
* @return 整单数量
*/
public UFDouble getNtotalastnum () {
return (UFDouble) this.getAttributeValue( CgfpHVO.NTOTALASTNUM);
 } 

/** 
* 设置整单数量
*
* @param ntotalastnum 整单数量
*/
public void setNtotalastnum ( UFDouble ntotalastnum) {
this.setAttributeValue( CgfpHVO.NTOTALASTNUM,ntotalastnum);
 } 

/** 
* 获取整单价税合计
*
* @return 整单价税合计
*/
public UFDouble getNtotalorigmny () {
return (UFDouble) this.getAttributeValue( CgfpHVO.NTOTALORIGMNY);
 } 

/** 
* 设置整单价税合计
*
* @param ntotalorigmny 整单价税合计
*/
public void setNtotalorigmny ( UFDouble ntotalorigmny) {
this.setAttributeValue( CgfpHVO.NTOTALORIGMNY,ntotalorigmny);
 } 

/** 
* 获取银行账户
*
* @return 银行账户
*/
public String getPk_bankaccbas () {
return (String) this.getAttributeValue( CgfpHVO.PK_BANKACCBAS);
 } 

/** 
* 设置银行账户
*
* @param pk_bankaccbas 银行账户
*/
public void setPk_bankaccbas ( String pk_bankaccbas) {
this.setAttributeValue( CgfpHVO.PK_BANKACCBAS,pk_bankaccbas);
 } 

/** 
* 获取业务员
*
* @return 业务员
*/
public String getPk_bizpsn () {
return (String) this.getAttributeValue( CgfpHVO.PK_BIZPSN);
 } 

/** 
* 设置业务员
*
* @param pk_bizpsn 业务员
*/
public void setPk_bizpsn ( String pk_bizpsn) {
this.setAttributeValue( CgfpHVO.PK_BIZPSN,pk_bizpsn);
 } 

/** 
* 获取业务流程
*
* @return 业务流程
*/
public String getPk_busitype () {
return (String) this.getAttributeValue( CgfpHVO.PK_BUSITYPE);
 } 

/** 
* 设置业务流程
*
* @param pk_busitype 业务流程
*/
public void setPk_busitype ( String pk_busitype) {
this.setAttributeValue( CgfpHVO.PK_BUSITYPE,pk_busitype);
 } 

/** 
* 获取采购发票
*
* @return 采购发票
*/
public String getPk_cgfp () {
return (String) this.getAttributeValue( CgfpHVO.PK_CGFP);
 } 

/** 
* 设置采购发票
*
* @param pk_cgfp 采购发票
*/
public void setPk_cgfp ( String pk_cgfp) {
this.setAttributeValue( CgfpHVO.PK_CGFP,pk_cgfp);
 } 

/** 
* 获取采购部门
*
* @return 采购部门
*/
public String getPk_dept () {
return (String) this.getAttributeValue( CgfpHVO.PK_DEPT);
 } 

/** 
* 设置采购部门
*
* @param pk_dept 采购部门
*/
public void setPk_dept ( String pk_dept) {
this.setAttributeValue( CgfpHVO.PK_DEPT,pk_dept);
 } 

/** 
* 获取采购部门
*
* @return 采购部门
*/
public String getPk_dept_v () {
return (String) this.getAttributeValue( CgfpHVO.PK_DEPT_V);
 } 

/** 
* 设置采购部门
*
* @param pk_dept_v 采购部门
*/
public void setPk_dept_v ( String pk_dept_v) {
this.setAttributeValue( CgfpHVO.PK_DEPT_V,pk_dept_v);
 } 

/** 
* 获取散户
*
* @return 散户
*/
public String getPk_freecust () {
return (String) this.getAttributeValue( CgfpHVO.PK_FREECUST);
 } 

/** 
* 设置散户
*
* @param pk_freecust 散户
*/
public void setPk_freecust ( String pk_freecust) {
this.setAttributeValue( CgfpHVO.PK_FREECUST,pk_freecust);
 } 

/** 
* 获取冻结人
*
* @return 冻结人
*/
public String getPk_frozenuser () {
return (String) this.getAttributeValue( CgfpHVO.PK_FROZENUSER);
 } 

/** 
* 设置冻结人
*
* @param pk_frozenuser 冻结人
*/
public void setPk_frozenuser ( String pk_frozenuser) {
this.setAttributeValue( CgfpHVO.PK_FROZENUSER,pk_frozenuser);
 } 

/** 
* 获取所属集团
*
* @return 所属集团
*/
public String getPk_group () {
return (String) this.getAttributeValue( CgfpHVO.PK_GROUP);
 } 

/** 
* 设置所属集团
*
* @param pk_group 所属集团
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( CgfpHVO.PK_GROUP,pk_group);
 } 

/** 
* 获取财务组织
*
* @return 财务组织
*/
public String getPk_org () {
return (String) this.getAttributeValue( CgfpHVO.PK_ORG);
 } 

/** 
* 设置财务组织
*
* @param pk_org 财务组织
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( CgfpHVO.PK_ORG,pk_org);
 } 

/** 
* 获取财务组织
*
* @return 财务组织
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( CgfpHVO.PK_ORG_V);
 } 

/** 
* 设置财务组织
*
* @param pk_org_v 财务组织
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( CgfpHVO.PK_ORG_V,pk_org_v);
 } 

/** 
* 获取费用发票对应货物发票
*
* @return 费用发票对应货物发票
*/
public String getPk_parentinvoice () {
return (String) this.getAttributeValue( CgfpHVO.PK_PARENTINVOICE);
 } 

/** 
* 设置费用发票对应货物发票
*
* @param pk_parentinvoice 费用发票对应货物发票
*/
public void setPk_parentinvoice ( String pk_parentinvoice) {
this.setAttributeValue( CgfpHVO.PK_PARENTINVOICE,pk_parentinvoice);
 } 

/** 
* 获取付款协议
*
* @return 付款协议
*/
public String getPk_payterm () {
return (String) this.getAttributeValue( CgfpHVO.PK_PAYTERM);
 } 

/** 
* 设置付款协议
*
* @param pk_payterm 付款协议
*/
public void setPk_payterm ( String pk_payterm) {
this.setAttributeValue( CgfpHVO.PK_PAYTERM,pk_payterm);
 } 

/** 
* 获取付款单位
*
* @return 付款单位
*/
public String getPk_paytosupplier () {
return (String) this.getAttributeValue( CgfpHVO.PK_PAYTOSUPPLIER);
 } 

/** 
* 设置付款单位
*
* @param pk_paytosupplier 付款单位
*/
public void setPk_paytosupplier ( String pk_paytosupplier) {
this.setAttributeValue( CgfpHVO.PK_PAYTOSUPPLIER,pk_paytosupplier);
 } 

/** 
* 获取采购组织
*
* @return 采购组织
*/
public String getPk_purchaseorg () {
return (String) this.getAttributeValue( CgfpHVO.PK_PURCHASEORG);
 } 

/** 
* 设置采购组织
*
* @param pk_purchaseorg 采购组织
*/
public void setPk_purchaseorg ( String pk_purchaseorg) {
this.setAttributeValue( CgfpHVO.PK_PURCHASEORG,pk_purchaseorg);
 } 

/** 
* 获取采购组织
*
* @return 采购组织
*/
public String getPk_purchaseorg_v () {
return (String) this.getAttributeValue( CgfpHVO.PK_PURCHASEORG_V);
 } 

/** 
* 设置采购组织
*
* @param pk_purchaseorg_v 采购组织
*/
public void setPk_purchaseorg_v ( String pk_purchaseorg_v) {
this.setAttributeValue( CgfpHVO.PK_PURCHASEORG_V,pk_purchaseorg_v);
 } 

/** 
* 获取库存组织
*
* @return 库存组织
*/
public String getPk_stockorg () {
return (String) this.getAttributeValue( CgfpHVO.PK_STOCKORG);
 } 

/** 
* 设置库存组织
*
* @param pk_stockorg 库存组织
*/
public void setPk_stockorg ( String pk_stockorg) {
this.setAttributeValue( CgfpHVO.PK_STOCKORG,pk_stockorg);
 } 

/** 
* 获取库存组织
*
* @return 库存组织
*/
public String getPk_stockorg_v () {
return (String) this.getAttributeValue( CgfpHVO.PK_STOCKORG_V);
 } 

/** 
* 设置库存组织
*
* @param pk_stockorg_v 库存组织
*/
public void setPk_stockorg_v ( String pk_stockorg_v) {
this.setAttributeValue( CgfpHVO.PK_STOCKORG_V,pk_stockorg_v);
 } 

/** 
* 获取供应商
*
* @return 供应商
*/
public String getPk_supplier () {
return (String) this.getAttributeValue( CgfpHVO.PK_SUPPLIER);
 } 

/** 
* 设置供应商
*
* @param pk_supplier 供应商
*/
public void setPk_supplier ( String pk_supplier) {
this.setAttributeValue( CgfpHVO.PK_SUPPLIER,pk_supplier);
 } 

/** 
* 获取审批日期
*
* @return 审批日期
*/
public UFDateTime getTaudittime () {
return (UFDateTime) this.getAttributeValue( CgfpHVO.TAUDITTIME);
 } 

/** 
* 设置审批日期
*
* @param taudittime 审批日期
*/
public void setTaudittime ( UFDateTime taudittime) {
this.setAttributeValue( CgfpHVO.TAUDITTIME,taudittime);
 } 

/** 
* 获取冻结日期
*
* @return 冻结日期
*/
public UFDate getTfrozentime () {
return (UFDate) this.getAttributeValue( CgfpHVO.TFROZENTIME);
 } 

/** 
* 设置冻结日期
*
* @param tfrozentime 冻结日期
*/
public void setTfrozentime ( UFDate tfrozentime) {
this.setAttributeValue( CgfpHVO.TFROZENTIME,tfrozentime);
 } 

/** 
* 获取时间戳
*
* @return 时间戳
*/
public UFDateTime getTs () {
return (UFDateTime) this.getAttributeValue( CgfpHVO.TS);
 } 

/** 
* 设置时间戳
*
* @param ts 时间戳
*/
public void setTs ( UFDateTime ts) {
this.setAttributeValue( CgfpHVO.TS,ts);
 } 

/** 
* 获取vbankaccount（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @return vbankaccount
*/
public String getVbankaccount () {
return (String) this.getAttributeValue( CgfpHVO.VBANKACCOUNT);
 } 

/** 
* 设置vbankaccount（可持续化字段，可以远程传递值，但不能保存到数据库）
*
* @param vbankaccount vbankaccount
*/
public void setVbankaccount ( String vbankaccount) {
this.setAttributeValue( CgfpHVO.VBANKACCOUNT,vbankaccount);
 } 

/** 
* 获取发票号
*
* @return 发票号
*/
public String getVbillcode () {
return (String) this.getAttributeValue( CgfpHVO.VBILLCODE);
 } 

/** 
* 设置发票号
*
* @param vbillcode 发票号
*/
public void setVbillcode ( String vbillcode) {
this.setAttributeValue( CgfpHVO.VBILLCODE,vbillcode);
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getVdef1 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF1);
 } 

/** 
* 设置自定义项1
*
* @param vdef1 自定义项1
*/
public void setVdef1 ( String vdef1) {
this.setAttributeValue( CgfpHVO.VDEF1,vdef1);
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public String getVdef10 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF10);
 } 

/** 
* 设置自定义项10
*
* @param vdef10 自定义项10
*/
public void setVdef10 ( String vdef10) {
this.setAttributeValue( CgfpHVO.VDEF10,vdef10);
 } 

/** 
* 获取自定义项11
*
* @return 自定义项11
*/
public String getVdef11 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF11);
 } 

/** 
* 设置自定义项11
*
* @param vdef11 自定义项11
*/
public void setVdef11 ( String vdef11) {
this.setAttributeValue( CgfpHVO.VDEF11,vdef11);
 } 

/** 
* 获取自定义项12
*
* @return 自定义项12
*/
public String getVdef12 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF12);
 } 

/** 
* 设置自定义项12
*
* @param vdef12 自定义项12
*/
public void setVdef12 ( String vdef12) {
this.setAttributeValue( CgfpHVO.VDEF12,vdef12);
 } 

/** 
* 获取自定义项13
*
* @return 自定义项13
*/
public String getVdef13 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF13);
 } 

/** 
* 设置自定义项13
*
* @param vdef13 自定义项13
*/
public void setVdef13 ( String vdef13) {
this.setAttributeValue( CgfpHVO.VDEF13,vdef13);
 } 

/** 
* 获取自定义项14
*
* @return 自定义项14
*/
public String getVdef14 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF14);
 } 

/** 
* 设置自定义项14
*
* @param vdef14 自定义项14
*/
public void setVdef14 ( String vdef14) {
this.setAttributeValue( CgfpHVO.VDEF14,vdef14);
 } 

/** 
* 获取自定义项15
*
* @return 自定义项15
*/
public String getVdef15 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF15);
 } 

/** 
* 设置自定义项15
*
* @param vdef15 自定义项15
*/
public void setVdef15 ( String vdef15) {
this.setAttributeValue( CgfpHVO.VDEF15,vdef15);
 } 

/** 
* 获取自定义项16
*
* @return 自定义项16
*/
public String getVdef16 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF16);
 } 

/** 
* 设置自定义项16
*
* @param vdef16 自定义项16
*/
public void setVdef16 ( String vdef16) {
this.setAttributeValue( CgfpHVO.VDEF16,vdef16);
 } 

/** 
* 获取自定义项17
*
* @return 自定义项17
*/
public String getVdef17 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF17);
 } 

/** 
* 设置自定义项17
*
* @param vdef17 自定义项17
*/
public void setVdef17 ( String vdef17) {
this.setAttributeValue( CgfpHVO.VDEF17,vdef17);
 } 

/** 
* 获取自定义项18
*
* @return 自定义项18
*/
public String getVdef18 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF18);
 } 

/** 
* 设置自定义项18
*
* @param vdef18 自定义项18
*/
public void setVdef18 ( String vdef18) {
this.setAttributeValue( CgfpHVO.VDEF18,vdef18);
 } 

/** 
* 获取自定义项19
*
* @return 自定义项19
*/
public String getVdef19 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF19);
 } 

/** 
* 设置自定义项19
*
* @param vdef19 自定义项19
*/
public void setVdef19 ( String vdef19) {
this.setAttributeValue( CgfpHVO.VDEF19,vdef19);
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getVdef2 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF2);
 } 

/** 
* 设置自定义项2
*
* @param vdef2 自定义项2
*/
public void setVdef2 ( String vdef2) {
this.setAttributeValue( CgfpHVO.VDEF2,vdef2);
 } 

/** 
* 获取自定义项20
*
* @return 自定义项20
*/
public String getVdef20 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF20);
 } 

/** 
* 设置自定义项20
*
* @param vdef20 自定义项20
*/
public void setVdef20 ( String vdef20) {
this.setAttributeValue( CgfpHVO.VDEF20,vdef20);
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getVdef3 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF3);
 } 

/** 
* 设置自定义项3
*
* @param vdef3 自定义项3
*/
public void setVdef3 ( String vdef3) {
this.setAttributeValue( CgfpHVO.VDEF3,vdef3);
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getVdef4 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF4);
 } 

/** 
* 设置自定义项4
*
* @param vdef4 自定义项4
*/
public void setVdef4 ( String vdef4) {
this.setAttributeValue( CgfpHVO.VDEF4,vdef4);
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getVdef5 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF5);
 } 

/** 
* 设置自定义项5
*
* @param vdef5 自定义项5
*/
public void setVdef5 ( String vdef5) {
this.setAttributeValue( CgfpHVO.VDEF5,vdef5);
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public String getVdef6 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF6);
 } 

/** 
* 设置自定义项6
*
* @param vdef6 自定义项6
*/
public void setVdef6 ( String vdef6) {
this.setAttributeValue( CgfpHVO.VDEF6,vdef6);
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public String getVdef7 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF7);
 } 

/** 
* 设置自定义项7
*
* @param vdef7 自定义项7
*/
public void setVdef7 ( String vdef7) {
this.setAttributeValue( CgfpHVO.VDEF7,vdef7);
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public String getVdef8 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF8);
 } 

/** 
* 设置自定义项8
*
* @param vdef8 自定义项8
*/
public void setVdef8 ( String vdef8) {
this.setAttributeValue( CgfpHVO.VDEF8,vdef8);
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public String getVdef9 () {
return (String) this.getAttributeValue( CgfpHVO.VDEF9);
 } 

/** 
* 设置自定义项9
*
* @param vdef9 自定义项9
*/
public void setVdef9 ( String vdef9) {
this.setAttributeValue( CgfpHVO.VDEF9,vdef9);
 } 

/** 
* 获取最后冻结原因
*
* @return 最后冻结原因
*/
public String getVfrozenreason () {
return (String) this.getAttributeValue( CgfpHVO.VFROZENREASON);
 } 

/** 
* 设置最后冻结原因
*
* @param vfrozenreason 最后冻结原因
*/
public void setVfrozenreason ( String vfrozenreason) {
this.setAttributeValue( CgfpHVO.VFROZENREASON,vfrozenreason);
 } 

/** 
* 获取备注
*
* @return 备注
*/
public String getVmemo () {
return (String) this.getAttributeValue( CgfpHVO.VMEMO);
 } 

/** 
* 设置备注
*
* @param vmemo 备注
*/
public void setVmemo ( String vmemo) {
this.setAttributeValue( CgfpHVO.VMEMO,vmemo);
 } 

/** 
* 获取发票类型编码
*
* @return 发票类型编码
*/
public String getVtrantypecode () {
return (String) this.getAttributeValue( CgfpHVO.VTRANTYPECODE);
 } 

/** 
* 设置发票类型编码
*
* @param vtrantypecode 发票类型编码
*/
public void setVtrantypecode ( String vtrantypecode) {
this.setAttributeValue( CgfpHVO.VTRANTYPECODE,vtrantypecode);
 } 

/** 
* 获取VAT注册码
*
* @return VAT注册码
*/
public String getVvatcode () {
return (String) this.getAttributeValue( CgfpHVO.VVATCODE);
 } 

/** 
* 设置VAT注册码
*
* @param vvatcode VAT注册码
*/
public void setVvatcode ( String vvatcode) {
this.setAttributeValue( CgfpHVO.VVATCODE,vvatcode);
 } 

/** 
* 获取供应商VAT注册码
*
* @return 供应商VAT注册码
*/
public String getVvendorvatcode () {
return (String) this.getAttributeValue( CgfpHVO.VVENDORVATCODE);
 } 

/** 
* 设置供应商VAT注册码
*
* @param vvendorvatcode 供应商VAT注册码
*/
public void setVvendorvatcode ( String vvendorvatcode) {
this.setAttributeValue( CgfpHVO.VVENDORVATCODE,vvendorvatcode);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("devlu.cgfp");
  }
}