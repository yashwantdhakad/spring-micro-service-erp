package com.monash.erp.oms.order.controller;

import com.monash.erp.oms.order.entity.OrderItem;
import com.monash.erp.oms.order.service.OrderItemService;
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
@RequestMapping("/api/order-items")
public class OrderItemController {

    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping
    public List<OrderItem> list() {
        return orderItemService.list();
    }

    @GetMapping("/{id}")
    public OrderItem get(@PathVariable Long id) {
        return orderItemService.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderItem> create(@RequestBody OrderItem entity) {
        OrderItem created = orderItemService.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderItem update(@PathVariable Long id, @RequestBody OrderItem entity) {
        return orderItemService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        orderItemService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
