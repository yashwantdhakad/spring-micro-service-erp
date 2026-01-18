package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShipmentAttribute;
import com.monash.erp.wms.repository.ShipmentAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentAttributeService {

    private final ShipmentAttributeRepository repository;

    public ShipmentAttributeService(ShipmentAttributeRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentAttribute> list() {
        return repository.findAll();
    }

    public ShipmentAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentAttribute %d not found".formatted(id)));
    }

    public ShipmentAttribute create(ShipmentAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentAttribute update(Long id, ShipmentAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}