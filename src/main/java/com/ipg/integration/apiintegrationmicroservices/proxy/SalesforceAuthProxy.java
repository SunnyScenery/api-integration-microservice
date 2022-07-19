package com.ipg.integration.apiintegrationmicroservices.proxy;

import java.net.URI;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ipg.integration.apiintegrationmicroservices.bean.salesforce.SalesforceAuth;

@FeignClient(name="salesforce-auth", url="login.salesforce.com")
public interface SalesforceAuthProxy {

    @PostMapping("/services/oauth2/token")
    public SalesforceAuth auth(
        URI uri,
        @RequestParam("grant_type") String grant_type,
        @RequestParam("client_id") String clientId,
        @RequestParam("client_secret") String clientSecret,
        @RequestParam("username") String username,
        @RequestParam("password") String password
    );
    
}
