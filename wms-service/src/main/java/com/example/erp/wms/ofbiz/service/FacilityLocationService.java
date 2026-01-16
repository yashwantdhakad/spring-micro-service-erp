package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.FacilityLocation;
import com.example.erp.wms.ofbiz.repository.FacilityLocationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityLocationService {

    private final FacilityLocationRepository repository;

    public FacilityLocationService(FacilityLocationRepository repository) {
        this.repository = repository;
    }

    public List<FacilityLocation> list() {
        return repository.findAll();
    }

    public FacilityLocation get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityLocation %d not found".formatted(id)));
    }

    public FacilityLocation create(FacilityLocation entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityLocation update(Long id, FacilityLocation entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityLocation %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}