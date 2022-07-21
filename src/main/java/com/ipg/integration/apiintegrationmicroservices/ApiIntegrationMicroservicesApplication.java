package com.ipg.integration.apiintegrationmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ipg.integration.apiintegrationmicroservices.bean.salesforce.SalesforceConfigAuth;
import com.ipg.integration.apiintegrationmicroservices.bean.salesforce.SalesforceConfigContact;

@EnableFeignClients
@SpringBootApplication
public class ApiIntegrationMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiIntegrationMicroservicesApplication.class, args);
	}

}
