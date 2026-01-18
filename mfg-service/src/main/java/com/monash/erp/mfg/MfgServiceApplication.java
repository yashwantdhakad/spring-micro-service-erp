package com.monash.erp.mfg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MfgServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MfgServiceApplication.class, args);
    }
}
