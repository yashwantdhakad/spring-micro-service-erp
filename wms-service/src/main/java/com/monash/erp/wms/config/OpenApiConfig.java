package com.monash.erp.wms.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI wmsOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("WMS Service API")
                .description("Warehouse management service endpoints")
                .version("v1"));
    }
}
