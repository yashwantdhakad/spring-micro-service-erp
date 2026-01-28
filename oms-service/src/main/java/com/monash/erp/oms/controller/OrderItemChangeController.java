package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderItemChange;
import com.monash.erp.oms.service.OrderItemChangeService;
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
@RequestMapping("/api/order-item-changes")
public class OrderItemChangeController {

    private final OrderItemChangeService service;

    public OrderItemChangeController(OrderItemChangeService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderItemChange> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderItemChange get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderItemChange> create(@RequestBody OrderItemChange entity) {
        OrderItemChange created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderItemChange update(@PathVariable Long id, @RequestBody OrderItemChange entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}