package org.kogito.P18;


import static org.kogito.Rules208ee0ecce284ffcb0cab9b2bba997ab.*;
import org.kogito.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate18909913AE75056AA5DFA83234ECB02A implements org.drools.model.functions.Predicate2<org.kogito.Item, java.util.Date>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "9B4235C2D65C65B96E91F5FFC82CD56F";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kogito.Item _this, java.util.Date currentTime) throws java.lang.Exception {
        return (_this.getRequestExpiration().after(currentTime) && org.drools.modelcompiler.util.EvaluationUtil.lessThanNumbers(_this.getItemPrice(), 50000));
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("requestExpiration.after(currentTime) && itemPrice<50000");
        info.addRuleNames("Is Item price Valid", "/home/shiavnski/Desktop/Quarkus/process-quarkus-dmn/src/main/resources/ExpenseValidationService.drl");
        return info;
    }
}
