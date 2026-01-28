package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderContactMech;
import com.monash.erp.oms.service.OrderContactMechService;
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
@RequestMapping("/api/order-contact-meches")
public class OrderContactMechController {

    private final OrderContactMechService service;

    public OrderContactMechController(OrderContactMechService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderContactMech> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderContactMech get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderContactMech> create(@RequestBody OrderContactMech entity) {
        OrderContactMech created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderContactMech update(@PathVariable Long id, @RequestBody OrderContactMech entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}