INSERT INTO pub_query_templet (ts, ID, MODEL_CODE, MODEL_NAME, NODE_CODE, PK_CORP, METACLASS, LAYER ) VALUES ('2016-04-01 22:38:11', '0001ZZ100000000030XR', 'BAJ50101', '销售发票主实体', 'BAJ50101', '@@@@', 'a0d90a52-439d-4107-a920-06d8638d311e', 0 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 0, 1, 'csaleinvoiceid', '0001ZZ100000000030XS', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 1, 1, 'pk_group', '0001ZZ100000000030XT', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, VALUE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '财务组织', 5, 2, 1, 'pk_org', '0001ZZ100000000030XU', 'Y', 'N', 'Y', 'N', 'N', 'Y', 'N', 'N', 'Y', 'N', 'N', '=@', '等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, '#mainorg#', 'Y', 'Y', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '财务组织版本', 5, 3, 1, 'pk_org_v', '0001ZZ100000000030XV', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=', '等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', 'IM,2ed33012-890c-4e5f-82a0-40ef0eeb4b45', 6, 4, 1, 'fstatusflag', '0001ZZ100000000030XW', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@<>@', '等于@不等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '用户', 5, 5, 1, 'creator', '0001ZZ100000000030XX', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=', '等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 8, 6, 1, 'creationtime', '0001ZZ100000000030XY', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', 'between@=@>@>=@<@<=@', '介于@等于@大于@大于等于@小于@小于等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'Y', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '用户', 5, 7, 1, 'billmaker', '0001ZZ100000000030XZ', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=', '等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 3, 8, 1, 'dmakedate', '0001ZZ100000000030Y0', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', 'between@=@>@>=@<@<=@', '介于@等于@大于@大于等于@小于@小于等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'Y', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '用户', 5, 9, 1, 'modifier', '0001ZZ100000000030Y1', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=', '等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 3, 10, 1, 'modifiedtime', '0001ZZ100000000030Y2', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', 'between@=@>@>=@<@<=@', '介于@等于@大于@大于等于@小于@小于等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'Y', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '用户', 5, 11, 1, 'approver', '0001ZZ100000000030Y3', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=', '等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 3, 12, 1, 'approvetime', '0001ZZ100000000030Y4', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', 'between@=@>@>=@<@<=@', '介于@等于@大于@大于等于@小于@小于等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'Y', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 13, 1, 'vdef1', '0001ZZ100000000030Y5', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 14, 1, 'vbillcode', '0001ZZ100000000030Y6', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '业务流程', 5, 15, 1, 'cbiztypeid', '0001ZZ100000000030Y7', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=', '等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '影响因素单据类型', 5, 16, 1, 'ctrantypeid', '0001ZZ100000000030Y8', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=', '等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 17, 1, 'vtrantypecode', '0001ZZ100000000030Y9', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, VALUE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 3, 18, 0, 'dbilldate', '0001ZZ100000000030YA', 'Y', 'N', 'Y', 'N', 'N', 'Y', 'N', 'N', 'Y', 'N', 'N', 'between@=@>@>=@<@<=@', '介于@等于@大于@大于等于@小于@小于等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, '#day(0)#,#day(0)#', 'Y', 'Y', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '客商银行账户', 5, 19, 1, 'ccustbankaccid', '0001ZZ100000000030YB', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=', '等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '币种档案', 5, 20, 1, 'corigcurrencyid', '0001ZZ100000000030YC', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=', '等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '8', 2, 21, 1, 'ntotalorigmny', '0001ZZ100000000030YD', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', 'between@=@>@>=@<@<=@', '介于@等于@大于@大于等于@小于@小于等于@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 22, 1, 'csaleinvoicebid', '0001ZZ100000000030YE', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 23, 1, 'vdef2', '0001ZZ100000000030YF', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 24, 1, 'vdef3', '0001ZZ100000000030YG', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 25, 1, 'vdef4', '0001ZZ100000000030YH', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 26, 1, 'vdef5', '0001ZZ100000000030YI', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 27, 1, 'vdef6', '0001ZZ100000000030YJ', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 28, 1, 'vdef7', '0001ZZ100000000030YK', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 29, 1, 'vdef8', '0001ZZ100000000030YL', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 30, 1, 'vdef9', '0001ZZ100000000030YM', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO pub_query_condition (ts, CONSULT_CODE, DATA_TYPE, DISP_SEQUENCE, DISP_TYPE, FIELD_CODE, ID, IF_AUTOCHECK, IF_DATAPOWER, IF_DEFAULT, IF_GROUP, IF_IMMOBILITY, IF_MUST, IF_ORDER, IF_SUM, IF_USED, IF_SUBINCLUDED, IF_MULTICORPREF, OPERA_CODE, OPERA_NAME, ORDER_SEQUENCE, PK_CORP, PK_TEMPLET, RETURN_TYPE, ISCONDITION, IF_SYSFUNCREFUSED, IF_ATTRREFUSED, LIMITS ) VALUES ('2016-04-01 22:38:11', '-99', 0, 31, 1, 'vdef10', '0001ZZ100000000030YN', 'Y', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'Y', 'N', 'N', '=@like@left like@right like@', '等于@包含@左包含@右包含@', 0, '@@@@', '0001ZZ100000000030XR', 2, 'Y', 'N', 'N', 9999 );
INSERT INTO aam_appasset (ts, dataidname, isvalid, creator, pk_developorg, dataidname2, dataidname3, dataidname4, dataidname5, pk_module, pk_org, dataidname6, pk_aamindustry, assetcode, dataid, dr, def5, pk_industry, modifier, creationtime, pk_countryzone, pk_assettype, assetdesc, assetname2, pk_asset, assetname4, assetname3, modifiedtime, assetname6, pk_group, assetname5, pk_developer, def4, assetlayer, def3, def2, def1, assetname ) VALUES ('2016-04-01 22:38:11', '销售发票主实体', '1', '#UAP#', '00001', null, null, null, null, 'BAJ5', 'GLOBLE00000000000000', null, null, 'AANCAAM160400000005', '0001ZZ100000000030XR', 0, null, '~', '~', '2016-04-01 22:38:11', '~', '1001Z01000000000MWUU', 'querytemplet', null, '0001ZZ100000000030YO', null, null, null, null, '~', null, '1004Z11000000001125X', null, '0', null, null, null, '查询模板-销售发票主实体' );
INSERT INTO pub_systemplate_base (ts, nodekey, layer, templateid, pk_systemplate, pk_industry, tempstyle, pk_country, funnode, moduleid, devorg, dr ) VALUES ('2016-04-01 22:38:11', 'qt', 0, '0001ZZ100000000030XR', '0001ZZ100000000030YP', '~', 1, '~', 'BAJ50101', 'BAJ5', '00001', 0 );
