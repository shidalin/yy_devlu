DELETE FROM bd_billtype2 WHERE pk_billtypeid = '0001ZZ10000000002VMS';
DELETE FROM bd_fwdbilltype WHERE pk_billtypeid = '0001ZZ10000000002VMS';
DELETE FROM pub_function WHERE pk_billtype = 'CGFP';
DELETE FROM pub_billaction WHERE pk_billtypeid = '0001ZZ10000000002VMS';
DELETE FROM pub_billactiongroup WHERE pk_billtype = 'CGFP';
DELETE FROM bd_billtype WHERE pk_billtypeid = '0001ZZ10000000002VMS';
delete from temppkts;
DELETE FROM sm_rule_type WHERE pk_rule_type = null;
DELETE FROM sm_permission_res WHERE pk_permission_res = null;
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ10000000002VMT';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ10000000002VMU';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ10000000002VMV';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ10000000002VMW';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ10000000002VMX';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ10000000002VMY';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ10000000002VMZ';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ10000000002VN0';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ10000000002VN1';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ10000000002VN2';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ10000000002VN3';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ10000000002VN4';
