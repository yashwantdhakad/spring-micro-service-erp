package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ItemIssuance;
import com.monash.erp.wms.service.ItemIssuanceService;
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
@RequestMapping("/api/item-issuances")
public class ItemIssuanceController {

    private final ItemIssuanceService service;

    public ItemIssuanceController(ItemIssuanceService service) {
        this.service = service;
    }

    @GetMapping
    public List<ItemIssuance> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ItemIssuance get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ItemIssuance> create(@RequestBody ItemIssuance entity) {
        ItemIssuance created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ItemIssuance update(@PathVariable Long id, @RequestBody ItemIssuance entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}