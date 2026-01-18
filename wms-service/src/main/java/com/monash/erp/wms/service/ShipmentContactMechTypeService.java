package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShipmentContactMechType;
import com.monash.erp.wms.repository.ShipmentContactMechTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentContactMechTypeService {

    private final ShipmentContactMechTypeRepository repository;

    public ShipmentContactMechTypeService(ShipmentContactMechTypeRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentContactMechType> list() {
        return repository.findAll();
    }

    public ShipmentContactMechType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentContactMechType %d not found".formatted(id)));
    }

    public ShipmentContactMechType create(ShipmentContactMechType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentContactMechType update(Long id, ShipmentContactMechType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentContactMechType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}