package com.example;

import com.example.ExpenseModel;

public class ExpenseProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<ExpenseModel> {

    public ExpenseProcessInstance(com.example.ExpenseProcess process, ExpenseModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public ExpenseProcessInstance(com.example.ExpenseProcess process, ExpenseModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public ExpenseProcessInstance(com.example.ExpenseProcess process, ExpenseModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public ExpenseProcessInstance(com.example.ExpenseProcess process, ExpenseModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public ExpenseProcessInstance(com.example.ExpenseProcess process, ExpenseModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(ExpenseModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(ExpenseModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
