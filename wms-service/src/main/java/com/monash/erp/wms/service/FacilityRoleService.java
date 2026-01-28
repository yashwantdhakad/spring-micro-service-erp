package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityRole;
import com.monash.erp.wms.repository.FacilityRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityRoleService {

    private final FacilityRoleRepository repository;

    public FacilityRoleService(FacilityRoleRepository repository) {
        this.repository = repository;
    }

    public List<FacilityRole> list() {
        return repository.findAll();
    }

    public FacilityRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityRole %d not found".formatted(id)));
    }

    public FacilityRole create(FacilityRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityRole update(Long id, FacilityRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}