package com.monash.erp.integration.controller;

import com.monash.erp.integration.service.ShopifyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/integration/shopify")
public class BulkImportController {

    private final ShopifyService shopifyService;

    public BulkImportController(ShopifyService shopifyService) {
        this.shopifyService = shopifyService;
    }

    @PostMapping("/import/bulk")
    public ResponseEntity<Void> triggerBulkImport() {
        shopifyService.runBulkQuery();
        return ResponseEntity.accepted().build();
    }
}
