package com.ipg.integration.apiintegrationmicroservices.bean.shopify;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopifyCustomerAddress {
    
    @JsonProperty("id")
    private String id;

    @JsonProperty("customer_id")
    private String customerId;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("company")
    private String company;

    @JsonProperty("address1")
    private String address1;

    @JsonProperty("address2")
    private String address2;

    @JsonProperty("city")
    private String city;

    @JsonProperty("province")
    private String province;

    @JsonProperty("country")
    private String country;

    @JsonProperty("zip")
    private String zip;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("name")
    private String name;

    @JsonProperty("province_code")
    private String provinceCode;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("country_name")
    private String countryName;

    @JsonProperty("true")
    private Boolean isDefault;
}
