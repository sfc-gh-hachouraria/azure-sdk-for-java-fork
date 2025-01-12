// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.fluent.models.ValidationResponseInner;

public final class ValidationResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ValidationResponseInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"status\":\"InputsRevisitRequired\",\"individualResponseDetails\":[{\"validationType\":\"ValidationInputResponse\"},{\"validationType\":\"ValidationInputResponse\"}]}}")
                .toObject(ValidationResponseInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ValidationResponseInner model = new ValidationResponseInner();
        model = BinaryData.fromObject(model).toObject(ValidationResponseInner.class);
    }
}
