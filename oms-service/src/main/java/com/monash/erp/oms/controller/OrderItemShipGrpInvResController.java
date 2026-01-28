package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderItemShipGrpInvRes;
import com.monash.erp.oms.service.OrderItemShipGrpInvResService;
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
@RequestMapping("/api/order-item-ship-grp-inv-reses")
public class OrderItemShipGrpInvResController {

    private final OrderItemShipGrpInvResService service;

    public OrderItemShipGrpInvResController(OrderItemShipGrpInvResService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderItemShipGrpInvRes> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderItemShipGrpInvRes get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderItemShipGrpInvRes> create(@RequestBody OrderItemShipGrpInvRes entity) {
        OrderItemShipGrpInvRes created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderItemShipGrpInvRes update(@PathVariable Long id, @RequestBody OrderItemShipGrpInvRes entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}