package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.TrackingCodeOrder;
import com.monash.erp.wms.service.TrackingCodeOrderService;
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
@RequestMapping("/api/tracking-code-orders")
public class TrackingCodeOrderController {

    private final TrackingCodeOrderService service;

    public TrackingCodeOrderController(TrackingCodeOrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<TrackingCodeOrder> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TrackingCodeOrder get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TrackingCodeOrder> create(@RequestBody TrackingCodeOrder entity) {
        TrackingCodeOrder created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TrackingCodeOrder update(@PathVariable Long id, @RequestBody TrackingCodeOrder entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}