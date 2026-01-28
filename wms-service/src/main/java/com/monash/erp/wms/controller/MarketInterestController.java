package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.MarketInterest;
import com.monash.erp.wms.service.MarketInterestService;
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
@RequestMapping("/api/market-interests")
public class MarketInterestController {

    private final MarketInterestService service;

    public MarketInterestController(MarketInterestService service) {
        this.service = service;
    }

    @GetMapping
    public List<MarketInterest> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public MarketInterest get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<MarketInterest> create(@RequestBody MarketInterest entity) {
        MarketInterest created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public MarketInterest update(@PathVariable Long id, @RequestBody MarketInterest entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}