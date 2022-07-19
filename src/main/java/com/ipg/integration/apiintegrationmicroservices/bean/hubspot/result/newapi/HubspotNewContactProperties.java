package com.ipg.integration.apiintegrationmicroservices.bean.hubspot.result.newapi;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HubspotNewContactProperties {
    
    @JsonProperty("createdate")
    private String createDate;

    @JsonProperty("email")
    private String email;

    @JsonProperty("firstname")
    private String firstName;

    @JsonProperty("hs_object_id")
    private String hsObjectId;

    @JsonProperty("lastmodifieddate")
    private String lastModifiedDate;

    @JsonProperty("lastname")
    private String lastName;
}
