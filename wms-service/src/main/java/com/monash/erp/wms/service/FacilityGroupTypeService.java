package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityGroupType;
import com.monash.erp.wms.repository.FacilityGroupTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityGroupTypeService {

    private final FacilityGroupTypeRepository repository;

    public FacilityGroupTypeService(FacilityGroupTypeRepository repository) {
        this.repository = repository;
    }

    public List<FacilityGroupType> list() {
        return repository.findAll();
    }

    public FacilityGroupType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityGroupType %d not found".formatted(id)));
    }

    public FacilityGroupType create(FacilityGroupType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityGroupType update(Long id, FacilityGroupType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityGroupType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}