package com.monash.erp.wms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.monash.erp.wms.client")
public class WmsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WmsServiceApplication.class, args);
    }
}
