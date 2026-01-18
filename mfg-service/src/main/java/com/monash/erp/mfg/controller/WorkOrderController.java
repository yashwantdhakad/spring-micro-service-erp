package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkOrder;
import com.monash.erp.mfg.service.WorkOrderService;
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
@RequestMapping("/work-orders")
public class WorkOrderController {

    private final WorkOrderService service;

    public WorkOrderController(WorkOrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkOrder> listWorkOrders() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkOrder getWorkOrder(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/by-product/{sku}")
    public List<WorkOrder> findBySku(@PathVariable String sku) {
        return service.findBySku(sku);
    }

    @PostMapping
    public ResponseEntity<WorkOrder> create(@Valid @RequestBody WorkOrder workOrder) {
        workOrder.setId(null);
        WorkOrder created = service.create(workOrder);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkOrder update(@PathVariable Long id, @Valid @RequestBody WorkOrder workOrder) {
        return service.update(id, workOrder);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
