// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcehealth.ResourceHealthManager;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStateValues;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStatus;
import com.azure.resourcemanager.resourcehealth.models.ReasonChronicityTypes;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AvailabilityStatusesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"id\":\"fqweykhmene\",\"name\":\"yexfwh\",\"type\":\"cibvyvdcsitynn\",\"location\":\"mdectehfiqscjey\",\"properties\":{\"availabilityState\":\"Unknown\",\"title\":\"rkgqhcjrefo\",\"summary\":\"mkqsleyyv\",\"detailedStatus\":\"qjpkcattpngjcrc\",\"reasonType\":\"sqpjhvmdajvn\",\"rootCauseAttributionTime\":\"2021-10-10T23:28:16Z\",\"healthEventType\":\"nqecanoaeup\",\"healthEventCause\":\"yhltrpmopjmcm\",\"healthEventCategory\":\"u\",\"healthEventId\":\"thfuiuaodsfcpkvx\",\"resolutionETA\":\"2021-07-31T05:00:25Z\",\"occuredTime\":\"2021-06-07T12:26:40Z\",\"reasonChronicity\":\"Persistent\",\"reportedTime\":\"2021-02-09T15:41:34Z\",\"recentlyResolved\":{\"unavailableOccuredTime\":\"2021-04-04T08:44:05Z\",\"resolvedTime\":\"2021-10-16T04:11:54Z\",\"unavailableSummary\":\"axbezyiuo\"},\"recommendedActions\":[],\"serviceImpactingEvents\":[]}}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ResourceHealthManager manager =
            ResourceHealthManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<AvailabilityStatus> response =
            manager.availabilityStatuses().list("owgujjugwdkcglhs", "azjdyggd", "jixhbk", Context.NONE);

        Assertions.assertEquals("fqweykhmene", response.iterator().next().id());
        Assertions.assertEquals("yexfwh", response.iterator().next().name());
        Assertions.assertEquals("cibvyvdcsitynn", response.iterator().next().type());
        Assertions.assertEquals("mdectehfiqscjey", response.iterator().next().location());
        Assertions
            .assertEquals(AvailabilityStateValues.UNKNOWN, response.iterator().next().properties().availabilityState());
        Assertions.assertEquals("rkgqhcjrefo", response.iterator().next().properties().title());
        Assertions.assertEquals("mkqsleyyv", response.iterator().next().properties().summary());
        Assertions.assertEquals("qjpkcattpngjcrc", response.iterator().next().properties().detailedStatus());
        Assertions.assertEquals("sqpjhvmdajvn", response.iterator().next().properties().reasonType());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-10-10T23:28:16Z"),
                response.iterator().next().properties().rootCauseAttributionTime());
        Assertions.assertEquals("nqecanoaeup", response.iterator().next().properties().healthEventType());
        Assertions.assertEquals("yhltrpmopjmcm", response.iterator().next().properties().healthEventCause());
        Assertions.assertEquals("u", response.iterator().next().properties().healthEventCategory());
        Assertions.assertEquals("thfuiuaodsfcpkvx", response.iterator().next().properties().healthEventId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-07-31T05:00:25Z"), response.iterator().next().properties().resolutionEta());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-06-07T12:26:40Z"), response.iterator().next().properties().occuredTime());
        Assertions
            .assertEquals(ReasonChronicityTypes.PERSISTENT, response.iterator().next().properties().reasonChronicity());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-02-09T15:41:34Z"), response.iterator().next().properties().reportedTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-04T08:44:05Z"),
                response.iterator().next().properties().recentlyResolved().unavailableOccuredTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-10-16T04:11:54Z"),
                response.iterator().next().properties().recentlyResolved().resolvedTime());
        Assertions
            .assertEquals("axbezyiuo", response.iterator().next().properties().recentlyResolved().unavailableSummary());
    }
}
