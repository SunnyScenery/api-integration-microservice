package com.ipg.integration.apiintegrationmicroservices.bean.hubspot.result.old;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HubspotContactResult {

    @JsonProperty("has-more")
    private Boolean hasMore;

    @JsonProperty("vid-offset")
    private Long offset;

    @JsonProperty("contacts")
    private List<HubspotContact> contacts;

    // @JsonProperty("contacts")
    // public void unpackContacts(Map<String, Object> c) {
    //     for (Map<String, Object> eachContact : (List<Object>) c.get("contacts")){
    //         contacts.add(new HubspotContact());
    //     }
    // }
}
