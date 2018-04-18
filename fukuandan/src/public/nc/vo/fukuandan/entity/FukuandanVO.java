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
*附件张数
*/
public Integer accessorynum;
/**
*审核日期
*/
public UFDateTime approvedate;
/**
*审核日期
*/
public UFDate approvedated;
/**
*审核人
*/
public String approver;
/**
*审批状态
*/
public Integer approvestatus;
/**
*资金计划项目
*/
public String bankrollprojet;
/**
*单据大类
*/
public String billclass;
/**
*单据日期
*/
public UFDate billdate;
/**
*制单人
*/
public String billmaker;
/**
*单据号
*/
public String billno;
/**
*单据会计期间
*/
public String billperiod;
/**
*单据状态
*/
public Integer billstatus;
/**
*单据会计年度
*/
public String billyear;
/**
*起算日期
*/
public UFDate busidate;
/**
*现金账户
*/
public String cashaccount;
/**
*现金流量项目
*/
public String cashitem;
/**
*责任核算要素
*/
public String checkelement;
/**
*承付开始日期
*/
public UFDate commpaybegindate;
/**
*承付截止日期
*/
public UFDate commpayenddate;
/**
*单据确认人
*/
public String confirmuser;
/**
*托收协议号
*/
public String consignagreement;
/**
*单据协同标志
*/
public Integer coordflag;
/**
*成本中心
*/
public String costcenter;
/**
*创建时间
*/
public UFDateTime creationtime;
/**
*创建人
*/
public String creator;
/**
*债权人参考号
*/
public String creditorreference;
/**
*贷方引用信息标准
*/
public String creditrefstd;
/**
*代垫单位
*/
public String custdelegate;
/**
*客户
*/
public String customer;
/**
*自定义项1
*/
public String def1;
/**
*自定义项10
*/
public String def10;
/**
*自定义项11
*/
public String def11;
/**
*自定义项12
*/
public String def12;
/**
*自定义项13
*/
public String def13;
/**
*自定义项14
*/
public String def14;
/**
*自定义项15
*/
public String def15;
/**
*自定义项16
*/
public String def16;
/**
*自定义项17
*/
public String def17;
/**
*自定义项18
*/
public String def18;
/**
*自定义项19
*/
public String def19;
/**
*自定义项2
*/
public String def2;
/**
*自定义项20
*/
public String def20;
/**
*自定义项21
*/
public String def21;
/**
*自定义项22
*/
public String def22;
/**
*自定义项23
*/
public String def23;
/**
*自定义项24
*/
public String def24;
/**
*自定义项25
*/
public String def25;
/**
*自定义项26
*/
public String def26;
/**
*自定义项27
*/
public String def27;
/**
*自定义项28
*/
public String def28;
/**
*自定义项29
*/
public String def29;
/**
*自定义项3
*/
public String def3;
/**
*自定义项30
*/
public String def30;
/**
*自定义项4
*/
public String def4;
/**
*自定义项5
*/
public String def5;
/**
*自定义项6
*/
public String def6;
/**
*自定义项7
*/
public String def7;
/**
*自定义项8
*/
public String def8;
/**
*自定义项9
*/
public String def9;
/**
*生效日期
*/
public UFDate effectdate;
/**
*生效状态
*/
public Integer effectstatus;
/**
*生效人
*/
public String effectuser;
/**
*期望处理日
*/
public UFDate expectdealdate;
/**
*失败原因
*/
public String failurereason;
/**
*全局本币金额
*/
public UFDouble globallocal;
/**
*全局本币汇率
*/
public UFDouble globalrate;
/**
*集团本币金额
*/
public UFDouble grouplocal;
/**
*集团本币汇率
*/
public UFDouble grouprate;
/**
*发票号
*/
public String invoiceno;
/**
*是否流程单据
*/
public UFBoolean isflowbill;
/**
*承付
*/
public UFBoolean isforce;
/**
*是否独立结算信息
*/
public UFBoolean isfromindependent;
/**
*期初标志
*/
public UFBoolean isinit;
/**
*提交资金组织结算
*/
public UFBoolean ismandatepay;
/**
*是否已经补录
*/
public UFBoolean isnetpayready;
/**
*是否网上支付
*/
public UFBoolean isonlinepay;
/**
*红冲标志
*/
public UFBoolean isreded;
/**
*最终调整人
*/
public String lastadjustuser;
/**
*最终审批人
*/
public String lastapproveid;
/**
*组织本币金额
*/
public UFDouble local_money;
/**
*最后修改时间
*/
public UFDateTime modifiedtime;
/**
*最后修改人
*/
public String modifier;
/**
*原币金额
*/
public UFDouble money;
/**
*往来对象
*/
public Integer objtype;
/**
*正式打印日期
*/
public UFDate officialprintdate;
/**
*正式打印人
*/
public String officialprintuser;
/**
*外系统业务类型
*/
public String outbusitype;
/**
*付款银行账户
*/
public String payaccount;
/**
*支付日期
*/
public UFDate paydate;
/**
*支付人
*/
public String payman;
/**
*支付原因
*/
public String payreason;
/**
*结算方式
*/
public String pk_balatype;
/**
*单据类型编码
*/
public String pk_billtype;
/**
*业务流程
*/
public String pk_busitype;
/**
*单位编码
*/
public String pk_corp;
/**
*币种
*/
public String pk_currtype;
/**
*部门
*/
public String pk_deptid;
/**
*部 门
*/
public String pk_deptid_v;
/**
*财务组织
*/
public String pk_fiorg;
/**
*财务组织版本主键
*/
public String pk_fiorg_v;
/**
*付款单标识
*/
public String pk_fukuandan;
/**
*所属集团
*/
public String pk_group;
/**
*付款财务组织
*/
public String pk_org;
/**
*付款财务组织版本主键
*/
public String pk_org_v;
/**
*利润中心
*/
public String pk_pcorg;
/**
*利润中心版本主键
*/
public String pk_pcorg_v;
/**
*业务员
*/
public String pk_psndoc;
/**
*收支项目
*/
public String pk_subjcode;
/**
*付款类型code
*/
public String pk_tradetype;
/**
*付款类型
*/
public String pk_tradetypeid;
/**
*采购部门
*/
public String pu_deptid;
/**
*采购 部门
*/
public String pu_deptid_v;
/**
*采购组织
*/
public String pu_org;
/**
*采购组织版本主键
*/
public String pu_org_v;
/**
*采购业务员
*/
public String pu_psndoc;
/**
*组织本币汇率
*/
public UFDouble rate;
/**
*收款银行账户
*/
public String recaccount;
/**
*退回原因
*/
public String reversalreason;
/**
*摘要
*/
public String scomment;
/**
*直接借记退回标记
*/
public UFBoolean sddreversalflag;
/**
*结算财务组织
*/
public String sett_org;
/**
*结算财务组织版本主键
*/
public String sett_org_v;
/**
*结算状态
*/
public Integer settleflag;
/**
*结算号
*/
public String settlenum;
/**
*结算类型
*/
public Integer settletype;
/**
*签字确认日期
*/
public UFDate signdate;
/**
*签字确认期间
*/
public String signperiod;
/**
*签字确认人
*/
public String signuser;
/**
*签字确认年度
*/
public String signyear;
/**
*单据来源系统
*/
public Integer src_syscode;
/**
*科目
*/
public String subjcode;
/**
*供应商
*/
public String supplier;
/**
*单据所属系统
*/
public Integer syscode;
/**
*时间戳
*/
public UFDateTime ts;
/** 
* 获取附件张数
*
* @return 附件张数
*/
public Integer getAccessorynum () {
return this.accessorynum;
 } 

