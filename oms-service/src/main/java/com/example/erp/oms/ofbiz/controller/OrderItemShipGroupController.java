package com.example.erp.oms.ofbiz.controller;

import com.example.erp.oms.ofbiz.domain.OrderItemShipGroup;
import com.example.erp.oms.ofbiz.service.OrderItemShipGroupService;
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
@RequestMapping("/ofbiz/order-item-ship-groups")
public class OrderItemShipGroupController {

    private final OrderItemShipGroupService orderItemShipGroupService;

    public OrderItemShipGroupController(OrderItemShipGroupService orderItemShipGroupService) {
        this.orderItemShipGroupService = orderItemShipGroupService;
    }

    @GetMapping
    public List<OrderItemShipGroup> list() {
        return orderItemShipGroupService.list();
    }

    @GetMapping("/{id}")
    public OrderItemShipGroup get(@PathVariable Long id) {
        return orderItemShipGroupService.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderItemShipGroup> create(@RequestBody OrderItemShipGroup entity) {
        OrderItemShipGroup created = orderItemShipGroupService.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderItemShipGroup update(@PathVariable Long id, @RequestBody OrderItemShipGroup entity) {
        return orderItemShipGroupService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        orderItemShipGroupService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
