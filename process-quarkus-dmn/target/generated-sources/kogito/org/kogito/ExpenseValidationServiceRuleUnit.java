package org.kogito;

import org.drools.core.SessionConfiguration;
import org.drools.core.common.ReteEvaluator;
import org.drools.core.impl.InternalRuleBase;
import org.drools.modelcompiler.KieBaseBuilder;
import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.api.conf.RuleConfig;
import org.drools.ruleunits.api.RuleUnits;
import org.drools.ruleunits.impl.factory.AbstractRuleUnit;
import org.drools.ruleunits.impl.factory.AbstractRuleUnits;
import org.drools.ruleunits.impl.ReteEvaluatorBasedRuleUnitInstance;
import org.drools.ruleunits.impl.sessions.RuleUnitExecutorImpl;

@javax.enterprise.context.ApplicationScoped
public class ExpenseValidationServiceRuleUnit extends AbstractRuleUnit<org.kogito.ExpenseValidationService> {

    private static final InternalRuleBase ruleBase = KieBaseBuilder.createKieBaseFromModel(new org.kogito.Rules208ee0ecce284ffcb0cab9b2bba997ab_ExpenseValidationService(),
                                                                                           new org.kie.api.conf.KieBaseOption[] { org.kie.api.conf.EventProcessingOption.CLOUD });

    private static final SessionConfiguration sessionConfiguration = ruleBase.getSessionConfiguration().as(SessionConfiguration.KEY);

    static {
        sessionConfiguration.setOption(org.kie.api.runtime.conf.ClockTypeOption.REALTIME);
    }

    public ExpenseValidationServiceRuleUnit() {
        this((RuleUnits) null);
    }

    @javax.inject.Inject
    public ExpenseValidationServiceRuleUnit(javax.enterprise.inject.Instance<RuleUnits> ruleUnits) {
        this(ruleUnits == null || ruleUnits.isUnsatisfied() ? AbstractRuleUnits.DummyRuleUnits.INSTANCE : ruleUnits.get());
    }

    public ExpenseValidationServiceRuleUnit(RuleUnits ruleUnits) {
        super(org.kogito.ExpenseValidationService.class,
              ruleUnits);
        this.ruleUnits.register(this);
    }

    @Override
    public ExpenseValidationServiceRuleUnitInstance internalCreateInstance(org.kogito.ExpenseValidationService data, RuleConfig ruleConfig) {
        ReteEvaluator reteEvaluator = evaluatorConfigurator.apply(new RuleUnitExecutorImpl(ruleBase,
                                                                                           sessionConfiguration));
        return new ExpenseValidationServiceRuleUnitInstance(this,
                                                            data,
                                                            reteEvaluator,
                                                            ruleConfig);
    }
}
