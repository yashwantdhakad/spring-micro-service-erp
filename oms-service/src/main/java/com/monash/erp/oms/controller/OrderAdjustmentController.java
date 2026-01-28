package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderAdjustment;
import com.monash.erp.oms.service.OrderAdjustmentService;
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
@RequestMapping("/api/order-adjustments")
public class OrderAdjustmentController {

    private final OrderAdjustmentService service;

    public OrderAdjustmentController(OrderAdjustmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderAdjustment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderAdjustment get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderAdjustment> create(@RequestBody OrderAdjustment entity) {
        OrderAdjustment created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderAdjustment update(@PathVariable Long id, @RequestBody OrderAdjustment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}