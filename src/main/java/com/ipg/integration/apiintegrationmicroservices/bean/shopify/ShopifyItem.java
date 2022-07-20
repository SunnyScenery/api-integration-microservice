package com.ipg.integration.apiintegrationmicroservices.bean.shopify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopifyItem {
    private String id;
    private String admin_graphql_api_id;
    private String grams;
    private String name;
    private String price;
    private String product_id;
    private String quantity;
    private String total_discount;
    private String title;

}
