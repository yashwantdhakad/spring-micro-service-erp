package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SalesForecast;
import com.monash.erp.wms.service.SalesForecastService;
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
@RequestMapping("/api/sales-forecasts")
public class SalesForecastController {

    private final SalesForecastService service;

    public SalesForecastController(SalesForecastService service) {
        this.service = service;
    }

    @GetMapping
    public List<SalesForecast> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SalesForecast get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SalesForecast> create(@RequestBody SalesForecast entity) {
        SalesForecast created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SalesForecast update(@PathVariable Long id, @RequestBody SalesForecast entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}