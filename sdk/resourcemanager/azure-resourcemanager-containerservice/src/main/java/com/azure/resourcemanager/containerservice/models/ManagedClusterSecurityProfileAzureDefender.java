// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Defender settings for the security profile. */
@Fluent
public final class ManagedClusterSecurityProfileAzureDefender {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterSecurityProfileAzureDefender.class);

    /*
     * Whether to enable Azure Defender
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Resource ID of the Log Analytics workspace to be associated with Azure
     * Defender.  When Azure Defender is enabled, this field is required and
     * must be a valid workspace resource ID. When Azure Defender is disabled,
     * leave the field empty.
     */
    @JsonProperty(value = "logAnalyticsWorkspaceResourceId")
    private String logAnalyticsWorkspaceResourceId;

    /**
     * Get the enabled property: Whether to enable Azure Defender.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether to enable Azure Defender.
     *
     * @param enabled the enabled value to set.
     * @return the ManagedClusterSecurityProfileAzureDefender object itself.
     */
    public ManagedClusterSecurityProfileAzureDefender withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the logAnalyticsWorkspaceResourceId property: Resource ID of the Log Analytics workspace to be associated
     * with Azure Defender. When Azure Defender is enabled, this field is required and must be a valid workspace
     * resource ID. When Azure Defender is disabled, leave the field empty.
     *
     * @return the logAnalyticsWorkspaceResourceId value.
     */
    public String logAnalyticsWorkspaceResourceId() {
        return this.logAnalyticsWorkspaceResourceId;
    }

    /**
     * Set the logAnalyticsWorkspaceResourceId property: Resource ID of the Log Analytics workspace to be associated
     * with Azure Defender. When Azure Defender is enabled, this field is required and must be a valid workspace
     * resource ID. When Azure Defender is disabled, leave the field empty.
     *
     * @param logAnalyticsWorkspaceResourceId the logAnalyticsWorkspaceResourceId value to set.
     * @return the ManagedClusterSecurityProfileAzureDefender object itself.
     */
    public ManagedClusterSecurityProfileAzureDefender withLogAnalyticsWorkspaceResourceId(
        String logAnalyticsWorkspaceResourceId) {
        this.logAnalyticsWorkspaceResourceId = logAnalyticsWorkspaceResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}