package org.kogito.P28;


import static org.kogito.Rules208ee0ecce284ffcb0cab9b2bba997ab.*;
import org.kogito.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence28F3B53DA83EC1737DCC885F602FFE19 implements org.drools.model.functions.Block1<org.kogito.Item>, org.drools.model.functions.HashedExpression {

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
