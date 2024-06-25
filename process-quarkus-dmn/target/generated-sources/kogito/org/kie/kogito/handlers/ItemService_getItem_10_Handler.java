package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class ItemService_getItem_10_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.kogito.ItemService service;

    public ItemService_getItem_10_Handler() {
        this(new org.kogito.ItemService());
    }

    @javax.inject.Inject()
    public ItemService_getItem_10_Handler(org.kogito.ItemService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.getItem((java.lang.String) workItem.getParameter("itemId"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("response", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.kogito.ItemService_getItem_10_Handler";
    }
}
