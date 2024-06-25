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

import java.time.ZonedDateTime;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ItemService {
    
    private static Logger LOGGER = LoggerFactory.getLogger(ItemService.class);

    public Item getItem(String itemId){
        LOGGER.info("Get Item information for id = {}", itemId);

         int days =  Integer.parseInt(itemId) % 2; 
         Date requestExpiration = new Date(ZonedDateTime.now().plusDays(days).toInstant().toEpochMilli());
        return new Item(itemId,"T.V.","Electronics",50000 ,requestExpiration);
    }
}
