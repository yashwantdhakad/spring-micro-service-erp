package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderItemBilling;
import com.monash.erp.oms.service.OrderItemBillingService;
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
@RequestMapping("/ofbiz/order-item-billings")
public class OrderItemBillingController {

    private final OrderItemBillingService orderItemBillingService;

    public OrderItemBillingController(OrderItemBillingService orderItemBillingService) {
        this.orderItemBillingService = orderItemBillingService;
    }

    @GetMapping
    public List<OrderItemBilling> list() {
        return orderItemBillingService.list();
    }

    @GetMapping("/{id}")
    public OrderItemBilling get(@PathVariable Long id) {
        return orderItemBillingService.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderItemBilling> create(@RequestBody OrderItemBilling entity) {
        OrderItemBilling created = orderItemBillingService.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderItemBilling update(@PathVariable Long id, @RequestBody OrderItemBilling entity) {
        return orderItemBillingService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        orderItemBillingService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
