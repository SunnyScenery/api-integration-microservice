package com.ipg.integration.apiintegrationmicroservices.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipg.integration.apiintegrationmicroservices.bean.salesforce.SalesforceAuth;
import com.ipg.integration.apiintegrationmicroservices.bean.salesforce.SalesforceConfigAuth;
import com.ipg.integration.apiintegrationmicroservices.bean.salesforce.SalesforceConfigContact;
import com.ipg.integration.apiintegrationmicroservices.bean.salesforce.SalesforceContactResult;
import com.ipg.integration.apiintegrationmicroservices.proxy.SalesforceAuthProxy;
import com.ipg.integration.apiintegrationmicroservices.proxy.SalesforceContactProxy;

import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name="salesforce")
@RestController
public class SalesforceContactController {

    @Autowired
    private SalesforceConfigAuth salesforceConfigAuth;

    @Autowired
    private SalesforceConfigContact salesforceConfigContact;

    @Autowired
    private SalesforceAuthProxy authProxy;

    @Autowired
    private SalesforceContactProxy queryProxy;
    
    // @ApiOperation(value="salesforce find all contacts", notes="find all contacts")
    @GetMapping("/salesforce/findall")
    public SalesforceContactResult findAll() throws URISyntaxException {

        SalesforceAuth auth = authProxy.auth(
            new URI(salesforceConfigAuth.getUrl()), 
            salesforceConfigAuth.getGrant_type(), 
            salesforceConfigAuth.getClientId(), 
            salesforceConfigAuth.getClientSecret(), 
            salesforceConfigAuth.getUsername(), 
            salesforceConfigAuth.getPassword());
        
        SalesforceContactResult salesforceContactResult = queryProxy.findAllQueryParam(
            new URI(salesforceConfigContact.getUrl()), 
            salesforceConfigContact.getQuery(), 
            salesforceConfigContact.getAuth() + " " + auth.getAccess_token());

        return salesforceContactResult;
    }
}
