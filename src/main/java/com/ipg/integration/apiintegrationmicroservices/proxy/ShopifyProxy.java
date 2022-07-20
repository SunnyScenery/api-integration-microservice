package com.ipg.integration.apiintegrationmicroservices.proxy;

import java.net.URI;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.ipg.integration.apiintegrationmicroservices.bean.shopify.ShopifyCheckoutResult;
import com.ipg.integration.apiintegrationmicroservices.bean.shopify.ShopifyCustomerResult;
import com.ipg.integration.apiintegrationmicroservices.bean.shopify.ShopifyOrderResult;


@FeignClient(name="shopify", url="https://ipgtest.myshopify.com")
public interface ShopifyProxy {
    
    @GetMapping(value="/admin/api/2022-04/customers.json")
    public ShopifyCustomerResult getCustomers(URI uri, @RequestHeader("X-Shopify-Access-Token") String auth);
    
    @GetMapping(value="/admin/api/2022-04/orders.json")
    public ShopifyOrderResult getOrders(URI uri, @RequestHeader("X-Shopify-Access-Token") String auth);

    @GetMapping(value="/admin/api/2022-04/checkouts.json")
    public ShopifyCheckoutResult getCheckouts(URI uri, @RequestHeader("X-Shopify-Access-Token") String auth);

}
