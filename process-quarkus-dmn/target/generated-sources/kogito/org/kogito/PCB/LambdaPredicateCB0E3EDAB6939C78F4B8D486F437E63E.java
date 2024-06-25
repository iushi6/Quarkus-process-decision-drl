package org.kogito.PCB;


import static org.kogito.Rules208ee0ecce284ffcb0cab9b2bba997ab.*;
import org.kogito.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateCB0E3EDAB6939C78F4B8D486F437E63E implements org.drools.model.functions.Predicate2<org.kogito.Item, java.util.Date>, org.drools.model.functions.HashedExpression {

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
