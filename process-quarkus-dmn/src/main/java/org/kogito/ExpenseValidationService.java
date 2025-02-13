/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kogito;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.RuleUnitData;
import org.drools.ruleunits.api.SingletonStore;

import java.util.Date;

public class ExpenseValidationService implements RuleUnitData {
    private SingletonStore<Item> item;

    public ExpenseValidationService(){
        this(DataSource.createSingleton());
    }


    public ExpenseValidationService(SingletonStore<Item> item) {
        this.item = item;
    }

    public void setItem(SingletonStore<Item> item) {
        this.item = item;
    }

    public SingletonStore<Item> getItem() {
        return item;
    }
    
    public Date getCurrentTime() {
        return new Date();
    }
    
}
