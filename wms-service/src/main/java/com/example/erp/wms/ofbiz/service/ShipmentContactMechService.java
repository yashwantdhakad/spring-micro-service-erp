package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ShipmentContactMech;
import com.example.erp.wms.ofbiz.repository.ShipmentContactMechRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentContactMechService {

    private final ShipmentContactMechRepository repository;

    public ShipmentContactMechService(ShipmentContactMechRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentContactMech> list() {
        return repository.findAll();
    }

    public ShipmentContactMech get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentContactMech %d not found".formatted(id)));
    }

    public ShipmentContactMech create(ShipmentContactMech entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentContactMech update(Long id, ShipmentContactMech entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentContactMech %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}