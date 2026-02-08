package com.monash.erp.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRoutesConfig {

    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("party-service", r -> r
                .path("/party/**", "/party-service/**")
                .filters(f -> f.stripPrefix(1))
                .uri("lb://party-service"))
            .route("oms-service", r -> r
                .path("/oms/**", "/oms-service/**")
                .filters(f -> f.stripPrefix(1))
                .uri("lb://oms-service"))
            .route("wms-service", r -> r
                .path("/wms/**", "/wms-service/**")
                .filters(f -> f.stripPrefix(1))
                .uri("lb://wms-service"))
            .route("mfg-legacy", r -> r
                .path("/mfg/**", "/mfg-service/**")
                .filters(f -> f.stripPrefix(1))
                .uri("lb://wms-service"))
            .route("kafka-service", r -> r
                .path("/kafka/**", "/kafka-service/**")
                .filters(f -> f.stripPrefix(1))
                .uri("lb://kafka-service"))
            .build();
    }
}
