package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.Facility;
import com.example.erp.wms.ofbiz.repository.FacilityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityService {

    private final FacilityRepository repository;

    public FacilityService(FacilityRepository repository) {
        this.repository = repository;
    }

    public List<Facility> list() {
        return repository.findAll();
    }

    public Facility get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Facility %d not found".formatted(id)));
    }

    public Facility create(Facility entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Facility update(Long id, Facility entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Facility %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}