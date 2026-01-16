package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ShipmentGatewayDhl;
import com.example.erp.wms.ofbiz.repository.ShipmentGatewayDhlRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentGatewayDhlService {

    private final ShipmentGatewayDhlRepository repository;

    public ShipmentGatewayDhlService(ShipmentGatewayDhlRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentGatewayDhl> list() {
        return repository.findAll();
    }

    public ShipmentGatewayDhl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentGatewayDhl %d not found".formatted(id)));
    }

    public ShipmentGatewayDhl create(ShipmentGatewayDhl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentGatewayDhl update(Long id, ShipmentGatewayDhl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentGatewayDhl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}