package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderAdjustmentTypeAttr;
import com.monash.erp.oms.service.OrderAdjustmentTypeAttrService;
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
@RequestMapping("/api/order-adjustment-type-attrs")
public class OrderAdjustmentTypeAttrController {

    private final OrderAdjustmentTypeAttrService service;

    public OrderAdjustmentTypeAttrController(OrderAdjustmentTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderAdjustmentTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderAdjustmentTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderAdjustmentTypeAttr> create(@RequestBody OrderAdjustmentTypeAttr entity) {
        OrderAdjustmentTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderAdjustmentTypeAttr update(@PathVariable Long id, @RequestBody OrderAdjustmentTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}