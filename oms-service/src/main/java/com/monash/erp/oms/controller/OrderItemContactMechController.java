package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderItemContactMech;
import com.monash.erp.oms.service.OrderItemContactMechService;
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
@RequestMapping("/api/order-item-contact-meches")
public class OrderItemContactMechController {

    private final OrderItemContactMechService service;

    public OrderItemContactMechController(OrderItemContactMechService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderItemContactMech> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderItemContactMech get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderItemContactMech> create(@RequestBody OrderItemContactMech entity) {
        OrderItemContactMech created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderItemContactMech update(@PathVariable Long id, @RequestBody OrderItemContactMech entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}