package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ShipmentGatewayUps;
import com.example.erp.wms.ofbiz.repository.ShipmentGatewayUpsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentGatewayUpsService {

    private final ShipmentGatewayUpsRepository repository;

    public ShipmentGatewayUpsService(ShipmentGatewayUpsRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentGatewayUps> list() {
        return repository.findAll();
    }

    public ShipmentGatewayUps get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentGatewayUps %d not found".formatted(id)));
    }

    public ShipmentGatewayUps create(ShipmentGatewayUps entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentGatewayUps update(Long id, ShipmentGatewayUps entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentGatewayUps %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}