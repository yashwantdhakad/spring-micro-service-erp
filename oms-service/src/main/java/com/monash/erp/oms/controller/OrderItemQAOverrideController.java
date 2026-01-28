package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderItemQAOverride;
import com.monash.erp.oms.service.OrderItemQAOverrideService;
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
@RequestMapping("/api/order-item-qa-overrides")
public class OrderItemQAOverrideController {

    private final OrderItemQAOverrideService service;

    public OrderItemQAOverrideController(OrderItemQAOverrideService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderItemQAOverride> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderItemQAOverride get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderItemQAOverride> create(@RequestBody OrderItemQAOverride entity) {
        OrderItemQAOverride created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderItemQAOverride update(@PathVariable Long id, @RequestBody OrderItemQAOverride entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}