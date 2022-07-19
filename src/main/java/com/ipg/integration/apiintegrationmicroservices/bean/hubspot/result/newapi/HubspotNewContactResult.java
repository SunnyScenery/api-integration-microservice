package com.ipg.integration.apiintegrationmicroservices.bean.hubspot.result.newapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class HubspotNewContactResult {
    
    @JsonProperty("results")
    private List<HubspotNewContactResultSingle> results;
}
