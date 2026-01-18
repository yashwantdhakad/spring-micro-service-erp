package com.monash.erp.party.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI partyOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Party Service API")
                .description("Party service endpoints")
                .version("v1"));
    }
}
