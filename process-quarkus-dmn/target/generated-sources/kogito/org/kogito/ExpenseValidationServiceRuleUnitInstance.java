package org.kogito;

import org.drools.core.common.ReteEvaluator;
import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.api.conf.RuleConfig;
import org.drools.ruleunits.impl.ReteEvaluatorBasedRuleUnitInstance;

public class ExpenseValidationServiceRuleUnitInstance extends ReteEvaluatorBasedRuleUnitInstance<org.kogito.ExpenseValidationService> {

    public ExpenseValidationServiceRuleUnitInstance(RuleUnit<org.kogito.ExpenseValidationService> unit, org.kogito.ExpenseValidationService workingMemory, ReteEvaluator reteEvaluator) {
        super(unit,
              workingMemory,
              reteEvaluator);
    }

    public ExpenseValidationServiceRuleUnitInstance(RuleUnit<org.kogito.ExpenseValidationService> unit, org.kogito.ExpenseValidationService workingMemory, ReteEvaluator reteEvaluator, RuleConfig ruleConfig) {
        super(unit,
              workingMemory,
              reteEvaluator,
              ruleConfig);
    }

    @Override
    protected void bind(ReteEvaluator evaluator, org.kogito.ExpenseValidationService ruleUnit) {
        evaluator.setGlobal("currentTime",
                            ruleUnit.getCurrentTime());
        if (ruleUnit.getItem() == null) {
            ruleUnit.setItem(org.drools.ruleunits.api.DataSource.createSingleton());
        }
        ruleUnit.getItem()
                .subscribe(new org.drools.ruleunits.impl.EntryPointDataProcessor(evaluator.getEntryPoint("item")));
        evaluator.setGlobal("item",
                            ruleUnit.getItem());
    }
}
