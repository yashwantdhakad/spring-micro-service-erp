package com.example.erp.oms.ofbiz.controller;

import com.example.erp.oms.ofbiz.domain.OrderItemShipGroupAssoc;
import com.example.erp.oms.ofbiz.service.OrderItemShipGroupAssocService;
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
@RequestMapping("/ofbiz/order-item-ship-group-assocs")
public class OrderItemShipGroupAssocController {

    private final OrderItemShipGroupAssocService orderItemShipGroupAssocService;

    public OrderItemShipGroupAssocController(OrderItemShipGroupAssocService orderItemShipGroupAssocService) {
        this.orderItemShipGroupAssocService = orderItemShipGroupAssocService;
    }

    @GetMapping
    public List<OrderItemShipGroupAssoc> list() {
        return orderItemShipGroupAssocService.list();
    }

    @GetMapping("/{id}")
    public OrderItemShipGroupAssoc get(@PathVariable Long id) {
        return orderItemShipGroupAssocService.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderItemShipGroupAssoc> create(@RequestBody OrderItemShipGroupAssoc entity) {
        OrderItemShipGroupAssoc created = orderItemShipGroupAssocService.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderItemShipGroupAssoc update(@PathVariable Long id, @RequestBody OrderItemShipGroupAssoc entity) {
        return orderItemShipGroupAssocService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        orderItemShipGroupAssocService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
