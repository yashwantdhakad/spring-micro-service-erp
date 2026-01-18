package com.monash.erp.oms.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI omsOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("OMS Service API")
                .description("Order management service endpoints")
                .version("v1"));
    }
}
