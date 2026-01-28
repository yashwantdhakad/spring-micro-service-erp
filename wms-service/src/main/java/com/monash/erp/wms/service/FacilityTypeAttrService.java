package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityTypeAttr;
import com.monash.erp.wms.repository.FacilityTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityTypeAttrService {

    private final FacilityTypeAttrRepository repository;

    public FacilityTypeAttrService(FacilityTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<FacilityTypeAttr> list() {
        return repository.findAll();
    }

    public FacilityTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityTypeAttr %d not found".formatted(id)));
    }

    public FacilityTypeAttr create(FacilityTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityTypeAttr update(Long id, FacilityTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}