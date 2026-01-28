package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderAdjustmentBilling;
import com.monash.erp.oms.service.OrderAdjustmentBillingService;
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
@RequestMapping("/api/order-adjustment-billings")
public class OrderAdjustmentBillingController {

    private final OrderAdjustmentBillingService service;

    public OrderAdjustmentBillingController(OrderAdjustmentBillingService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderAdjustmentBilling> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderAdjustmentBilling get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderAdjustmentBilling> create(@RequestBody OrderAdjustmentBilling entity) {
        OrderAdjustmentBilling created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderAdjustmentBilling update(@PathVariable Long id, @RequestBody OrderAdjustmentBilling entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}