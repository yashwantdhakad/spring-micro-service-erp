package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CustRequestResolution;
import com.monash.erp.oms.service.CustRequestResolutionService;
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
@RequestMapping("/api/cust-request-resolutions")
public class CustRequestResolutionController {

    private final CustRequestResolutionService service;

    public CustRequestResolutionController(CustRequestResolutionService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustRequestResolution> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustRequestResolution get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustRequestResolution> create(@RequestBody CustRequestResolution entity) {
        CustRequestResolution created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustRequestResolution update(@PathVariable Long id, @RequestBody CustRequestResolution entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}