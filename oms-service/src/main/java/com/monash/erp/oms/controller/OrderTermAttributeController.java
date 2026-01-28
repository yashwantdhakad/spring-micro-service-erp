package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderTermAttribute;
import com.monash.erp.oms.service.OrderTermAttributeService;
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
@RequestMapping("/api/order-term-attributes")
public class OrderTermAttributeController {

    private final OrderTermAttributeService service;

    public OrderTermAttributeController(OrderTermAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderTermAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderTermAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderTermAttribute> create(@RequestBody OrderTermAttribute entity) {
        OrderTermAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderTermAttribute update(@PathVariable Long id, @RequestBody OrderTermAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}