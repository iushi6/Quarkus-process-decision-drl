package com.example;

import com.example.ExpenseModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("expense")
@io.quarkus.runtime.Startup()
public class ExpenseProcess extends org.kie.kogito.process.impl.AbstractProcess<com.example.ExpenseModel> {

    public ExpenseProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        this(app, correlations, new org.kie.kogito.handlers.ItemService_getItem_10_Handler());
    }

    @javax.inject.Inject()
    public ExpenseProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.handlers.ItemService_getItem_10_Handler itemService_getItem_10_Handler) {
        super(app, java.util.Arrays.asList(itemService_getItem_10_Handler), correlations);
        activate();
    }

    public ExpenseProcess() {
    }

    @Override()
    public com.example.ExpenseProcessInstance createInstance(com.example.ExpenseModel value) {
        return new com.example.ExpenseProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.example.ExpenseProcessInstance createInstance(java.lang.String businessKey, com.example.ExpenseModel value) {
        return new com.example.ExpenseProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public com.example.ExpenseProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, com.example.ExpenseModel value) {
        return new com.example.ExpenseProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public com.example.ExpenseModel createModel() {
        return new com.example.ExpenseModel();
    }

    public com.example.ExpenseProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.example.ExpenseModel) value);
    }

    public com.example.ExpenseProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.example.ExpenseModel) value);
    }

    public com.example.ExpenseProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ExpenseProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.example.ExpenseProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ExpenseProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("expense", true);
        factory.variable("finaldecision", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), null, "customTags", null);
        factory.variable("itemId", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("motherconsent", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.kogito.MotherConsent.class), null, "customTags", null);
        factory.variable("fatherconsent", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.kogito.FatherConsent.class), null, "customTags", null);
        factory.variable("item", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.kogito.Item.class), null, "customTags", null);
        factory.name("expense");
        factory.packageName("com.example");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode1 = factory.endNode(1);
        endNode1.name("End Unsuccessfully");
        endNode1.terminate(false);
        endNode1.metaData("UniqueId", "_75A48C3E-EAA8-46B7-9B5E-419D94C009DB");
        endNode1.metaData("elementname", "End Unsuccessfully");
        endNode1.metaData("x", 1652);
        endNode1.metaData("width", 56);
        endNode1.metaData("y", 392);
        endNode1.metaData("height", 56);
        endNode1.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode2 = factory.endNode(2);
        endNode2.name("End Succesfully");
        endNode2.terminate(false);
        endNode2.metaData("UniqueId", "_42C57EC6-3FC2-4F9E-A72D-65086FEE4889");
        endNode2.metaData("elementname", "End Succesfully");
        endNode2.metaData("x", 1632);
        endNode2.metaData("width", 56);
        endNode2.metaData("y", 102);
        endNode2.metaData("height", 56);
        endNode2.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode3 = factory.actionNode(3);
        actionNode3.name("Cannot buy Item");
        actionNode3.action(kcontext -> {
            System.out.println("Cannot buy the Item!!");
        });
        actionNode3.metaData("UniqueId", "_328A9F28-0010-4DE6-9A7C-A1B2BC2B326B");
        actionNode3.metaData("elementname", "Cannot buy Item");
        actionNode3.metaData("NodeType", "ScriptTask");
        actionNode3.metaData("x", 1417);
        actionNode3.metaData("width", 154);
        actionNode3.metaData("y", 369);
        actionNode3.metaData("height", 102);
        actionNode3.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode4 = factory.actionNode(4);
        actionNode4.name("Can buy Item");
        actionNode4.action(kcontext -> {
            System.out.println("Can buy Item!!");
        });
        actionNode4.metaData("UniqueId", "_55A60F7C-A2A9-4B1B-9ACA-202CFD45A3D1");
        actionNode4.metaData("elementname", "Can buy Item");
        actionNode4.metaData("NodeType", "ScriptTask");
        actionNode4.metaData("x", 1403);
        actionNode4.metaData("width", 154);
        actionNode4.metaData("y", 79);
        actionNode4.metaData("height", 102);
        actionNode4.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode5 = factory.splitNode(5);
        splitNode5.name("Split");
        splitNode5.type(1);
        splitNode5.metaData("UniqueId", "_AB926C63-45FF-4E63-89CC-A7466414F9EE");
        splitNode5.metaData("x", 1279);
        splitNode5.metaData("width", 56);
        splitNode5.metaData("y", 302);
        splitNode5.metaData("height", 56);
        splitNode5.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode6 = factory.endNode(6);
        endNode6.name("End Unsuccessfully");
        endNode6.terminate(false);
        endNode6.metaData("UniqueId", "_867DB5F7-687F-4938-990A-87677D299B2D");
        endNode6.metaData("elementname", "End Unsuccessfully");
        endNode6.metaData("x", 843);
        endNode6.metaData("width", 56);
        endNode6.metaData("y", 522);
        endNode6.metaData("height", 56);
        endNode6.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode7 = factory.ruleSetNode(7);
        ruleSetNode7.name("ConsentValidation\nDML");
        ruleSetNode7.decision("https://kiegroup.org/dmn/_C30FADB8-8C6D-4A39-96D1-352313B30191", "Consent Validation", "Consent Validation", () -> {
            return app.get(org.kie.kogito.decision.DecisionModels.class).getDecisionModel("https://kiegroup.org/dmn/_C30FADB8-8C6D-4A39-96D1-352313B30191", "Consent Validation");
        });
        ruleSetNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_5AEE1EC3-4948-45D6-8160-57A8BB10A188_namespaceInputX", "namespace", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("8fe761be-68e6-43a1-bd51-92b995492f58", "EXPRESSION (https://kiegroup.org/dmn/_C30FADB8-8C6D-4A39-96D1-352313B30191)", "java.lang.Object", "https://kiegroup.org/dmn/_C30FADB8-8C6D-4A39-96D1-352313B30191"), new org.jbpm.workflow.core.impl.DataDefinition("_5AEE1EC3-4948-45D6-8160-57A8BB10A188_namespaceInputX", "namespace", "java.lang.String", null))), null));
        ruleSetNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_5AEE1EC3-4948-45D6-8160-57A8BB10A188_decisionInputX", "decision", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("99c3fb61-39fe-45f8-afdb-cd03389fe309", "EXPRESSION (Consent Validation)", "java.lang.Object", "Consent Validation"), new org.jbpm.workflow.core.impl.DataDefinition("_5AEE1EC3-4948-45D6-8160-57A8BB10A188_decisionInputX", "decision", "java.lang.String", null))), null));
        ruleSetNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_5AEE1EC3-4948-45D6-8160-57A8BB10A188_modelInputX", "model", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("93218f0a-809b-49bf-ab26-b906a15363b8", "EXPRESSION (Consent Validation)", "java.lang.Object", "Consent Validation"), new org.jbpm.workflow.core.impl.DataDefinition("_5AEE1EC3-4948-45D6-8160-57A8BB10A188_modelInputX", "model", "java.lang.String", null))), null));
        ruleSetNode7.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("motherconsent", "motherconsent", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_5AEE1EC3-4948-45D6-8160-57A8BB10A188_MotherConsentInputX", "MotherConsent", "org.kogito.MotherConsent", null), null, null));
        ruleSetNode7.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_5AEE1EC3-4948-45D6-8160-57A8BB10A188_FinalDecisionOutputX", "FinalDecision", "String", null)), new org.jbpm.workflow.core.impl.DataDefinition("finaldecision", "finaldecision", "java.lang.Object", null), null, null));
        ruleSetNode7.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_5AEE1EC3-4948-45D6-8160-57A8BB10A188_FatherConsentOutputX", "FatherConsent", "org.kogito.FatherConsent", null)), new org.jbpm.workflow.core.impl.DataDefinition("fatherconsent", "fatherconsent", "java.lang.Object", null), null, null));
        ruleSetNode7.metaData("UniqueId", "_5AEE1EC3-4948-45D6-8160-57A8BB10A188");
        ruleSetNode7.metaData("elementname", "ConsentValidation\nDML");
        ruleSetNode7.metaData("x", 979);
        ruleSetNode7.metaData("width", 154);
        ruleSetNode7.metaData("y", 279);
        ruleSetNode7.metaData("height", 102);
        ruleSetNode7.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode8 = factory.splitNode(8);
        splitNode8.name("Split");
        splitNode8.type(2);
        splitNode8.metaData("UniqueId", "_EC47590A-7BBA-4570-B4A9-EFA8171AA77F");
        splitNode8.metaData("x", 843);
        splitNode8.metaData("width", 56);
        splitNode8.metaData("y", 302);
        splitNode8.metaData("Default", null);
        splitNode8.metaData("height", 56);
        splitNode8.constraint(6, "_B72E7A30-B739-43C9-971E-40FABFC0843F", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean finaldecision = (java.lang.Boolean) kcontext.getVariable("finaldecision");
            java.lang.String itemId = (java.lang.String) kcontext.getVariable("itemId");
            org.kogito.MotherConsent motherconsent = (org.kogito.MotherConsent) kcontext.getVariable("motherconsent");
            org.kogito.FatherConsent fatherconsent = (org.kogito.FatherConsent) kcontext.getVariable("fatherconsent");
            org.kogito.Item item = (org.kogito.Item) kcontext.getVariable("item");
            return item.isValidPrice();
        }, 0, false);
        splitNode8.constraint(7, "_3482AA89-86EA-4239-BBD7-4EEA8EB02E94", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean finaldecision = (java.lang.Boolean) kcontext.getVariable("finaldecision");
            java.lang.String itemId = (java.lang.String) kcontext.getVariable("itemId");
            org.kogito.MotherConsent motherconsent = (org.kogito.MotherConsent) kcontext.getVariable("motherconsent");
            org.kogito.FatherConsent fatherconsent = (org.kogito.FatherConsent) kcontext.getVariable("fatherconsent");
            org.kogito.Item item = (org.kogito.Item) kcontext.getVariable("item");
            return item.isValidPrice();
        }, 0, false);
        splitNode8.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode9 = factory.ruleSetNode(9);
        ruleSetNode9.name("Expense Validation\nDRL");
        ruleSetNode9.ruleUnit("org.kogito.ExpenseValidationService", new org.jbpm.workflow.core.node.RuleUnitFactory<org.kogito.ExpenseValidationService>() {

            public org.kogito.ExpenseValidationService bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                org.kogito.ExpenseValidationService unit = new org.kogito.ExpenseValidationService();
                org.kogito.Item item = (org.kogito.Item) (kcontext.getVariable("item"));
                {
                    org.drools.ruleunits.api.SingletonStore unit_item = unit.getItem();
                    unit_item.subscribe(org.drools.ruleunits.api.DataObserver.ofUpdatable(o -> kcontext.setVariable("item", o)));
                }
                {
                    org.drools.ruleunits.api.SingletonStore unit_item = unit.getItem();
                    unit_item.set((org.kogito.Item) (kcontext.getVariable("item")));
                }
                return unit;
            }

            public org.drools.ruleunits.api.RuleUnit<org.kogito.ExpenseValidationService> unit() {
                return app.get(org.kie.kogito.rules.RuleUnits.class).create(org.kogito.ExpenseValidationService.class);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, org.kogito.ExpenseValidationService unit) {
                org.kogito.Item item = (org.kogito.Item) (kcontext.getVariable("item"));
                {
                    org.drools.ruleunits.api.SingletonStore unit_item = unit.getItem();
                    unit_item.subscribe(org.drools.ruleunits.api.DataObserver.ofUpdatable(o -> kcontext.setVariable("item", o)));
                }
            }
        });
        ruleSetNode9.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("item", "item", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_C62B9702-8B46-4745-AF3B-A319C26BE850_itemInputX", "item", "org.kogito.Item", null), null, null));
        ruleSetNode9.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_C62B9702-8B46-4745-AF3B-A319C26BE850_itemOutputX", "item", "org.kogito.Item", null)), new org.jbpm.workflow.core.impl.DataDefinition("item", "item", "java.lang.Object", null), null, null));
        ruleSetNode9.metaData("UniqueId", "_C62B9702-8B46-4745-AF3B-A319C26BE850");
        ruleSetNode9.metaData("elementname", "Expense Validation\nDRL");
        ruleSetNode9.metaData("x", 593);
        ruleSetNode9.metaData("width", 154);
        ruleSetNode9.metaData("y", 279);
        ruleSetNode9.metaData("height", 102);
        ruleSetNode9.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode10 = factory.workItemNode(10);
        workItemNode10.name("Get Item Details");
        workItemNode10.workName("org.kogito.ItemService_getItem_10_Handler");
        workItemNode10.workParameter("NodeName", "Get Item Details");
        workItemNode10.workParameter("Interface", "org.kogito.ItemService");
        workItemNode10.workParameter("Operation", "getItem");
        workItemNode10.workParameter("interfaceImplementationRef", "org.kogito.ItemService");
        workItemNode10.workParameter("operationImplementationRef", "getItem");
        workItemNode10.workParameter("implementation", "Java");
        workItemNode10.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("itemId", "itemId", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_FA5D3573-E37C-4A3E-A360-87386DBC9A0A_itemIdInputX", "itemId", "String", null), null, null));
        workItemNode10.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_FA5D3573-E37C-4A3E-A360-87386DBC9A0A_responseOutputX", "response", "org.kogito.Item", null)), new org.jbpm.workflow.core.impl.DataDefinition("item", "item", "java.lang.Object", null), null, null));
        workItemNode10.done();
        workItemNode10.metaData("UniqueId", "_FA5D3573-E37C-4A3E-A360-87386DBC9A0A");
        workItemNode10.metaData("Implementation", "Java");
        workItemNode10.metaData("elementname", "Get Item Details");
        workItemNode10.metaData("Type", "Service Task");
        workItemNode10.metaData("OperationRef", "_FA5D3573-E37C-4A3E-A360-87386DBC9A0A_ServiceOperation");
        workItemNode10.metaData("x", 353);
        workItemNode10.metaData("width", 154);
        workItemNode10.metaData("y", 279);
        workItemNode10.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode11 = factory.startNode(11);
        startNode11.name("start");
        startNode11.interrupting(true);
        startNode11.metaData("UniqueId", "_0D9C0EC2-D8FE-443C-87AE-0CF4BF56D459");
        startNode11.metaData("elementname", "start");
        startNode11.metaData("x", 152);
        startNode11.metaData("width", 56);
        startNode11.metaData("y", 302);
        startNode11.metaData("height", 56);
        startNode11.done();
        factory.connection(3, 1, "_DC69CBF5-5A56-4470-BAEA-5E90DA692967");
        factory.connection(4, 2, "_4EF0FEC6-AAC9-4951-AB23-9F87E440E657");
        factory.connection(5, 3, "_7712F293-02E5-4369-8AE1-473C92247F5A");
        factory.connection(5, 4, "_26CF8F70-9A13-4606-8FCC-50741A73C1FA");
        factory.connection(7, 5, "_42A793C3-9556-47B8-B1AE-013ED5AFE436");
        factory.connection(8, 6, "_B72E7A30-B739-43C9-971E-40FABFC0843F");
        factory.connection(8, 7, "_3482AA89-86EA-4239-BBD7-4EEA8EB02E94");
        factory.connection(9, 8, "Flow_1avw67e");
        factory.connection(10, 9, "_073D99FF-1977-47FF-8A9A-DFB362F59223");
        factory.connection(11, 10, "_96AFF05A-99C0-4212-8D47-66BAE74D7698");
        factory.validate();
        return factory.getProcess();
    }
}
