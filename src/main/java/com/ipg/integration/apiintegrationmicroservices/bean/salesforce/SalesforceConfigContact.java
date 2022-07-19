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
@ConfigurationProperties(prefix="salesforce.contact")
public class SalesforceConfigContact {
    private String url;
    private String query;
    private String auth;
}
