package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ReturnItemBilling;
import com.monash.erp.wms.service.ReturnItemBillingService;
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
@RequestMapping("/api/return-item-billings")
public class ReturnItemBillingController {

    private final ReturnItemBillingService service;

    public ReturnItemBillingController(ReturnItemBillingService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReturnItemBilling> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ReturnItemBilling get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ReturnItemBilling> create(@RequestBody ReturnItemBilling entity) {
        ReturnItemBilling created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ReturnItemBilling update(@PathVariable Long id, @RequestBody ReturnItemBilling entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}