package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.OrderFinishedGoodsShipment;
import com.monash.erp.oms.service.OrderFinishedGoodsShipmentService;
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
@RequestMapping("/api/order-finished-goods-shipments")
public class OrderFinishedGoodsShipmentController {

    private final OrderFinishedGoodsShipmentService service;

    public OrderFinishedGoodsShipmentController(OrderFinishedGoodsShipmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderFinishedGoodsShipment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public OrderFinishedGoodsShipment get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<OrderFinishedGoodsShipment> create(@RequestBody OrderFinishedGoodsShipment entity) {
        OrderFinishedGoodsShipment created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public OrderFinishedGoodsShipment update(@PathVariable Long id, @RequestBody OrderFinishedGoodsShipment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}