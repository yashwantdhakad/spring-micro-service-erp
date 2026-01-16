package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.FacilityType;
import com.example.erp.wms.ofbiz.repository.FacilityTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityTypeService {

    private final FacilityTypeRepository repository;

    public FacilityTypeService(FacilityTypeRepository repository) {
        this.repository = repository;
    }

    public List<FacilityType> list() {
        return repository.findAll();
    }

    public FacilityType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityType %d not found".formatted(id)));
    }

    public FacilityType create(FacilityType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityType update(Long id, FacilityType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}