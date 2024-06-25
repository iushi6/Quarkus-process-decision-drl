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

import org.drools.ruleunits.api.RuleUnitInstance;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.toList;

public class ExpenseValidationServiceQueryValidation {

    public static List<org.kogito.Item> execute(RuleUnitInstance<org.kogito.ExpenseValidationService> instance) {
        return instance.executeQuery("validation").toList().stream().map(ExpenseValidationServiceQueryValidation::toResult).collect(toList());
    }

    private static org.kogito.Item toResult(Map<String, Object> tuple) {
        return (org.kogito.Item) tuple.get("$item");
    }
}
