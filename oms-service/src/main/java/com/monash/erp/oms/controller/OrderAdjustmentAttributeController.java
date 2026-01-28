package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderAdjustmentAttribute;
import com.monash.erp.oms.service.OrderAdjustmentAttributeService;
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
@RequestMapping("/api/order-adjustment-attributes")
public class OrderAdjustmentAttributeController {

    private final OrderAdjustmentAttributeService service;

    public OrderAdjustmentAttributeController(OrderAdjustmentAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderAdjustmentAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderAdjustmentAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderAdjustmentAttribute> create(@RequestBody OrderAdjustmentAttribute entity) {
        OrderAdjustmentAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderAdjustmentAttribute update(@PathVariable Long id, @RequestBody OrderAdjustmentAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}