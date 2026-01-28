package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SubscriptionFulfillmentPiece;
import com.monash.erp.wms.service.SubscriptionFulfillmentPieceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/subscription-fulfillment-pieces")
public class SubscriptionFulfillmentPieceController {

    private final SubscriptionFulfillmentPieceService service;

    public SubscriptionFulfillmentPieceController(SubscriptionFulfillmentPieceService service) {
        this.service = service;
    }

    @GetMapping
    public List<SubscriptionFulfillmentPiece> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SubscriptionFulfillmentPiece get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SubscriptionFulfillmentPiece> create(@RequestBody SubscriptionFulfillmentPiece entity) {
        SubscriptionFulfillmentPiece created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SubscriptionFulfillmentPiece update(@PathVariable Long id, @RequestBody SubscriptionFulfillmentPiece entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}