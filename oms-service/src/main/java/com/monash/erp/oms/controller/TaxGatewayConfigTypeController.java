package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.TaxGatewayConfigType;
import com.monash.erp.oms.service.TaxGatewayConfigTypeService;
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
@RequestMapping("/api/tax-gateway-config-types")
public class TaxGatewayConfigTypeController {

    private final TaxGatewayConfigTypeService service;

    public TaxGatewayConfigTypeController(TaxGatewayConfigTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<TaxGatewayConfigType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TaxGatewayConfigType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TaxGatewayConfigType> create(@RequestBody TaxGatewayConfigType entity) {
        TaxGatewayConfigType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TaxGatewayConfigType update(@PathVariable Long id, @RequestBody TaxGatewayConfigType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}