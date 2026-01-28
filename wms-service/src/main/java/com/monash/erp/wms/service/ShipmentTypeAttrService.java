package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShipmentTypeAttr;
import com.monash.erp.wms.repository.ShipmentTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentTypeAttrService {

    private final ShipmentTypeAttrRepository repository;

    public ShipmentTypeAttrService(ShipmentTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentTypeAttr> list() {
        return repository.findAll();
    }

    public ShipmentTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentTypeAttr %d not found".formatted(id)));
    }

    public ShipmentTypeAttr create(ShipmentTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentTypeAttr update(Long id, ShipmentTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}