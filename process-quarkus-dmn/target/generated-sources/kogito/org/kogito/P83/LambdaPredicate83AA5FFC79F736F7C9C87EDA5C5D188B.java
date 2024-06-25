package org.kogito.P83;


import static org.kogito.Rules789990eb9079482c9b5eabc81d848874.*;
import org.kogito.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate83AA5FFC79F736F7C9C87EDA5C5D188B implements org.drools.model.functions.Predicate2<org.kogito.Item, java.util.Date>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "DE95CFF9B29E96213C5A708B5EDBB2B0";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kogito.Item _this, java.util.Date currentTime) throws java.lang.Exception {
        return (_this.getRequestExpiration().after(currentTime) && org.drools.modelcompiler.util.EvaluationUtil.lessThanNumbers(_this.getItemPrice(), 5000));
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("requestExpiration.after(currentTime) && itemPrice<5000");
        info.addRuleNames("Is Item price Valid", "/home/shiavnski/Desktop/Quarkus/process-quarkus-dmn/src/main/resources/ExpenseValidationService.drl");
        return info;
    }
}
