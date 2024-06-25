package org.kogito;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import static org.kogito.Rules208ee0ecce284ffcb0cab9b2bba997ab.*;
import org.drools.model.Query;

public class Rules208ee0ecce284ffcb0cab9b2bba997ab_ExpenseValidationService extends Rules208ee0ecce284ffcb0cab9b2bba997ab {

    @Override
    public String getName() {
        return super.getName() + ".ExpenseValidationService";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.model.codegen.execmodel.generator.DRLIdGenerator@35573752
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rules208ee0ecce284ffcb0cab9b2bba997ab_ExpenseValidationService_rule_Is_32Item_32price_32Valid.rule_Is_32Item_32price_32Valid(),
                                       Rules208ee0ecce284ffcb0cab9b2bba997ab_ExpenseValidationService_rule_Is_32Item_32price_32Invalid.rule_Is_32Item_32price_32Invalid());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("item"));
    }

    public static final org.drools.model.Global<java.util.Date> var_currentTime = D.globalOf(java.util.Date.class,
                                                                                             "org.kogito",
                                                                                             "currentTime");

    public static final org.drools.model.Global<org.drools.ruleunits.api.SingletonStore<org.kogito.Item>> var_item = D.globalOf(new org.drools.model.TypeReference<org.drools.ruleunits.api.SingletonStore<org.kogito.Item>>(org.drools.ruleunits.api.SingletonStore.class),
                                                                                                                                "org.kogito",
                                                                                                                                "item");

    final Query query_validation = query_validation();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_validation() {
        final org.drools.model.Variable<org.kogito.Item> var_$item = D.declarationOf(org.kogito.Item.class,
                                                                                     DomainClassesMetadata208ee0ecce284ffcb0cab9b2bba997ab.org_kogito_Item_Metadata_INSTANCE,
                                                                                     "$item",
                                                                                     D.entryPoint("item"));
        org.drools.model.Query validation_build = queryDef_validation.build(D.pattern(var_$item,
                                                                                      D.entryPoint("item")));
        return validation_build;
    }

    protected java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        globals.add(var_currentTime);
        globals.add(var_item);
        queries.add(query_validation);
    }
}
