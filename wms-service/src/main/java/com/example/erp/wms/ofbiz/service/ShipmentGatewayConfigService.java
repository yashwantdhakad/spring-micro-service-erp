package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ShipmentGatewayConfig;
import com.example.erp.wms.ofbiz.repository.ShipmentGatewayConfigRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentGatewayConfigService {

    private final ShipmentGatewayConfigRepository repository;

    public ShipmentGatewayConfigService(ShipmentGatewayConfigRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentGatewayConfig> list() {
        return repository.findAll();
    }

    public ShipmentGatewayConfig get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentGatewayConfig %d not found".formatted(id)));
    }

    public ShipmentGatewayConfig create(ShipmentGatewayConfig entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentGatewayConfig update(Long id, ShipmentGatewayConfig entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentGatewayConfig %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}