package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityGroupRollup;
import com.monash.erp.wms.repository.FacilityGroupRollupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityGroupRollupService {

    private final FacilityGroupRollupRepository repository;

    public FacilityGroupRollupService(FacilityGroupRollupRepository repository) {
        this.repository = repository;
    }

    public List<FacilityGroupRollup> list() {
        return repository.findAll();
    }

    public FacilityGroupRollup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityGroupRollup %d not found".formatted(id)));
    }

    public FacilityGroupRollup create(FacilityGroupRollup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityGroupRollup update(Long id, FacilityGroupRollup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityGroupRollup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}