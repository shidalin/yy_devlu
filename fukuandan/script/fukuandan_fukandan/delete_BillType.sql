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