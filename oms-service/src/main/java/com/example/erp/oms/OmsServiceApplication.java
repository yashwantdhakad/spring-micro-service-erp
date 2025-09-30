package com.example.erp.oms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.example.erp.oms.client")
public class OmsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OmsServiceApplication.class, args);
    }
}
