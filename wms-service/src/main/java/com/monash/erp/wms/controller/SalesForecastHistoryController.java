package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SalesForecastHistory;
import com.monash.erp.wms.service.SalesForecastHistoryService;
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
@RequestMapping("/api/sales-forecast-histories")
public class SalesForecastHistoryController {

    private final SalesForecastHistoryService service;

    public SalesForecastHistoryController(SalesForecastHistoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<SalesForecastHistory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SalesForecastHistory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SalesForecastHistory> create(@RequestBody SalesForecastHistory entity) {
        SalesForecastHistory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SalesForecastHistory update(@PathVariable Long id, @RequestBody SalesForecastHistory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}