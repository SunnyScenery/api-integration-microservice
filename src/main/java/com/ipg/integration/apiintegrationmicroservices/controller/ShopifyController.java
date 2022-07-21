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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="shopify")
@RestController
public class ShopifyController {

    @Autowired
    private ShopifyConfig shopifyConfig;
    
    @Autowired
    private ShopifyProxy proxy;

    @Operation(summary="get all customers")
    @GetMapping("/shopify/getallcustomers")
    public ShopifyCustomerResult getAllCustomers() throws URISyntaxException {
        
        ShopifyCustomerResult shopifyResult = proxy.getCustomers(
            new URI(shopifyConfig.getUrl()), 
            shopifyConfig.getAuth());

        return shopifyResult;
    }

    @Operation(summary="get all orders")
    @GetMapping("/shopify/getallorders")
    public ShopifyOrderResult getAllOrders() throws URISyntaxException {
        
        ShopifyOrderResult shopifyResult = proxy.getOrders(
            new URI(shopifyConfig.getUrl()), 
            shopifyConfig.getAuth());

        return shopifyResult;
    }

    @Operation(summary="get all checkouts")
    @GetMapping("/shopify/getallcheckouts")
    public ShopifyCheckoutResult getAllCheckouts() throws URISyntaxException {
        
        ShopifyCheckoutResult shopifyResult = proxy.getCheckouts(
            new URI(shopifyConfig.getUrl()), 
            shopifyConfig.getAuth());

        return shopifyResult;
    }


}
