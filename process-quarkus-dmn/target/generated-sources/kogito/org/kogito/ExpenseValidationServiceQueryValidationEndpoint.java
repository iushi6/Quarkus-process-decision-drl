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

import java.util.List;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.api.RuleUnitInstance;
import static java.util.stream.Collectors.toList;

@Path("/validation")
public class ExpenseValidationServiceQueryValidationEndpoint {

    @javax.inject.Inject
    RuleUnit<org.kogito.ExpenseValidationService> ruleUnit;

    public ExpenseValidationServiceQueryValidationEndpoint() {
    }

    public ExpenseValidationServiceQueryValidationEndpoint(RuleUnit<org.kogito.ExpenseValidationService> ruleUnit) {
        this.ruleUnit = ruleUnit;
    }

    @POST()
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<org.kogito.Item> executeQuery(org.kogito.ExpenseValidationService unitDTO) {
        RuleUnitInstance<org.kogito.ExpenseValidationService> instance = ruleUnit.createInstance(unitDTO);
        // Do not return the result directly to allow post execution codegen (like monitoring)
        List<org.kogito.Item> response = ExpenseValidationServiceQueryValidation.execute(instance);
        instance.close();
        return response;
    }

    @POST()
    @Path("/first")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public org.kogito.Item executeQueryFirst(org.kogito.ExpenseValidationService unitDTO) {
        List<org.kogito.Item> results = executeQuery(unitDTO);
        org.kogito.Item response = results.isEmpty() ? null : results.get(0);
        return response;
    }
}
