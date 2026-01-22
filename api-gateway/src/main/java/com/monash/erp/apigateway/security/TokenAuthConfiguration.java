package com.monash.erp.apigateway.security;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TokenAuthProperties.class)
public class TokenAuthConfiguration {
}
