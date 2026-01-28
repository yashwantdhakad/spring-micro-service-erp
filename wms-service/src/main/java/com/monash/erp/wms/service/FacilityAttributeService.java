package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityAttribute;
import com.monash.erp.wms.repository.FacilityAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityAttributeService {

    private final FacilityAttributeRepository repository;

    public FacilityAttributeService(FacilityAttributeRepository repository) {
        this.repository = repository;
    }

    public List<FacilityAttribute> list() {
        return repository.findAll();
    }

    public FacilityAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityAttribute %d not found".formatted(id)));
    }

    public FacilityAttribute create(FacilityAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityAttribute update(Long id, FacilityAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}