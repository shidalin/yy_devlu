DELETE FROM pub_bcr_candiattr WHERE pk_nbcr = '0001ZZ100000000043KQ';
DELETE FROM pub_bcr_elem WHERE pk_billcodebase in ( select pk_billcodebase from pub_bcr_RuleBase where nbcrcode = 'FKSQ' );
DELETE FROM pub_bcr_RuleBase WHERE nbcrcode = 'FKSQ';
DELETE FROM pub_bcr_nbcr WHERE pk_nbcr = '0001ZZ100000000043KQ';
DELETE FROM pub_bcr_OrgRela WHERE pk_billcodebase = '0001ZZ100000000043KR';
DELETE FROM pub_bcr_RuleBase WHERE pk_billcodebase = '0001ZZ100000000043KR';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000043KS';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000043KT';
DELETE FROM pub_bcr_elem WHERE pk_billcodeelem = '0001ZZ100000000043KU';
DELETE FROM bd_billtype2 WHERE pk_billtypeid = '0001ZZ100000000043KD';
DELETE FROM bd_fwdbilltype WHERE pk_billtypeid = '0001ZZ100000000043KD';
DELETE FROM pub_function WHERE pk_billtype = 'FKSQ';
DELETE FROM pub_billaction WHERE pk_billtypeid = '0001ZZ100000000043KD';
DELETE FROM pub_billactiongroup WHERE pk_billtype = 'FKSQ';
DELETE FROM bd_billtype WHERE pk_billtypeid = '0001ZZ100000000043KD';
delete from temppkts;
DELETE FROM sm_rule_type WHERE pk_rule_type = null;
DELETE FROM sm_permission_res WHERE pk_permission_res = null;
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000043KE';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000043KF';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000043KG';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000043KH';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000043KI';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000043KJ';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000043KK';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000043KL';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000043KM';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000043KN';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000043KO';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000043KP';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001ZZ100000000043KC';
delete from pub_print_datasource where ctemplateid = '0001ZZ1000000000426A';
delete from pub_print_cell where ctemplateid = '0001ZZ1000000000426A';
delete from pub_print_line where ctemplateid = '0001ZZ1000000000426A';
delete from pub_print_variable where ctemplateid = '0001ZZ1000000000426A';
delete from pub_print_template where ctemplateid = '0001ZZ1000000000426A';
DELETE FROM aam_appasset WHERE pk_asset = '0001ZZ100000000043KB';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001ZZ10000000004269';
delete from pub_query_condition where pk_templet = '0001ZZ1000000000422H';
delete from pub_query_templet where id = '0001ZZ1000000000422H';
DELETE FROM aam_appasset WHERE pk_asset = '0001ZZ10000000004268';
DELETE FROM pub_systemplate_base where pk_systemplate = '0001ZZ1000000000422G';
delete from pub_billtemplet_b where pk_billtemplet = '0001ZZ100000000041U4';
delete from pub_billtemplet where pk_billtemplet = '0001ZZ100000000041U4';
DELETE FROM pub_billtemplet_t WHERE pk_billtemplet = '0001ZZ100000000041U4';
DELETE FROM aam_appasset WHERE pk_asset = '0001ZZ1000000000422F';
DELETE FROM sm_menuitemreg WHERE pk_menuitem = '0001ZZ100000000041U3';
DELETE FROM sm_funcregister WHERE cfunid = '0001ZZ100000000041U1';
DELETE FROM sm_paramregister WHERE pk_param = '0001ZZ100000000041U2';
