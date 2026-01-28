package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityGroup;
import com.monash.erp.wms.repository.FacilityGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityGroupService {

    private final FacilityGroupRepository repository;

    public FacilityGroupService(FacilityGroupRepository repository) {
        this.repository = repository;
    }

    public List<FacilityGroup> list() {
        return repository.findAll();
    }

    public FacilityGroup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityGroup %d not found".formatted(id)));
    }

    public FacilityGroup create(FacilityGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityGroup update(Long id, FacilityGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}