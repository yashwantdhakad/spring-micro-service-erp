package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderContent;
import com.monash.erp.oms.service.OrderContentService;
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
@RequestMapping("/ofbiz/order-contents")
public class OrderContentController {

    private final OrderContentService orderContentService;

    public OrderContentController(OrderContentService orderContentService) {
        this.orderContentService = orderContentService;
    }

    @GetMapping
    public List<OrderContent> list() {
        return orderContentService.list();
    }

    @GetMapping("/{id}")
    public OrderContent get(@PathVariable Long id) {
        return orderContentService.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderContent> create(@RequestBody OrderContent entity) {
        OrderContent created = orderContentService.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderContent update(@PathVariable Long id, @RequestBody OrderContent entity) {
        return orderContentService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        orderContentService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
