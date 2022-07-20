package com.ipg.integration.apiintegrationmicroservices.bean.shopify;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopifyCheckout {
    private String id;
    private String admin_graphql_api_id;
    private Boolean confirmed;
    private String contact_email;
    private String created_at;
    private String email;
    private String financial_status;
    private String name;
    private String order_number;
    private String phone;
    private String processed_at;
    private String total_price;
    private String total_tip_received;
    private String user_id;
    private String updated_at;
    private List<ShopifyItem> line_items;
    private String completed_at;
    private String closed_at;
    private String token;
    private String cart_token;
    private String abandoned_checkout_url;
    private ShopifyCustomer customer;


}
