package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.TelecomGatewayConfig;
import com.monash.erp.oms.common.service.TelecomGatewayConfigService;
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
@RequestMapping("/api/common/telecom-gateway-configs")
public class TelecomGatewayConfigController {

    private final TelecomGatewayConfigService service;

    public TelecomGatewayConfigController(TelecomGatewayConfigService service) {
        this.service = service;
    }

    @GetMapping
    public List<TelecomGatewayConfig> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TelecomGatewayConfig get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TelecomGatewayConfig> create(@RequestBody TelecomGatewayConfig entity) {
        TelecomGatewayConfig created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TelecomGatewayConfig update(@PathVariable Long id, @RequestBody TelecomGatewayConfig entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
