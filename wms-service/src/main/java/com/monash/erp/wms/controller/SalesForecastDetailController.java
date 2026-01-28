package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SalesForecastDetail;
import com.monash.erp.wms.service.SalesForecastDetailService;
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
@RequestMapping("/api/sales-forecast-details")
public class SalesForecastDetailController {

    private final SalesForecastDetailService service;

    public SalesForecastDetailController(SalesForecastDetailService service) {
        this.service = service;
    }

    @GetMapping
    public List<SalesForecastDetail> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SalesForecastDetail get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SalesForecastDetail> create(@RequestBody SalesForecastDetail entity) {
        SalesForecastDetail created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SalesForecastDetail update(@PathVariable Long id, @RequestBody SalesForecastDetail entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}