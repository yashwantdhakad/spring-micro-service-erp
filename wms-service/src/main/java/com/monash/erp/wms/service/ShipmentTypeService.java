package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShipmentType;
import com.monash.erp.wms.repository.ShipmentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentTypeService {

    private final ShipmentTypeRepository repository;

    public ShipmentTypeService(ShipmentTypeRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentType> list() {
        return repository.findAll();
    }

    public ShipmentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentType %d not found".formatted(id)));
    }

    public ShipmentType create(ShipmentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentType update(Long id, ShipmentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}