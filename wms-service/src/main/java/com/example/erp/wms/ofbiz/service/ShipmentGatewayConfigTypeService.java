package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ShipmentGatewayConfigType;
import com.example.erp.wms.ofbiz.repository.ShipmentGatewayConfigTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentGatewayConfigTypeService {

    private final ShipmentGatewayConfigTypeRepository repository;

    public ShipmentGatewayConfigTypeService(ShipmentGatewayConfigTypeRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentGatewayConfigType> list() {
        return repository.findAll();
    }

    public ShipmentGatewayConfigType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentGatewayConfigType %d not found".formatted(id)));
    }

    public ShipmentGatewayConfigType create(ShipmentGatewayConfigType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentGatewayConfigType update(Long id, ShipmentGatewayConfigType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentGatewayConfigType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}