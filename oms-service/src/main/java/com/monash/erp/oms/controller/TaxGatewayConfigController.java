package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.TaxGatewayConfig;
import com.monash.erp.oms.service.TaxGatewayConfigService;
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
@RequestMapping("/api/tax-gateway-configs")
public class TaxGatewayConfigController {

    private final TaxGatewayConfigService service;

    public TaxGatewayConfigController(TaxGatewayConfigService service) {
        this.service = service;
    }

    @GetMapping
    public List<TaxGatewayConfig> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TaxGatewayConfig get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TaxGatewayConfig> create(@RequestBody TaxGatewayConfig entity) {
        TaxGatewayConfig created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TaxGatewayConfig update(@PathVariable Long id, @RequestBody TaxGatewayConfig entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}