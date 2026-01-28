package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.BenefitType;
import com.monash.erp.wms.service.BenefitTypeService;
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
@RequestMapping("/api/benefit-types")
public class BenefitTypeController {

    private final BenefitTypeService service;

    public BenefitTypeController(BenefitTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<BenefitType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public BenefitType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<BenefitType> create(@RequestBody BenefitType entity) {
        BenefitType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public BenefitType update(@PathVariable Long id, @RequestBody BenefitType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}