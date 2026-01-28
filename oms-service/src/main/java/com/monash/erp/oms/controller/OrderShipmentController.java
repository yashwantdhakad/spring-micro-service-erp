package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderShipment;
import com.monash.erp.oms.service.OrderShipmentService;
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
@RequestMapping("/api/order-shipments")
public class OrderShipmentController {

    private final OrderShipmentService service;

    public OrderShipmentController(OrderShipmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderShipment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderShipment get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderShipment> create(@RequestBody OrderShipment entity) {
        OrderShipment created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderShipment update(@PathVariable Long id, @RequestBody OrderShipment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}