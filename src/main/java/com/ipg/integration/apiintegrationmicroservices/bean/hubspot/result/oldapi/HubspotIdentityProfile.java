package com.ipg.integration.apiintegrationmicroservices.bean.hubspot.result.oldapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HubspotIdentityProfile {
    
    @JsonProperty("vid")
    private String vid;

    @JsonProperty("saved-at-timestamp")
    private String savedAtTimestamp;

    @JsonProperty("deleted-changed-timestamp")
    private String deletedChangedTimestamp;

    @JsonProperty("identities")
    private List<HubspotIdentity> identities;
}
