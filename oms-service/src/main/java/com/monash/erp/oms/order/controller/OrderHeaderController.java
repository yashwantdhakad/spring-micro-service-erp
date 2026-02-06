package com.monash.erp.oms.order.controller;

import com.monash.erp.oms.order.dto.OrderHeaderDto;
import com.monash.erp.oms.order.service.OrderHeaderService;
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
@RequestMapping("/api/order-headers")
public class OrderHeaderController {

    private final OrderHeaderService orderHeaderService;

    public OrderHeaderController(OrderHeaderService orderHeaderService) {
        this.orderHeaderService = orderHeaderService;
    }

    @GetMapping
    public List<OrderHeaderDto> list() {
        return orderHeaderService.list();
    }

    @GetMapping("/{id}")
    public OrderHeaderDto get(@PathVariable Long id) {
        return orderHeaderService.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderHeaderDto> create(@RequestBody OrderHeaderDto dto) {
        OrderHeaderDto created = orderHeaderService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderHeaderDto update(@PathVariable Long id, @RequestBody OrderHeaderDto dto) {
        return orderHeaderService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        orderHeaderService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
