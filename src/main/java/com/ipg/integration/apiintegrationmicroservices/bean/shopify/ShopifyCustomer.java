package com.ipg.integration.apiintegrationmicroservices.bean.shopify;

import java.util.List;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// TODO: There is too many result values, just choose to use part of it. Figure out the needs.

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopifyCustomer {

    @JsonProperty("id")
    private String id;

    @JsonProperty("email")
    private String email;

    @JsonProperty("accepts_marketing")
    private Boolean acceptsMarketing; 

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updateAt;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("orders_count")
    private Long ordersCount;

    @JsonProperty("state")
    private String state;

    @JsonProperty("total_spent")
    private String totalSpent;

    @JsonProperty("last_order_id")
    private String lastOrderId;

    @JsonProperty("note")
    private String note;

    @JsonProperty("verified_email")
    private String verifiedEmail;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("tags")
    private String tags;

    @JsonProperty("last_order_name")
    private String lastOrderName;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("addresses")
    private List<ShopifyCustomerAddress> addresses;
    
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;

}
