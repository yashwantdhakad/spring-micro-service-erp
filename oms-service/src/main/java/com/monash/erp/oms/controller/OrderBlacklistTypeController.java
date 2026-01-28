package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderBlacklistType;
import com.monash.erp.oms.service.OrderBlacklistTypeService;
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
@RequestMapping("/api/order-blacklist-types")
public class OrderBlacklistTypeController {

    private final OrderBlacklistTypeService service;

    public OrderBlacklistTypeController(OrderBlacklistTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderBlacklistType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderBlacklistType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderBlacklistType> create(@RequestBody OrderBlacklistType entity) {
        OrderBlacklistType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderBlacklistType update(@PathVariable Long id, @RequestBody OrderBlacklistType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}