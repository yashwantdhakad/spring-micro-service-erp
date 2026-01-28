package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderProductPromoCode;
import com.monash.erp.oms.service.OrderProductPromoCodeService;
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
@RequestMapping("/api/order-product-promo-codes")
public class OrderProductPromoCodeController {

    private final OrderProductPromoCodeService service;

    public OrderProductPromoCodeController(OrderProductPromoCodeService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderProductPromoCode> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderProductPromoCode get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderProductPromoCode> create(@RequestBody OrderProductPromoCode entity) {
        OrderProductPromoCode created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderProductPromoCode update(@PathVariable Long id, @RequestBody OrderProductPromoCode entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}