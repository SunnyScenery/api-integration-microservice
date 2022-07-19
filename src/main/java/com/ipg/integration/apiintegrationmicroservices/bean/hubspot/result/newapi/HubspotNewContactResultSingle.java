package com.ipg.integration.apiintegrationmicroservices.bean.hubspot.result.newapi;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HubspotNewContactResultSingle {

    @JsonProperty("id")
    private String id;

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("updateAt")
    private String updateAt;

    @JsonProperty("archived")
    private Boolean archived;

    @JsonProperty("properties")
    private HubspotNewContactProperties properties;
}
