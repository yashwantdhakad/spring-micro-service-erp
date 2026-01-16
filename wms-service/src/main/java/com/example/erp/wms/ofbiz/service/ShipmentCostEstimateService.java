package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ShipmentCostEstimate;
import com.example.erp.wms.ofbiz.repository.ShipmentCostEstimateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentCostEstimateService {

    private final ShipmentCostEstimateRepository repository;

    public ShipmentCostEstimateService(ShipmentCostEstimateRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentCostEstimate> list() {
        return repository.findAll();
    }

    public ShipmentCostEstimate get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentCostEstimate %d not found".formatted(id)));
    }

    public ShipmentCostEstimate create(ShipmentCostEstimate entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentCostEstimate update(Long id, ShipmentCostEstimate entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentCostEstimate %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}