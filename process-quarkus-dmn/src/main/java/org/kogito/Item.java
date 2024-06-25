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
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
    private String itemId;

    @JsonProperty("ItemName")
    private String itemName;

    @JsonProperty("Category")
    private String category;

    @JsonProperty("ItemPrice")
    private int itemPrice;

    private Boolean validPrice = Boolean.FALSE;
    private Date requestExpiration;


    public Date getRequestExpiration() {
        return requestExpiration;
    }

    public void setRequestExpiration(Date requestExpiration) {
        this.requestExpiration = requestExpiration;
    }

    public Boolean isValidPrice(){
        return validPrice;
    }

    public Boolean getValidPrice() {
        return validPrice;
    }

    public void setValidPrice(Boolean validPrice) {
        this.validPrice = validPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Item(String itemId,String itemName, String category, int itemPrice,Date requestExpiration) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
        this.itemPrice = itemPrice;
        this.requestExpiration = requestExpiration;
    }

    public Item() {
    }

    
    
}
