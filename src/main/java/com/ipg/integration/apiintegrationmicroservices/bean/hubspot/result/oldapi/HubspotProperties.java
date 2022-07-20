package com.ipg.integration.apiintegrationmicroservices.bean.hubspot.result.oldapi;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HubspotProperties {
    
    private String firstName;
    private String lastName;
    private String lastModifiedDate;

    @JsonProperty("firstname")
    public void unpackFirstName(Map<String, String> fn) {
        firstName = fn.get("value");
    }

    @JsonProperty("lastname")
    public void unpackLastName(Map<String, String> ln) {
        lastName = ln.get("value");
    }

    @JsonProperty("lastmodifieddate")
    public void unpackLastModifiedDate(Map<String, String> lmd) {
        lastModifiedDate = lmd.get("value");
    }
}
