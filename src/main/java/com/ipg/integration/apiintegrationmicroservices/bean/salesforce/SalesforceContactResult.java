package com.ipg.integration.apiintegrationmicroservices.bean.salesforce;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesforceContactResult {
    
    private String totalSize;
    private Boolean done;
    private List<SalesforceContact> records;
    
}
