package org.kogito;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.kogito.Rules208ee0ecce284ffcb0cab9b2bba997ab.*;
import static org.kogito.Rules208ee0ecce284ffcb0cab9b2bba997ab_ExpenseValidationService.*;

public class Rules208ee0ecce284ffcb0cab9b2bba997ab_ExpenseValidationService_rule_Is_32Item_32price_32Invalid {

    /**
     * Rule name: Is Item price Invalid
     */
    public static org.drools.model.Rule rule_Is_32Item_32price_32Invalid() {
        final org.drools.model.Variable<org.kogito.Item> var_$item = D.declarationOf(org.kogito.Item.class,
                                                                                     DomainClassesMetadata208ee0ecce284ffcb0cab9b2bba997ab.org_kogito_Item_Metadata_INSTANCE,
                                                                                     "$item",
                                                                                     D.entryPoint("item"));
        org.drools.model.Rule rule = D.rule("org.kogito",
                                            "Is Item price Invalid")
                                      .unit(org.kogito.ExpenseValidationService.class)
                                      .build(D.pattern(var_$item).expr("GENERATED_45BBF9C133EFF96435CEEC7AEDE43629",
                                                                       var_currentTime,
                                                                       org.kogito.PCB.LambdaPredicateCB0E3EDAB6939C78F4B8D486F437E63E.INSTANCE,
                                                                       D.reactOn("requestExpiration",
                                                                                 "itemPrice")),
                                             D.on(var_$item).execute(org.kogito.P28.LambdaConsequence28F3B53DA83EC1737DCC885F602FFE19.INSTANCE));
        return rule;
    }
}
