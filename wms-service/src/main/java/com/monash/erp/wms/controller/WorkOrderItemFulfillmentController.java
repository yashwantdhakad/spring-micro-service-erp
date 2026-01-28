package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.WorkOrderItemFulfillment;
import com.monash.erp.wms.service.WorkOrderItemFulfillmentService;
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
@RequestMapping("/api/work-order-item-fulfillments")
public class WorkOrderItemFulfillmentController {

    private final WorkOrderItemFulfillmentService service;

    public WorkOrderItemFulfillmentController(WorkOrderItemFulfillmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkOrderItemFulfillment> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkOrderItemFulfillment get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkOrderItemFulfillment> create(@RequestBody WorkOrderItemFulfillment entity) {
        WorkOrderItemFulfillment created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkOrderItemFulfillment update(@PathVariable Long id, @RequestBody WorkOrderItemFulfillment entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}