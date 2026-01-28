package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderItemGroup;
import com.monash.erp.oms.service.OrderItemGroupService;
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
@RequestMapping("/api/order-item-groups")
public class OrderItemGroupController {

    private final OrderItemGroupService service;

    public OrderItemGroupController(OrderItemGroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderItemGroup> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderItemGroup get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderItemGroup> create(@RequestBody OrderItemGroup entity) {
        OrderItemGroup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderItemGroup update(@PathVariable Long id, @RequestBody OrderItemGroup entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}