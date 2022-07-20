package com.ipg.integration.apiintegrationmicroservices.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipg.integration.apiintegrationmicroservices.bean.shopify.ShopifyCheckoutResult;
import com.ipg.integration.apiintegrationmicroservices.bean.shopify.ShopifyConfig;
import com.ipg.integration.apiintegrationmicroservices.bean.shopify.ShopifyCustomerResult;
import com.ipg.integration.apiintegrationmicroservices.bean.shopify.ShopifyOrderResult;
import com.ipg.integration.apiintegrationmicroservices.proxy.ShopifyProxy;

@RestController
public class ShopifyController {

    @Autowired
    private ShopifyConfig shopifyConfig;
    
    @Autowired
    private ShopifyProxy proxy;

    @GetMapping("/shopify/getallcustomers")
    public ShopifyCustomerResult getAllCustomers() throws URISyntaxException {
        
        ShopifyCustomerResult shopifyResult = proxy.getCustomers(
            new URI(shopifyConfig.getUrl()), 
            shopifyConfig.getAuth());

        return shopifyResult;
    }

    @GetMapping("/shopify/getallorders")
    public ShopifyOrderResult getAllOrders() throws URISyntaxException {
        
        ShopifyOrderResult shopifyResult = proxy.getOrders(
            new URI(shopifyConfig.getUrl()), 
            shopifyConfig.getAuth());

        return shopifyResult;
    }

    @GetMapping("/shopify/getallcheckouts")
    public ShopifyCheckoutResult getAllCheckouts() throws URISyntaxException {
        
        ShopifyCheckoutResult shopifyResult = proxy.getCheckouts(
            new URI(shopifyConfig.getUrl()), 
            shopifyConfig.getAuth());

        return shopifyResult;
    }


}
