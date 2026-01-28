package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderItemAssocType;
import com.monash.erp.oms.service.OrderItemAssocTypeService;
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
@RequestMapping("/api/order-item-assoc-types")
public class OrderItemAssocTypeController {

    private final OrderItemAssocTypeService service;

    public OrderItemAssocTypeController(OrderItemAssocTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderItemAssocType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderItemAssocType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderItemAssocType> create(@RequestBody OrderItemAssocType entity) {
        OrderItemAssocType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderItemAssocType update(@PathVariable Long id, @RequestBody OrderItemAssocType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}