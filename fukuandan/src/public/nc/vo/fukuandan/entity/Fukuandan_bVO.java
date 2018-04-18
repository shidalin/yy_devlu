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
*托收组织本币
*/
public UFDouble agentreceivelocal;
/**
*托收原币金额
*/
public UFDouble agentreceiveprimal;
/**
*资产合同号
*/
public String assetpactno;
/**
*对账标识码
*/
public String bankrelated_code;
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
*单据号
*/
public String billno;
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
*票据方向
*/
public String checkdirection;
/**
*责任核算要素
*/
public String checkelement;
/**
*票据号
*/
public String checkno;
/**
*票据类型
*/
public String checktype;
/**
*承付人
*/
public String commpayer;
/**
*承付状态
*/
public Integer commpaystatus;
/**
*承付类型
*/
public Integer commpaytype;
/**
*内部交易结算号
*/
public String confernum;
/**
*合同号
*/
public String contractno;
/**
*单据协同状态
*/
public Integer coordflag;
/**
*成本中心
*/
public String costcenter;
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
*方向
*/
public Integer direction;
/**
*设备编码
*/
public String equipmentcode;
/**
*固定资产卡片号
*/
public String facard;
/**
*散户
*/
public String freecust;
/**
*托收全局本币
*/
public UFDouble globalagentreceivelocal;
/**
*全局本币余额
*/
public UFDouble globalbalance;
/**
*全局本币金额(借方)
*/
public UFDouble globaldebit;
/**
*全局本币无税金额(借方)
*/
public UFDouble globalnotax_de;
/**
*全局本币汇率
*/
public UFDouble globalrate;
/**
*托收集团本币
*/
public UFDouble groupagentreceivelocal;
/**
*集团本币余额
*/
public UFDouble groupbalance;
/**
*集团本币金额(借方)
*/
public UFDouble groupdebit;
/**
*集团本币无税金额(借方)
*/
public UFDouble groupnotax_de;
/**
*集团本币汇率
*/
public UFDouble grouprate;
/**
*调拨订单号
*/
public String innerorderno;
/**
*发票号
*/
public String invoiceno;
/**
*是否抵扣金额
*/
public UFBoolean isdiscount;
/**
*是否被拒付
*/
public UFBoolean isrefused;
/**
*组织本币余额
*/
public UFDouble local_money_bal;
/**
*组织本币金额(借方)
*/
public UFDouble local_money_de;
/**
*组织本币无税金额(借方)
*/
public UFDouble local_notax_de;
/**
*本币单价
*/
public UFDouble local_price;
/**
*税额
*/
public UFDouble local_tax_de;
/**
*本币含税单价
*/
public UFDouble local_taxprice;
/**
*物料
*/
public String material;
/**
*原始物料
*/
public String material_src;
/**
*原币余额
*/
public UFDouble money_bal;
/**
*借方原币金额
*/
public UFDouble money_de;
/**
*借方原币无税金额
*/
public UFDouble notax_de;
/**
*往来对象
*/
public Integer objtype;
/**
*预占用核销原币余额
*/
public UFDouble occupationmny;
/**
*订单供应商
*/
public String ordercubasdoc;
/**
*出库单号
*/
public String outstoreno;
/**
*挂起标志
*/
public UFBoolean pausetransact;
/**
*付款银行账户
*/
public String payaccount;
/**
*摘要
*/
public String paycomment;
/**
*支付日期
*/
public UFDate paydate;
/**
*支付状态
*/
public Integer payflag;
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
*付款单行标识
*/
public String pk_fukuandan_b;
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
*付款协议
*/
public String pk_payterm;
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
*付款业务类型
*/
public String pk_recpaytype;
/**
*事项审批单
*/
public String pk_ssitem;
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
*报价单位含税单价
*/
public UFDouble postprice;
/**
*报价单位无税单价
*/
public UFDouble postpricenotax;
/**
*报价单位数量
*/
public UFDouble postquantity;
/**
*报价计量单位
*/
public String postunit;
/**
*付款性质
*/
public Integer prepay;
/**
*单价
*/
public UFDouble price;
/**
*产品线
*/
public String productline;
/**
*项目
*/
public String project;
/**
*项目任务
*/
public String project_task;
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
*订单号
*/
public String purchaseorder;
/**
*数量余额
*/
public UFDouble quantity_bal;
/**
*贷方数量
*/
public UFDouble quantity_cr;
/**
*借方数量
*/
public UFDouble quantity_de;
/**
*组织本币汇率
*/
public UFDouble rate;
/**
*收款银行账户
*/
public String recaccount;
/**
*拒付理由
*/
public String refuse_reason;
/**
*单据分录号
*/
public Integer rowno;
/**
*行类型
*/
public Integer rowtype;
/**
*摘要
*/
public String scomment;
/**
*结算财务组织
*/
public String sett_org;
/**
*结算财务组织版本主键
*/
public String sett_org_v;
/**
*应付币种
*/
public String settlecurr;
/**
*应付金额
*/
public UFDouble settlemoney;
/**
*源头单据主键
*/
public String src_billid;
/**
*源头单据类型
*/
public String src_billtype;
/**
*源头单据行主键
*/
public String src_itemid;
/**
*源头交易类型
*/
public String src_tradetype;
/**
*科目
*/
public String subjcode;
/**
*供应商
*/
public String supplier;
/**
*税号
*/
public String taxnum;
/**
*含税单价
*/
public UFDouble taxprice;
/**
*税率
*/
public UFDouble taxrate;
/**
*上层单据主键
*/
public String top_billid;
/**
*上层单据号
*/
public String top_billno;
/**
*上层单据类型
*/
public String top_billtype;
/**
*交换时间
*/
public UFDateTime top_changets;
/**
*上层单据行主键
*/
public String top_itemid;
/**
*来源付款协议行
*/
public String top_termch;
/**
*上层交易类型
*/
public String top_tradetype;
/**
*时间戳
*/
public UFDateTime ts;
/** 
* 获取托收组织本币
*
* @return 托收组织本币
*/
public UFDouble getAgentreceivelocal () {
return this.agentreceivelocal;
 } 

