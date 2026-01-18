package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShipmentGatewayUsps;
import com.monash.erp.wms.repository.ShipmentGatewayUspsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentGatewayUspsService {

    private final ShipmentGatewayUspsRepository repository;

    public ShipmentGatewayUspsService(ShipmentGatewayUspsRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentGatewayUsps> list() {
        return repository.findAll();
    }

    public ShipmentGatewayUsps get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentGatewayUsps %d not found".formatted(id)));
    }

    public ShipmentGatewayUsps create(ShipmentGatewayUsps entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentGatewayUsps update(Long id, ShipmentGatewayUsps entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentGatewayUsps %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}