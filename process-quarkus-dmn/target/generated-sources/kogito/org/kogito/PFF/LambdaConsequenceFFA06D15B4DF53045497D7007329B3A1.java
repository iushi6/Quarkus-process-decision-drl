package org.kogito.PFF;


import static org.kogito.Rules789990eb9079482c9b5eabc81d848874.*;
import org.kogito.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceFFA06D15B4DF53045497D7007329B3A1 implements org.drools.model.functions.Block1<org.kogito.Item>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "4B64EEE51E91C491EA9976E5FF42FC7F";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.kogito.Item $item) throws java.lang.Exception {
        $item.setValidPrice(Boolean.FALSE);
    }
}
