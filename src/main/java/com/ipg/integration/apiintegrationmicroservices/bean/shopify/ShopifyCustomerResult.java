package com.ipg.integration.apiintegrationmicroservices.bean.shopify;

import java.util.List;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopifyCustomerResult {
    
    @JsonProperty("customers")
    private List<ShopifyCustomer> customers;
}
