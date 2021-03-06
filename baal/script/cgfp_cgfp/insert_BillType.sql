INSERT INTO bd_billtype (ts, iseditableproperty, pk_billtypecode, ncbrcode, parentbilltype, canextendtransaction, isbizflowbill, istransaction, datafinderclz, referclassname, isaccount, isroot, pk_org, component, billtypename, billcoderule, emendenumclass, dr, nodecode, isenablebutton, pk_billtypeid, systemcode, classname, checkclassname, accountclass, islock, forwardbilltype, billtypename2, billtypename3, transtype_class, billtypename4, billtypename5, billtypename6, pk_group, webnodecode, billstyle, def3, def2, isapprovebill, wherestring, def1 ) VALUES ('2016-03-27 13:18:28', null, 'CGFP', '~', '~', 'Y', null, 'N', null, null, null, null, 'GLOBLE00000000000000', 'cgfp', '采购发票登记', '~', null, null, 'BAJ50102', null, '0001ZZ10000000002VMS', 'baal', null, null, null, null, null, null, null, null, null, null, null, '~', '~', null, null, null, 'Y', null, null );
INSERT INTO pub_billaction (ts, finishflag, showhint6, showhint5, showhint4, showhint2, showhint3, constrictflag, action_type, actionstyle, showhint, dr, pk_billtype, pushflag, actionstyleremark, pk_billtypeid, controlflag, actionnote6, pk_billaction, actiontype, actionnote4, actionnote, actionnote5, actionnote2, actionnote3 ) VALUES ('2016-03-27 13:18:29', 'N', null, null, null, null, null, 'N', 10, '1', null, null, 'CGFP', null, null, '0001ZZ10000000002VMS', 'N', null, '0001ZZ10000000002VMT', 'SAVE', null, '送审', null, null, null );
INSERT INTO pub_billaction (ts, finishflag, showhint6, showhint5, showhint4, showhint2, showhint3, constrictflag, action_type, actionstyle, showhint, dr, pk_billtype, pushflag, actionstyleremark, pk_billtypeid, controlflag, actionnote6, pk_billaction, actiontype, actionnote4, actionnote, actionnote5, actionnote2, actionnote3 ) VALUES ('2016-03-27 13:18:29', 'N', null, null, null, null, null, 'N', 11, '2', null, null, 'CGFP', null, null, '0001ZZ10000000002VMS', 'N', null, '0001ZZ10000000002VMU', 'APPROVE', null, '审核', null, null, null );
INSERT INTO pub_billaction (ts, finishflag, showhint6, showhint5, showhint4, showhint2, showhint3, constrictflag, action_type, actionstyle, showhint, dr, pk_billtype, pushflag, actionstyleremark, pk_billtypeid, controlflag, actionnote6, pk_billaction, actiontype, actionnote4, actionnote, actionnote5, actionnote2, actionnote3 ) VALUES ('2016-03-27 13:18:29', 'Y', null, null, null, null, null, 'N', 13, '3', null, null, 'CGFP', null, null, '0001ZZ10000000002VMS', 'Y', null, '0001ZZ10000000002VMV', 'UNSAVEBILL', null, '收回', null, null, null );
INSERT INTO pub_billaction (ts, finishflag, showhint6, showhint5, showhint4, showhint2, showhint3, constrictflag, action_type, actionstyle, showhint, dr, pk_billtype, pushflag, actionstyleremark, pk_billtypeid, controlflag, actionnote6, pk_billaction, actiontype, actionnote4, actionnote, actionnote5, actionnote2, actionnote3 ) VALUES ('2016-03-27 13:18:29', 'Y', null, null, null, null, null, 'N', 12, '3', null, null, 'CGFP', null, null, '0001ZZ10000000002VMS', 'N', null, '0001ZZ10000000002VMW', 'UNAPPROVE', null, '弃审', null, null, null );
INSERT INTO pub_billaction (ts, finishflag, showhint6, showhint5, showhint4, showhint2, showhint3, constrictflag, action_type, actionstyle, showhint, dr, pk_billtype, pushflag, actionstyleremark, pk_billtypeid, controlflag, actionnote6, pk_billaction, actiontype, actionnote4, actionnote, actionnote5, actionnote2, actionnote3 ) VALUES ('2016-03-27 13:18:29', 'N', null, null, null, null, null, 'N', 30, '3', null, null, 'CGFP', null, null, '0001ZZ10000000002VMS', 'N', null, '0001ZZ10000000002VMX', 'DELETE', null, '删除', null, null, null );
INSERT INTO pub_billaction (ts, finishflag, showhint6, showhint5, showhint4, showhint2, showhint3, constrictflag, action_type, actionstyle, showhint, dr, pk_billtype, pushflag, actionstyleremark, pk_billtypeid, controlflag, actionnote6, pk_billaction, actiontype, actionnote4, actionnote, actionnote5, actionnote2, actionnote3 ) VALUES ('2016-03-27 13:18:29', 'N', null, null, null, null, null, 'Y', 31, '1', null, null, 'CGFP', null, null, '0001ZZ10000000002VMS', 'N', null, '0001ZZ10000000002VMY', 'SAVEBASE', null, '保存', null, null, null );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2016-03-27 13:18:29', '0001ZZ10000000002VMS', '~', 'N_CGFP_SAVE', 'N', 'SAVE', '~', 0, 'CGFP', '0001ZZ10000000002VMZ' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2016-03-27 13:18:29', '0001ZZ10000000002VMS', '~', 'N_CGFP_APPROVE', 'N', 'APPROVE', '~', 0, 'CGFP', '0001ZZ10000000002VN0' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2016-03-27 13:18:29', '0001ZZ10000000002VMS', '~', 'N_CGFP_UNSAVEBILL', 'N', 'UNSAVEBILL', '~', 0, 'CGFP', '0001ZZ10000000002VN1' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2016-03-27 13:18:29', '0001ZZ10000000002VMS', '~', 'N_CGFP_UNAPPROVE', 'N', 'UNAPPROVE', '~', 0, 'CGFP', '0001ZZ10000000002VN2' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2016-03-27 13:18:29', '0001ZZ10000000002VMS', '~', 'N_CGFP_DELETE', 'N', 'DELETE', '~', 0, 'CGFP', '0001ZZ10000000002VN3' );
INSERT INTO pub_busiclass (ts, pk_billtypeid, pk_businesstype, classname, isbefore, actiontype, pk_group, dr, pk_billtype, pk_busiclass ) VALUES ('2016-03-27 13:18:29', '0001ZZ10000000002VMS', '~', 'N_CGFP_SAVEBASE', 'N', 'SAVEBASE', '~', 0, 'CGFP', '0001ZZ10000000002VN4' );
