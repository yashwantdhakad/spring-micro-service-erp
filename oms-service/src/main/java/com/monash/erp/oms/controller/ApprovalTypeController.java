package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.ApprovalType;
import com.monash.erp.oms.service.ApprovalTypeService;
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
@RequestMapping("/api/approval-types")
public class ApprovalTypeController {

    private final ApprovalTypeService service;

    public ApprovalTypeController(ApprovalTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ApprovalType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ApprovalType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ApprovalType> create(@RequestBody ApprovalType entity) {
        ApprovalType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ApprovalType update(@PathVariable Long id, @RequestBody ApprovalType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}