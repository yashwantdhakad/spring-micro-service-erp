package com.example.erp.oms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "wms-service", path = "/products")
public interface ProductClient {

    @GetMapping("/sku/{sku}")
    ProductSummary getProduct(@PathVariable("sku") String sku);
}
