package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.RejectionReason;
import com.monash.erp.wms.service.RejectionReasonService;
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
@RequestMapping("/ofbiz/rejection-reasons")
public class RejectionReasonController {

    private final RejectionReasonService service;

    public RejectionReasonController(RejectionReasonService service) {
        this.service = service;
    }

    @GetMapping
    public List<RejectionReason> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public RejectionReason get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<RejectionReason> create(@RequestBody RejectionReason entity) {
        RejectionReason created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public RejectionReason update(@PathVariable Long id, @RequestBody RejectionReason entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}