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
*审核人
*/
public String approver;
/**
*审核时间
*/
public UFDateTime approvetime;
/**
*制单人
*/
public String billmaker;
/**
*业务流程
*/
public String cbiztypeid;
/**
*客户银行账号
*/
public String ccustbankaccid;
/**
*币种
*/
public String corigcurrencyid;
/**
*创建时间
*/
public UFDateTime creationtime;
/**
*创建人
*/
public String creator;
/**
*发票主实体
*/
public String csaleinvoiceid;
/**
*发票类型
*/
public String ctrantypeid;
/**
*开票日期
*/
public UFDate dbilldate;
/**
*制单日期
*/
public UFDate dmakedate;
/**
*单据状态
*/
public Integer fstatusflag;
/**
*最后修改时间
*/
public UFDate modifiedtime;
/**
*最后修改人
*/
public String modifier;
/**
*价税合计
*/
public UFDouble ntotalorigmny;
/**
*集团
*/
public String pk_group;
/**
*开票组织
*/
public String pk_org;
/**
*开票组织版本
*/
public String pk_org_v;
/**
*时间戳
*/
public UFDateTime ts;
/**
*发票号
*/
public String vbillcode;
/**
*自定义项1
*/
public String vdef1;
/**
*自定义项10
*/
public String vdef10;
/**
*自定义项2
*/
public String vdef2;
/**
*自定义项3
*/
public String vdef3;
/**
*自定义项4
*/
public String vdef4;
/**
*自定义项5
*/
public String vdef5;
/**
*自定义项6
*/
public String vdef6;
/**
*自定义项7
*/
public String vdef7;
/**
*自定义项8
*/
public String vdef8;
/**
*自定义项9
*/
public String vdef9;
/**
*发票类型编码
*/
public String vtrantypecode;
/** 
* 获取审核人
*
* @return 审核人
*/
public String getApprover () {
return this.approver;
 } 

/** 
* 设置审核人
*
* @param approver 审核人
*/
public void setApprover ( String approver) {
this.approver=approver;
 } 

/** 
* 获取审核时间
*
* @return 审核时间
*/
public UFDateTime getApprovetime () {
return this.approvetime;
 } 

/** 
* 设置审核时间
*
* @param approvetime 审核时间
*/
public void setApprovetime ( UFDateTime approvetime) {
this.approvetime=approvetime;
 } 

/** 
* 获取制单人
*
* @return 制单人
*/
public String getBillmaker () {
return this.billmaker;
 } 

/** 
* 设置制单人
*
* @param billmaker 制单人
*/
public void setBillmaker ( String billmaker) {
this.billmaker=billmaker;
 } 

/** 
* 获取业务流程
*
* @return 业务流程
*/
public String getCbiztypeid () {
return this.cbiztypeid;
 } 

/** 
* 设置业务流程
*
* @param cbiztypeid 业务流程
*/
public void setCbiztypeid ( String cbiztypeid) {
this.cbiztypeid=cbiztypeid;
 } 

/** 
* 获取客户银行账号
*
* @return 客户银行账号
*/
public String getCcustbankaccid () {
return this.ccustbankaccid;
 } 

/** 
* 设置客户银行账号
*
* @param ccustbankaccid 客户银行账号
*/
public void setCcustbankaccid ( String ccustbankaccid) {
this.ccustbankaccid=ccustbankaccid;
 } 

/** 
* 获取币种
*
* @return 币种
*/
public String getCorigcurrencyid () {
return this.corigcurrencyid;
 } 

/** 
* 设置币种
*
* @param corigcurrencyid 币种
*/
public void setCorigcurrencyid ( String corigcurrencyid) {
this.corigcurrencyid=corigcurrencyid;
 } 

/** 
* 获取创建时间
*
* @return 创建时间
*/
public UFDateTime getCreationtime () {
return this.creationtime;
 } 

/** 
* 设置创建时间
*
* @param creationtime 创建时间
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
 } 

/** 
* 获取创建人
*
* @return 创建人
*/
public String getCreator () {
return this.creator;
 } 

/** 
* 设置创建人
*
* @param creator 创建人
*/
public void setCreator ( String creator) {
this.creator=creator;
 } 

/** 
* 获取发票主实体
*
* @return 发票主实体
*/
public String getCsaleinvoiceid () {
return this.csaleinvoiceid;
 } 

/** 
* 设置发票主实体
*
* @param csaleinvoiceid 发票主实体
*/
public void setCsaleinvoiceid ( String csaleinvoiceid) {
this.csaleinvoiceid=csaleinvoiceid;
 } 

/** 
* 获取发票类型
*
* @return 发票类型
*/
public String getCtrantypeid () {
return this.ctrantypeid;
 } 

/** 
* 设置发票类型
*
* @param ctrantypeid 发票类型
*/
public void setCtrantypeid ( String ctrantypeid) {
this.ctrantypeid=ctrantypeid;
 } 

/** 
* 获取开票日期
*
* @return 开票日期
*/
public UFDate getDbilldate () {
return this.dbilldate;
 } 

