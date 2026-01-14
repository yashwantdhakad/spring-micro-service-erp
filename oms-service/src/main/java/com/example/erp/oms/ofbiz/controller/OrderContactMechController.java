package com.example.erp.oms.ofbiz.controller;

import com.example.erp.oms.ofbiz.domain.OrderContactMech;
import com.example.erp.oms.ofbiz.service.OrderContactMechService;
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
@RequestMapping("/ofbiz/order-contact-mechs")
public class OrderContactMechController {

    private final OrderContactMechService orderContactMechService;

    public OrderContactMechController(OrderContactMechService orderContactMechService) {
        this.orderContactMechService = orderContactMechService;
    }

    @GetMapping
    public List<OrderContactMech> list() {
        return orderContactMechService.list();
    }

    @GetMapping("/{id}")
    public OrderContactMech get(@PathVariable Long id) {
        return orderContactMechService.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderContactMech> create(@RequestBody OrderContactMech entity) {
        OrderContactMech created = orderContactMechService.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderContactMech update(@PathVariable Long id, @RequestBody OrderContactMech entity) {
        return orderContactMechService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        orderContactMechService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
