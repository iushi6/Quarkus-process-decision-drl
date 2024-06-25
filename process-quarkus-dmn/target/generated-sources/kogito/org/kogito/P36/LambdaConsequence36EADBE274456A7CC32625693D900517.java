package org.kogito.P36;


import static org.kogito.Rules208ee0ecce284ffcb0cab9b2bba997ab.*;
import org.kogito.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence36EADBE274456A7CC32625693D900517 implements org.drools.model.functions.Block1<org.kogito.Item>, org.drools.model.functions.HashedExpression {

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
