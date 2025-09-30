package com.example.erp.wms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "mfg-service", path = "/work-orders")
public interface WorkOrderClient {

    @GetMapping("/by-product/{sku}")
    List<WorkOrderSummary> findByProduct(@PathVariable("sku") String sku);
}
