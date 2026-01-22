package com.monash.erp.oms.order.controller;

import com.monash.erp.oms.order.entity.OrderAdjustment;
import com.monash.erp.oms.order.service.OrderAdjustmentService;
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

    private final OrderAdjustmentService orderAdjustmentService;

    public OrderAdjustmentController(OrderAdjustmentService orderAdjustmentService) {
        this.orderAdjustmentService = orderAdjustmentService;
    }

    @GetMapping
    public List<OrderAdjustment> list() {
        return orderAdjustmentService.list();
    }

    @GetMapping("/{id}")
    public OrderAdjustment get(@PathVariable Long id) {
        return orderAdjustmentService.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderAdjustment> create(@RequestBody OrderAdjustment entity) {
        OrderAdjustment created = orderAdjustmentService.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderAdjustment update(@PathVariable Long id, @RequestBody OrderAdjustment entity) {
        return orderAdjustmentService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        orderAdjustmentService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
