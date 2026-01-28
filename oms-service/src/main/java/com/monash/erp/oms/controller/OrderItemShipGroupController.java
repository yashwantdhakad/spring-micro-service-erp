package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderItemShipGroup;
import com.monash.erp.oms.service.OrderItemShipGroupService;
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
@RequestMapping("/api/order-item-ship-groups")
public class OrderItemShipGroupController {

    private final OrderItemShipGroupService service;

    public OrderItemShipGroupController(OrderItemShipGroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderItemShipGroup> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderItemShipGroup get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderItemShipGroup> create(@RequestBody OrderItemShipGroup entity) {
        OrderItemShipGroup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderItemShipGroup update(@PathVariable Long id, @RequestBody OrderItemShipGroup entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}