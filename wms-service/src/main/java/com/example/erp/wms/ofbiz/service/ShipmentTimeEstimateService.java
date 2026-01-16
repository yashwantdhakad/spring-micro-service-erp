package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ShipmentTimeEstimate;
import com.example.erp.wms.ofbiz.repository.ShipmentTimeEstimateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentTimeEstimateService {

    private final ShipmentTimeEstimateRepository repository;

    public ShipmentTimeEstimateService(ShipmentTimeEstimateRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentTimeEstimate> list() {
        return repository.findAll();
    }

    public ShipmentTimeEstimate get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentTimeEstimate %d not found".formatted(id)));
    }

    public ShipmentTimeEstimate create(ShipmentTimeEstimate entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentTimeEstimate update(Long id, ShipmentTimeEstimate entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentTimeEstimate %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}