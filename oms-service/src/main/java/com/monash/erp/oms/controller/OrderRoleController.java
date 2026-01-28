package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderRole;
import com.monash.erp.oms.service.OrderRoleService;
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
@RequestMapping("/api/order-roles")
public class OrderRoleController {

    private final OrderRoleService service;

    public OrderRoleController(OrderRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderRole> create(@RequestBody OrderRole entity) {
        OrderRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderRole update(@PathVariable Long id, @RequestBody OrderRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}