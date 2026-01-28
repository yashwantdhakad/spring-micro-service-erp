package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.RequirementCustRequest;
import com.monash.erp.wms.service.RequirementCustRequestService;
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
@RequestMapping("/api/requirement-cust-requests")
public class RequirementCustRequestController {

    private final RequirementCustRequestService service;

    public RequirementCustRequestController(RequirementCustRequestService service) {
        this.service = service;
    }

    @GetMapping
    public List<RequirementCustRequest> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public RequirementCustRequest get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<RequirementCustRequest> create(@RequestBody RequirementCustRequest entity) {
        RequirementCustRequest created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public RequirementCustRequest update(@PathVariable Long id, @RequestBody RequirementCustRequest entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}