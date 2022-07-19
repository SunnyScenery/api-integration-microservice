package com.ipg.integration.apiintegrationmicroservices.proxy;

import java.net.URI;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.ipg.integration.apiintegrationmicroservices.bean.hubspot.result.old.HubspotContactResult;

@FeignClient(name="hubspot-contact", url="https://api.hubapi.com")
public interface HubspotContactProxy {
    
    @GetMapping("/contacts/v1/lists/all/contacts/all")
    public HubspotContactResult findAll(URI uri, @RequestHeader("Authorization") String auth);
}
