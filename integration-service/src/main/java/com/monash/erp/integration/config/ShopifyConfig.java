package com.monash.erp.integration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "shopify")
public class ShopifyConfig {
    private String shopDomain;
    private String accessToken;
    private String apiKey;
    private String apiSecret;
    private String webhookSecret;
}
