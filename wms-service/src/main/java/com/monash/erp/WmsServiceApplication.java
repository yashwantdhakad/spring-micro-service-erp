package com.monash.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.monash.erp.wms.client")
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
@EnableJpaRepositories(basePackages = { "com.monash.erp.wms.repository", "com.monash.erp.mfg.repository" })
public class WmsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WmsServiceApplication.class, args);
    }
}
