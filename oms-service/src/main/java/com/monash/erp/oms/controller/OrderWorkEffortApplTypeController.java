package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderWorkEffortApplType;
import com.monash.erp.oms.service.OrderWorkEffortApplTypeService;
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
@RequestMapping("/api/order-work-effort-appl-types")
public class OrderWorkEffortApplTypeController {

    private final OrderWorkEffortApplTypeService service;

    public OrderWorkEffortApplTypeController(OrderWorkEffortApplTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderWorkEffortApplType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderWorkEffortApplType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderWorkEffortApplType> create(@RequestBody OrderWorkEffortApplType entity) {
        OrderWorkEffortApplType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderWorkEffortApplType update(@PathVariable Long id, @RequestBody OrderWorkEffortApplType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}