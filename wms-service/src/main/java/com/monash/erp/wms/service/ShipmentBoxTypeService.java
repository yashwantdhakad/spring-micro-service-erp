package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShipmentBoxType;
import com.monash.erp.wms.repository.ShipmentBoxTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentBoxTypeService {

    private final ShipmentBoxTypeRepository repository;

    public ShipmentBoxTypeService(ShipmentBoxTypeRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentBoxType> list() {
        return repository.findAll();
    }

    public ShipmentBoxType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentBoxType %d not found".formatted(id)));
    }

    public ShipmentBoxType create(ShipmentBoxType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentBoxType update(Long id, ShipmentBoxType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentBoxType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}