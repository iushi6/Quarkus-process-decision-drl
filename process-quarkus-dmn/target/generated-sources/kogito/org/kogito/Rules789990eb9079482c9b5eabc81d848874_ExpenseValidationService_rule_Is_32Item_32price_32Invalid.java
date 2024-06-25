package org.kogito;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.kogito.Rules789990eb9079482c9b5eabc81d848874.*;
import static org.kogito.Rules789990eb9079482c9b5eabc81d848874_ExpenseValidationService.*;

public class Rules789990eb9079482c9b5eabc81d848874_ExpenseValidationService_rule_Is_32Item_32price_32Invalid {

    /**
     * Rule name: Is Item price Invalid
     */
    public static org.drools.model.Rule rule_Is_32Item_32price_32Invalid() {
        final org.drools.model.Variable<org.kogito.Item> var_$item = D.declarationOf(org.kogito.Item.class,
                                                                                     DomainClassesMetadata789990eb9079482c9b5eabc81d848874.org_kogito_Item_Metadata_INSTANCE,
                                                                                     "$item",
                                                                                     D.entryPoint("item"));
        org.drools.model.Rule rule = D.rule("org.kogito",
                                            "Is Item price Invalid")
                                      .unit(org.kogito.ExpenseValidationService.class)
                                      .build(D.pattern(var_$item).expr("GENERATED_45BBF9C133EFF96435CEEC7AEDE43629",
                                                                       var_currentTime,
                                                                       org.kogito.P8C.LambdaPredicate8C95487CFA960594A22A712B5544AC02.INSTANCE,
                                                                       D.reactOn("requestExpiration",
                                                                                 "itemPrice")),
                                             D.on(var_$item).execute(org.kogito.PFF.LambdaConsequenceFFA06D15B4DF53045497D7007329B3A1.INSTANCE));
        return rule;
    }
}
