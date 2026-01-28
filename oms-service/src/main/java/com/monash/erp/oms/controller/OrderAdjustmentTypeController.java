package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderAdjustmentType;
import com.monash.erp.oms.service.OrderAdjustmentTypeService;
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
@RequestMapping("/api/order-adjustment-types")
public class OrderAdjustmentTypeController {

    private final OrderAdjustmentTypeService service;

    public OrderAdjustmentTypeController(OrderAdjustmentTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderAdjustmentType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderAdjustmentType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderAdjustmentType> create(@RequestBody OrderAdjustmentType entity) {
        OrderAdjustmentType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderAdjustmentType update(@PathVariable Long id, @RequestBody OrderAdjustmentType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}