/** 
* 设置开票日期
*
* @param dbilldate 开票日期
*/
public void setDbilldate ( UFDate dbilldate) {
this.dbilldate=dbilldate;
 } 

/** 
* 获取制单日期
*
* @return 制单日期
*/
public UFDate getDmakedate () {
return this.dmakedate;
 } 

/** 
* 设置制单日期
*
* @param dmakedate 制单日期
*/
public void setDmakedate ( UFDate dmakedate) {
this.dmakedate=dmakedate;
 } 

/** 
* 获取单据状态
*
* @return 单据状态
* @see String
*/
public Integer getFstatusflag () {
return this.fstatusflag;
 } 

/** 
* 设置单据状态
*
* @param fstatusflag 单据状态
* @see String
*/
public void setFstatusflag ( Integer fstatusflag) {
this.fstatusflag=fstatusflag;
 } 

/** 
* 获取最后修改时间
*
* @return 最后修改时间
*/
public UFDate getModifiedtime () {
return this.modifiedtime;
 } 

/** 
* 设置最后修改时间
*
* @param modifiedtime 最后修改时间
*/
public void setModifiedtime ( UFDate modifiedtime) {
this.modifiedtime=modifiedtime;
 } 

/** 
* 获取最后修改人
*
* @return 最后修改人
*/
public String getModifier () {
return this.modifier;
 } 

/** 
* 设置最后修改人
*
* @param modifier 最后修改人
*/
public void setModifier ( String modifier) {
this.modifier=modifier;
 } 

/** 
* 获取价税合计
*
* @return 价税合计
*/
public UFDouble getNtotalorigmny () {
return this.ntotalorigmny;
 } 

/** 
* 设置价税合计
*
* @param ntotalorigmny 价税合计
*/
public void setNtotalorigmny ( UFDouble ntotalorigmny) {
this.ntotalorigmny=ntotalorigmny;
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
* 获取开票组织版本
*
* @return 开票组织版本
*/
public String getPk_org_v () {
return this.pk_org_v;
 } 

/** 
* 设置开票组织版本
*
* @param pk_org_v 开票组织版本
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
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
* 获取发票号
*
* @return 发票号
*/
public String getVbillcode () {
return this.vbillcode;
 } 

/** 
* 设置发票号
*
* @param vbillcode 发票号
*/
public void setVbillcode ( String vbillcode) {
this.vbillcode=vbillcode;
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getVdef1 () {
return this.vdef1;
 } 

/** 
* 设置自定义项1
*
* @param vdef1 自定义项1
*/
public void setVdef1 ( String vdef1) {
this.vdef1=vdef1;
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public String getVdef10 () {
return this.vdef10;
 } 

/** 
* 设置自定义项10
*
* @param vdef10 自定义项10
*/
public void setVdef10 ( String vdef10) {
this.vdef10=vdef10;
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getVdef2 () {
return this.vdef2;
 } 

/** 
* 设置自定义项2
*
* @param vdef2 自定义项2
*/
public void setVdef2 ( String vdef2) {
this.vdef2=vdef2;
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getVdef3 () {
return this.vdef3;
 } 

/** 
* 设置自定义项3
*
* @param vdef3 自定义项3
*/
public void setVdef3 ( String vdef3) {
this.vdef3=vdef3;
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getVdef4 () {
return this.vdef4;
 } 

/** 
* 设置自定义项4
*
* @param vdef4 自定义项4
*/
public void setVdef4 ( String vdef4) {
this.vdef4=vdef4;
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getVdef5 () {
return this.vdef5;
 } 

/** 
* 设置自定义项5
*
* @param vdef5 自定义项5
*/
public void setVdef5 ( String vdef5) {
this.vdef5=vdef5;
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public String getVdef6 () {
return this.vdef6;
 } 

/** 
* 设置自定义项6
*
* @param vdef6 自定义项6
*/
public void setVdef6 ( String vdef6) {
this.vdef6=vdef6;
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public String getVdef7 () {
return this.vdef7;
 } 

/** 
* 设置自定义项7
*
* @param vdef7 自定义项7
*/
public void setVdef7 ( String vdef7) {
this.vdef7=vdef7;
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public String getVdef8 () {
return this.vdef8;
 } 

/** 
* 设置自定义项8
*
* @param vdef8 自定义项8
*/
public void setVdef8 ( String vdef8) {
this.vdef8=vdef8;
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public String getVdef9 () {
return this.vdef9;
 } 

/** 
* 设置自定义项9
*
* @param vdef9 自定义项9
*/
public void setVdef9 ( String vdef9) {
this.vdef9=vdef9;
 } 

/** 
* 获取发票类型编码
*
* @return 发票类型编码
*/
public String getVtrantypecode () {
return this.vtrantypecode;
 } 

/** 
* 设置发票类型编码
*
* @param vtrantypecode 发票类型编码
*/
public void setVtrantypecode ( String vtrantypecode) {
this.vtrantypecode=vtrantypecode;
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("devlu.xsfp");
  }
}