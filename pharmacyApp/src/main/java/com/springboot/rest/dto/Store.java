package com.springboot.rest.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "store")
@Component
@RefreshScope
public class Store {
    private String storeNo;
    private String storeName;
    private String storeManager;
    private int openingHrs;
    private int closingHrs;
    private String location;
}
