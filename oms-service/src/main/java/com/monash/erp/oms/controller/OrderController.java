package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CustomerOrder;
import com.monash.erp.oms.service.OrderService;
import com.monash.erp.oms.service.OrderService.OrderView;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomerOrder> listOrders() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustomerOrder getOrder(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/{id}/details")
    public OrderView getOrderDetails(@PathVariable Long id) {
        return service.getDetailedOrder(id);
    }

    @PostMapping
    public ResponseEntity<CustomerOrder> create(@Valid @RequestBody CustomerOrder order) {
        order.setId(null);
        CustomerOrder created = service.create(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustomerOrder update(@PathVariable Long id, @Valid @RequestBody CustomerOrder order) {
        return service.update(id, order);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleNotFound(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
