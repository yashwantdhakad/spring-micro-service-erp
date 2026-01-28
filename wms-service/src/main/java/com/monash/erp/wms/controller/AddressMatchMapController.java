package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.AddressMatchMap;
import com.monash.erp.wms.service.AddressMatchMapService;
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
@RequestMapping("/api/address-match-maps")
public class AddressMatchMapController {

    private final AddressMatchMapService service;

    public AddressMatchMapController(AddressMatchMapService service) {
        this.service = service;
    }

    @GetMapping
    public List<AddressMatchMap> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AddressMatchMap get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AddressMatchMap> create(@RequestBody AddressMatchMap entity) {
        AddressMatchMap created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AddressMatchMap update(@PathVariable Long id, @RequestBody AddressMatchMap entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}