package org.kogito.P8C;


import static org.kogito.Rules789990eb9079482c9b5eabc81d848874.*;
import org.kogito.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate8C95487CFA960594A22A712B5544AC02 implements org.drools.model.functions.Predicate2<org.kogito.Item, java.util.Date>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "C3612AF6C521AB0807216B9BD305A54B";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kogito.Item _this, java.util.Date currentTime) throws java.lang.Exception {
        return (_this.getRequestExpiration().before(currentTime) && org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getItemPrice(), 50000));
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("requestExpiration.before(currentTime) && itemPrice >= 50000");
        info.addRuleNames("Is Item price Invalid", "/home/shiavnski/Desktop/Quarkus/process-quarkus-dmn/src/main/resources/ExpenseValidationService.drl");
        return info;
    }
}