/** 
* 设置附件张数
*
* @param accessorynum 附件张数
*/
public void setAccessorynum ( Integer accessorynum) {
this.accessorynum=accessorynum;
 } 

/** 
* 获取审核日期
*
* @return 审核日期
*/
public UFDateTime getApprovedate () {
return this.approvedate;
 } 

/** 
* 设置审核日期
*
* @param approvedate 审核日期
*/
public void setApprovedate ( UFDateTime approvedate) {
this.approvedate=approvedate;
 } 

/** 
* 获取审核日期
*
* @return 审核日期
*/
public UFDate getApprovedated () {
return this.approvedated;
 } 

/** 
* 设置审核日期
*
* @param approvedated 审核日期
*/
public void setApprovedated ( UFDate approvedated) {
this.approvedated=approvedated;
 } 

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
* 获取审批状态
*
* @return 审批状态
* @see String
*/
public Integer getApprovestatus () {
return this.approvestatus;
 } 

/** 
* 设置审批状态
*
* @param approvestatus 审批状态
* @see String
*/
public void setApprovestatus ( Integer approvestatus) {
this.approvestatus=approvestatus;
 } 

/** 
* 获取资金计划项目
*
* @return 资金计划项目
*/
public String getBankrollprojet () {
return this.bankrollprojet;
 } 

/** 
* 设置资金计划项目
*
* @param bankrollprojet 资金计划项目
*/
public void setBankrollprojet ( String bankrollprojet) {
this.bankrollprojet=bankrollprojet;
 } 

/** 
* 获取单据大类
*
* @return 单据大类
* @see String
*/
public String getBillclass () {
return this.billclass;
 } 

/** 
* 设置单据大类
*
* @param billclass 单据大类
* @see String
*/
public void setBillclass ( String billclass) {
this.billclass=billclass;
 } 

/** 
* 获取单据日期
*
* @return 单据日期
*/
public UFDate getBilldate () {
return this.billdate;
 } 

