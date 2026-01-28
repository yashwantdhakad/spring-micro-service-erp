package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderHeaderWorkEffort;
import com.monash.erp.oms.service.OrderHeaderWorkEffortService;
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
@RequestMapping("/api/order-header-work-efforts")
public class OrderHeaderWorkEffortController {

    private final OrderHeaderWorkEffortService service;

    public OrderHeaderWorkEffortController(OrderHeaderWorkEffortService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderHeaderWorkEffort> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderHeaderWorkEffort get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderHeaderWorkEffort> create(@RequestBody OrderHeaderWorkEffort entity) {
        OrderHeaderWorkEffort created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderHeaderWorkEffort update(@PathVariable Long id, @RequestBody OrderHeaderWorkEffort entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}