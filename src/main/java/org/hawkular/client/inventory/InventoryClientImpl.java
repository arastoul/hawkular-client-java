/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hawkular.client.inventory;

import java.util.Collection;

import org.hawkular.client.BaseClient;
import org.hawkular.client.InventoryClient;
import org.hawkular.client.RestFactory;
import org.hawkular.inventory.api.Resource;

public class InventoryClientImpl extends BaseClient<InventoryRestApi>implements InventoryClient {

    public InventoryClientImpl(String endpointUrl, String username,
            String password) throws Exception {
        super(endpointUrl, username, password, new RestFactory<InventoryRestApi>(InventoryRestApi.class));
    }

    @Override
    public Collection<Resource> getResourcesByType(String tenantId, String type) {
        return null;
    }

}