package org.kogito;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.kogito.Rules208ee0ecce284ffcb0cab9b2bba997ab.*;
import static org.kogito.Rules208ee0ecce284ffcb0cab9b2bba997ab_ExpenseValidationService.*;

public class Rules208ee0ecce284ffcb0cab9b2bba997ab_ExpenseValidationService_rule_Is_32Item_32price_32Valid {

    /**
     * Rule name: Is Item price Valid
     */
    public static org.drools.model.Rule rule_Is_32Item_32price_32Valid() {
        final org.drools.model.Variable<org.kogito.Item> var_$item = D.declarationOf(org.kogito.Item.class,
                                                                                     DomainClassesMetadata208ee0ecce284ffcb0cab9b2bba997ab.org_kogito_Item_Metadata_INSTANCE,
                                                                                     "$item",
                                                                                     D.entryPoint("item"));
        org.drools.model.Rule rule = D.rule("org.kogito",
                                            "Is Item price Valid")
                                      .unit(org.kogito.ExpenseValidationService.class)
                                      .build(D.pattern(var_$item).expr("GENERATED_D3DA2E8CD8CBFA406911EC8992F583BB",
                                                                       var_currentTime,
                                                                       org.kogito.P18.LambdaPredicate18909913AE75056AA5DFA83234ECB02A.INSTANCE,
                                                                       D.reactOn("requestExpiration",
                                                                                 "itemPrice")),
                                             D.on(var_$item).execute(org.kogito.P36.LambdaConsequence36EADBE274456A7CC32625693D900517.INSTANCE));
        return rule;
    }
}
