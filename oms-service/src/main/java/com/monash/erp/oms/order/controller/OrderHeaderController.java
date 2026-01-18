package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderHeader;
import com.monash.erp.oms.service.OrderHeaderService;
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
@RequestMapping("/ofbiz/order-headers")
public class OrderHeaderController {

    private final OrderHeaderService orderHeaderService;

    public OrderHeaderController(OrderHeaderService orderHeaderService) {
        this.orderHeaderService = orderHeaderService;
    }

    @GetMapping
    public List<OrderHeader> list() {
        return orderHeaderService.list();
    }

    @GetMapping("/{id}")
    public OrderHeader get(@PathVariable Long id) {
        return orderHeaderService.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderHeader> create(@RequestBody OrderHeader entity) {
        OrderHeader created = orderHeaderService.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderHeader update(@PathVariable Long id, @RequestBody OrderHeader entity) {
        return orderHeaderService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        orderHeaderService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
