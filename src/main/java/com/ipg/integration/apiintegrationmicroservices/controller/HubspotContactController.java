package com.ipg.integration.apiintegrationmicroservices.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipg.integration.apiintegrationmicroservices.bean.hubspot.HubspotConfig;
import com.ipg.integration.apiintegrationmicroservices.bean.hubspot.result.newapi.HubspotNewContactResult;
import com.ipg.integration.apiintegrationmicroservices.bean.hubspot.result.oldapi.HubspotContactResult;
import com.ipg.integration.apiintegrationmicroservices.proxy.HubspotContactProxy;

// Hubspot API Reference: The new one: https://developers.hubspot.com/docs/api/crm/contacts
// Here is the old-version api. It is still stable and supported.
@RestController
public class HubspotContactController {
    
    @Autowired 
    private HubspotConfig hubspotConfig;

    @Autowired
    private HubspotContactProxy proxy;

    @GetMapping("/hubspot/findall")
    public HubspotContactResult findAll() throws URISyntaxException {

        HubspotContactResult hubspotContactResult = proxy.findAll(
            new URI(hubspotConfig.getUrl()), 
            hubspotConfig.getAuth());

        return hubspotContactResult;
    }

    @GetMapping("/hubspot/findall-new")
    public HubspotNewContactResult findAllNew() throws URISyntaxException {
        HubspotNewContactResult hubspotContactResult = proxy.findAllNew(
            new URI(hubspotConfig.getUrl()), 
            hubspotConfig.getAuth());

        return hubspotContactResult;
    }

    // TODO: GET recently created contacts, see in api doc
}
