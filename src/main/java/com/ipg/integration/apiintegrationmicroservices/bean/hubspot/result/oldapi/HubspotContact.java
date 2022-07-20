package com.ipg.integration.apiintegrationmicroservices.bean.hubspot.result.oldapi;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HubspotContact {
    
    // private String firstName;
    // private String lastName;
    // private Date lastModifiedDate;
    // private String email;

    @JsonProperty("addedAt")
    private String addedAt;

    @JsonProperty("vid")
    private String vid;

    @JsonProperty("canonical-vid")
    private String canonicalVid;

    @JsonProperty("merged-vids")
    private Object mergedVids;

    @JsonProperty("portal-id")
    private String portalId;

    @JsonProperty("is-contact")
    private Boolean isContact;

    @JsonProperty("form-submissions")
    private Object formSubmissions;

    @JsonProperty("properties")
    private HubspotProperties hubspotProperties;

    @JsonProperty("identity-profiles")
    private List<HubspotIdentityProfile> profiles;

    @JsonProperty("merge-audits")
    private Object mergeAudits;
}
