package com.ipg.integration.apiintegrationmicroservices.bean.hubspot.result.old;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HubspotIdentity {
    
    @JsonProperty("type")
    private String type;

    @JsonProperty("value")
    private String value;

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("is-primary")
    private Boolean isPrimary;
}
