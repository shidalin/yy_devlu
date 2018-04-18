package nc.ui.ct.ap.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.ui.uif2.factory.AbstractJavaBeanDefinition;

public class ap_config extends AbstractJavaBeanDefinition{
	private Map<String, Object> context = new HashMap();
public nc.ui.uif2.actions.ActionContributors getToftpanelActionContributors(){
 if(context.get("toftpanelActionContributors")!=null)
 return (nc.ui.uif2.actions.ActionContributors)context.get("toftpanelActionContributors");
  nc.ui.uif2.actions.ActionContributors bean = new nc.ui.uif2.actions.ActionContributors();
  context.put("toftpanelActionContributors",bean);
  bean.setContributors(getManagedList0());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList0(){  List list = new ArrayList();  list.add(getActionsOfList());  list.add(getActionsOfCard());  list.add(getActionsOfHistory());  return list;}

public nc.ui.uif2.actions.StandAloneToftPanelActionContainer getActionsOfList(){
 if(context.get("actionsOfList")!=null)
 return (nc.ui.uif2.actions.StandAloneToftPanelActionContainer)context.get("actionsOfList");
  nc.ui.uif2.actions.StandAloneToftPanelActionContainer bean = new nc.ui.uif2.actions.StandAloneToftPanelActionContainer(getListView());  context.put("actionsOfList",bean);
  bean.setActions(getManagedList1());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList1(){  List list = new ArrayList();  list.add(getAddMenuGroup());  list.add(getEditAction());  list.add(getDeleteAction());  list.add(getCopyAction());  list.add(getSeparatorAction());  list.add(getQueryAction());  list.add(getRefreshAction());  list.add(getSeparatorAction());  list.add(getCommitMenuAction());  list.add(getApproveMenuAction());  list.add(getTransactMenuAction());  list.add(getAssistMenuAction());  list.add(getSeparatorAction());  list.add(getAsstQueryMenuAction());  list.add(getSeparatorAction());  list.add(getPayMnyAction());  list.add(getSeparatorAction());  list.add(getPrintMenuAction());  return list;}

public nc.ui.uif2.actions.StandAloneToftPanelActionContainer getActionsOfCard(){
 if(context.get("actionsOfCard")!=null)
 return (nc.ui.uif2.actions.StandAloneToftPanelActionContainer)context.get("actionsOfCard");
  nc.ui.uif2.actions.StandAloneToftPanelActionContainer bean = new nc.ui.uif2.actions.StandAloneToftPanelActionContainer(getBillFormEditor());  context.put("actionsOfCard",bean);
  bean.setModel(getManageAppModel());
  bean.setActions(getManagedList2());
  bean.setEditActions(getManagedList3());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList2(){  List list = new ArrayList();  list.add(getAddMenuGroup());  list.add(getEditAction());  list.add(getDeleteAction());  list.add(getCopyAction());  list.add(getSeparatorAction());  list.add(getQueryAction());  list.add(getCardRefreshAction());  list.add(getSeparatorAction());  list.add(getCommitMenuAction());  list.add(getApproveMenuAction());  list.add(getTransactMenuAction());  list.add(getAssistMenuAction());  list.add(getSeparatorAction());  list.add(getAsstQueryMenuAction());  list.add(getSeparatorAction());  list.add(getPayMnyAction());  list.add(getSeparatorAction());  list.add(getPrintMenuAction());  return list;}

private List getManagedList3(){  List list = new ArrayList();  list.add(getSaveAction());  list.add(getSaveApproveAction());  list.add(getSeparatorAction());  list.add(getCancelAction());  return list;}

public nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor getFormInterceptor(){
 if(context.get("formInterceptor")!=null)
 return (nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor)context.get("formInterceptor");
  nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor bean = new nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor();
  context.put("formInterceptor",bean);
  bean.setShowUpComponent(getBillFormEditor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.funcnode.ui.action.SeparatorAction getSeparatorAction(){
 if(context.get("separatorAction")!=null)
 return (nc.funcnode.ui.action.SeparatorAction)context.get("separatorAction");
  nc.funcnode.ui.action.SeparatorAction bean = new nc.funcnode.ui.action.SeparatorAction();
  context.put("separatorAction",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApAddAction getAddAction(){
 if(context.get("addAction")!=null)
 return (nc.ui.ct.ap.action.ApAddAction)context.get("addAction");
  nc.ui.ct.ap.action.ApAddAction bean = new nc.ui.ct.ap.action.ApAddAction();
  context.put("addAction",bean);
  bean.setCardForm(getBillFormEditor());
  bean.setModel(getManageAppModel());
  bean.setInterceptor(getCompositeActionInterceptor_18934e9());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor getCompositeActionInterceptor_18934e9(){
 if(context.get("nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor#18934e9")!=null)
 return (nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor)context.get("nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor#18934e9");
  nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor bean = new nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor();
  context.put("nc.ui.pubapp.uif2app.actions.interceptor.CompositeActionInterceptor#18934e9",bean);
  bean.setInterceptors(getManagedList4());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList4(){  List list = new ArrayList();  list.add(getShowUpComponentInterceptor_c203d3());  return list;}

private nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor getShowUpComponentInterceptor_c203d3(){
 if(context.get("nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor#c203d3")!=null)
 return (nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor)context.get("nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor#c203d3");
  nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor bean = new nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor();
  context.put("nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor#c203d3",bean);
  bean.setShowUpComponent(getBillFormEditor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApEditAction getEditAction(){
 if(context.get("editAction")!=null)
 return (nc.ui.ct.ap.action.ApEditAction)context.get("editAction");
  nc.ui.ct.ap.action.ApEditAction bean = new nc.ui.ct.ap.action.ApEditAction();
  context.put("editAction",bean);
  bean.setCardForm(getBillFormEditor());
  bean.setModel(getManageAppModel());
  bean.setInterceptor(getShowUpComponentInterceptor_f0bc25());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor getShowUpComponentInterceptor_f0bc25(){
 if(context.get("nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor#f0bc25")!=null)
 return (nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor)context.get("nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor#f0bc25");
  nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor bean = new nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor();
  context.put("nc.ui.pubapp.uif2app.actions.interceptor.ShowUpComponentInterceptor#f0bc25",bean);
  bean.setShowUpComponent(getBillFormEditor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.query2.action.DefaultQueryAction getQueryAction(){
 if(context.get("queryAction")!=null)
 return (nc.ui.pubapp.uif2app.query2.action.DefaultQueryAction)context.get("queryAction");
  nc.ui.pubapp.uif2app.query2.action.DefaultQueryAction bean = new nc.ui.pubapp.uif2app.query2.action.DefaultQueryAction();
  context.put("queryAction",bean);
  bean.setModel(getManageAppModel());
  bean.setDataManager(getModelDataManager());
  bean.setQryCondDLGInitializer(getApQryCondDLGInitializer());
  bean.setTemplateContainer(getQueryTemplateContainer());
  bean.setShowUpComponent(getListView());
  bean.setHasQueryArea(false);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.query.ApQryCondDLGInitializer getApQryCondDLGInitializer(){
 if(context.get("apQryCondDLGInitializer")!=null)
 return (nc.ui.ct.ap.query.ApQryCondDLGInitializer)context.get("apQryCondDLGInitializer");
  nc.ui.ct.ap.query.ApQryCondDLGInitializer bean = new nc.ui.ct.ap.query.ApQryCondDLGInitializer();
  context.put("apQryCondDLGInitializer",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApDeleteAction getDeleteAction(){
 if(context.get("deleteAction")!=null)
 return (nc.ui.ct.ap.action.ApDeleteAction)context.get("deleteAction");
  nc.ui.ct.ap.action.ApDeleteAction bean = new nc.ui.ct.ap.action.ApDeleteAction();
  context.put("deleteAction",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setActionName("DELETE");
  bean.setBillType("Z4");
  bean.setValidationService(getDelpowervalidservice());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApSaveAction getSaveAction(){
 if(context.get("saveAction")!=null)
 return (nc.ui.ct.ap.action.ApSaveAction)context.get("saveAction");
  nc.ui.ct.ap.action.ApSaveAction bean = new nc.ui.ct.ap.action.ApSaveAction();
  context.put("saveAction",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setCardForm(getBillFormEditor());
  bean.setActionName("SAVEBASE");
  bean.setBillType("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.CancelAction getCancelAction(){
 if(context.get("cancelAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.CancelAction)context.get("cancelAction");
  nc.ui.pubapp.uif2app.actions.CancelAction bean = new nc.ui.pubapp.uif2app.actions.CancelAction();
  context.put("cancelAction",bean);
  bean.setModel(getManageAppModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.query2.action.DefaultRefreshAction getRefreshAction(){
 if(context.get("refreshAction")!=null)
 return (nc.ui.pubapp.uif2app.query2.action.DefaultRefreshAction)context.get("refreshAction");
  nc.ui.pubapp.uif2app.query2.action.DefaultRefreshAction bean = new nc.ui.pubapp.uif2app.query2.action.DefaultRefreshAction();
  context.put("refreshAction",bean);
  bean.setDataManager(getModelDataManager());
  bean.setModel(getManageAppModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.RefreshSingleAction getCardRefreshAction(){
 if(context.get("cardRefreshAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.RefreshSingleAction)context.get("cardRefreshAction");
  nc.ui.pubapp.uif2app.actions.RefreshSingleAction bean = new nc.ui.pubapp.uif2app.actions.RefreshSingleAction();
  context.put("cardRefreshAction",bean);
  bean.setModel(getManageAppModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.MetaDataBasedPrintAction getPreviewAction(){
 if(context.get("previewAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.MetaDataBasedPrintAction)context.get("previewAction");
  nc.ui.pubapp.uif2app.actions.MetaDataBasedPrintAction bean = new nc.ui.pubapp.uif2app.actions.MetaDataBasedPrintAction();
  context.put("previewAction",bean);
  bean.setPreview(true);
  bean.setModel(getManageAppModel());
  bean.setBeforePrintDataProcess(getPrintProcessor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApPrintAction getPrintAction(){
 if(context.get("printAction")!=null)
 return (nc.ui.ct.ap.action.ApPrintAction)context.get("printAction");
  nc.ui.ct.ap.action.ApPrintAction bean = new nc.ui.ct.ap.action.ApPrintAction();
  context.put("printAction",bean);
  bean.setPreview(false);
  bean.setModel(getManageAppModel());
  bean.setBeforePrintDataProcess(getPrintProcessor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.processor.CtApPrintProcessor getPrintProcessor(){
 if(context.get("printProcessor")!=null)
 return (nc.ui.ct.ap.action.processor.CtApPrintProcessor)context.get("printProcessor");
  nc.ui.ct.ap.action.processor.CtApPrintProcessor bean = new nc.ui.ct.ap.action.processor.CtApPrintProcessor();
  context.put("printProcessor",bean);
  bean.setModel(getManageAppModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApCommitScriptAction getCommitAction(){
 if(context.get("commitAction")!=null)
 return (nc.ui.ct.ap.action.ApCommitScriptAction)context.get("commitAction");
  nc.ui.ct.ap.action.ApCommitScriptAction bean = new nc.ui.ct.ap.action.ApCommitScriptAction();
  context.put("commitAction",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setActionName("SAVE");
  bean.setBillType("Z4");
  bean.setPreActionNames(getManagedList5());
  bean.setFilledUpInFlow(true);
  bean.setValidationService(getComitpowervalidservice());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList5(){  List list = new ArrayList();  list.add("SAVEBASE");  return list;}

public nc.ui.pubapp.uif2app.actions.pflow.SaveAndCommitScriptAction getSaveApproveAction(){
 if(context.get("saveApproveAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.pflow.SaveAndCommitScriptAction)context.get("saveApproveAction");
  nc.ui.pubapp.uif2app.actions.pflow.SaveAndCommitScriptAction bean = new nc.ui.pubapp.uif2app.actions.pflow.SaveAndCommitScriptAction(getSaveAction(),getApproveAction());  context.put("saveApproveAction",bean);
  bean.setModel(getManageAppModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApApproveAction getApproveAction(){
 if(context.get("approveAction")!=null)
 return (nc.ui.ct.ap.action.ApApproveAction)context.get("approveAction");
  nc.ui.ct.ap.action.ApApproveAction bean = new nc.ui.ct.ap.action.ApApproveAction();
  context.put("approveAction",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setActionName("APPROVE");
  bean.setFilledUpInFlow(true);
  bean.setBillType("Z4");
  bean.setValidationService(getPowervalidservice());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApUnApproveAction getUnApproveAction(){
 if(context.get("unApproveAction")!=null)
 return (nc.ui.ct.ap.action.ApUnApproveAction)context.get("unApproveAction");
  nc.ui.ct.ap.action.ApUnApproveAction bean = new nc.ui.ct.ap.action.ApUnApproveAction();
  context.put("unApproveAction",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setActionName("UNAPPROVE");
  bean.setFilledUpInFlow(true);
  bean.setBillType("Z4");
  bean.setValidationService(getUnapprovepowervalidservice());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.action.CtCopyAction getCopyAction(){
 if(context.get("copyAction")!=null)
 return (nc.ui.ct.action.CtCopyAction)context.get("copyAction");
  nc.ui.ct.action.CtCopyAction bean = new nc.ui.ct.action.CtCopyAction();
  context.put("copyAction",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setCopyActionProcessor(getCopyActionProcessor());
  bean.setInterceptor(getFormInterceptor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApCopyActionProcessor getCopyActionProcessor(){
 if(context.get("copyActionProcessor")!=null)
 return (nc.ui.ct.ap.action.ApCopyActionProcessor)context.get("copyActionProcessor");
  nc.ui.ct.ap.action.ApCopyActionProcessor bean = new nc.ui.ct.ap.action.ApCopyActionProcessor();
  context.put("copyActionProcessor",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApFrozenAction getFrozenAction(){
 if(context.get("frozenAction")!=null)
 return (nc.ui.ct.ap.action.ApFrozenAction)context.get("frozenAction");
  nc.ui.ct.ap.action.ApFrozenAction bean = new nc.ui.ct.ap.action.ApFrozenAction();
  context.put("frozenAction",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setActionName("FREEZE");
  bean.setFilledUpInFlow(false);
  bean.setBillType("Z4");
  bean.setValidationService(getFrozenpowervalidservice());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApUnFrozenAction getUnFrozenAction(){
 if(context.get("unFrozenAction")!=null)
 return (nc.ui.ct.ap.action.ApUnFrozenAction)context.get("unFrozenAction");
  nc.ui.ct.ap.action.ApUnFrozenAction bean = new nc.ui.ct.ap.action.ApUnFrozenAction();
  context.put("unFrozenAction",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setActionName("UNFREEZE");
  bean.setFilledUpInFlow(false);
  bean.setBillType("Z4");
  bean.setValidationService(getUnfrozenpowervalidservice());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApPayMnyAction getPayMnyAction(){
 if(context.get("payMnyAction")!=null)
 return (nc.ui.ct.ap.action.ApPayMnyAction)context.get("payMnyAction");
  nc.ui.ct.ap.action.ApPayMnyAction bean = new nc.ui.ct.ap.action.ApPayMnyAction();
  context.put("payMnyAction",bean);
  bean.setModel(getManageAppModel());
  bean.setCardForm(getBillFormEditor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApAppStateAction getAppStateAction(){
 if(context.get("appStateAction")!=null)
 return (nc.ui.ct.ap.action.ApAppStateAction)context.get("appStateAction");
  nc.ui.ct.ap.action.ApAppStateAction bean = new nc.ui.ct.ap.action.ApAppStateAction();
  context.put("appStateAction",bean);
  bean.setModel(getManageAppModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.action.CtChangeAction getChangeAction(){
 if(context.get("changeAction")!=null)
 return (nc.ui.ct.action.CtChangeAction)context.get("changeAction");
  nc.ui.ct.action.CtChangeAction bean = new nc.ui.ct.action.CtChangeAction();
  context.put("changeAction",bean);
  bean.setModel(getManageAppModel());
  bean.setCardForm(getBillFormEditor());
  bean.setListForm(getListView());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApModifyAction getModifyAction(){
 if(context.get("modifyAction")!=null)
 return (nc.ui.ct.ap.action.ApModifyAction)context.get("modifyAction");
  nc.ui.ct.ap.action.ApModifyAction bean = new nc.ui.ct.ap.action.ApModifyAction();
  context.put("modifyAction",bean);
  bean.setModel(getManageAppModel());
  bean.setCardForm(getBillFormEditor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApTerminateAction getTerminateAction(){
 if(context.get("terminateAction")!=null)
 return (nc.ui.ct.ap.action.ApTerminateAction)context.get("terminateAction");
  nc.ui.ct.ap.action.ApTerminateAction bean = new nc.ui.ct.ap.action.ApTerminateAction();
  context.put("terminateAction",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setCardForm(getBillFormEditor());
  bean.setActionName("TERMINATE");
  bean.setFilledUpInFlow(false);
  bean.setBillType("Z4");
  bean.setValidationService(getTerminatepowervalidservice());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApUnTerminateAction getUnTerminateAction(){
 if(context.get("unTerminateAction")!=null)
 return (nc.ui.ct.ap.action.ApUnTerminateAction)context.get("unTerminateAction");
  nc.ui.ct.ap.action.ApUnTerminateAction bean = new nc.ui.ct.ap.action.ApUnTerminateAction();
  context.put("unTerminateAction",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setCardForm(getBillFormEditor());
  bean.setActionName("UNTERMINATE");
  bean.setFilledUpInFlow(false);
  bean.setBillType("Z4");
  bean.setValidationService(getUnterminatepowervalidservice());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApValidateAction getValidateAction(){
 if(context.get("validateAction")!=null)
 return (nc.ui.ct.ap.action.ApValidateAction)context.get("validateAction");
  nc.ui.ct.ap.action.ApValidateAction bean = new nc.ui.ct.ap.action.ApValidateAction();
  context.put("validateAction",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setCardForm(getBillFormEditor());
  bean.setActionName("VALIDATE");
  bean.setFilledUpInFlow(false);
  bean.setBillType("Z4");
  bean.setValidationService(getValidatepowervalidservice());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.scmmm.ui.uif2.actions.SCMLinkQueryAction getLinkBillAction(){
 if(context.get("linkBillAction")!=null)
 return (nc.scmmm.ui.uif2.actions.SCMLinkQueryAction)context.get("linkBillAction");
  nc.scmmm.ui.uif2.actions.SCMLinkQueryAction bean = new nc.scmmm.ui.uif2.actions.SCMLinkQueryAction();
  context.put("linkBillAction",bean);
  bean.setModel(getManageAppModel());
  bean.setBillType("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApPayMnyStateAction getPayMnyStateAction(){
 if(context.get("payMnyStateAction")!=null)
 return (nc.ui.ct.ap.action.ApPayMnyStateAction)context.get("payMnyStateAction");
  nc.ui.ct.ap.action.ApPayMnyStateAction bean = new nc.ui.ct.ap.action.ApPayMnyStateAction();
  context.put("payMnyStateAction",bean);
  bean.setModel(getManageAppModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApTakeBackAction getTakeBackAction(){
 if(context.get("takeBackAction")!=null)
 return (nc.ui.ct.ap.action.ApTakeBackAction)context.get("takeBackAction");
  nc.ui.ct.ap.action.ApTakeBackAction bean = new nc.ui.ct.ap.action.ApTakeBackAction();
  context.put("takeBackAction",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setActionName("UNSAVEBILL");
  bean.setFilledUpInFlow(true);
  bean.setBillType("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.action.ApUnValidateAction getUnValidateAction(){
 if(context.get("unValidateAction")!=null)
 return (nc.ui.ct.ap.action.ApUnValidateAction)context.get("unValidateAction");
  nc.ui.ct.ap.action.ApUnValidateAction bean = new nc.ui.ct.ap.action.ApUnValidateAction();
  context.put("unValidateAction",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setActionName("UNVALIDATE");
  bean.setFilledUpInFlow(false);
  bean.setBillType("Z4");
  bean.setValidationService(getUnvalidatepowervalidservice());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.AddMenuAction getAddMenuAction(){
 if(context.get("addMenuAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.AddMenuAction)context.get("addMenuAction");
  nc.ui.pubapp.uif2app.actions.AddMenuAction bean = new nc.ui.pubapp.uif2app.actions.AddMenuAction();
  context.put("addMenuAction",bean);
  bean.setBillType("Z4");
  bean.setActions(getManagedList6());
  bean.setModel(getManageAppModel());
  bean.setPfAddInfoLoader(getPfAddInfoLoader());
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList6(){  List list = new ArrayList();  list.add(getAddAction());  return list;}

public nc.ui.pubapp.uif2app.actions.PfAddInfoLoader getPfAddInfoLoader(){
 if(context.get("pfAddInfoLoader")!=null)
 return (nc.ui.pubapp.uif2app.actions.PfAddInfoLoader)context.get("pfAddInfoLoader");
  nc.ui.pubapp.uif2app.actions.PfAddInfoLoader bean = new nc.ui.pubapp.uif2app.actions.PfAddInfoLoader();
  context.put("pfAddInfoLoader",bean);
  bean.setBillType("Z4");
  bean.setModel(getManageAppModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.funcnode.ui.action.GroupAction getApproveMenuAction(){
 if(context.get("approveMenuAction")!=null)
 return (nc.funcnode.ui.action.GroupAction)context.get("approveMenuAction");
  nc.funcnode.ui.action.GroupAction bean = new nc.funcnode.ui.action.GroupAction();
  context.put("approveMenuAction",bean);
  bean.setCode("approveMenuAction");
  bean.setActions(getManagedList7());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList7(){  List list = new ArrayList();  list.add(getApproveAction());  list.add(getUnApproveAction());  list.add(getSeparatorAction());  list.add(getAppStateAction());  return list;}

public nc.funcnode.ui.action.GroupAction getCommitMenuAction(){
 if(context.get("commitMenuAction")!=null)
 return (nc.funcnode.ui.action.GroupAction)context.get("commitMenuAction");
  nc.funcnode.ui.action.GroupAction bean = new nc.funcnode.ui.action.GroupAction();
  context.put("commitMenuAction",bean);
  bean.setCode("commitMenuAction");
  bean.setActions(getManagedList8());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList8(){  List list = new ArrayList();  list.add(getCommitAction());  list.add(getTakeBackAction());  return list;}

public nc.ui.ct.action.TransactMenuAction getTransactMenuAction(){
 if(context.get("transactMenuAction")!=null)
 return (nc.ui.ct.action.TransactMenuAction)context.get("transactMenuAction");
  nc.ui.ct.action.TransactMenuAction bean = new nc.ui.ct.action.TransactMenuAction();
  context.put("transactMenuAction",bean);
  bean.setCode("transactMenuAction");
  bean.setActions(getManagedList9());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList9(){  List list = new ArrayList();  list.add(getValidateAction());  list.add(getUnValidateAction());  list.add(getFrozenAction());  list.add(getUnFrozenAction());  list.add(getTerminateAction());  list.add(getUnTerminateAction());  list.add(getModifyAction());  return list;}

public nc.ui.ct.action.AsstQueryMenuAction getAsstQueryMenuAction(){
 if(context.get("asstQueryMenuAction")!=null)
 return (nc.ui.ct.action.AsstQueryMenuAction)context.get("asstQueryMenuAction");
  nc.ui.ct.action.AsstQueryMenuAction bean = new nc.ui.ct.action.AsstQueryMenuAction();
  context.put("asstQueryMenuAction",bean);
  bean.setCode("asstQueryMenuAction");
  bean.setActions(getManagedList10());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList10(){  List list = new ArrayList();  list.add(getLinkBillAction());  list.add(getSeparatorAction());  list.add(getPayMnyStateAction());  return list;}

public nc.ui.ct.action.AssistMenuAction getAssistMenuAction(){
 if(context.get("assistMenuAction")!=null)
 return (nc.ui.ct.action.AssistMenuAction)context.get("assistMenuAction");
  nc.ui.ct.action.AssistMenuAction bean = new nc.ui.ct.action.AssistMenuAction();
  context.put("assistMenuAction",bean);
  bean.setCode("assistMenuAction");
  bean.setActions(getManagedList11());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList11(){  List list = new ArrayList();  list.add(getAccessoriesAction());  list.add(getSeparatorAction());  list.add(getChangeAction());  return list;}

public nc.ui.pubapp.uif2app.actions.FileDocManageAction getAccessoriesAction(){
 if(context.get("accessoriesAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.FileDocManageAction)context.get("accessoriesAction");
  nc.ui.pubapp.uif2app.actions.FileDocManageAction bean = new nc.ui.pubapp.uif2app.actions.FileDocManageAction();
  context.put("accessoriesAction",bean);
  bean.setModel(getManageAppModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.OutputAction getOutputAction(){
 if(context.get("outputAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.OutputAction)context.get("outputAction");
  nc.ui.pubapp.uif2app.actions.OutputAction bean = new nc.ui.pubapp.uif2app.actions.OutputAction();
  context.put("outputAction",bean);
  bean.setModel(getManageAppModel());
  bean.setParent(getBillFormEditor());
  bean.setBeforePrintDataProcess(getPrintProcessor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.funcnode.ui.action.GroupAction getPrintMenuAction(){
 if(context.get("printMenuAction")!=null)
 return (nc.funcnode.ui.action.GroupAction)context.get("printMenuAction");
  nc.funcnode.ui.action.GroupAction bean = new nc.funcnode.ui.action.GroupAction();
  context.put("printMenuAction",bean);
  bean.setCode("print");
  bean.setActions(getManagedList12());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList12(){  List list = new ArrayList();  list.add(getPrintAction());  list.add(getPreviewAction());  list.add(getOutputAction());  return list;}

public nc.ui.ct.action.CtCloseHistoryDlgAction getClosehistoryAction(){
 if(context.get("closehistoryAction")!=null)
 return (nc.ui.ct.action.CtCloseHistoryDlgAction)context.get("closehistoryAction");
  nc.ui.ct.action.CtCloseHistoryDlgAction bean = new nc.ui.ct.action.CtCloseHistoryDlgAction();
  context.put("closehistoryAction",bean);
  bean.setView(getListViewHistory());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.uif2.actions.StandAloneToftPanelActionContainer getActionsOfHistory(){
 if(context.get("actionsOfHistory")!=null)
 return (nc.ui.uif2.actions.StandAloneToftPanelActionContainer)context.get("actionsOfHistory");
  nc.ui.uif2.actions.StandAloneToftPanelActionContainer bean = new nc.ui.uif2.actions.StandAloneToftPanelActionContainer(getListViewHistory());  context.put("actionsOfHistory",bean);
  bean.setActions(getManagedList13());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList13(){  List list = new ArrayList();  list.add(getClosehistoryAction());  return list;}

public nc.ui.pubapp.pub.power.PowerValidateService getComitpowervalidservice(){
 if(context.get("comitpowervalidservice")!=null)
 return (nc.ui.pubapp.pub.power.PowerValidateService)context.get("comitpowervalidservice");
  nc.ui.pubapp.pub.power.PowerValidateService bean = new nc.ui.pubapp.pub.power.PowerValidateService();
  context.put("comitpowervalidservice",bean);
  bean.setActionCode("commit");
  bean.setBillCodeFiledName("vbillcode");
  bean.setPermissionCode("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.pub.power.PowerValidateService getPowervalidservice(){
 if(context.get("powervalidservice")!=null)
 return (nc.ui.pubapp.pub.power.PowerValidateService)context.get("powervalidservice");
  nc.ui.pubapp.pub.power.PowerValidateService bean = new nc.ui.pubapp.pub.power.PowerValidateService();
  context.put("powervalidservice",bean);
  bean.setActionCode("approve");
  bean.setBillCodeFiledName("vbillcode");
  bean.setPermissionCode("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.pub.power.PowerValidateService getUnapprovepowervalidservice(){
 if(context.get("unapprovepowervalidservice")!=null)
 return (nc.ui.pubapp.pub.power.PowerValidateService)context.get("unapprovepowervalidservice");
  nc.ui.pubapp.pub.power.PowerValidateService bean = new nc.ui.pubapp.pub.power.PowerValidateService();
  context.put("unapprovepowervalidservice",bean);
  bean.setActionCode("unapprove");
  bean.setBillCodeFiledName("vbillcode");
  bean.setPermissionCode("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.pub.power.PowerValidateService getDelpowervalidservice(){
 if(context.get("delpowervalidservice")!=null)
 return (nc.ui.pubapp.pub.power.PowerValidateService)context.get("delpowervalidservice");
  nc.ui.pubapp.pub.power.PowerValidateService bean = new nc.ui.pubapp.pub.power.PowerValidateService();
  context.put("delpowervalidservice",bean);
  bean.setActionCode("delete");
  bean.setBillCodeFiledName("vbillcode");
  bean.setPermissionCode("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.pub.power.PowerValidateService getFrozenpowervalidservice(){
 if(context.get("frozenpowervalidservice")!=null)
 return (nc.ui.pubapp.pub.power.PowerValidateService)context.get("frozenpowervalidservice");
  nc.ui.pubapp.pub.power.PowerValidateService bean = new nc.ui.pubapp.pub.power.PowerValidateService();
  context.put("frozenpowervalidservice",bean);
  bean.setActionCode("frozen");
  bean.setBillCodeFiledName("vbillcode");
  bean.setPermissionCode("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.pub.power.PowerValidateService getUnfrozenpowervalidservice(){
 if(context.get("unfrozenpowervalidservice")!=null)
 return (nc.ui.pubapp.pub.power.PowerValidateService)context.get("unfrozenpowervalidservice");
  nc.ui.pubapp.pub.power.PowerValidateService bean = new nc.ui.pubapp.pub.power.PowerValidateService();
  context.put("unfrozenpowervalidservice",bean);
  bean.setActionCode("unfrozen");
  bean.setBillCodeFiledName("vbillcode");
  bean.setPermissionCode("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.pub.power.PowerValidateService getTerminatepowervalidservice(){
 if(context.get("terminatepowervalidservice")!=null)
 return (nc.ui.pubapp.pub.power.PowerValidateService)context.get("terminatepowervalidservice");
  nc.ui.pubapp.pub.power.PowerValidateService bean = new nc.ui.pubapp.pub.power.PowerValidateService();
  context.put("terminatepowervalidservice",bean);
  bean.setActionCode("teminate");
  bean.setBillCodeFiledName("vbillcode");
  bean.setPermissionCode("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.pub.power.PowerValidateService getUnterminatepowervalidservice(){
 if(context.get("unterminatepowervalidservice")!=null)
 return (nc.ui.pubapp.pub.power.PowerValidateService)context.get("unterminatepowervalidservice");
  nc.ui.pubapp.pub.power.PowerValidateService bean = new nc.ui.pubapp.pub.power.PowerValidateService();
  context.put("unterminatepowervalidservice",bean);
  bean.setActionCode("unterminate");
  bean.setBillCodeFiledName("vbillcode");
  bean.setPermissionCode("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.pub.power.PowerValidateService getValidatepowervalidservice(){
 if(context.get("validatepowervalidservice")!=null)
 return (nc.ui.pubapp.pub.power.PowerValidateService)context.get("validatepowervalidservice");
  nc.ui.pubapp.pub.power.PowerValidateService bean = new nc.ui.pubapp.pub.power.PowerValidateService();
  context.put("validatepowervalidservice",bean);
  bean.setActionCode("validate");
  bean.setBillCodeFiledName("vbillcode");
  bean.setPermissionCode("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.pub.power.PowerValidateService getUnvalidatepowervalidservice(){
 if(context.get("unvalidatepowervalidservice")!=null)
 return (nc.ui.pubapp.pub.power.PowerValidateService)context.get("unvalidatepowervalidservice");
  nc.ui.pubapp.pub.power.PowerValidateService bean = new nc.ui.pubapp.pub.power.PowerValidateService();
  context.put("unvalidatepowervalidservice",bean);
  bean.setActionCode("unvalidate");
  bean.setBillCodeFiledName("vbillcode");
  bean.setPermissionCode("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.actions.AddMenuAction getAddMenuGroup(){
 if(context.get("addMenuGroup")!=null)
 return (nc.ui.pubapp.uif2app.actions.AddMenuAction)context.get("addMenuGroup");
  nc.ui.pubapp.uif2app.actions.AddMenuAction bean = new nc.ui.pubapp.uif2app.actions.AddMenuAction();
  context.put("addMenuGroup",bean);
  bean.setBillType("Z4");
  bean.setActions(getManagedList14());
  bean.setModel(getManageAppModel());
  bean.setPfAddInfoLoader(getPfAddInfoLoader());
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList14(){  List list = new ArrayList();  list.add(getAddAction());  list.add(getSeparatorAction());  list.add(getAddZ5Action());  return list;}

public nc.ui.devlu.billref.AddZ5Action getAddZ5Action(){
 if(context.get("addZ5Action")!=null)
 return (nc.ui.devlu.billref.AddZ5Action)context.get("addZ5Action");
  nc.ui.devlu.billref.AddZ5Action bean = new nc.ui.devlu.billref.AddZ5Action();
  context.put("addZ5Action",bean);
  bean.setSourceBillType("Z5");
  bean.setSourceBillName("参照销售合同");
  bean.setFlowBillType(false);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setTransferViewProcessor(getTransferProcessorforZ4());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.billref.dest.TransferViewProcessor getTransferProcessorforZ4(){
 if(context.get("transferProcessorforZ4")!=null)
 return (nc.ui.pubapp.billref.dest.TransferViewProcessor)context.get("transferProcessorforZ4");
  nc.ui.pubapp.billref.dest.TransferViewProcessor bean = new nc.ui.pubapp.billref.dest.TransferViewProcessor();
  context.put("transferProcessorforZ4",bean);
  bean.setList(getListView());
  bean.setActionContainer(getActionsOfList());
  bean.setCardActionContainer(getActionsOfCard());
  bean.setTransferLogic(getTransferLogicforZ4());
  bean.setBillForm(getBillFormEditor());
  bean.setCancelAction(getCancelAction());
  bean.setSaveAction(getSaveAction());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.devlu.billref.Z5RefZ4TransferBillDataLogic getTransferLogicforZ4(){
 if(context.get("transferLogicforZ4")!=null)
 return (nc.ui.devlu.billref.Z5RefZ4TransferBillDataLogic)context.get("transferLogicforZ4");
  nc.ui.devlu.billref.Z5RefZ4TransferBillDataLogic bean = new nc.ui.devlu.billref.Z5RefZ4TransferBillDataLogic();
  context.put("transferLogicforZ4",bean);
  bean.setBillForm(getBillFormEditor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.model.AppEventHandlerMediator getAppEventHandlerMediator(){
 if(context.get("appEventHandlerMediator")!=null)
 return (nc.ui.pubapp.uif2app.model.AppEventHandlerMediator)context.get("appEventHandlerMediator");
  nc.ui.pubapp.uif2app.model.AppEventHandlerMediator bean = new nc.ui.pubapp.uif2app.model.AppEventHandlerMediator();
  context.put("appEventHandlerMediator",bean);
  bean.setModel(getManageAppModel());
  bean.setHandlerMap(getManagedMap0());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private Map getManagedMap0(){  Map map = new HashMap();  map.put("nc.ui.pubapp.uif2app.event.list.ListHeadRowChangedEvent",getManagedList15());  map.put("nc.ui.pubapp.uif2app.event.OrgChangedEvent",getManagedList16());  map.put("nc.ui.pubapp.uif2app.event.card.CardHeadTailBeforeEditEvent",getManagedList17());  map.put("nc.ui.pubapp.uif2app.event.card.CardHeadTailAfterEditEvent",getManagedList18());  map.put("nc.ui.pubapp.uif2app.event.card.CardBodyBeforeEditEvent",getManagedList19());  map.put("nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent",getManagedList20());  return map;}

private List getManagedList15(){  List list = new ArrayList();  list.add(getHeadrowchghandler());  return list;}

private List getManagedList16(){  List list = new ArrayList();  list.add(getMainorgchghandler());  return list;}

private List getManagedList17(){  List list = new ArrayList();  list.add(getBefore_headtail_edithandler());  return list;}

private List getManagedList18(){  List list = new ArrayList();  list.add(getAfter_headtail_edithandler());  return list;}

private List getManagedList19(){  List list = new ArrayList();  list.add(getBefore_body_edithandler());  return list;}

private List getManagedList20(){  List list = new ArrayList();  list.add(getAfter_body_edithandler());  list.add(getRelationCalculate());  return list;}

public nc.ui.ct.ap.editor.org.ApOrgChangedEventHandler getMainorgchghandler(){
 if(context.get("mainorgchghandler")!=null)
 return (nc.ui.ct.ap.editor.org.ApOrgChangedEventHandler)context.get("mainorgchghandler");
  nc.ui.ct.ap.editor.org.ApOrgChangedEventHandler bean = new nc.ui.ct.ap.editor.org.ApOrgChangedEventHandler();
  context.put("mainorgchghandler",bean);
  bean.setCardForm(getBillFormEditor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.editor.rowchange.HeadRowChangeHandler getHeadrowchghandler(){
 if(context.get("headrowchghandler")!=null)
 return (nc.ui.ct.editor.rowchange.HeadRowChangeHandler)context.get("headrowchghandler");
  nc.ui.ct.editor.rowchange.HeadRowChangeHandler bean = new nc.ui.ct.editor.rowchange.HeadRowChangeHandler();
  context.put("headrowchghandler",bean);
  bean.setTableCode("pk_ct_ap_b");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.editor.before.ApHeadTailBeforeEventHandler getBefore_headtail_edithandler(){
 if(context.get("before_headtail_edithandler")!=null)
 return (nc.ui.ct.ap.editor.before.ApHeadTailBeforeEventHandler)context.get("before_headtail_edithandler");
  nc.ui.ct.ap.editor.before.ApHeadTailBeforeEventHandler bean = new nc.ui.ct.ap.editor.before.ApHeadTailBeforeEventHandler();
  context.put("before_headtail_edithandler",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.editor.after.ApHeadTailAfterEventHandler getAfter_headtail_edithandler(){
 if(context.get("after_headtail_edithandler")!=null)
 return (nc.ui.ct.ap.editor.after.ApHeadTailAfterEventHandler)context.get("after_headtail_edithandler");
  nc.ui.ct.ap.editor.after.ApHeadTailAfterEventHandler bean = new nc.ui.ct.ap.editor.after.ApHeadTailAfterEventHandler();
  context.put("after_headtail_edithandler",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.editor.before.ApBodyBeforeEventHandler getBefore_body_edithandler(){
 if(context.get("before_body_edithandler")!=null)
 return (nc.ui.ct.ap.editor.before.ApBodyBeforeEventHandler)context.get("before_body_edithandler");
  nc.ui.ct.ap.editor.before.ApBodyBeforeEventHandler bean = new nc.ui.ct.ap.editor.before.ApBodyBeforeEventHandler();
  context.put("before_body_edithandler",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.editor.after.ApBodyAfterEventHandler getAfter_body_edithandler(){
 if(context.get("after_body_edithandler")!=null)
 return (nc.ui.ct.ap.editor.after.ApBodyAfterEventHandler)context.get("after_body_edithandler");
  nc.ui.ct.ap.editor.after.ApBodyAfterEventHandler bean = new nc.ui.ct.ap.editor.after.ApBodyAfterEventHandler();
  context.put("after_body_edithandler",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.util.RelationCalculate getRelationCalculate(){
 if(context.get("relationCalculate")!=null)
 return (nc.ui.ct.util.RelationCalculate)context.get("relationCalculate");
  nc.ui.ct.util.RelationCalculate bean = new nc.ui.ct.util.RelationCalculate();
  context.put("relationCalculate",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.model.DefaultFuncNodeInitDataListener getInitDataListener(){
 if(context.get("InitDataListener")!=null)
 return (nc.ui.pubapp.uif2app.model.DefaultFuncNodeInitDataListener)context.get("InitDataListener");
  nc.ui.pubapp.uif2app.model.DefaultFuncNodeInitDataListener bean = new nc.ui.pubapp.uif2app.model.DefaultFuncNodeInitDataListener();
  context.put("InitDataListener",bean);
  bean.setModel(getManageAppModel());
  bean.setQueryAction(getQueryAction());
  bean.setVoClassName("nc.vo.ct.ap.entity.AggCtApVO");
  bean.setAutoShowUpComponent(getBillFormEditor());
  bean.setProcessorMap(getManagedMap1());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private Map getManagedMap1(){  Map map = new HashMap();  map.put("3",getCTLinkQueryInitDataProcessor_a5e7d1());  return map;}

private nc.ui.ct.view.CTLinkQueryInitDataProcessor getCTLinkQueryInitDataProcessor_a5e7d1(){
 if(context.get("nc.ui.ct.view.CTLinkQueryInitDataProcessor#a5e7d1")!=null)
 return (nc.ui.ct.view.CTLinkQueryInitDataProcessor)context.get("nc.ui.ct.view.CTLinkQueryInitDataProcessor#a5e7d1");
  nc.ui.ct.view.CTLinkQueryInitDataProcessor bean = new nc.ui.ct.view.CTLinkQueryInitDataProcessor();
  context.put("nc.ui.ct.view.CTLinkQueryInitDataProcessor#a5e7d1",bean);
  bean.setFunNodeInitDataListener(getInitDataListener());
  bean.setView(getListViewHistory());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public java.util.ArrayList getPasteClearItem_ct_ap_b(){
 if(context.get("pasteClearItem_ct_ap_b")!=null)
 return (java.util.ArrayList)context.get("pasteClearItem_ct_ap_b");
  java.util.ArrayList bean = new java.util.ArrayList(getManagedList21());  context.put("pasteClearItem_ct_ap_b",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList21(){  List list = new ArrayList();  list.add("nordnum");  list.add("nordsum");  list.add("pk_ct_ap_b");  list.add("noritotalgpmny");  list.add("ntotalgpmny");  list.add("ncopegpmny");  list.add("noricopegpmny");  list.add("ts");  return list;}

public java.util.ArrayList getPasteClearItem_ct_ap_term(){
 if(context.get("pasteClearItem_ct_ap_term")!=null)
 return (java.util.ArrayList)context.get("pasteClearItem_ct_ap_term");
  java.util.ArrayList bean = new java.util.ArrayList(getManagedList22());  context.put("pasteClearItem_ct_ap_term",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList22(){  List list = new ArrayList();  list.add("pk_ct_ap_term");  list.add("ts");  return list;}

public java.util.ArrayList getPasteClearItem_ct_ap_exp(){
 if(context.get("pasteClearItem_ct_ap_exp")!=null)
 return (java.util.ArrayList)context.get("pasteClearItem_ct_ap_exp");
  java.util.ArrayList bean = new java.util.ArrayList(getManagedList23());  context.put("pasteClearItem_ct_ap_exp",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList23(){  List list = new ArrayList();  list.add("pk_ct_ap_exp");  list.add("ts");  return list;}

public java.util.ArrayList getPasteClearItem_ct_ap_memora(){
 if(context.get("pasteClearItem_ct_ap_memora")!=null)
 return (java.util.ArrayList)context.get("pasteClearItem_ct_ap_memora");
  java.util.ArrayList bean = new java.util.ArrayList(getManagedList24());  context.put("pasteClearItem_ct_ap_memora",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList24(){  List list = new ArrayList();  list.add("pk_ct_ap_memora");  list.add("ts");  return list;}

public nc.vo.uif2.LoginContext getContext(){
 if(context.get("context")!=null)
 return (nc.vo.uif2.LoginContext)context.get("context");
  nc.vo.uif2.LoginContext bean = new nc.vo.uif2.LoginContext();
  context.put("context",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.model.ApModelService getManageModelService(){
 if(context.get("ManageModelService")!=null)
 return (nc.ui.ct.ap.model.ApModelService)context.get("ManageModelService");
  nc.ui.ct.ap.model.ApModelService bean = new nc.ui.ct.ap.model.ApModelService();
  context.put("ManageModelService",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.view.value.AggVOMetaBDObjectAdapterFactory getBoadatorfactory(){
 if(context.get("boadatorfactory")!=null)
 return (nc.ui.pubapp.uif2app.view.value.AggVOMetaBDObjectAdapterFactory)context.get("boadatorfactory");
  nc.ui.pubapp.uif2app.view.value.AggVOMetaBDObjectAdapterFactory bean = new nc.ui.pubapp.uif2app.view.value.AggVOMetaBDObjectAdapterFactory();
  context.put("boadatorfactory",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.model.CTModel getManageAppModel(){
 if(context.get("ManageAppModel")!=null)
 return (nc.ui.ct.model.CTModel)context.get("ManageAppModel");
  nc.ui.ct.model.CTModel bean = new nc.ui.ct.model.CTModel();
  context.put("ManageAppModel",bean);
  bean.setService(getManageModelService());
  bean.setBusinessObjectAdapterFactory(getBoadatorfactory());
  bean.setContext(getContext());
  bean.setBillType("Z4");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.model.BillBodySortMediator getBillBodySortMediator(){
 if(context.get("billBodySortMediator")!=null)
 return (nc.ui.pubapp.uif2app.model.BillBodySortMediator)context.get("billBodySortMediator");
  nc.ui.pubapp.uif2app.model.BillBodySortMediator bean = new nc.ui.pubapp.uif2app.model.BillBodySortMediator(getManageAppModel(),getBillFormEditor(),getListView());  context.put("billBodySortMediator",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.query2.model.ModelDataManager getModelDataManager(){
 if(context.get("modelDataManager")!=null)
 return (nc.ui.pubapp.uif2app.query2.model.ModelDataManager)context.get("modelDataManager");
  nc.ui.pubapp.uif2app.query2.model.ModelDataManager bean = new nc.ui.pubapp.uif2app.query2.model.ModelDataManager();
  context.put("modelDataManager",bean);
  bean.setModel(getManageAppModel());
  bean.setService(getManageModelService());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.view.TemplateContainer getTemplateContainer(){
 if(context.get("templateContainer")!=null)
 return (nc.ui.pubapp.uif2app.view.TemplateContainer)context.get("templateContainer");
  nc.ui.pubapp.uif2app.view.TemplateContainer bean = new nc.ui.pubapp.uif2app.view.TemplateContainer();
  context.put("templateContainer",bean);
  bean.setContext(getContext());
  bean.setBillTemplateMender(getBillTemplateMender());
  bean.load();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.funcnode.trantype.TrantypeBillTemplateMender getBillTemplateMender(){
 if(context.get("billTemplateMender")!=null)
 return (nc.ui.pubapp.uif2app.funcnode.trantype.TrantypeBillTemplateMender)context.get("billTemplateMender");
  nc.ui.pubapp.uif2app.funcnode.trantype.TrantypeBillTemplateMender bean = new nc.ui.pubapp.uif2app.funcnode.trantype.TrantypeBillTemplateMender(getContext());  context.put("billTemplateMender",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.view.BillOrgPanel getOrgPanel(){
 if(context.get("orgPanel")!=null)
 return (nc.ui.pubapp.uif2app.view.BillOrgPanel)context.get("orgPanel");
  nc.ui.pubapp.uif2app.view.BillOrgPanel bean = new nc.ui.pubapp.uif2app.view.BillOrgPanel();
  context.put("orgPanel",bean);
  bean.setModel(getManageAppModel());
  bean.setType("公司");
  bean.setOnlyLeafCanSelected(false);
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.view.CTListView getListView(){
 if(context.get("listView")!=null)
 return (nc.ui.ct.view.CTListView)context.get("listView");
  nc.ui.ct.view.CTListView bean = new nc.ui.ct.view.CTListView();
  context.put("listView",bean);
  bean.setModel(getManageAppModel());
  bean.setMultiSelectionEnable(true);
  bean.setTemplateContainer(getTemplateContainer());
  bean.setUserdefitemListPreparator(getUserdefAndMarAsstListPreparator());
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.view.ApHistiryListForm getListViewHistory(){
 if(context.get("listViewHistory")!=null)
 return (nc.ui.ct.ap.view.ApHistiryListForm)context.get("listViewHistory");
  nc.ui.ct.ap.view.ApHistiryListForm bean = new nc.ui.ct.ap.view.ApHistiryListForm();
  context.put("listViewHistory",bean);
  bean.setModel(getManageAppModel());
  bean.setMultiSelectionEnable(true);
  bean.setTemplateContainer(getTemplateContainer());
  bean.setUserdefitemListPreparator(getUserdefAndMarAsstListPreparator());
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.linkquery.LinkQueryHyperlinkMediator getVsourcecodeMediator(){
 if(context.get("vsourcecodeMediator")!=null)
 return (nc.ui.pubapp.uif2app.linkquery.LinkQueryHyperlinkMediator)context.get("vsourcecodeMediator");
  nc.ui.pubapp.uif2app.linkquery.LinkQueryHyperlinkMediator bean = new nc.ui.pubapp.uif2app.linkquery.LinkQueryHyperlinkMediator();
  context.put("vsourcecodeMediator",bean);
  bean.setModel(getManageAppModel());
  bean.setSrcBillIdField("csrcid");
  bean.setSrcBillNOField("vsrccode");
  bean.setSrcBillTypeField("vsrctype");
  bean.setSrcBillTypeFieldPos(1);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.ap.view.ApBillForm getBillFormEditor(){
 if(context.get("billFormEditor")!=null)
 return (nc.ui.ct.ap.view.ApBillForm)context.get("billFormEditor");
  nc.ui.ct.ap.view.ApBillForm bean = new nc.ui.ct.ap.view.ApBillForm();
  context.put("billFormEditor",bean);
  bean.setModel(getManageAppModel());
  bean.setTemplateContainer(getTemplateContainer());
  bean.setUserdefitemPreparator(getUserdefAndMarAsstCardPreparator());
  bean.setTemplateNotNullValidate(true);
  bean.setAutoAddLine(true);
  bean.setBlankChildrenFilter(getBlankitemfilter());
  bean.setBodyActionMap(getManagedMap2());
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private Map getManagedMap2(){  Map map = new HashMap();  map.put("pk_ct_ap_b",getManagedList25());  map.put("pk_ct_ap_term",getManagedList26());  map.put("pk_ct_ap_exp",getManagedList27());  map.put("pk_ct_ap_memora",getManagedList28());  return map;}

private List getManagedList25(){  List list = new ArrayList();  list.add(getApAddLineAction_1654ee());  list.add(getApInsertLineAction_21e19c());  list.add(getManageBDelLineAction_62fb19());  list.add(getManageBCopyLineAction_5335e4());  list.add(getManageBPasteLineAction_f74766());  list.add(getManageBPasteToTailLineAction_707b0f());  list.add(getActionsBar_ActionsBarSeparator_9f32bb());  list.add(getManageRearrangeRowLineAction_1bbc48b());  list.add(getBodyLineEditAction_64bd09());  list.add(getActionsBar_ActionsBarSeparator_1b6b0a4());  list.add(getDefaultBodyZoomAction_106e3f7());  return list;}

private nc.ui.ct.ap.action.ApAddLineAction getApAddLineAction_1654ee(){
 if(context.get("nc.ui.ct.ap.action.ApAddLineAction#1654ee")!=null)
 return (nc.ui.ct.ap.action.ApAddLineAction)context.get("nc.ui.ct.ap.action.ApAddLineAction#1654ee");
  nc.ui.ct.ap.action.ApAddLineAction bean = new nc.ui.ct.ap.action.ApAddLineAction();
  context.put("nc.ui.ct.ap.action.ApAddLineAction#1654ee",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.ap.action.ApInsertLineAction getApInsertLineAction_21e19c(){
 if(context.get("nc.ui.ct.ap.action.ApInsertLineAction#21e19c")!=null)
 return (nc.ui.ct.ap.action.ApInsertLineAction)context.get("nc.ui.ct.ap.action.ApInsertLineAction#21e19c");
  nc.ui.ct.ap.action.ApInsertLineAction bean = new nc.ui.ct.ap.action.ApInsertLineAction();
  context.put("nc.ui.ct.ap.action.ApInsertLineAction#21e19c",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.manage.ManageBDelLineAction getManageBDelLineAction_62fb19(){
 if(context.get("nc.ui.ct.bodyaction.manage.ManageBDelLineAction#62fb19")!=null)
 return (nc.ui.ct.bodyaction.manage.ManageBDelLineAction)context.get("nc.ui.ct.bodyaction.manage.ManageBDelLineAction#62fb19");
  nc.ui.ct.bodyaction.manage.ManageBDelLineAction bean = new nc.ui.ct.bodyaction.manage.ManageBDelLineAction();
  context.put("nc.ui.ct.bodyaction.manage.ManageBDelLineAction#62fb19",bean);
  bean.setTableCode("pk_ct_ap_b");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.manage.ManageBCopyLineAction getManageBCopyLineAction_5335e4(){
 if(context.get("nc.ui.ct.bodyaction.manage.ManageBCopyLineAction#5335e4")!=null)
 return (nc.ui.ct.bodyaction.manage.ManageBCopyLineAction)context.get("nc.ui.ct.bodyaction.manage.ManageBCopyLineAction#5335e4");
  nc.ui.ct.bodyaction.manage.ManageBCopyLineAction bean = new nc.ui.ct.bodyaction.manage.ManageBCopyLineAction();
  context.put("nc.ui.ct.bodyaction.manage.ManageBCopyLineAction#5335e4",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.manage.ManageBPasteLineAction getManageBPasteLineAction_f74766(){
 if(context.get("nc.ui.ct.bodyaction.manage.ManageBPasteLineAction#f74766")!=null)
 return (nc.ui.ct.bodyaction.manage.ManageBPasteLineAction)context.get("nc.ui.ct.bodyaction.manage.ManageBPasteLineAction#f74766");
  nc.ui.ct.bodyaction.manage.ManageBPasteLineAction bean = new nc.ui.ct.bodyaction.manage.ManageBPasteLineAction();
  context.put("nc.ui.ct.bodyaction.manage.ManageBPasteLineAction#f74766",bean);
  bean.setClearItems(getPasteClearItem_ct_ap_b());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.manage.ManageBPasteToTailLineAction getManageBPasteToTailLineAction_707b0f(){
 if(context.get("nc.ui.ct.bodyaction.manage.ManageBPasteToTailLineAction#707b0f")!=null)
 return (nc.ui.ct.bodyaction.manage.ManageBPasteToTailLineAction)context.get("nc.ui.ct.bodyaction.manage.ManageBPasteToTailLineAction#707b0f");
  nc.ui.ct.bodyaction.manage.ManageBPasteToTailLineAction bean = new nc.ui.ct.bodyaction.manage.ManageBPasteToTailLineAction();
  context.put("nc.ui.ct.bodyaction.manage.ManageBPasteToTailLineAction#707b0f",bean);
  bean.setClearItems(getPasteClearItem_ct_ap_b());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pub.beans.ActionsBar.ActionsBarSeparator getActionsBar_ActionsBarSeparator_9f32bb(){
 if(context.get("nc.ui.pub.beans.ActionsBar.ActionsBarSeparator#9f32bb")!=null)
 return (nc.ui.pub.beans.ActionsBar.ActionsBarSeparator)context.get("nc.ui.pub.beans.ActionsBar.ActionsBarSeparator#9f32bb");
  nc.ui.pub.beans.ActionsBar.ActionsBarSeparator bean = new nc.ui.pub.beans.ActionsBar.ActionsBarSeparator();
  context.put("nc.ui.pub.beans.ActionsBar.ActionsBarSeparator#9f32bb",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction getManageRearrangeRowLineAction_1bbc48b(){
 if(context.get("nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction#1bbc48b")!=null)
 return (nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction)context.get("nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction#1bbc48b");
  nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction bean = new nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction();
  context.put("nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction#1bbc48b",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pubapp.uif2app.actions.BodyLineEditAction getBodyLineEditAction_64bd09(){
 if(context.get("nc.ui.pubapp.uif2app.actions.BodyLineEditAction#64bd09")!=null)
 return (nc.ui.pubapp.uif2app.actions.BodyLineEditAction)context.get("nc.ui.pubapp.uif2app.actions.BodyLineEditAction#64bd09");
  nc.ui.pubapp.uif2app.actions.BodyLineEditAction bean = new nc.ui.pubapp.uif2app.actions.BodyLineEditAction();
  context.put("nc.ui.pubapp.uif2app.actions.BodyLineEditAction#64bd09",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pub.beans.ActionsBar.ActionsBarSeparator getActionsBar_ActionsBarSeparator_1b6b0a4(){
 if(context.get("nc.ui.pub.beans.ActionsBar.ActionsBarSeparator#1b6b0a4")!=null)
 return (nc.ui.pub.beans.ActionsBar.ActionsBarSeparator)context.get("nc.ui.pub.beans.ActionsBar.ActionsBarSeparator#1b6b0a4");
  nc.ui.pub.beans.ActionsBar.ActionsBarSeparator bean = new nc.ui.pub.beans.ActionsBar.ActionsBarSeparator();
  context.put("nc.ui.pub.beans.ActionsBar.ActionsBarSeparator#1b6b0a4",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pubapp.uif2app.actions.DefaultBodyZoomAction getDefaultBodyZoomAction_106e3f7(){
 if(context.get("nc.ui.pubapp.uif2app.actions.DefaultBodyZoomAction#106e3f7")!=null)
 return (nc.ui.pubapp.uif2app.actions.DefaultBodyZoomAction)context.get("nc.ui.pubapp.uif2app.actions.DefaultBodyZoomAction#106e3f7");
  nc.ui.pubapp.uif2app.actions.DefaultBodyZoomAction bean = new nc.ui.pubapp.uif2app.actions.DefaultBodyZoomAction();
  context.put("nc.ui.pubapp.uif2app.actions.DefaultBodyZoomAction#106e3f7",bean);
  bean.setPos(1);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList26(){  List list = new ArrayList();  list.add(getTermBAddLineAction_1608a60());  list.add(getTermBInsertLineAction_11cdfcd());  list.add(getTermBDelLineAction_a93034());  list.add(getTermBCopyLineAction_19bc2fb());  list.add(getTermBPasteLineAction_11e23ee());  list.add(getManageRearrangeRowLineAction_1c8fea1());  return list;}

private nc.ui.ct.bodyaction.term.TermBAddLineAction getTermBAddLineAction_1608a60(){
 if(context.get("nc.ui.ct.bodyaction.term.TermBAddLineAction#1608a60")!=null)
 return (nc.ui.ct.bodyaction.term.TermBAddLineAction)context.get("nc.ui.ct.bodyaction.term.TermBAddLineAction#1608a60");
  nc.ui.ct.bodyaction.term.TermBAddLineAction bean = new nc.ui.ct.bodyaction.term.TermBAddLineAction();
  context.put("nc.ui.ct.bodyaction.term.TermBAddLineAction#1608a60",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.term.TermBInsertLineAction getTermBInsertLineAction_11cdfcd(){
 if(context.get("nc.ui.ct.bodyaction.term.TermBInsertLineAction#11cdfcd")!=null)
 return (nc.ui.ct.bodyaction.term.TermBInsertLineAction)context.get("nc.ui.ct.bodyaction.term.TermBInsertLineAction#11cdfcd");
  nc.ui.ct.bodyaction.term.TermBInsertLineAction bean = new nc.ui.ct.bodyaction.term.TermBInsertLineAction();
  context.put("nc.ui.ct.bodyaction.term.TermBInsertLineAction#11cdfcd",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.term.TermBDelLineAction getTermBDelLineAction_a93034(){
 if(context.get("nc.ui.ct.bodyaction.term.TermBDelLineAction#a93034")!=null)
 return (nc.ui.ct.bodyaction.term.TermBDelLineAction)context.get("nc.ui.ct.bodyaction.term.TermBDelLineAction#a93034");
  nc.ui.ct.bodyaction.term.TermBDelLineAction bean = new nc.ui.ct.bodyaction.term.TermBDelLineAction();
  context.put("nc.ui.ct.bodyaction.term.TermBDelLineAction#a93034",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.term.TermBCopyLineAction getTermBCopyLineAction_19bc2fb(){
 if(context.get("nc.ui.ct.bodyaction.term.TermBCopyLineAction#19bc2fb")!=null)
 return (nc.ui.ct.bodyaction.term.TermBCopyLineAction)context.get("nc.ui.ct.bodyaction.term.TermBCopyLineAction#19bc2fb");
  nc.ui.ct.bodyaction.term.TermBCopyLineAction bean = new nc.ui.ct.bodyaction.term.TermBCopyLineAction();
  context.put("nc.ui.ct.bodyaction.term.TermBCopyLineAction#19bc2fb",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.term.TermBPasteLineAction getTermBPasteLineAction_11e23ee(){
 if(context.get("nc.ui.ct.bodyaction.term.TermBPasteLineAction#11e23ee")!=null)
 return (nc.ui.ct.bodyaction.term.TermBPasteLineAction)context.get("nc.ui.ct.bodyaction.term.TermBPasteLineAction#11e23ee");
  nc.ui.ct.bodyaction.term.TermBPasteLineAction bean = new nc.ui.ct.bodyaction.term.TermBPasteLineAction();
  context.put("nc.ui.ct.bodyaction.term.TermBPasteLineAction#11e23ee",bean);
  bean.setClearItems(getPasteClearItem_ct_ap_term());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction getManageRearrangeRowLineAction_1c8fea1(){
 if(context.get("nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction#1c8fea1")!=null)
 return (nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction)context.get("nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction#1c8fea1");
  nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction bean = new nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction();
  context.put("nc.ui.ct.bodyaction.manage.ManageRearrangeRowLineAction#1c8fea1",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList27(){  List list = new ArrayList();  list.add(getExpBAddLineAction_c52700());  list.add(getExpBInsertLineAction_1838a03());  list.add(getExpBDelLineAction_d9fbf2());  list.add(getExpBCopyLineAction_12be7f9());  list.add(getExpBPasteLineAction_18ab717());  return list;}

private nc.ui.ct.bodyaction.exp.ExpBAddLineAction getExpBAddLineAction_c52700(){
 if(context.get("nc.ui.ct.bodyaction.exp.ExpBAddLineAction#c52700")!=null)
 return (nc.ui.ct.bodyaction.exp.ExpBAddLineAction)context.get("nc.ui.ct.bodyaction.exp.ExpBAddLineAction#c52700");
  nc.ui.ct.bodyaction.exp.ExpBAddLineAction bean = new nc.ui.ct.bodyaction.exp.ExpBAddLineAction();
  context.put("nc.ui.ct.bodyaction.exp.ExpBAddLineAction#c52700",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.exp.ExpBInsertLineAction getExpBInsertLineAction_1838a03(){
 if(context.get("nc.ui.ct.bodyaction.exp.ExpBInsertLineAction#1838a03")!=null)
 return (nc.ui.ct.bodyaction.exp.ExpBInsertLineAction)context.get("nc.ui.ct.bodyaction.exp.ExpBInsertLineAction#1838a03");
  nc.ui.ct.bodyaction.exp.ExpBInsertLineAction bean = new nc.ui.ct.bodyaction.exp.ExpBInsertLineAction();
  context.put("nc.ui.ct.bodyaction.exp.ExpBInsertLineAction#1838a03",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.exp.ExpBDelLineAction getExpBDelLineAction_d9fbf2(){
 if(context.get("nc.ui.ct.bodyaction.exp.ExpBDelLineAction#d9fbf2")!=null)
 return (nc.ui.ct.bodyaction.exp.ExpBDelLineAction)context.get("nc.ui.ct.bodyaction.exp.ExpBDelLineAction#d9fbf2");
  nc.ui.ct.bodyaction.exp.ExpBDelLineAction bean = new nc.ui.ct.bodyaction.exp.ExpBDelLineAction();
  context.put("nc.ui.ct.bodyaction.exp.ExpBDelLineAction#d9fbf2",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.exp.ExpBCopyLineAction getExpBCopyLineAction_12be7f9(){
 if(context.get("nc.ui.ct.bodyaction.exp.ExpBCopyLineAction#12be7f9")!=null)
 return (nc.ui.ct.bodyaction.exp.ExpBCopyLineAction)context.get("nc.ui.ct.bodyaction.exp.ExpBCopyLineAction#12be7f9");
  nc.ui.ct.bodyaction.exp.ExpBCopyLineAction bean = new nc.ui.ct.bodyaction.exp.ExpBCopyLineAction();
  context.put("nc.ui.ct.bodyaction.exp.ExpBCopyLineAction#12be7f9",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.exp.ExpBPasteLineAction getExpBPasteLineAction_18ab717(){
 if(context.get("nc.ui.ct.bodyaction.exp.ExpBPasteLineAction#18ab717")!=null)
 return (nc.ui.ct.bodyaction.exp.ExpBPasteLineAction)context.get("nc.ui.ct.bodyaction.exp.ExpBPasteLineAction#18ab717");
  nc.ui.ct.bodyaction.exp.ExpBPasteLineAction bean = new nc.ui.ct.bodyaction.exp.ExpBPasteLineAction();
  context.put("nc.ui.ct.bodyaction.exp.ExpBPasteLineAction#18ab717",bean);
  bean.setClearItems(getPasteClearItem_ct_ap_exp());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList28(){  List list = new ArrayList();  list.add(getMemoraBAddLineAction_1fa7c1c());  list.add(getMemoraBInsertLineAction_1ea3521());  list.add(getMemoraBDelLineAction_14643f4());  list.add(getMemoraBCopyLineAction_176cba());  list.add(getMemoraBPasteLineAction_1e3537e());  return list;}

private nc.ui.ct.bodyaction.memora.MemoraBAddLineAction getMemoraBAddLineAction_1fa7c1c(){
 if(context.get("nc.ui.ct.bodyaction.memora.MemoraBAddLineAction#1fa7c1c")!=null)
 return (nc.ui.ct.bodyaction.memora.MemoraBAddLineAction)context.get("nc.ui.ct.bodyaction.memora.MemoraBAddLineAction#1fa7c1c");
  nc.ui.ct.bodyaction.memora.MemoraBAddLineAction bean = new nc.ui.ct.bodyaction.memora.MemoraBAddLineAction();
  context.put("nc.ui.ct.bodyaction.memora.MemoraBAddLineAction#1fa7c1c",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.memora.MemoraBInsertLineAction getMemoraBInsertLineAction_1ea3521(){
 if(context.get("nc.ui.ct.bodyaction.memora.MemoraBInsertLineAction#1ea3521")!=null)
 return (nc.ui.ct.bodyaction.memora.MemoraBInsertLineAction)context.get("nc.ui.ct.bodyaction.memora.MemoraBInsertLineAction#1ea3521");
  nc.ui.ct.bodyaction.memora.MemoraBInsertLineAction bean = new nc.ui.ct.bodyaction.memora.MemoraBInsertLineAction();
  context.put("nc.ui.ct.bodyaction.memora.MemoraBInsertLineAction#1ea3521",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.memora.MemoraBDelLineAction getMemoraBDelLineAction_14643f4(){
 if(context.get("nc.ui.ct.bodyaction.memora.MemoraBDelLineAction#14643f4")!=null)
 return (nc.ui.ct.bodyaction.memora.MemoraBDelLineAction)context.get("nc.ui.ct.bodyaction.memora.MemoraBDelLineAction#14643f4");
  nc.ui.ct.bodyaction.memora.MemoraBDelLineAction bean = new nc.ui.ct.bodyaction.memora.MemoraBDelLineAction();
  context.put("nc.ui.ct.bodyaction.memora.MemoraBDelLineAction#14643f4",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.memora.MemoraBCopyLineAction getMemoraBCopyLineAction_176cba(){
 if(context.get("nc.ui.ct.bodyaction.memora.MemoraBCopyLineAction#176cba")!=null)
 return (nc.ui.ct.bodyaction.memora.MemoraBCopyLineAction)context.get("nc.ui.ct.bodyaction.memora.MemoraBCopyLineAction#176cba");
  nc.ui.ct.bodyaction.memora.MemoraBCopyLineAction bean = new nc.ui.ct.bodyaction.memora.MemoraBCopyLineAction();
  context.put("nc.ui.ct.bodyaction.memora.MemoraBCopyLineAction#176cba",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.ct.bodyaction.memora.MemoraBPasteLineAction getMemoraBPasteLineAction_1e3537e(){
 if(context.get("nc.ui.ct.bodyaction.memora.MemoraBPasteLineAction#1e3537e")!=null)
 return (nc.ui.ct.bodyaction.memora.MemoraBPasteLineAction)context.get("nc.ui.ct.bodyaction.memora.MemoraBPasteLineAction#1e3537e");
  nc.ui.ct.bodyaction.memora.MemoraBPasteLineAction bean = new nc.ui.ct.bodyaction.memora.MemoraBPasteLineAction();
  context.put("nc.ui.ct.bodyaction.memora.MemoraBPasteLineAction#1e3537e",bean);
  bean.setClearItems(getPasteClearItem_ct_ap_memora());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.view.MouseClickShowPanelMediator getMouseClickShowPanelMediator(){
 if(context.get("mouseClickShowPanelMediator")!=null)
 return (nc.ui.pubapp.uif2app.view.MouseClickShowPanelMediator)context.get("mouseClickShowPanelMediator");
  nc.ui.pubapp.uif2app.view.MouseClickShowPanelMediator bean = new nc.ui.pubapp.uif2app.view.MouseClickShowPanelMediator();
  context.put("mouseClickShowPanelMediator",bean);
  bean.setListView(getListView());
  bean.setShowUpComponent(getBillFormEditor());
  bean.setHyperLinkColumn("vbillcode");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.view.CardPanelOrgSetterForAllRefMediator getCardPanelOrgSetterForAllRefMediator(){
 if(context.get("cardPanelOrgSetterForAllRefMediator")!=null)
 return (nc.ui.pubapp.uif2app.view.CardPanelOrgSetterForAllRefMediator)context.get("cardPanelOrgSetterForAllRefMediator");
  nc.ui.pubapp.uif2app.view.CardPanelOrgSetterForAllRefMediator bean = new nc.ui.pubapp.uif2app.view.CardPanelOrgSetterForAllRefMediator(getBillFormEditor());  context.put("cardPanelOrgSetterForAllRefMediator",bean);
  bean.setModel(getManageAppModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.bill.BillCodeMediator getBillCodeMediator(){
 if(context.get("billCodeMediator")!=null)
 return (nc.ui.pubapp.bill.BillCodeMediator)context.get("billCodeMediator");
  nc.ui.pubapp.bill.BillCodeMediator bean = new nc.ui.pubapp.bill.BillCodeMediator();
  context.put("billCodeMediator",bean);
  bean.setBillForm(getBillFormEditor());
  bean.setBillCodeKey("vbillcode");
  bean.setBillType("Z4");
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.uif2.TangramContainer getContainer(){
 if(context.get("container")!=null)
 return (nc.ui.uif2.TangramContainer)context.get("container");
  nc.ui.uif2.TangramContainer bean = new nc.ui.uif2.TangramContainer();
  context.put("container",bean);
  bean.setTangramLayoutRoot(getTBNode_5eb3ef());
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.tangramlayout.node.TBNode getTBNode_5eb3ef(){
 if(context.get("nc.ui.uif2.tangramlayout.node.TBNode#5eb3ef")!=null)
 return (nc.ui.uif2.tangramlayout.node.TBNode)context.get("nc.ui.uif2.tangramlayout.node.TBNode#5eb3ef");
  nc.ui.uif2.tangramlayout.node.TBNode bean = new nc.ui.uif2.tangramlayout.node.TBNode();
  context.put("nc.ui.uif2.tangramlayout.node.TBNode#5eb3ef",bean);
  bean.setShowMode("CardLayout");
  bean.setTabs(getManagedList29());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList29(){  List list = new ArrayList();  list.add(getVSNode_160e9b());  list.add(getVSNode_20e7fd());  list.add(getListviewhistornode());  return list;}

private nc.ui.uif2.tangramlayout.node.VSNode getVSNode_160e9b(){
 if(context.get("nc.ui.uif2.tangramlayout.node.VSNode#160e9b")!=null)
 return (nc.ui.uif2.tangramlayout.node.VSNode)context.get("nc.ui.uif2.tangramlayout.node.VSNode#160e9b");
  nc.ui.uif2.tangramlayout.node.VSNode bean = new nc.ui.uif2.tangramlayout.node.VSNode();
  context.put("nc.ui.uif2.tangramlayout.node.VSNode#160e9b",bean);
  bean.setUp(getCNode_17e837f());
  bean.setDown(getCNode_1eef116());
  bean.setDividerLocation(25f);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.tangramlayout.node.CNode getCNode_17e837f(){
 if(context.get("nc.ui.uif2.tangramlayout.node.CNode#17e837f")!=null)
 return (nc.ui.uif2.tangramlayout.node.CNode)context.get("nc.ui.uif2.tangramlayout.node.CNode#17e837f");
  nc.ui.uif2.tangramlayout.node.CNode bean = new nc.ui.uif2.tangramlayout.node.CNode();
  context.put("nc.ui.uif2.tangramlayout.node.CNode#17e837f",bean);
  bean.setComponent(getQueryInfo());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.tangramlayout.node.CNode getCNode_1eef116(){
 if(context.get("nc.ui.uif2.tangramlayout.node.CNode#1eef116")!=null)
 return (nc.ui.uif2.tangramlayout.node.CNode)context.get("nc.ui.uif2.tangramlayout.node.CNode#1eef116");
  nc.ui.uif2.tangramlayout.node.CNode bean = new nc.ui.uif2.tangramlayout.node.CNode();
  context.put("nc.ui.uif2.tangramlayout.node.CNode#1eef116",bean);
  bean.setName(getI18nFB_eb3cf4());
  bean.setComponent(getListView());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private java.lang.String getI18nFB_eb3cf4(){
 if(context.get("nc.ui.uif2.I18nFB#eb3cf4")!=null)
 return (java.lang.String)context.get("nc.ui.uif2.I18nFB#eb3cf4");
  nc.ui.uif2.I18nFB bean = new nc.ui.uif2.I18nFB();
    context.put("&nc.ui.uif2.I18nFB#eb3cf4",bean);  bean.setResDir("common");
  bean.setResId("UC001-0000107");
  bean.setDefaultValue("列表");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
 try {
     Object product = bean.getObject();
    context.put("nc.ui.uif2.I18nFB#eb3cf4",product);
     return (java.lang.String)product;
}
catch(Exception e) { throw new RuntimeException(e);}}

private nc.ui.uif2.tangramlayout.node.VSNode getVSNode_20e7fd(){
 if(context.get("nc.ui.uif2.tangramlayout.node.VSNode#20e7fd")!=null)
 return (nc.ui.uif2.tangramlayout.node.VSNode)context.get("nc.ui.uif2.tangramlayout.node.VSNode#20e7fd");
  nc.ui.uif2.tangramlayout.node.VSNode bean = new nc.ui.uif2.tangramlayout.node.VSNode();
  context.put("nc.ui.uif2.tangramlayout.node.VSNode#20e7fd",bean);
  bean.setUp(getCNode_191158());
  bean.setDown(getCNode_e4343a());
  bean.setDividerLocation(25f);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.tangramlayout.node.CNode getCNode_191158(){
 if(context.get("nc.ui.uif2.tangramlayout.node.CNode#191158")!=null)
 return (nc.ui.uif2.tangramlayout.node.CNode)context.get("nc.ui.uif2.tangramlayout.node.CNode#191158");
  nc.ui.uif2.tangramlayout.node.CNode bean = new nc.ui.uif2.tangramlayout.node.CNode();
  context.put("nc.ui.uif2.tangramlayout.node.CNode#191158",bean);
  bean.setComponent(getCardInfoPnl());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.tangramlayout.node.CNode getCNode_e4343a(){
 if(context.get("nc.ui.uif2.tangramlayout.node.CNode#e4343a")!=null)
 return (nc.ui.uif2.tangramlayout.node.CNode)context.get("nc.ui.uif2.tangramlayout.node.CNode#e4343a");
  nc.ui.uif2.tangramlayout.node.CNode bean = new nc.ui.uif2.tangramlayout.node.CNode();
  context.put("nc.ui.uif2.tangramlayout.node.CNode#e4343a",bean);
  bean.setName(getI18nFB_1c1bf06());
  bean.setComponent(getBillFormEditor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private java.lang.String getI18nFB_1c1bf06(){
 if(context.get("nc.ui.uif2.I18nFB#1c1bf06")!=null)
 return (java.lang.String)context.get("nc.ui.uif2.I18nFB#1c1bf06");
  nc.ui.uif2.I18nFB bean = new nc.ui.uif2.I18nFB();
    context.put("&nc.ui.uif2.I18nFB#1c1bf06",bean);  bean.setResDir("common");
  bean.setResId("UC001-0000106");
  bean.setDefaultValue("卡片");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
 try {
     Object product = bean.getObject();
    context.put("nc.ui.uif2.I18nFB#1c1bf06",product);
     return (java.lang.String)product;
}
catch(Exception e) { throw new RuntimeException(e);}}

public nc.ui.pubapp.uif2app.tangramlayout.UECardLayoutToolbarPanel getCardInfoPnl(){
 if(context.get("cardInfoPnl")!=null)
 return (nc.ui.pubapp.uif2app.tangramlayout.UECardLayoutToolbarPanel)context.get("cardInfoPnl");
  nc.ui.pubapp.uif2app.tangramlayout.UECardLayoutToolbarPanel bean = new nc.ui.pubapp.uif2app.tangramlayout.UECardLayoutToolbarPanel();
  context.put("cardInfoPnl",bean);
  bean.setTitleAction(getReturnaction());
  bean.setRightExActions(getManagedList30());
  bean.setModel(getManageAppModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pubapp.uif2app.actions.UEReturnAction getReturnaction(){
 if(context.get("returnaction")!=null)
 return (nc.ui.pubapp.uif2app.actions.UEReturnAction)context.get("returnaction");
  nc.ui.pubapp.uif2app.actions.UEReturnAction bean = new nc.ui.pubapp.uif2app.actions.UEReturnAction();
  context.put("returnaction",bean);
  bean.setGoComponent(getListView());
  bean.setSaveAction(getSaveAction());
  bean.setModel(getManageAppModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList30(){  List list = new ArrayList();  list.add(getActionsBar_ActionsBarSeparator_17728b8());  list.add(getHeadZoomAction());  return list;}

private nc.ui.pub.beans.ActionsBar.ActionsBarSeparator getActionsBar_ActionsBarSeparator_17728b8(){
 if(context.get("nc.ui.pub.beans.ActionsBar.ActionsBarSeparator#17728b8")!=null)
 return (nc.ui.pub.beans.ActionsBar.ActionsBarSeparator)context.get("nc.ui.pub.beans.ActionsBar.ActionsBarSeparator#17728b8");
  nc.ui.pub.beans.ActionsBar.ActionsBarSeparator bean = new nc.ui.pub.beans.ActionsBar.ActionsBarSeparator();
  context.put("nc.ui.pub.beans.ActionsBar.ActionsBarSeparator#17728b8",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pubapp.uif2app.actions.DefaultHeadZoomAction getHeadZoomAction(){
 if(context.get("headZoomAction")!=null)
 return (nc.ui.pubapp.uif2app.actions.DefaultHeadZoomAction)context.get("headZoomAction");
  nc.ui.pubapp.uif2app.actions.DefaultHeadZoomAction bean = new nc.ui.pubapp.uif2app.actions.DefaultHeadZoomAction();
  context.put("headZoomAction",bean);
  bean.setBillForm(getBillFormEditor());
  bean.setModel(getManageAppModel());
  bean.setPos(0);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.uif2.tangramlayout.CardLayoutToolbarPanel getQueryInfo(){
 if(context.get("queryInfo")!=null)
 return (nc.ui.uif2.tangramlayout.CardLayoutToolbarPanel)context.get("queryInfo");
  nc.ui.uif2.tangramlayout.CardLayoutToolbarPanel bean = new nc.ui.uif2.tangramlayout.CardLayoutToolbarPanel();
  context.put("queryInfo",bean);
  bean.setModel(getManageAppModel());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.uif2.tangramlayout.node.CNode getListviewhistornode(){
 if(context.get("listviewhistornode")!=null)
 return (nc.ui.uif2.tangramlayout.node.CNode)context.get("listviewhistornode");
  nc.ui.uif2.tangramlayout.node.CNode bean = new nc.ui.uif2.tangramlayout.node.CNode();
  context.put("listviewhistornode",bean);
  bean.setComponent(getListViewHistory());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.uif2.tangramlayout.node.TBNode getMaintainnode(){
 if(context.get("maintainnode")!=null)
 return (nc.ui.uif2.tangramlayout.node.TBNode)context.get("maintainnode");
  nc.ui.uif2.tangramlayout.node.TBNode bean = new nc.ui.uif2.tangramlayout.node.TBNode();
  context.put("maintainnode",bean);
  bean.setTabs(getManagedList31());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList31(){  List list = new ArrayList();  list.add(getListviewnode());  list.add(getCardviewnode());  return list;}

public nc.ui.uif2.tangramlayout.node.CNode getListviewnode(){
 if(context.get("listviewnode")!=null)
 return (nc.ui.uif2.tangramlayout.node.CNode)context.get("listviewnode");
  nc.ui.uif2.tangramlayout.node.CNode bean = new nc.ui.uif2.tangramlayout.node.CNode();
  context.put("listviewnode",bean);
  bean.setName(getI18nFB_125517());
  bean.setComponent(getListView());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private java.lang.String getI18nFB_125517(){
 if(context.get("nc.ui.uif2.I18nFB#125517")!=null)
 return (java.lang.String)context.get("nc.ui.uif2.I18nFB#125517");
  nc.ui.uif2.I18nFB bean = new nc.ui.uif2.I18nFB();
    context.put("&nc.ui.uif2.I18nFB#125517",bean);  bean.setResDir("common");
  bean.setResId("UC001-0000107");
  bean.setDefaultValue("列表");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
 try {
     Object product = bean.getObject();
    context.put("nc.ui.uif2.I18nFB#125517",product);
     return (java.lang.String)product;
}
catch(Exception e) { throw new RuntimeException(e);}}

public nc.ui.uif2.tangramlayout.node.CNode getCardviewnode(){
 if(context.get("cardviewnode")!=null)
 return (nc.ui.uif2.tangramlayout.node.CNode)context.get("cardviewnode");
  nc.ui.uif2.tangramlayout.node.CNode bean = new nc.ui.uif2.tangramlayout.node.CNode();
  context.put("cardviewnode",bean);
  bean.setName(getI18nFB_1908941());
  bean.setComponent(getBillFormEditor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private java.lang.String getI18nFB_1908941(){
 if(context.get("nc.ui.uif2.I18nFB#1908941")!=null)
 return (java.lang.String)context.get("nc.ui.uif2.I18nFB#1908941");
  nc.ui.uif2.I18nFB bean = new nc.ui.uif2.I18nFB();
    context.put("&nc.ui.uif2.I18nFB#1908941",bean);  bean.setResDir("common");
  bean.setResId("UC001-0000106");
  bean.setDefaultValue("卡片");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
 try {
     Object product = bean.getObject();
    context.put("nc.ui.uif2.I18nFB#1908941",product);
     return (java.lang.String)product;
}
catch(Exception e) { throw new RuntimeException(e);}}

public nc.ui.uif2.editor.QueryTemplateContainer getQueryTemplateContainer(){
 if(context.get("queryTemplateContainer")!=null)
 return (nc.ui.uif2.editor.QueryTemplateContainer)context.get("queryTemplateContainer");
  nc.ui.uif2.editor.QueryTemplateContainer bean = new nc.ui.uif2.editor.QueryTemplateContainer();
  context.put("queryTemplateContainer",bean);
  bean.setContext(getContext());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.uif2.editor.UIF2RemoteCallCombinatorCaller getRemoteCallCombinatorCaller(){
 if(context.get("remoteCallCombinatorCaller")!=null)
 return (nc.ui.uif2.editor.UIF2RemoteCallCombinatorCaller)context.get("remoteCallCombinatorCaller");
  nc.ui.uif2.editor.UIF2RemoteCallCombinatorCaller bean = new nc.ui.uif2.editor.UIF2RemoteCallCombinatorCaller();
  context.put("remoteCallCombinatorCaller",bean);
  bean.setRemoteCallers(getManagedList32());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList32(){  List list = new ArrayList();  list.add(getQueryTemplateContainer());  list.add(getTemplateContainer());  list.add(getUserdefitemContainer());  list.add(getPfAddInfoLoader());  return list;}

public nc.ui.uif2.userdefitem.UserDefItemContainer getUserdefitemContainer(){
 if(context.get("userdefitemContainer")!=null)
 return (nc.ui.uif2.userdefitem.UserDefItemContainer)context.get("userdefitemContainer");
  nc.ui.uif2.userdefitem.UserDefItemContainer bean = new nc.ui.uif2.userdefitem.UserDefItemContainer();
  context.put("userdefitemContainer",bean);
  bean.setContext(getContext());
  bean.setParams(getManagedList33());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList33(){  List list = new ArrayList();  list.add(getQueryParam_230d41());  list.add(getQueryParam_13b518e());  list.add(getQueryParam_1676731());  return list;}

private nc.ui.uif2.userdefitem.QueryParam getQueryParam_230d41(){
 if(context.get("nc.ui.uif2.userdefitem.QueryParam#230d41")!=null)
 return (nc.ui.uif2.userdefitem.QueryParam)context.get("nc.ui.uif2.userdefitem.QueryParam#230d41");
  nc.ui.uif2.userdefitem.QueryParam bean = new nc.ui.uif2.userdefitem.QueryParam();
  context.put("nc.ui.uif2.userdefitem.QueryParam#230d41",bean);
  bean.setMdfullname("ct.ct_ap");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.userdefitem.QueryParam getQueryParam_13b518e(){
 if(context.get("nc.ui.uif2.userdefitem.QueryParam#13b518e")!=null)
 return (nc.ui.uif2.userdefitem.QueryParam)context.get("nc.ui.uif2.userdefitem.QueryParam#13b518e");
  nc.ui.uif2.userdefitem.QueryParam bean = new nc.ui.uif2.userdefitem.QueryParam();
  context.put("nc.ui.uif2.userdefitem.QueryParam#13b518e",bean);
  bean.setMdfullname("ct.ct_ap_b");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.userdefitem.QueryParam getQueryParam_1676731(){
 if(context.get("nc.ui.uif2.userdefitem.QueryParam#1676731")!=null)
 return (nc.ui.uif2.userdefitem.QueryParam)context.get("nc.ui.uif2.userdefitem.QueryParam#1676731");
  nc.ui.uif2.userdefitem.QueryParam bean = new nc.ui.uif2.userdefitem.QueryParam();
  context.put("nc.ui.uif2.userdefitem.QueryParam#1676731",bean);
  bean.setRulecode("materialassistant");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.view.RowNoMediator getRowNoMediator(){
 if(context.get("rowNoMediator")!=null)
 return (nc.ui.pubapp.uif2app.view.RowNoMediator)context.get("rowNoMediator");
  nc.ui.pubapp.uif2app.view.RowNoMediator bean = new nc.ui.pubapp.uif2app.view.RowNoMediator();
  context.put("rowNoMediator",bean);
  bean.setModel(getManageAppModel());
  bean.setEditor(getBillFormEditor());
  bean.setRowNoKey("crowno");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.common.validateservice.ClosingCheck getClosingListener(){
 if(context.get("ClosingListener")!=null)
 return (nc.ui.pubapp.common.validateservice.ClosingCheck)context.get("ClosingListener");
  nc.ui.pubapp.common.validateservice.ClosingCheck bean = new nc.ui.pubapp.common.validateservice.ClosingCheck();
  context.put("ClosingListener",bean);
  bean.setModel(getManageAppModel());
  bean.setSaveAction(getSaveAction());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.ct.view.ChildrenFilter getBlankitemfilter(){
 if(context.get("blankitemfilter")!=null)
 return (nc.ui.ct.view.ChildrenFilter)context.get("blankitemfilter");
  nc.ui.ct.view.ChildrenFilter bean = new nc.ui.ct.view.ChildrenFilter();
  context.put("blankitemfilter",bean);
  bean.setFilterMap(getManagedMap3());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private Map getManagedMap3(){  Map map = new HashMap();  map.put("pk_ct_ap_b",getManagedList34());  map.put("pk_ct_ap_term",getManagedList35());  map.put("pk_ct_ap_exp",getManagedList36());  map.put("pk_ct_ap_memora",getManagedList37());  map.put("pk_ct_ap_change",getManagedList38());  return map;}

private List getManagedList34(){  List list = new ArrayList();  list.add("pk_material");  list.add("pk_marbasclass");  list.add("cunitid");  list.add("nnum");  list.add("nqtorigprice");  list.add("nqtorigtaxprice");  list.add("norigtaxmny");  return list;}

private List getManagedList35(){  List list = new ArrayList();  list.add("vtermcode");  list.add("vtermcontent");  list.add("votherinfo");  list.add("vmemo");  return list;}

private List getManagedList36(){  List list = new ArrayList();  list.add("vexpcode");  list.add("vexpsum");  list.add("vmemo");  return list;}

private List getManagedList37(){  List list = new ArrayList();  list.add("vmemoracode");  list.add("vmemo");  return list;}

private List getManagedList38(){  List list = new ArrayList();  list.add("vchangecode");  return list;}

public nc.ui.pubapp.uif2app.view.FractionFixMediator getFractionFixMediator(){
 if(context.get("fractionFixMediator")!=null)
 return (nc.ui.pubapp.uif2app.view.FractionFixMediator)context.get("fractionFixMediator");
  nc.ui.pubapp.uif2app.view.FractionFixMediator bean = new nc.ui.pubapp.uif2app.view.FractionFixMediator(getManagedList39(),getManagedList40());  context.put("fractionFixMediator",bean);
  bean.initUI();
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList39(){  List list = new ArrayList();  list.add(getBillFormEditor());  return list;}

private List getManagedList40(){  List list = new ArrayList();  list.add(getListView());  return list;}

public nc.ui.pubapp.billref.dest.TransferViewProcessor getTransferViewProcessor(){
 if(context.get("transferViewProcessor")!=null)
 return (nc.ui.pubapp.billref.dest.TransferViewProcessor)context.get("transferViewProcessor");
  nc.ui.pubapp.billref.dest.TransferViewProcessor bean = new nc.ui.pubapp.billref.dest.TransferViewProcessor();
  context.put("transferViewProcessor",bean);
  bean.setList(getListView());
  bean.setActionContainer(getActionsOfList());
  bean.setCardActionContainer(getActionsOfCard());
  bean.setSaveAction(getSaveAction());
  bean.setCommitAction(getCommitAction());
  bean.setCancelAction(getCancelAction());
  bean.setBillForm(getBillFormEditor());
  bean.setTransferLogic(getDefaultBillDataLogic_1a7edc4());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.pubapp.billref.dest.DefaultBillDataLogic getDefaultBillDataLogic_1a7edc4(){
 if(context.get("nc.ui.pubapp.billref.dest.DefaultBillDataLogic#1a7edc4")!=null)
 return (nc.ui.pubapp.billref.dest.DefaultBillDataLogic)context.get("nc.ui.pubapp.billref.dest.DefaultBillDataLogic#1a7edc4");
  nc.ui.pubapp.billref.dest.DefaultBillDataLogic bean = new nc.ui.pubapp.billref.dest.DefaultBillDataLogic();
  context.put("nc.ui.pubapp.billref.dest.DefaultBillDataLogic#1a7edc4",bean);
  bean.setBillForm(getBillFormEditor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.view.CompositeBillDataPrepare getUserdefAndMarAsstCardPreparator(){
 if(context.get("userdefAndMarAsstCardPreparator")!=null)
 return (nc.ui.pubapp.uif2app.view.CompositeBillDataPrepare)context.get("userdefAndMarAsstCardPreparator");
  nc.ui.pubapp.uif2app.view.CompositeBillDataPrepare bean = new nc.ui.pubapp.uif2app.view.CompositeBillDataPrepare();
  context.put("userdefAndMarAsstCardPreparator",bean);
  bean.setBillDataPrepares(getManagedList41());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList41(){  List list = new ArrayList();  list.add(getUserdefitemPreparator());  list.add(getMarAsstPreparator());  return list;}

public nc.ui.pubapp.uif2app.view.CompositeBillListDataPrepare getUserdefAndMarAsstListPreparator(){
 if(context.get("userdefAndMarAsstListPreparator")!=null)
 return (nc.ui.pubapp.uif2app.view.CompositeBillListDataPrepare)context.get("userdefAndMarAsstListPreparator");
  nc.ui.pubapp.uif2app.view.CompositeBillListDataPrepare bean = new nc.ui.pubapp.uif2app.view.CompositeBillListDataPrepare();
  context.put("userdefAndMarAsstListPreparator",bean);
  bean.setBillListDataPrepares(getManagedList42());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList42(){  List list = new ArrayList();  list.add(getUserdefitemlistPreparator());  list.add(getMarAsstPreparator());  return list;}

public nc.ui.uif2.editor.UserdefitemContainerPreparator getUserdefitemPreparator(){
 if(context.get("userdefitemPreparator")!=null)
 return (nc.ui.uif2.editor.UserdefitemContainerPreparator)context.get("userdefitemPreparator");
  nc.ui.uif2.editor.UserdefitemContainerPreparator bean = new nc.ui.uif2.editor.UserdefitemContainerPreparator();
  context.put("userdefitemPreparator",bean);
  bean.setContainer(getUserdefitemContainer());
  bean.setParams(getManagedList43());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList43(){  List list = new ArrayList();  list.add(getUserdefQueryParam_1eb1c3b());  list.add(getUserdefQueryParam_8a7f17());  return list;}

private nc.ui.uif2.editor.UserdefQueryParam getUserdefQueryParam_1eb1c3b(){
 if(context.get("nc.ui.uif2.editor.UserdefQueryParam#1eb1c3b")!=null)
 return (nc.ui.uif2.editor.UserdefQueryParam)context.get("nc.ui.uif2.editor.UserdefQueryParam#1eb1c3b");
  nc.ui.uif2.editor.UserdefQueryParam bean = new nc.ui.uif2.editor.UserdefQueryParam();
  context.put("nc.ui.uif2.editor.UserdefQueryParam#1eb1c3b",bean);
  bean.setMdfullname("ct.ct_ap");
  bean.setPos(0);
  bean.setPrefix("vdef");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.editor.UserdefQueryParam getUserdefQueryParam_8a7f17(){
 if(context.get("nc.ui.uif2.editor.UserdefQueryParam#8a7f17")!=null)
 return (nc.ui.uif2.editor.UserdefQueryParam)context.get("nc.ui.uif2.editor.UserdefQueryParam#8a7f17");
  nc.ui.uif2.editor.UserdefQueryParam bean = new nc.ui.uif2.editor.UserdefQueryParam();
  context.put("nc.ui.uif2.editor.UserdefQueryParam#8a7f17",bean);
  bean.setMdfullname("ct.ct_ap_b");
  bean.setPos(1);
  bean.setPrefix("vbdef");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.uif2.editor.UserdefitemContainerListPreparator getUserdefitemlistPreparator(){
 if(context.get("userdefitemlistPreparator")!=null)
 return (nc.ui.uif2.editor.UserdefitemContainerListPreparator)context.get("userdefitemlistPreparator");
  nc.ui.uif2.editor.UserdefitemContainerListPreparator bean = new nc.ui.uif2.editor.UserdefitemContainerListPreparator();
  context.put("userdefitemlistPreparator",bean);
  bean.setContainer(getUserdefitemContainer());
  bean.setParams(getManagedList44());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList44(){  List list = new ArrayList();  list.add(getUserdefQueryParam_9de122());  list.add(getUserdefQueryParam_12788ba());  return list;}

private nc.ui.uif2.editor.UserdefQueryParam getUserdefQueryParam_9de122(){
 if(context.get("nc.ui.uif2.editor.UserdefQueryParam#9de122")!=null)
 return (nc.ui.uif2.editor.UserdefQueryParam)context.get("nc.ui.uif2.editor.UserdefQueryParam#9de122");
  nc.ui.uif2.editor.UserdefQueryParam bean = new nc.ui.uif2.editor.UserdefQueryParam();
  context.put("nc.ui.uif2.editor.UserdefQueryParam#9de122",bean);
  bean.setMdfullname("ct.ct_ap");
  bean.setPos(0);
  bean.setPrefix("vdef");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private nc.ui.uif2.editor.UserdefQueryParam getUserdefQueryParam_12788ba(){
 if(context.get("nc.ui.uif2.editor.UserdefQueryParam#12788ba")!=null)
 return (nc.ui.uif2.editor.UserdefQueryParam)context.get("nc.ui.uif2.editor.UserdefQueryParam#12788ba");
  nc.ui.uif2.editor.UserdefQueryParam bean = new nc.ui.uif2.editor.UserdefQueryParam();
  context.put("nc.ui.uif2.editor.UserdefQueryParam#12788ba",bean);
  bean.setMdfullname("ct.ct_ap_b");
  bean.setPos(1);
  bean.setTabcode("pk_ct_ap_b");
  bean.setPrefix("vbdef");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.view.material.assistant.MarAsstPreparator getMarAsstPreparator(){
 if(context.get("marAsstPreparator")!=null)
 return (nc.ui.pubapp.uif2app.view.material.assistant.MarAsstPreparator)context.get("marAsstPreparator");
  nc.ui.pubapp.uif2app.view.material.assistant.MarAsstPreparator bean = new nc.ui.pubapp.uif2app.view.material.assistant.MarAsstPreparator();
  context.put("marAsstPreparator",bean);
  bean.setModel(getManageAppModel());
  bean.setContainer(getUserdefitemContainer());
  bean.setPrefix("vfree");
  bean.setMaterialField("pk_material");
  bean.setProductorField("cproductorid");
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.lazilyload.DefaultBillLazilyLoader getBillLazilyLoader(){
 if(context.get("billLazilyLoader")!=null)
 return (nc.ui.pubapp.uif2app.lazilyload.DefaultBillLazilyLoader)context.get("billLazilyLoader");
  nc.ui.pubapp.uif2app.lazilyload.DefaultBillLazilyLoader bean = new nc.ui.pubapp.uif2app.lazilyload.DefaultBillLazilyLoader();
  context.put("billLazilyLoader",bean);
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.lazilyload.CardPanelLazilyLoad getCardLazySupport(){
 if(context.get("cardLazySupport")!=null)
 return (nc.ui.pubapp.uif2app.lazilyload.CardPanelLazilyLoad)context.get("cardLazySupport");
  nc.ui.pubapp.uif2app.lazilyload.CardPanelLazilyLoad bean = new nc.ui.pubapp.uif2app.lazilyload.CardPanelLazilyLoad();
  context.put("cardLazySupport",bean);
  bean.setBillform(getBillFormEditor());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.lazilyload.ListPanelLazilyLoad getListLazySupport(){
 if(context.get("listLazySupport")!=null)
 return (nc.ui.pubapp.uif2app.lazilyload.ListPanelLazilyLoad)context.get("listLazySupport");
  nc.ui.pubapp.uif2app.lazilyload.ListPanelLazilyLoad bean = new nc.ui.pubapp.uif2app.lazilyload.ListPanelLazilyLoad();
  context.put("listLazySupport",bean);
  bean.setListView(getListView());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

public nc.ui.pubapp.uif2app.lazilyload.LazilyLoadManager getLasilyLodadMediator(){
 if(context.get("lasilyLodadMediator")!=null)
 return (nc.ui.pubapp.uif2app.lazilyload.LazilyLoadManager)context.get("lasilyLodadMediator");
  nc.ui.pubapp.uif2app.lazilyload.LazilyLoadManager bean = new nc.ui.pubapp.uif2app.lazilyload.LazilyLoadManager();
  context.put("lasilyLodadMediator",bean);
  bean.setModel(getManageAppModel());
  bean.setLoader(getBillLazilyLoader());
  bean.setLazilyLoadSupporter(getManagedList45());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList45(){  List list = new ArrayList();  list.add(getCardLazySupport());  list.add(getListLazySupport());  list.add(getLazyActions());  return list;}

public nc.ui.pubapp.uif2app.lazilyload.ActionLazilyLoad getLazyActions(){
 if(context.get("lazyActions")!=null)
 return (nc.ui.pubapp.uif2app.lazilyload.ActionLazilyLoad)context.get("lazyActions");
  nc.ui.pubapp.uif2app.lazilyload.ActionLazilyLoad bean = new nc.ui.pubapp.uif2app.lazilyload.ActionLazilyLoad();
  context.put("lazyActions",bean);
  bean.setModel(getManageAppModel());
  bean.setActionList(getManagedList46());
setBeanFacotryIfBeanFacatoryAware(bean);
invokeInitializingBean(bean);
return bean;
}

private List getManagedList46(){  List list = new ArrayList();  list.add(getPrintAction());  list.add(getPreviewAction());  list.add(getOutputAction());  return list;}

}
