package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.AbleOrderApprovalTier;
import com.monash.erp.wms.service.AbleOrderApprovalTierService;
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
@RequestMapping("/api/able-order-approval-tiers")
public class AbleOrderApprovalTierController {

    private final AbleOrderApprovalTierService service;

    public AbleOrderApprovalTierController(AbleOrderApprovalTierService service) {
        this.service = service;
    }

    @GetMapping
    public List<AbleOrderApprovalTier> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AbleOrderApprovalTier get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AbleOrderApprovalTier> create(@RequestBody AbleOrderApprovalTier entity) {
        AbleOrderApprovalTier created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AbleOrderApprovalTier update(@PathVariable Long id, @RequestBody AbleOrderApprovalTier entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}