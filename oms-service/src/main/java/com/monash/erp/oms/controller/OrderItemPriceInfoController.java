package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderItemPriceInfo;
import com.monash.erp.oms.service.OrderItemPriceInfoService;
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
@RequestMapping("/api/order-item-price-infos")
public class OrderItemPriceInfoController {

    private final OrderItemPriceInfoService service;

    public OrderItemPriceInfoController(OrderItemPriceInfoService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderItemPriceInfo> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderItemPriceInfo get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderItemPriceInfo> create(@RequestBody OrderItemPriceInfo entity) {
        OrderItemPriceInfo created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderItemPriceInfo update(@PathVariable Long id, @RequestBody OrderItemPriceInfo entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}