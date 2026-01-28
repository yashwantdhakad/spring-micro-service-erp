package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.GiftCardFulfillment;
import com.monash.erp.wms.service.GiftCardFulfillmentService;
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
@RequestMapping("/api/gift-card-fulfillments")
public class GiftCardFulfillmentController {

    private final GiftCardFulfillmentService service;

    public GiftCardFulfillmentController(GiftCardFulfillmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<GiftCardFulfillment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GiftCardFulfillment get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GiftCardFulfillment> create(@RequestBody GiftCardFulfillment entity) {
        GiftCardFulfillment created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GiftCardFulfillment update(@PathVariable Long id, @RequestBody GiftCardFulfillment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}