/** 
* 设置托收组织本币
*
* @param agentreceivelocal 托收组织本币
*/
public void setAgentreceivelocal ( UFDouble agentreceivelocal) {
this.agentreceivelocal=agentreceivelocal;
 } 

/** 
* 获取托收原币金额
*
* @return 托收原币金额
*/
public UFDouble getAgentreceiveprimal () {
return this.agentreceiveprimal;
 } 

/** 
* 设置托收原币金额
*
* @param agentreceiveprimal 托收原币金额
*/
public void setAgentreceiveprimal ( UFDouble agentreceiveprimal) {
this.agentreceiveprimal=agentreceiveprimal;
 } 

/** 
* 获取资产合同号
*
* @return 资产合同号
*/
public String getAssetpactno () {
return this.assetpactno;
 } 

/** 
* 设置资产合同号
*
* @param assetpactno 资产合同号
*/
public void setAssetpactno ( String assetpactno) {
this.assetpactno=assetpactno;
 } 

/** 
* 获取对账标识码
*
* @return 对账标识码
*/
public String getBankrelated_code () {
return this.bankrelated_code;
 } 

/** 
* 设置对账标识码
*
* @param bankrelated_code 对账标识码
*/
public void setBankrelated_code ( String bankrelated_code) {
this.bankrelated_code=bankrelated_code;
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
* 获取票据方向
*
* @return 票据方向
* @see String
*/
public String getCheckdirection () {
return this.checkdirection;
 } 

/** 
* 设置票据方向
*
* @param checkdirection 票据方向
* @see String
*/
public void setCheckdirection ( String checkdirection) {
this.checkdirection=checkdirection;
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
* 获取票据号
*
* @return 票据号
*/
public String getCheckno () {
return this.checkno;
 } 

/** 
* 设置票据号
*
* @param checkno 票据号
*/
public void setCheckno ( String checkno) {
this.checkno=checkno;
 } 

/** 
* 获取票据类型
*
* @return 票据类型
*/
public String getChecktype () {
return this.checktype;
 } 

/** 
* 设置票据类型
*
* @param checktype 票据类型
*/
public void setChecktype ( String checktype) {
this.checktype=checktype;
 } 

/** 
* 获取承付人
*
* @return 承付人
*/
public String getCommpayer () {
return this.commpayer;
 } 

/** 
* 设置承付人
*
* @param commpayer 承付人
*/
public void setCommpayer ( String commpayer) {
this.commpayer=commpayer;
 } 

/** 
* 获取承付状态
*
* @return 承付状态
* @see String
*/
public Integer getCommpaystatus () {
return this.commpaystatus;
 } 

/** 
* 设置承付状态
*
* @param commpaystatus 承付状态
* @see String
*/
public void setCommpaystatus ( Integer commpaystatus) {
this.commpaystatus=commpaystatus;
 } 

/** 
* 获取承付类型
*
* @return 承付类型
* @see String
*/
public Integer getCommpaytype () {
return this.commpaytype;
 } 

/** 
* 设置承付类型
*
* @param commpaytype 承付类型
* @see String
*/
public void setCommpaytype ( Integer commpaytype) {
this.commpaytype=commpaytype;
 } 

/** 
* 获取内部交易结算号
*
* @return 内部交易结算号
*/
public String getConfernum () {
return this.confernum;
 } 

/** 
* 设置内部交易结算号
*
* @param confernum 内部交易结算号
*/
public void setConfernum ( String confernum) {
this.confernum=confernum;
 } 

/** 
* 获取合同号
*
* @return 合同号
*/
public String getContractno () {
return this.contractno;
 } 

/** 
* 设置合同号
*
* @param contractno 合同号
*/
public void setContractno ( String contractno) {
this.contractno=contractno;
 } 

/** 
* 获取单据协同状态
*
* @return 单据协同状态
* @see String
*/
public Integer getCoordflag () {
return this.coordflag;
 } 

/** 
* 设置单据协同状态
*
* @param coordflag 单据协同状态
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
* 获取方向
*
* @return 方向
* @see String
*/
public Integer getDirection () {
return this.direction;
 } 

/** 
* 设置方向
*
* @param direction 方向
* @see String
*/
public void setDirection ( Integer direction) {
this.direction=direction;
 } 

/** 
* 获取设备编码
*
* @return 设备编码
*/
public String getEquipmentcode () {
return this.equipmentcode;
 } 

/** 
* 设置设备编码
*
* @param equipmentcode 设备编码
*/
public void setEquipmentcode ( String equipmentcode) {
this.equipmentcode=equipmentcode;
 } 

/** 
* 获取固定资产卡片号
*
* @return 固定资产卡片号
*/
public String getFacard () {
return this.facard;
 } 

/** 
* 设置固定资产卡片号
*
* @param facard 固定资产卡片号
*/
public void setFacard ( String facard) {
this.facard=facard;
 } 

/** 
* 获取散户
*
* @return 散户
*/
public String getFreecust () {
return this.freecust;
 } 

/** 
* 设置散户
*
* @param freecust 散户
*/
public void setFreecust ( String freecust) {
this.freecust=freecust;
 } 

/** 
* 获取托收全局本币
*
* @return 托收全局本币
*/
public UFDouble getGlobalagentreceivelocal () {
return this.globalagentreceivelocal;
 } 

/** 
* 设置托收全局本币
*
* @param globalagentreceivelocal 托收全局本币
*/
public void setGlobalagentreceivelocal ( UFDouble globalagentreceivelocal) {
this.globalagentreceivelocal=globalagentreceivelocal;
 } 

/** 
* 获取全局本币余额
*
* @return 全局本币余额
*/
public UFDouble getGlobalbalance () {
return this.globalbalance;
 } 

/** 
* 设置全局本币余额
*
* @param globalbalance 全局本币余额
*/
public void setGlobalbalance ( UFDouble globalbalance) {
this.globalbalance=globalbalance;
 } 

/** 
* 获取全局本币金额(借方)
*
* @return 全局本币金额(借方)
*/
public UFDouble getGlobaldebit () {
return this.globaldebit;
 } 

/** 
* 设置全局本币金额(借方)
*
* @param globaldebit 全局本币金额(借方)
*/
public void setGlobaldebit ( UFDouble globaldebit) {
this.globaldebit=globaldebit;
 } 

/** 
* 获取全局本币无税金额(借方)
*
* @return 全局本币无税金额(借方)
*/
public UFDouble getGlobalnotax_de () {
return this.globalnotax_de;
 } 

/** 
* 设置全局本币无税金额(借方)
*
* @param globalnotax_de 全局本币无税金额(借方)
*/
public void setGlobalnotax_de ( UFDouble globalnotax_de) {
this.globalnotax_de=globalnotax_de;
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
* 获取托收集团本币
*
* @return 托收集团本币
*/
public UFDouble getGroupagentreceivelocal () {
return this.groupagentreceivelocal;
 } 

/** 
* 设置托收集团本币
*
* @param groupagentreceivelocal 托收集团本币
*/
public void setGroupagentreceivelocal ( UFDouble groupagentreceivelocal) {
this.groupagentreceivelocal=groupagentreceivelocal;
 } 

/** 
* 获取集团本币余额
*
* @return 集团本币余额
*/
public UFDouble getGroupbalance () {
return this.groupbalance;
 } 

/** 
* 设置集团本币余额
*
* @param groupbalance 集团本币余额
*/
public void setGroupbalance ( UFDouble groupbalance) {
this.groupbalance=groupbalance;
 } 

/** 
* 获取集团本币金额(借方)
*
* @return 集团本币金额(借方)
*/
public UFDouble getGroupdebit () {
return this.groupdebit;
 } 

/** 
* 设置集团本币金额(借方)
*
* @param groupdebit 集团本币金额(借方)
*/
public void setGroupdebit ( UFDouble groupdebit) {
this.groupdebit=groupdebit;
 } 

/** 
* 获取集团本币无税金额(借方)
*
* @return 集团本币无税金额(借方)
*/
public UFDouble getGroupnotax_de () {
return this.groupnotax_de;
 } 

/** 
* 设置集团本币无税金额(借方)
*
* @param groupnotax_de 集团本币无税金额(借方)
*/
public void setGroupnotax_de ( UFDouble groupnotax_de) {
this.groupnotax_de=groupnotax_de;
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
* 获取调拨订单号
*
* @return 调拨订单号
*/
public String getInnerorderno () {
return this.innerorderno;
 } 

/** 
* 设置调拨订单号
*
* @param innerorderno 调拨订单号
*/
public void setInnerorderno ( String innerorderno) {
this.innerorderno=innerorderno;
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
* 获取是否抵扣金额
*
* @return 是否抵扣金额
*/
public UFBoolean getIsdiscount () {
return this.isdiscount;
 } 

/** 
* 设置是否抵扣金额
*
* @param isdiscount 是否抵扣金额
*/
public void setIsdiscount ( UFBoolean isdiscount) {
this.isdiscount=isdiscount;
 } 

/** 
* 获取是否被拒付
*
* @return 是否被拒付
*/
public UFBoolean getIsrefused () {
return this.isrefused;
 } 

/** 
* 设置是否被拒付
*
* @param isrefused 是否被拒付
*/
public void setIsrefused ( UFBoolean isrefused) {
this.isrefused=isrefused;
 } 

/** 
* 获取组织本币余额
*
* @return 组织本币余额
*/
public UFDouble getLocal_money_bal () {
return this.local_money_bal;
 } 

/** 
* 设置组织本币余额
*
* @param local_money_bal 组织本币余额
*/
public void setLocal_money_bal ( UFDouble local_money_bal) {
this.local_money_bal=local_money_bal;
 } 

/** 
* 获取组织本币金额(借方)
*
* @return 组织本币金额(借方)
*/
public UFDouble getLocal_money_de () {
return this.local_money_de;
 } 

/** 
* 设置组织本币金额(借方)
*
* @param local_money_de 组织本币金额(借方)
*/
public void setLocal_money_de ( UFDouble local_money_de) {
this.local_money_de=local_money_de;
 } 

/** 
* 获取组织本币无税金额(借方)
*
* @return 组织本币无税金额(借方)
*/
public UFDouble getLocal_notax_de () {
return this.local_notax_de;
 } 

/** 
* 设置组织本币无税金额(借方)
*
* @param local_notax_de 组织本币无税金额(借方)
*/
public void setLocal_notax_de ( UFDouble local_notax_de) {
this.local_notax_de=local_notax_de;
 } 

/** 
* 获取本币单价
*
* @return 本币单价
*/
public UFDouble getLocal_price () {
return this.local_price;
 } 

/** 
* 设置本币单价
*
* @param local_price 本币单价
*/
public void setLocal_price ( UFDouble local_price) {
this.local_price=local_price;
 } 

/** 
* 获取税额
*
* @return 税额
*/
public UFDouble getLocal_tax_de () {
return this.local_tax_de;
 } 

/** 
* 设置税额
*
* @param local_tax_de 税额
*/
public void setLocal_tax_de ( UFDouble local_tax_de) {
this.local_tax_de=local_tax_de;
 } 

/** 
* 获取本币含税单价
*
* @return 本币含税单价
*/
public UFDouble getLocal_taxprice () {
return this.local_taxprice;
 } 

/** 
* 设置本币含税单价
*
* @param local_taxprice 本币含税单价
*/
public void setLocal_taxprice ( UFDouble local_taxprice) {
this.local_taxprice=local_taxprice;
 } 

/** 
* 获取物料
*
* @return 物料
*/
public String getMaterial () {
return this.material;
 } 

/** 
* 设置物料
*
* @param material 物料
*/
public void setMaterial ( String material) {
this.material=material;
 } 

/** 
* 获取原始物料
*
* @return 原始物料
*/
public String getMaterial_src () {
return this.material_src;
 } 

/** 
* 设置原始物料
*
* @param material_src 原始物料
*/
public void setMaterial_src ( String material_src) {
this.material_src=material_src;
 } 

/** 
* 获取原币余额
*
* @return 原币余额
*/
public UFDouble getMoney_bal () {
return this.money_bal;
 } 

/** 
* 设置原币余额
*
* @param money_bal 原币余额
*/
public void setMoney_bal ( UFDouble money_bal) {
this.money_bal=money_bal;
 } 

/** 
* 获取借方原币金额
*
* @return 借方原币金额
*/
public UFDouble getMoney_de () {
return this.money_de;
 } 

/** 
* 设置借方原币金额
*
* @param money_de 借方原币金额
*/
public void setMoney_de ( UFDouble money_de) {
this.money_de=money_de;
 } 

/** 
* 获取借方原币无税金额
*
* @return 借方原币无税金额
*/
public UFDouble getNotax_de () {
return this.notax_de;
 } 

/** 
* 设置借方原币无税金额
*
* @param notax_de 借方原币无税金额
*/
public void setNotax_de ( UFDouble notax_de) {
this.notax_de=notax_de;
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
* 获取预占用核销原币余额
*
* @return 预占用核销原币余额
*/
public UFDouble getOccupationmny () {
return this.occupationmny;
 } 

/** 
* 设置预占用核销原币余额
*
* @param occupationmny 预占用核销原币余额
*/
public void setOccupationmny ( UFDouble occupationmny) {
this.occupationmny=occupationmny;
 } 

/** 
* 获取订单供应商
*
* @return 订单供应商
*/
public String getOrdercubasdoc () {
return this.ordercubasdoc;
 } 

/** 
* 设置订单供应商
*
* @param ordercubasdoc 订单供应商
*/
public void setOrdercubasdoc ( String ordercubasdoc) {
this.ordercubasdoc=ordercubasdoc;
 } 

/** 
* 获取出库单号
*
* @return 出库单号
*/
public String getOutstoreno () {
return this.outstoreno;
 } 

/** 
* 设置出库单号
*
* @param outstoreno 出库单号
*/
public void setOutstoreno ( String outstoreno) {
this.outstoreno=outstoreno;
 } 

/** 
* 获取挂起标志
*
* @return 挂起标志
*/
public UFBoolean getPausetransact () {
return this.pausetransact;
 } 

/** 
* 设置挂起标志
*
* @param pausetransact 挂起标志
*/
public void setPausetransact ( UFBoolean pausetransact) {
this.pausetransact=pausetransact;
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
* 获取摘要
*
* @return 摘要
*/
public String getPaycomment () {
return this.paycomment;
 } 

/** 
* 设置摘要
*
* @param paycomment 摘要
*/
public void setPaycomment ( String paycomment) {
this.paycomment=paycomment;
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
* 获取支付状态
*
* @return 支付状态
* @see String
*/
public Integer getPayflag () {
return this.payflag;
 } 

/** 
* 设置支付状态
*
* @param payflag 支付状态
* @see String
*/
public void setPayflag ( Integer payflag) {
this.payflag=payflag;
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
* 获取付款单行标识
*
* @return 付款单行标识
*/
public String getPk_fukuandan_b () {
return this.pk_fukuandan_b;
 } 

/** 
* 设置付款单行标识
*
* @param pk_fukuandan_b 付款单行标识
*/
public void setPk_fukuandan_b ( String pk_fukuandan_b) {
this.pk_fukuandan_b=pk_fukuandan_b;
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
* 获取付款协议
*
* @return 付款协议
*/
public String getPk_payterm () {
return this.pk_payterm;
 } 

/** 
* 设置付款协议
*
* @param pk_payterm 付款协议
*/
public void setPk_payterm ( String pk_payterm) {
this.pk_payterm=pk_payterm;
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
* 获取付款业务类型
*
* @return 付款业务类型
*/
public String getPk_recpaytype () {
return this.pk_recpaytype;
 } 

/** 
* 设置付款业务类型
*
* @param pk_recpaytype 付款业务类型
*/
public void setPk_recpaytype ( String pk_recpaytype) {
this.pk_recpaytype=pk_recpaytype;
 } 

/** 
* 获取事项审批单
*
* @return 事项审批单
*/
public String getPk_ssitem () {
return this.pk_ssitem;
 } 

/** 
* 设置事项审批单
*
* @param pk_ssitem 事项审批单
*/
public void setPk_ssitem ( String pk_ssitem) {
this.pk_ssitem=pk_ssitem;
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
* 获取报价单位含税单价
*
* @return 报价单位含税单价
*/
public UFDouble getPostprice () {
return this.postprice;
 } 

/** 
* 设置报价单位含税单价
*
* @param postprice 报价单位含税单价
*/
public void setPostprice ( UFDouble postprice) {
this.postprice=postprice;
 } 

/** 
* 获取报价单位无税单价
*
* @return 报价单位无税单价
*/
public UFDouble getPostpricenotax () {
return this.postpricenotax;
 } 

/** 
* 设置报价单位无税单价
*
* @param postpricenotax 报价单位无税单价
*/
public void setPostpricenotax ( UFDouble postpricenotax) {
this.postpricenotax=postpricenotax;
 } 

/** 
* 获取报价单位数量
*
* @return 报价单位数量
*/
public UFDouble getPostquantity () {
return this.postquantity;
 } 

/** 
* 设置报价单位数量
*
* @param postquantity 报价单位数量
*/
public void setPostquantity ( UFDouble postquantity) {
this.postquantity=postquantity;
 } 

/** 
* 获取报价计量单位
*
* @return 报价计量单位
*/
public String getPostunit () {
return this.postunit;
 } 

/** 
* 设置报价计量单位
*
* @param postunit 报价计量单位
*/
public void setPostunit ( String postunit) {
this.postunit=postunit;
 } 

/** 
* 获取付款性质
*
* @return 付款性质
* @see String
*/
public Integer getPrepay () {
return this.prepay;
 } 

/** 
* 设置付款性质
*
* @param prepay 付款性质
* @see String
*/
public void setPrepay ( Integer prepay) {
this.prepay=prepay;
 } 

/** 
* 获取单价
*
* @return 单价
*/
public UFDouble getPrice () {
return this.price;
 } 

/** 
* 设置单价
*
* @param price 单价
*/
public void setPrice ( UFDouble price) {
this.price=price;
 } 

/** 
* 获取产品线
*
* @return 产品线
*/
public String getProductline () {
return this.productline;
 } 

/** 
* 设置产品线
*
* @param productline 产品线
*/
public void setProductline ( String productline) {
this.productline=productline;
 } 

/** 
* 获取项目
*
* @return 项目
*/
public String getProject () {
return this.project;
 } 

/** 
* 设置项目
*
* @param project 项目
*/
public void setProject ( String project) {
this.project=project;
 } 

/** 
* 获取项目任务
*
* @return 项目任务
*/
public String getProject_task () {
return this.project_task;
 } 

/** 
* 设置项目任务
*
* @param project_task 项目任务
*/
public void setProject_task ( String project_task) {
this.project_task=project_task;
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
* 获取订单号
*
* @return 订单号
*/
public String getPurchaseorder () {
return this.purchaseorder;
 } 

/** 
* 设置订单号
*
* @param purchaseorder 订单号
*/
public void setPurchaseorder ( String purchaseorder) {
this.purchaseorder=purchaseorder;
 } 

/** 
* 获取数量余额
*
* @return 数量余额
*/
public UFDouble getQuantity_bal () {
return this.quantity_bal;
 } 

/** 
* 设置数量余额
*
* @param quantity_bal 数量余额
*/
public void setQuantity_bal ( UFDouble quantity_bal) {
this.quantity_bal=quantity_bal;
 } 

/** 
* 获取贷方数量
*
* @return 贷方数量
*/
public UFDouble getQuantity_cr () {
return this.quantity_cr;
 } 

/** 
* 设置贷方数量
*
* @param quantity_cr 贷方数量
*/
public void setQuantity_cr ( UFDouble quantity_cr) {
this.quantity_cr=quantity_cr;
 } 

/** 
* 获取借方数量
*
* @return 借方数量
*/
public UFDouble getQuantity_de () {
return this.quantity_de;
 } 

/** 
* 设置借方数量
*
* @param quantity_de 借方数量
*/
public void setQuantity_de ( UFDouble quantity_de) {
this.quantity_de=quantity_de;
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
* 获取拒付理由
*
* @return 拒付理由
*/
public String getRefuse_reason () {
return this.refuse_reason;
 } 

/** 
* 设置拒付理由
*
* @param refuse_reason 拒付理由
*/
public void setRefuse_reason ( String refuse_reason) {
this.refuse_reason=refuse_reason;
 } 

/** 
* 获取单据分录号
*
* @return 单据分录号
*/
public Integer getRowno () {
return this.rowno;
 } 

/** 
* 设置单据分录号
*
* @param rowno 单据分录号
*/
public void setRowno ( Integer rowno) {
this.rowno=rowno;
 } 

/** 
* 获取行类型
*
* @return 行类型
* @see String
*/
public Integer getRowtype () {
return this.rowtype;
 } 

/** 
* 设置行类型
*
* @param rowtype 行类型
* @see String
*/
public void setRowtype ( Integer rowtype) {
this.rowtype=rowtype;
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
* 获取应付币种
*
* @return 应付币种
*/
public String getSettlecurr () {
return this.settlecurr;
 } 

/** 
* 设置应付币种
*
* @param settlecurr 应付币种
*/
public void setSettlecurr ( String settlecurr) {
this.settlecurr=settlecurr;
 } 

/** 
* 获取应付金额
*
* @return 应付金额
*/
public UFDouble getSettlemoney () {
return this.settlemoney;
 } 

/** 
* 设置应付金额
*
* @param settlemoney 应付金额
*/
public void setSettlemoney ( UFDouble settlemoney) {
this.settlemoney=settlemoney;
 } 

/** 
* 获取源头单据主键
*
* @return 源头单据主键
*/
public String getSrc_billid () {
return this.src_billid;
 } 

/** 
* 设置源头单据主键
*
* @param src_billid 源头单据主键
*/
public void setSrc_billid ( String src_billid) {
this.src_billid=src_billid;
 } 

/** 
* 获取源头单据类型
*
* @return 源头单据类型
*/
public String getSrc_billtype () {
return this.src_billtype;
 } 

/** 
* 设置源头单据类型
*
* @param src_billtype 源头单据类型
*/
public void setSrc_billtype ( String src_billtype) {
this.src_billtype=src_billtype;
 } 

/** 
* 获取源头单据行主键
*
* @return 源头单据行主键
*/
public String getSrc_itemid () {
return this.src_itemid;
 } 

/** 
* 设置源头单据行主键
*
* @param src_itemid 源头单据行主键
*/
public void setSrc_itemid ( String src_itemid) {
this.src_itemid=src_itemid;
 } 

/** 
* 获取源头交易类型
*
* @return 源头交易类型
*/
public String getSrc_tradetype () {
return this.src_tradetype;
 } 

/** 
* 设置源头交易类型
*
* @param src_tradetype 源头交易类型
*/
public void setSrc_tradetype ( String src_tradetype) {
this.src_tradetype=src_tradetype;
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
* 获取税号
*
* @return 税号
*/
public String getTaxnum () {
return this.taxnum;
 } 

/** 
* 设置税号
*
* @param taxnum 税号
*/
public void setTaxnum ( String taxnum) {
this.taxnum=taxnum;
 } 

/** 
* 获取含税单价
*
* @return 含税单价
*/
public UFDouble getTaxprice () {
return this.taxprice;
 } 

/** 
* 设置含税单价
*
* @param taxprice 含税单价
*/
public void setTaxprice ( UFDouble taxprice) {
this.taxprice=taxprice;
 } 

/** 
* 获取税率
*
* @return 税率
*/
public UFDouble getTaxrate () {
return this.taxrate;
 } 

/** 
* 设置税率
*
* @param taxrate 税率
*/
public void setTaxrate ( UFDouble taxrate) {
this.taxrate=taxrate;
 } 

/** 
* 获取上层单据主键
*
* @return 上层单据主键
*/
public String getTop_billid () {
return this.top_billid;
 } 

/** 
* 设置上层单据主键
*
* @param top_billid 上层单据主键
*/
public void setTop_billid ( String top_billid) {
this.top_billid=top_billid;
 } 

/** 
* 获取上层单据号
*
* @return 上层单据号
*/
public String getTop_billno () {
return this.top_billno;
 } 

/** 
* 设置上层单据号
*
* @param top_billno 上层单据号
*/
public void setTop_billno ( String top_billno) {
this.top_billno=top_billno;
 } 

/** 
* 获取上层单据类型
*
* @return 上层单据类型
*/
public String getTop_billtype () {
return this.top_billtype;
 } 

/** 
* 设置上层单据类型
*
* @param top_billtype 上层单据类型
*/
public void setTop_billtype ( String top_billtype) {
this.top_billtype=top_billtype;
 } 

/** 
* 获取交换时间
*
* @return 交换时间
*/
public UFDateTime getTop_changets () {
return this.top_changets;
 } 

/** 
* 设置交换时间
*
* @param top_changets 交换时间
*/
public void setTop_changets ( UFDateTime top_changets) {
this.top_changets=top_changets;
 } 

/** 
* 获取上层单据行主键
*
* @return 上层单据行主键
*/
public String getTop_itemid () {
return this.top_itemid;
 } 

/** 
* 设置上层单据行主键
*
* @param top_itemid 上层单据行主键
*/
public void setTop_itemid ( String top_itemid) {
this.top_itemid=top_itemid;
 } 

/** 
* 获取来源付款协议行
*
* @return 来源付款协议行
*/
public String getTop_termch () {
return this.top_termch;
 } 

/** 
* 设置来源付款协议行
*
* @param top_termch 来源付款协议行
*/
public void setTop_termch ( String top_termch) {
this.top_termch=top_termch;
 } 

/** 
* 获取上层交易类型
*
* @return 上层交易类型
*/
public String getTop_tradetype () {
return this.top_tradetype;
 } 

/** 
* 设置上层交易类型
*
* @param top_tradetype 上层交易类型
*/
public void setTop_tradetype ( String top_tradetype) {
this.top_tradetype=top_tradetype;
 } 

/** 
* 获取时间戳
*
* @return 时间戳
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
* 设置时间戳
*
* @param ts 时间戳
*/
public void setTs ( UFDateTime ts) {
this.ts=ts;
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("baal.fukuandan_b");
  }
}