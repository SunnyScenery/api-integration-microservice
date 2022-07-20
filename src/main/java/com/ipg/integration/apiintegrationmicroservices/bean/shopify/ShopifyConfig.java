package com.ipg.integration.apiintegrationmicroservices.bean.shopify;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix="shopify")
public class ShopifyConfig {
    private String url;
    private String auth;
}
