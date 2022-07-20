package com.ipg.integration.apiintegrationmicroservices.bean.shopify;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopifyOrderResult {
    
    private List<ShopifyOrder> orders;
}
