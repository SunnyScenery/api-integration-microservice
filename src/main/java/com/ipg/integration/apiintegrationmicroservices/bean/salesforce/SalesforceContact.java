package com.ipg.integration.apiintegrationmicroservices.bean.salesforce;

import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesforceContact {
    
    private SalesforceAttributes attributes;

    @JsonProperty(value="Id")
    private String Id;

    @JsonProperty(value="FirstName")
    private String FirstName;

    @JsonProperty(value="LastName")
    private String LastName;

    @JsonProperty(value="Email")
    private String Email;

    @JsonProperty(value="LastModifiedDate")
    private Date LastModifiedDate;
}
