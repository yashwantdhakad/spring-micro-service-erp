package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderWorkEffortAppl;
import com.monash.erp.oms.service.OrderWorkEffortApplService;
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
@RequestMapping("/api/order-work-effort-appls")
public class OrderWorkEffortApplController {

    private final OrderWorkEffortApplService service;

    public OrderWorkEffortApplController(OrderWorkEffortApplService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderWorkEffortAppl> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderWorkEffortAppl get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderWorkEffortAppl> create(@RequestBody OrderWorkEffortAppl entity) {
        OrderWorkEffortAppl created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderWorkEffortAppl update(@PathVariable Long id, @RequestBody OrderWorkEffortAppl entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}