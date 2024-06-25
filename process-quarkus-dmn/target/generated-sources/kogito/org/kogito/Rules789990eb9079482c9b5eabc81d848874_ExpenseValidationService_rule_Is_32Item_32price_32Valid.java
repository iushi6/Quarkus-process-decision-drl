package org.kogito;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.kogito.Rules789990eb9079482c9b5eabc81d848874.*;
import static org.kogito.Rules789990eb9079482c9b5eabc81d848874_ExpenseValidationService.*;

public class Rules789990eb9079482c9b5eabc81d848874_ExpenseValidationService_rule_Is_32Item_32price_32Valid {

    /**
     * Rule name: Is Item price Valid
     */
    public static org.drools.model.Rule rule_Is_32Item_32price_32Valid() {
        final org.drools.model.Variable<org.kogito.Item> var_$item = D.declarationOf(org.kogito.Item.class,
                                                                                     DomainClassesMetadata789990eb9079482c9b5eabc81d848874.org_kogito_Item_Metadata_INSTANCE,
                                                                                     "$item",
                                                                                     D.entryPoint("item"));
        org.drools.model.Rule rule = D.rule("org.kogito",
                                            "Is Item price Valid")
                                      .unit(org.kogito.ExpenseValidationService.class)
                                      .build(D.pattern(var_$item).expr("GENERATED_D9A90715C98BED5F6921942E7F6CC650",
                                                                       var_currentTime,
                                                                       org.kogito.P83.LambdaPredicate83AA5FFC79F736F7C9C87EDA5C5D188B.INSTANCE,
                                                                       D.reactOn("requestExpiration",
                                                                                 "itemPrice")),
                                             D.on(var_$item).execute(org.kogito.P6A.LambdaConsequence6AC871801B6D14B29E82649DF2020708.INSTANCE));
        return rule;
    }
}
