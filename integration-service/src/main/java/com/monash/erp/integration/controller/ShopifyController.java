package com.monash.erp.integration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/webhooks/shopify")
public class ShopifyController {

    @PostMapping("/products/update")
    public ResponseEntity<Void> handleProductUpdate(
            @RequestBody String payload,
            @RequestHeader(value = "X-Shopify-Hmac-Sha256", required = false) String hmac,
            @RequestHeader(value = "X-Shopify-Topic", required = false) String topic,
            @RequestHeader(value = "X-Shopify-Shop-Domain", required = false) String shopDomain) {
        
        log.info("Received Shopify Webhook: Topic={}, Shop={}", topic, shopDomain);
        
        // TODO: Verify HMAC signature
        // if (!verifyHmac(payload, hmac)) {
        //     return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        // }

        // TODO: Process payload and update ERP
        log.debug("Payload: {}", payload);

        return ResponseEntity.ok().build();
    }
}
