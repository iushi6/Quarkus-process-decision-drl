package org.kogito.P6A;


import static org.kogito.Rules789990eb9079482c9b5eabc81d848874.*;
import org.kogito.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence6AC871801B6D14B29E82649DF2020708 implements org.drools.model.functions.Block1<org.kogito.Item>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "976AB8A22A2F8CDF53E3A5B6F359D27A";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.kogito.Item $item) throws java.lang.Exception {
        $item.setValidPrice(Boolean.TRUE);
    }
}
