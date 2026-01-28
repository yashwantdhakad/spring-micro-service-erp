package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderTypeAttr;
import com.monash.erp.oms.service.OrderTypeAttrService;
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
@RequestMapping("/api/order-type-attrs")
public class OrderTypeAttrController {

    private final OrderTypeAttrService service;

    public OrderTypeAttrController(OrderTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderTypeAttr> create(@RequestBody OrderTypeAttr entity) {
        OrderTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderTypeAttr update(@PathVariable Long id, @RequestBody OrderTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}