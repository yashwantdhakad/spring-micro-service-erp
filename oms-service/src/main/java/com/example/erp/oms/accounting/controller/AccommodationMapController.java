package com.example.erp.oms.accounting.controller;

import com.example.erp.oms.accounting.domain.AccommodationMap;
import com.example.erp.oms.accounting.service.AccommodationMapService;
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
@RequestMapping("/accounting/accommodation-maps")
public class AccommodationMapController {

    private final AccommodationMapService service;

    public AccommodationMapController(AccommodationMapService service) {
        this.service = service;
    }

    @GetMapping
    public List<AccommodationMap> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AccommodationMap get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AccommodationMap> create(@RequestBody AccommodationMap entity) {
        AccommodationMap created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AccommodationMap update(@PathVariable Long id, @RequestBody AccommodationMap entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
