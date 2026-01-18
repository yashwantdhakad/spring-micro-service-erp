package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShipmentStatus;
import com.monash.erp.wms.repository.ShipmentStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentStatusService {

    private final ShipmentStatusRepository repository;

    public ShipmentStatusService(ShipmentStatusRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentStatus> list() {
        return repository.findAll();
    }

    public ShipmentStatus get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentStatus %d not found".formatted(id)));
    }

    public ShipmentStatus create(ShipmentStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentStatus update(Long id, ShipmentStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}