package com.example.erp.oms.common.controller;

import com.example.erp.oms.common.domain.PeriodType;
import com.example.erp.oms.common.service.PeriodTypeService;
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
@RequestMapping("/common/period-types")
public class PeriodTypeController {

    private final PeriodTypeService service;

    public PeriodTypeController(PeriodTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PeriodType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PeriodType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PeriodType> create(@RequestBody PeriodType entity) {
        PeriodType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PeriodType update(@PathVariable Long id, @RequestBody PeriodType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
