package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShipmentMethodType;
import com.monash.erp.wms.repository.ShipmentMethodTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentMethodTypeService {

    private final ShipmentMethodTypeRepository repository;

    public ShipmentMethodTypeService(ShipmentMethodTypeRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentMethodType> list() {
        return repository.findAll();
    }

    public ShipmentMethodType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentMethodType %d not found".formatted(id)));
    }

    public ShipmentMethodType create(ShipmentMethodType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentMethodType update(Long id, ShipmentMethodType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentMethodType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}