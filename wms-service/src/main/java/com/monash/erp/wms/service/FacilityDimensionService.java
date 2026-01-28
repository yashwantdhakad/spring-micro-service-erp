package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityDimension;
import com.monash.erp.wms.repository.FacilityDimensionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityDimensionService {

    private final FacilityDimensionRepository repository;

    public FacilityDimensionService(FacilityDimensionRepository repository) {
        this.repository = repository;
    }

    public List<FacilityDimension> list() {
        return repository.findAll();
    }

    public FacilityDimension get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityDimension %d not found".formatted(id)));
    }

    public FacilityDimension create(FacilityDimension entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityDimension update(Long id, FacilityDimension entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityDimension %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}