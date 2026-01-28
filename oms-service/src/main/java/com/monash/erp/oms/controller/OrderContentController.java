package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderContent;
import com.monash.erp.oms.service.OrderContentService;
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
@RequestMapping("/api/order-contents")
public class OrderContentController {

    private final OrderContentService service;

    public OrderContentController(OrderContentService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderContent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderContent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderContent> create(@RequestBody OrderContent entity) {
        OrderContent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderContent update(@PathVariable Long id, @RequestBody OrderContent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}