/** 
* 设置单据日期
*
* @param billdate 单据日期
*/
public void setBilldate ( UFDate billdate) {
this.billdate=billdate;
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
* 获取单据号
*
* @return 单据号
*/
public String getBillno () {
return this.billno;
 } 

/** 
* 设置单据号
*
* @param billno 单据号
*/
public void setBillno ( String billno) {
this.billno=billno;
 } 

/** 
* 获取单据会计期间
*
* @return 单据会计期间
*/
public String getBillperiod () {
return this.billperiod;
 } 

/** 
* 设置单据会计期间
*
* @param billperiod 单据会计期间
*/
public void setBillperiod ( String billperiod) {
this.billperiod=billperiod;
 } 

/** 
* 获取单据状态
*
* @return 单据状态
* @see String
*/
public Integer getBillstatus () {
return this.billstatus;
 } 

/** 
* 设置单据状态
*
* @param billstatus 单据状态
* @see String
*/
public void setBillstatus ( Integer billstatus) {
this.billstatus=billstatus;
 } 

/** 
* 获取单据会计年度
*
* @return 单据会计年度
*/
public String getBillyear () {
return this.billyear;
 } 

/** 
* 设置单据会计年度
*
* @param billyear 单据会计年度
*/
public void setBillyear ( String billyear) {
this.billyear=billyear;
 } 

/** 
* 获取起算日期
*
* @return 起算日期
*/
public UFDate getBusidate () {
return this.busidate;
 } 

/** 
* 设置起算日期
*
* @param busidate 起算日期
*/
public void setBusidate ( UFDate busidate) {
this.busidate=busidate;
 } 

/** 
* 获取现金账户
*
* @return 现金账户
*/
public String getCashaccount () {
return this.cashaccount;
 } 

/** 
* 设置现金账户
*
* @param cashaccount 现金账户
*/
public void setCashaccount ( String cashaccount) {
this.cashaccount=cashaccount;
 } 

/** 
* 获取现金流量项目
*
* @return 现金流量项目
*/
public String getCashitem () {
return this.cashitem;
 } 

/** 
* 设置现金流量项目
*
* @param cashitem 现金流量项目
*/
public void setCashitem ( String cashitem) {
this.cashitem=cashitem;
 } 

/** 
* 获取责任核算要素
*
* @return 责任核算要素
*/
public String getCheckelement () {
return this.checkelement;
 } 

/** 
* 设置责任核算要素
*
* @param checkelement 责任核算要素
*/
public void setCheckelement ( String checkelement) {
this.checkelement=checkelement;
 } 

/** 
* 获取承付开始日期
*
* @return 承付开始日期
*/
public UFDate getCommpaybegindate () {
return this.commpaybegindate;
 } 

/** 
* 设置承付开始日期
*
* @param commpaybegindate 承付开始日期
*/
public void setCommpaybegindate ( UFDate commpaybegindate) {
this.commpaybegindate=commpaybegindate;
 } 

/** 
* 获取承付截止日期
*
* @return 承付截止日期
*/
public UFDate getCommpayenddate () {
return this.commpayenddate;
 } 

/** 
* 设置承付截止日期
*
* @param commpayenddate 承付截止日期
*/
public void setCommpayenddate ( UFDate commpayenddate) {
this.commpayenddate=commpayenddate;
 } 

/** 
* 获取单据确认人
*
* @return 单据确认人
*/
public String getConfirmuser () {
return this.confirmuser;
 } 

/** 
* 设置单据确认人
*
* @param confirmuser 单据确认人
*/
public void setConfirmuser ( String confirmuser) {
this.confirmuser=confirmuser;
 } 

/** 
* 获取托收协议号
*
* @return 托收协议号
*/
public String getConsignagreement () {
return this.consignagreement;
 } 

/** 
* 设置托收协议号
*
* @param consignagreement 托收协议号
*/
public void setConsignagreement ( String consignagreement) {
this.consignagreement=consignagreement;
 } 

/** 
* 获取单据协同标志
*
* @return 单据协同标志
* @see String
*/
public Integer getCoordflag () {
return this.coordflag;
 } 

/** 
* 设置单据协同标志
*
* @param coordflag 单据协同标志
* @see String
*/
public void setCoordflag ( Integer coordflag) {
this.coordflag=coordflag;
 } 

/** 
* 获取成本中心
*
* @return 成本中心
*/
public String getCostcenter () {
return this.costcenter;
 } 

/** 
* 设置成本中心
*
* @param costcenter 成本中心
*/
public void setCostcenter ( String costcenter) {
this.costcenter=costcenter;
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
* 获取债权人参考号
*
* @return 债权人参考号
*/
public String getCreditorreference () {
return this.creditorreference;
 } 

/** 
* 设置债权人参考号
*
* @param creditorreference 债权人参考号
*/
public void setCreditorreference ( String creditorreference) {
this.creditorreference=creditorreference;
 } 

/** 
* 获取贷方引用信息标准
*
* @return 贷方引用信息标准
* @see String
*/
public String getCreditrefstd () {
return this.creditrefstd;
 } 

/** 
* 设置贷方引用信息标准
*
* @param creditrefstd 贷方引用信息标准
* @see String
*/
public void setCreditrefstd ( String creditrefstd) {
this.creditrefstd=creditrefstd;
 } 

/** 
* 获取代垫单位
*
* @return 代垫单位
*/
public String getCustdelegate () {
return this.custdelegate;
 } 

/** 
* 设置代垫单位
*
* @param custdelegate 代垫单位
*/
public void setCustdelegate ( String custdelegate) {
this.custdelegate=custdelegate;
 } 

/** 
* 获取客户
*
* @return 客户
*/
public String getCustomer () {
return this.customer;
 } 

/** 
* 设置客户
*
* @param customer 客户
*/
public void setCustomer ( String customer) {
this.customer=customer;
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getDef1 () {
return this.def1;
 } 

/** 
* 设置自定义项1
*
* @param def1 自定义项1
*/
public void setDef1 ( String def1) {
this.def1=def1;
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public String getDef10 () {
return this.def10;
 } 

/** 
* 设置自定义项10
*
* @param def10 自定义项10
*/
public void setDef10 ( String def10) {
this.def10=def10;
 } 

/** 
* 获取自定义项11
*
* @return 自定义项11
*/
public String getDef11 () {
return this.def11;
 } 

/** 
* 设置自定义项11
*
* @param def11 自定义项11
*/
public void setDef11 ( String def11) {
this.def11=def11;
 } 

/** 
* 获取自定义项12
*
* @return 自定义项12
*/
public String getDef12 () {
return this.def12;
 } 

/** 
* 设置自定义项12
*
* @param def12 自定义项12
*/
public void setDef12 ( String def12) {
this.def12=def12;
 } 

/** 
* 获取自定义项13
*
* @return 自定义项13
*/
public String getDef13 () {
return this.def13;
 } 

/** 
* 设置自定义项13
*
* @param def13 自定义项13
*/
public void setDef13 ( String def13) {
this.def13=def13;
 } 

/** 
* 获取自定义项14
*
* @return 自定义项14
*/
public String getDef14 () {
return this.def14;
 } 

/** 
* 设置自定义项14
*
* @param def14 自定义项14
*/
public void setDef14 ( String def14) {
this.def14=def14;
 } 

/** 
* 获取自定义项15
*
* @return 自定义项15
*/
public String getDef15 () {
return this.def15;
 } 

/** 
* 设置自定义项15
*
* @param def15 自定义项15
*/
public void setDef15 ( String def15) {
this.def15=def15;
 } 

/** 
* 获取自定义项16
*
* @return 自定义项16
*/
public String getDef16 () {
return this.def16;
 } 

/** 
* 设置自定义项16
*
* @param def16 自定义项16
*/
public void setDef16 ( String def16) {
this.def16=def16;
 } 

/** 
* 获取自定义项17
*
* @return 自定义项17
*/
public String getDef17 () {
return this.def17;
 } 

/** 
* 设置自定义项17
*
* @param def17 自定义项17
*/
public void setDef17 ( String def17) {
this.def17=def17;
 } 

/** 
* 获取自定义项18
*
* @return 自定义项18
*/
public String getDef18 () {
return this.def18;
 } 

/** 
* 设置自定义项18
*
* @param def18 自定义项18
*/
public void setDef18 ( String def18) {
this.def18=def18;
 } 

/** 
* 获取自定义项19
*
* @return 自定义项19
*/
public String getDef19 () {
return this.def19;
 } 

/** 
* 设置自定义项19
*
* @param def19 自定义项19
*/
public void setDef19 ( String def19) {
this.def19=def19;
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getDef2 () {
return this.def2;
 } 

/** 
* 设置自定义项2
*
* @param def2 自定义项2
*/
public void setDef2 ( String def2) {
this.def2=def2;
 } 

/** 
* 获取自定义项20
*
* @return 自定义项20
*/
public String getDef20 () {
return this.def20;
 } 

/** 
* 设置自定义项20
*
* @param def20 自定义项20
*/
public void setDef20 ( String def20) {
this.def20=def20;
 } 

/** 
* 获取自定义项21
*
* @return 自定义项21
*/
public String getDef21 () {
return this.def21;
 } 

/** 
* 设置自定义项21
*
* @param def21 自定义项21
*/
public void setDef21 ( String def21) {
this.def21=def21;
 } 

/** 
* 获取自定义项22
*
* @return 自定义项22
*/
public String getDef22 () {
return this.def22;
 } 

/** 
* 设置自定义项22
*
* @param def22 自定义项22
*/
public void setDef22 ( String def22) {
this.def22=def22;
 } 

/** 
* 获取自定义项23
*
* @return 自定义项23
*/
public String getDef23 () {
return this.def23;
 } 

/** 
* 设置自定义项23
*
* @param def23 自定义项23
*/
public void setDef23 ( String def23) {
this.def23=def23;
 } 

/** 
* 获取自定义项24
*
* @return 自定义项24
*/
public String getDef24 () {
return this.def24;
 } 

/** 
* 设置自定义项24
*
* @param def24 自定义项24
*/
public void setDef24 ( String def24) {
this.def24=def24;
 } 

/** 
* 获取自定义项25
*
* @return 自定义项25
*/
public String getDef25 () {
return this.def25;
 } 

/** 
* 设置自定义项25
*
* @param def25 自定义项25
*/
public void setDef25 ( String def25) {
this.def25=def25;
 } 

/** 
* 获取自定义项26
*
* @return 自定义项26
*/
public String getDef26 () {
return this.def26;
 } 

/** 
* 设置自定义项26
*
* @param def26 自定义项26
*/
public void setDef26 ( String def26) {
this.def26=def26;
 } 

/** 
* 获取自定义项27
*
* @return 自定义项27
*/
public String getDef27 () {
return this.def27;
 } 

/** 
* 设置自定义项27
*
* @param def27 自定义项27
*/
public void setDef27 ( String def27) {
this.def27=def27;
 } 

/** 
* 获取自定义项28
*
* @return 自定义项28
*/
public String getDef28 () {
return this.def28;
 } 

/** 
* 设置自定义项28
*
* @param def28 自定义项28
*/
public void setDef28 ( String def28) {
this.def28=def28;
 } 

/** 
* 获取自定义项29
*
* @return 自定义项29
*/
public String getDef29 () {
return this.def29;
 } 

/** 
* 设置自定义项29
*
* @param def29 自定义项29
*/
public void setDef29 ( String def29) {
this.def29=def29;
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getDef3 () {
return this.def3;
 } 

/** 
* 设置自定义项3
*
* @param def3 自定义项3
*/
public void setDef3 ( String def3) {
this.def3=def3;
 } 

/** 
* 获取自定义项30
*
* @return 自定义项30
*/
public String getDef30 () {
return this.def30;
 } 

/** 
* 设置自定义项30
*
* @param def30 自定义项30
*/
public void setDef30 ( String def30) {
this.def30=def30;
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getDef4 () {
return this.def4;
 } 

/** 
* 设置自定义项4
*
* @param def4 自定义项4
*/
public void setDef4 ( String def4) {
this.def4=def4;
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getDef5 () {
return this.def5;
 } 

/** 
* 设置自定义项5
*
* @param def5 自定义项5
*/
public void setDef5 ( String def5) {
this.def5=def5;
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public String getDef6 () {
return this.def6;
 } 

/** 
* 设置自定义项6
*
* @param def6 自定义项6
*/
public void setDef6 ( String def6) {
this.def6=def6;
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public String getDef7 () {
return this.def7;
 } 

/** 
* 设置自定义项7
*
* @param def7 自定义项7
*/
public void setDef7 ( String def7) {
this.def7=def7;
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public String getDef8 () {
return this.def8;
 } 

/** 
* 设置自定义项8
*
* @param def8 自定义项8
*/
public void setDef8 ( String def8) {
this.def8=def8;
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public String getDef9 () {
return this.def9;
 } 

/** 
* 设置自定义项9
*
* @param def9 自定义项9
*/
public void setDef9 ( String def9) {
this.def9=def9;
 } 

/** 
* 获取生效日期
*
* @return 生效日期
*/
public UFDate getEffectdate () {
return this.effectdate;
 } 

/** 
* 设置生效日期
*
* @param effectdate 生效日期
*/
public void setEffectdate ( UFDate effectdate) {
this.effectdate=effectdate;
 } 

/** 
* 获取生效状态
*
* @return 生效状态
* @see String
*/
public Integer getEffectstatus () {
return this.effectstatus;
 } 

/** 
* 设置生效状态
*
* @param effectstatus 生效状态
* @see String
*/
public void setEffectstatus ( Integer effectstatus) {
this.effectstatus=effectstatus;
 } 

/** 
* 获取生效人
*
* @return 生效人
*/
public String getEffectuser () {
return this.effectuser;
 } 

/** 
* 设置生效人
*
* @param effectuser 生效人
*/
public void setEffectuser ( String effectuser) {
this.effectuser=effectuser;
 } 

/** 
* 获取期望处理日
*
* @return 期望处理日
*/
public UFDate getExpectdealdate () {
return this.expectdealdate;
 } 

/** 
* 设置期望处理日
*
* @param expectdealdate 期望处理日
*/
public void setExpectdealdate ( UFDate expectdealdate) {
this.expectdealdate=expectdealdate;
 } 

/** 
* 获取失败原因
*
* @return 失败原因
*/
public String getFailurereason () {
return this.failurereason;
 } 

/** 
* 设置失败原因
*
* @param failurereason 失败原因
*/
public void setFailurereason ( String failurereason) {
this.failurereason=failurereason;
 } 

/** 
* 获取全局本币金额
*
* @return 全局本币金额
*/
public UFDouble getGloballocal () {
return this.globallocal;
 } 

/** 
* 设置全局本币金额
*
* @param globallocal 全局本币金额
*/
public void setGloballocal ( UFDouble globallocal) {
this.globallocal=globallocal;
 } 

/** 
* 获取全局本币汇率
*
* @return 全局本币汇率
*/
public UFDouble getGlobalrate () {
return this.globalrate;
 } 

/** 
* 设置全局本币汇率
*
* @param globalrate 全局本币汇率
*/
public void setGlobalrate ( UFDouble globalrate) {
this.globalrate=globalrate;
 } 

/** 
* 获取集团本币金额
*
* @return 集团本币金额
*/
public UFDouble getGrouplocal () {
return this.grouplocal;
 } 

/** 
* 设置集团本币金额
*
* @param grouplocal 集团本币金额
*/
public void setGrouplocal ( UFDouble grouplocal) {
this.grouplocal=grouplocal;
 } 

/** 
* 获取集团本币汇率
*
* @return 集团本币汇率
*/
public UFDouble getGrouprate () {
return this.grouprate;
 } 

/** 
* 设置集团本币汇率
*
* @param grouprate 集团本币汇率
*/
public void setGrouprate ( UFDouble grouprate) {
this.grouprate=grouprate;
 } 

/** 
* 获取发票号
*
* @return 发票号
*/
public String getInvoiceno () {
return this.invoiceno;
 } 

/** 
* 设置发票号
*
* @param invoiceno 发票号
*/
public void setInvoiceno ( String invoiceno) {
this.invoiceno=invoiceno;
 } 

/** 
* 获取是否流程单据
*
* @return 是否流程单据
*/
public UFBoolean getIsflowbill () {
return this.isflowbill;
 } 

/** 
* 设置是否流程单据
*
* @param isflowbill 是否流程单据
*/
public void setIsflowbill ( UFBoolean isflowbill) {
this.isflowbill=isflowbill;
 } 

/** 
* 获取承付
*
* @return 承付
*/
public UFBoolean getIsforce () {
return this.isforce;
 } 

/** 
* 设置承付
*
* @param isforce 承付
*/
public void setIsforce ( UFBoolean isforce) {
this.isforce=isforce;
 } 

/** 
* 获取是否独立结算信息
*
* @return 是否独立结算信息
*/
public UFBoolean getIsfromindependent () {
return this.isfromindependent;
 } 

/** 
* 设置是否独立结算信息
*
* @param isfromindependent 是否独立结算信息
*/
public void setIsfromindependent ( UFBoolean isfromindependent) {
this.isfromindependent=isfromindependent;
 } 

/** 
* 获取期初标志
*
* @return 期初标志
*/
public UFBoolean getIsinit () {
return this.isinit;
 } 

/** 
* 设置期初标志
*
* @param isinit 期初标志
*/
public void setIsinit ( UFBoolean isinit) {
this.isinit=isinit;
 } 

/** 
* 获取提交资金组织结算
*
* @return 提交资金组织结算
*/
public UFBoolean getIsmandatepay () {
return this.ismandatepay;
 } 

/** 
* 设置提交资金组织结算
*
* @param ismandatepay 提交资金组织结算
*/
public void setIsmandatepay ( UFBoolean ismandatepay) {
this.ismandatepay=ismandatepay;
 } 

/** 
* 获取是否已经补录
*
* @return 是否已经补录
*/
public UFBoolean getIsnetpayready () {
return this.isnetpayready;
 } 

/** 
* 设置是否已经补录
*
* @param isnetpayready 是否已经补录
*/
public void setIsnetpayready ( UFBoolean isnetpayready) {
this.isnetpayready=isnetpayready;
 } 

/** 
* 获取是否网上支付
*
* @return 是否网上支付
*/
public UFBoolean getIsonlinepay () {
return this.isonlinepay;
 } 

/** 
* 设置是否网上支付
*
* @param isonlinepay 是否网上支付
*/
public void setIsonlinepay ( UFBoolean isonlinepay) {
this.isonlinepay=isonlinepay;
 } 

/** 
* 获取红冲标志
*
* @return 红冲标志
*/
public UFBoolean getIsreded () {
return this.isreded;
 } 

/** 
* 设置红冲标志
*
* @param isreded 红冲标志
*/
public void setIsreded ( UFBoolean isreded) {
this.isreded=isreded;
 } 

/** 
* 获取最终调整人
*
* @return 最终调整人
*/
public String getLastadjustuser () {
return this.lastadjustuser;
 } 

/** 
* 设置最终调整人
*
* @param lastadjustuser 最终调整人
*/
public void setLastadjustuser ( String lastadjustuser) {
this.lastadjustuser=lastadjustuser;
 } 

/** 
* 获取最终审批人
*
* @return 最终审批人
*/
public String getLastapproveid () {
return this.lastapproveid;
 } 

/** 
* 设置最终审批人
*
* @param lastapproveid 最终审批人
*/
public void setLastapproveid ( String lastapproveid) {
this.lastapproveid=lastapproveid;
 } 

/** 
* 获取组织本币金额
*
* @return 组织本币金额
*/
public UFDouble getLocal_money () {
return this.local_money;
 } 

/** 
* 设置组织本币金额
*
* @param local_money 组织本币金额
*/
public void setLocal_money ( UFDouble local_money) {
this.local_money=local_money;
 } 

/** 
* 获取最后修改时间
*
* @return 最后修改时间
*/
public UFDateTime getModifiedtime () {
return this.modifiedtime;
 } 

/** 
* 设置最后修改时间
*
* @param modifiedtime 最后修改时间
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
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
* 获取原币金额
*
* @return 原币金额
*/
public UFDouble getMoney () {
return this.money;
 } 

/** 
* 设置原币金额
*
* @param money 原币金额
*/
public void setMoney ( UFDouble money) {
this.money=money;
 } 

/** 
* 获取往来对象
*
* @return 往来对象
* @see String
*/
public Integer getObjtype () {
return this.objtype;
 } 

/** 
* 设置往来对象
*
* @param objtype 往来对象
* @see String
*/
public void setObjtype ( Integer objtype) {
this.objtype=objtype;
 } 

/** 
* 获取正式打印日期
*
* @return 正式打印日期
*/
public UFDate getOfficialprintdate () {
return this.officialprintdate;
 } 

/** 
* 设置正式打印日期
*
* @param officialprintdate 正式打印日期
*/
public void setOfficialprintdate ( UFDate officialprintdate) {
this.officialprintdate=officialprintdate;
 } 

/** 
* 获取正式打印人
*
* @return 正式打印人
*/
public String getOfficialprintuser () {
return this.officialprintuser;
 } 

/** 
* 设置正式打印人
*
* @param officialprintuser 正式打印人
*/
public void setOfficialprintuser ( String officialprintuser) {
this.officialprintuser=officialprintuser;
 } 

/** 
* 获取外系统业务类型
*
* @return 外系统业务类型
*/
public String getOutbusitype () {
return this.outbusitype;
 } 

/** 
* 设置外系统业务类型
*
* @param outbusitype 外系统业务类型
*/
public void setOutbusitype ( String outbusitype) {
this.outbusitype=outbusitype;
 } 

/** 
* 获取付款银行账户
*
* @return 付款银行账户
*/
public String getPayaccount () {
return this.payaccount;
 } 

/** 
* 设置付款银行账户
*
* @param payaccount 付款银行账户
*/
public void setPayaccount ( String payaccount) {
this.payaccount=payaccount;
 } 

/** 
* 获取支付日期
*
* @return 支付日期
*/
public UFDate getPaydate () {
return this.paydate;
 } 

/** 
* 设置支付日期
*
* @param paydate 支付日期
*/
public void setPaydate ( UFDate paydate) {
this.paydate=paydate;
 } 

/** 
* 获取支付人
*
* @return 支付人
*/
public String getPayman () {
return this.payman;
 } 

/** 
* 设置支付人
*
* @param payman 支付人
*/
public void setPayman ( String payman) {
this.payman=payman;
 } 

/** 
* 获取支付原因
*
* @return 支付原因
* @see String
*/
public String getPayreason () {
return this.payreason;
 } 

/** 
* 设置支付原因
*
* @param payreason 支付原因
* @see String
*/
public void setPayreason ( String payreason) {
this.payreason=payreason;
 } 

/** 
* 获取结算方式
*
* @return 结算方式
*/
public String getPk_balatype () {
return this.pk_balatype;
 } 

/** 
* 设置结算方式
*
* @param pk_balatype 结算方式
*/
public void setPk_balatype ( String pk_balatype) {
this.pk_balatype=pk_balatype;
 } 

/** 
* 获取单据类型编码
*
* @return 单据类型编码
*/
public String getPk_billtype () {
return this.pk_billtype;
 } 

/** 
* 设置单据类型编码
*
* @param pk_billtype 单据类型编码
*/
public void setPk_billtype ( String pk_billtype) {
this.pk_billtype=pk_billtype;
 } 

/** 
* 获取业务流程
*
* @return 业务流程
*/
public String getPk_busitype () {
return this.pk_busitype;
 } 

/** 
* 设置业务流程
*
* @param pk_busitype 业务流程
*/
public void setPk_busitype ( String pk_busitype) {
this.pk_busitype=pk_busitype;
 } 

/** 
* 获取单位编码
*
* @return 单位编码
*/
public String getPk_corp () {
return this.pk_corp;
 } 

/** 
* 设置单位编码
*
* @param pk_corp 单位编码
*/
public void setPk_corp ( String pk_corp) {
this.pk_corp=pk_corp;
 } 

/** 
* 获取币种
*
* @return 币种
*/
public String getPk_currtype () {
return this.pk_currtype;
 } 

/** 
* 设置币种
*
* @param pk_currtype 币种
*/
public void setPk_currtype ( String pk_currtype) {
this.pk_currtype=pk_currtype;
 } 

/** 
* 获取部门
*
* @return 部门
*/
public String getPk_deptid () {
return this.pk_deptid;
 } 

/** 
* 设置部门
*
* @param pk_deptid 部门
*/
public void setPk_deptid ( String pk_deptid) {
this.pk_deptid=pk_deptid;
 } 

/** 
* 获取部 门
*
* @return 部 门
*/
public String getPk_deptid_v () {
return this.pk_deptid_v;
 } 

/** 
* 设置部 门
*
* @param pk_deptid_v 部 门
*/
public void setPk_deptid_v ( String pk_deptid_v) {
this.pk_deptid_v=pk_deptid_v;
 } 

/** 
* 获取财务组织
*
* @return 财务组织
*/
public String getPk_fiorg () {
return this.pk_fiorg;
 } 

/** 
* 设置财务组织
*
* @param pk_fiorg 财务组织
*/
public void setPk_fiorg ( String pk_fiorg) {
this.pk_fiorg=pk_fiorg;
 } 

/** 
* 获取财务组织版本主键
*
* @return 财务组织版本主键
*/
public String getPk_fiorg_v () {
return this.pk_fiorg_v;
 } 

/** 
* 设置财务组织版本主键
*
* @param pk_fiorg_v 财务组织版本主键
*/
public void setPk_fiorg_v ( String pk_fiorg_v) {
this.pk_fiorg_v=pk_fiorg_v;
 } 

/** 
* 获取付款单标识
*
* @return 付款单标识
*/
public String getPk_fukuandan () {
return this.pk_fukuandan;
 } 

/** 
* 设置付款单标识
*
* @param pk_fukuandan 付款单标识
*/
public void setPk_fukuandan ( String pk_fukuandan) {
this.pk_fukuandan=pk_fukuandan;
 } 

/** 
* 获取所属集团
*
* @return 所属集团
*/
public String getPk_group () {
return this.pk_group;
 } 

/** 
* 设置所属集团
*
* @param pk_group 所属集团
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
 } 

/** 
* 获取付款财务组织
*
* @return 付款财务组织
*/
public String getPk_org () {
return this.pk_org;
 } 

/** 
* 设置付款财务组织
*
* @param pk_org 付款财务组织
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
 } 

/** 
* 获取付款财务组织版本主键
*
* @return 付款财务组织版本主键
*/
public String getPk_org_v () {
return this.pk_org_v;
 } 

/** 
* 设置付款财务组织版本主键
*
* @param pk_org_v 付款财务组织版本主键
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
 } 

/** 
* 获取利润中心
*
* @return 利润中心
*/
public String getPk_pcorg () {
return this.pk_pcorg;
 } 

/** 
* 设置利润中心
*
* @param pk_pcorg 利润中心
*/
public void setPk_pcorg ( String pk_pcorg) {
this.pk_pcorg=pk_pcorg;
 } 

/** 
* 获取利润中心版本主键
*
* @return 利润中心版本主键
*/
public String getPk_pcorg_v () {
return this.pk_pcorg_v;
 } 

/** 
* 设置利润中心版本主键
*
* @param pk_pcorg_v 利润中心版本主键
*/
public void setPk_pcorg_v ( String pk_pcorg_v) {
this.pk_pcorg_v=pk_pcorg_v;
 } 

/** 
* 获取业务员
*
* @return 业务员
*/
public String getPk_psndoc () {
return this.pk_psndoc;
 } 

/** 
* 设置业务员
*
* @param pk_psndoc 业务员
*/
public void setPk_psndoc ( String pk_psndoc) {
this.pk_psndoc=pk_psndoc;
 } 

/** 
* 获取收支项目
*
* @return 收支项目
*/
public String getPk_subjcode () {
return this.pk_subjcode;
 } 

/** 
* 设置收支项目
*
* @param pk_subjcode 收支项目
*/
public void setPk_subjcode ( String pk_subjcode) {
this.pk_subjcode=pk_subjcode;
 } 

/** 
* 获取付款类型code
*
* @return 付款类型code
*/
public String getPk_tradetype () {
return this.pk_tradetype;
 } 

/** 
* 设置付款类型code
*
* @param pk_tradetype 付款类型code
*/
public void setPk_tradetype ( String pk_tradetype) {
this.pk_tradetype=pk_tradetype;
 } 

/** 
* 获取付款类型
*
* @return 付款类型
*/
public String getPk_tradetypeid () {
return this.pk_tradetypeid;
 } 

/** 
* 设置付款类型
*
* @param pk_tradetypeid 付款类型
*/
public void setPk_tradetypeid ( String pk_tradetypeid) {
this.pk_tradetypeid=pk_tradetypeid;
 } 

/** 
* 获取采购部门
*
* @return 采购部门
*/
public String getPu_deptid () {
return this.pu_deptid;
 } 

/** 
* 设置采购部门
*
* @param pu_deptid 采购部门
*/
public void setPu_deptid ( String pu_deptid) {
this.pu_deptid=pu_deptid;
 } 

/** 
* 获取采购 部门
*
* @return 采购 部门
*/
public String getPu_deptid_v () {
return this.pu_deptid_v;
 } 

/** 
* 设置采购 部门
*
* @param pu_deptid_v 采购 部门
*/
public void setPu_deptid_v ( String pu_deptid_v) {
this.pu_deptid_v=pu_deptid_v;
 } 

/** 
* 获取采购组织
*
* @return 采购组织
*/
public String getPu_org () {
return this.pu_org;
 } 

/** 
* 设置采购组织
*
* @param pu_org 采购组织
*/
public void setPu_org ( String pu_org) {
this.pu_org=pu_org;
 } 

/** 
* 获取采购组织版本主键
*
* @return 采购组织版本主键
*/
public String getPu_org_v () {
return this.pu_org_v;
 } 

/** 
* 设置采购组织版本主键
*
* @param pu_org_v 采购组织版本主键
*/
public void setPu_org_v ( String pu_org_v) {
this.pu_org_v=pu_org_v;
 } 

/** 
* 获取采购业务员
*
* @return 采购业务员
*/
public String getPu_psndoc () {
return this.pu_psndoc;
 } 

/** 
* 设置采购业务员
*
* @param pu_psndoc 采购业务员
*/
public void setPu_psndoc ( String pu_psndoc) {
this.pu_psndoc=pu_psndoc;
 } 

/** 
* 获取组织本币汇率
*
* @return 组织本币汇率
*/
public UFDouble getRate () {
return this.rate;
 } 

/** 
* 设置组织本币汇率
*
* @param rate 组织本币汇率
*/
public void setRate ( UFDouble rate) {
this.rate=rate;
 } 

/** 
* 获取收款银行账户
*
* @return 收款银行账户
*/
public String getRecaccount () {
return this.recaccount;
 } 

/** 
* 设置收款银行账户
*
* @param recaccount 收款银行账户
*/
public void setRecaccount ( String recaccount) {
this.recaccount=recaccount;
 } 

/** 
* 获取退回原因
*
* @return 退回原因
* @see String
*/
public String getReversalreason () {
return this.reversalreason;
 } 

/** 
* 设置退回原因
*
* @param reversalreason 退回原因
* @see String
*/
public void setReversalreason ( String reversalreason) {
this.reversalreason=reversalreason;
 } 

/** 
* 获取摘要
*
* @return 摘要
*/
public String getScomment () {
return this.scomment;
 } 

/** 
* 设置摘要
*
* @param scomment 摘要
*/
public void setScomment ( String scomment) {
this.scomment=scomment;
 } 

/** 
* 获取直接借记退回标记
*
* @return 直接借记退回标记
*/
public UFBoolean getSddreversalflag () {
return this.sddreversalflag;
 } 

/** 
* 设置直接借记退回标记
*
* @param sddreversalflag 直接借记退回标记
*/
public void setSddreversalflag ( UFBoolean sddreversalflag) {
this.sddreversalflag=sddreversalflag;
 } 

/** 
* 获取结算财务组织
*
* @return 结算财务组织
*/
public String getSett_org () {
return this.sett_org;
 } 

/** 
* 设置结算财务组织
*
* @param sett_org 结算财务组织
*/
public void setSett_org ( String sett_org) {
this.sett_org=sett_org;
 } 

/** 
* 获取结算财务组织版本主键
*
* @return 结算财务组织版本主键
*/
public String getSett_org_v () {
return this.sett_org_v;
 } 

/** 
* 设置结算财务组织版本主键
*
* @param sett_org_v 结算财务组织版本主键
*/
public void setSett_org_v ( String sett_org_v) {
this.sett_org_v=sett_org_v;
 } 

/** 
* 获取结算状态
*
* @return 结算状态
* @see String
*/
public Integer getSettleflag () {
return this.settleflag;
 } 

/** 
* 设置结算状态
*
* @param settleflag 结算状态
* @see String
*/
public void setSettleflag ( Integer settleflag) {
this.settleflag=settleflag;
 } 

/** 
* 获取结算号
*
* @return 结算号
*/
public String getSettlenum () {
return this.settlenum;
 } 

/** 
* 设置结算号
*
* @param settlenum 结算号
*/
public void setSettlenum ( String settlenum) {
this.settlenum=settlenum;
 } 

/** 
* 获取结算类型
*
* @return 结算类型
* @see String
*/
public Integer getSettletype () {
return this.settletype;
 } 

/** 
* 设置结算类型
*
* @param settletype 结算类型
* @see String
*/
public void setSettletype ( Integer settletype) {
this.settletype=settletype;
 } 

/** 
* 获取签字确认日期
*
* @return 签字确认日期
*/
public UFDate getSigndate () {
return this.signdate;
 } 

/** 
* 设置签字确认日期
*
* @param signdate 签字确认日期
*/
public void setSigndate ( UFDate signdate) {
this.signdate=signdate;
 } 

/** 
* 获取签字确认期间
*
* @return 签字确认期间
*/
public String getSignperiod () {
return this.signperiod;
 } 

/** 
* 设置签字确认期间
*
* @param signperiod 签字确认期间
*/
public void setSignperiod ( String signperiod) {
this.signperiod=signperiod;
 } 

/** 
* 获取签字确认人
*
* @return 签字确认人
*/
public String getSignuser () {
return this.signuser;
 } 

/** 
* 设置签字确认人
*
* @param signuser 签字确认人
*/
public void setSignuser ( String signuser) {
this.signuser=signuser;
 } 

/** 
* 获取签字确认年度
*
* @return 签字确认年度
*/
public String getSignyear () {
return this.signyear;
 } 

/** 
* 设置签字确认年度
*
* @param signyear 签字确认年度
*/
public void setSignyear ( String signyear) {
this.signyear=signyear;
 } 

/** 
* 获取单据来源系统
*
* @return 单据来源系统
* @see String
*/
public Integer getSrc_syscode () {
return this.src_syscode;
 } 

/** 
* 设置单据来源系统
*
* @param src_syscode 单据来源系统
* @see String
*/
public void setSrc_syscode ( Integer src_syscode) {
this.src_syscode=src_syscode;
 } 

/** 
* 获取科目
*
* @return 科目
*/
public String getSubjcode () {
return this.subjcode;
 } 

/** 
* 设置科目
*
* @param subjcode 科目
*/
public void setSubjcode ( String subjcode) {
this.subjcode=subjcode;
 } 

/** 
* 获取供应商
*
* @return 供应商
*/
public String getSupplier () {
return this.supplier;
 } 

/** 
* 设置供应商
*
* @param supplier 供应商
*/
public void setSupplier ( String supplier) {
this.supplier=supplier;
 } 

/** 
* 获取单据所属系统
*
* @return 单据所属系统
* @see String
*/
public Integer getSyscode () {
return this.syscode;
 } 

/** 
* 设置单据所属系统
*
* @param syscode 单据所属系统
* @see String
*/
public void setSyscode ( Integer syscode) {
this.syscode=syscode;
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


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("baal.fukuandan");
  }
}