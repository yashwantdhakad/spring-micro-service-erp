package com.monash.erp.mfg.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI mfgOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("MFG Service API")
                .description("Manufacturing service endpoints")
                .version("v1"));
    }
}
