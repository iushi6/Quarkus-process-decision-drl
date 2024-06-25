/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
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
package com.example;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "expense", name = "Expense", hidden = true)
public class ExpenseModelOutput implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<ExpenseModel> {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "itemId")
    @javax.validation.Valid()
    private java.lang.String itemId;

    public java.lang.String getItemId() {
        return itemId;
    }

    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "item")
    @javax.validation.Valid()
    private org.kogito.Item item;

    public org.kogito.Item getItem() {
        return item;
    }

    public void setItem(org.kogito.Item item) {
        this.item = item;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "finaldecision")
    @javax.validation.Valid()
    private java.lang.Boolean finaldecision;

    public java.lang.Boolean getFinaldecision() {
        return finaldecision;
    }

    public void setFinaldecision(java.lang.Boolean finaldecision) {
        this.finaldecision = finaldecision;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "motherconsent")
    @javax.validation.Valid()
    private org.kogito.MotherConsent motherconsent;

    public org.kogito.MotherConsent getMotherconsent() {
        return motherconsent;
    }

    public void setMotherconsent(org.kogito.MotherConsent motherconsent) {
        this.motherconsent = motherconsent;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "fatherconsent")
    @javax.validation.Valid()
    private org.kogito.FatherConsent fatherconsent;

    public org.kogito.FatherConsent getFatherconsent() {
        return fatherconsent;
    }

    public void setFatherconsent(org.kogito.FatherConsent fatherconsent) {
        this.fatherconsent = fatherconsent;
    }

    @Override()
    public ExpenseModel toModel() {
        ExpenseModel result = new ExpenseModel();
        result.setId(getId());
        result.setItemId(getItemId());
        result.setItem(getItem());
        result.setFinaldecision(getFinaldecision());
        result.setMotherconsent(getMotherconsent());
        result.setFatherconsent(getFatherconsent());
        return result;
    }
}
