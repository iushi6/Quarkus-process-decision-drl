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

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class NativeExpenseValidIT {
 
    @Test
    public void testExpenseValidationEmbeddedDecisionOnQuarkus() {
        testExpenseProcess("expense", "1243","Yes","Yes",true);
        testExpenseProcess("expense", "1244","No","No",true);
    }

    private void testExpenseProcess(String processId, String itemId,String consent,String finalDecision, Boolean validExpense) {
        Map<String, String> request = new HashMap<>();
        request.put("itemId" , itemId);
        request.put("consent",consent);
        given()
                .body(request)
                .contentType(ContentType.JSON)
                .when()
                .post("/" + processId)
                .then()
                .statusCode(201)
                .body("finalDecision", is(finalDecision))
                .body("item.validExpense", is(validExpense));
    }
}
