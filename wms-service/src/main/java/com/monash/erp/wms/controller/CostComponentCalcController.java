package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.CostComponentCalc;
import com.monash.erp.wms.service.CostComponentCalcService;
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
@RequestMapping("/api/cost-component-calcs")
public class CostComponentCalcController {

    private final CostComponentCalcService service;

    public CostComponentCalcController(CostComponentCalcService service) {
        this.service = service;
    }

    @GetMapping
    public List<CostComponentCalc> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CostComponentCalc get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CostComponentCalc> create(@RequestBody CostComponentCalc entity) {
        CostComponentCalc created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CostComponentCalc update(@PathVariable Long id, @RequestBody CostComponentCalc entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}