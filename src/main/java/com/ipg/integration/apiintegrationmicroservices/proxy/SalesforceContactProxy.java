package com.ipg.integration.apiintegrationmicroservices.proxy;

import java.net.URI;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.ipg.integration.apiintegrationmicroservices.bean.salesforce.SalesforceContactResult;

import feign.Param;

@FeignClient(name="salesforce-contact", url="udemy70-dev-ed.my.salesforce.com")
public interface SalesforceContactProxy {
    
    @GetMapping("/services/data/v49.0/query/{query}")
    public SalesforceContactResult findAll(URI uri, @PathVariable("query") String q, @RequestHeader("Authorization") String auth);

    @GetMapping("/services/data/v49.0/query/")
    public SalesforceContactResult findAllParam(URI uri, @Param("q") String q, @RequestHeader("Authorization") String auth);

    @GetMapping("/services/data/v49.0/query/")
    public SalesforceContactResult findAllQueryParam(URI uri, @RequestParam("q") String q, @RequestHeader("Authorization") String auth);
    
}
