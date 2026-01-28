package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShipmentItemFeature;
import com.monash.erp.wms.repository.ShipmentItemFeatureRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentItemFeatureService {

    private final ShipmentItemFeatureRepository repository;

    public ShipmentItemFeatureService(ShipmentItemFeatureRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentItemFeature> list() {
        return repository.findAll();
    }

    public ShipmentItemFeature get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentItemFeature %d not found".formatted(id)));
    }

    public ShipmentItemFeature create(ShipmentItemFeature entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentItemFeature update(Long id, ShipmentItemFeature entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentItemFeature %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}