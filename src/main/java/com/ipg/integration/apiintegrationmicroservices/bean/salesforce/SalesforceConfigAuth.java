package com.ipg.integration.apiintegrationmicroservices.bean.salesforce;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix="salesforce.auth")
public class SalesforceConfigAuth {
    private String url;
    private String grant_type;
    private String clientId;
    private String clientSecret;
    private String username;
    private String password;
}
