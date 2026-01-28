package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityGroupRole;
import com.monash.erp.wms.repository.FacilityGroupRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityGroupRoleService {

    private final FacilityGroupRoleRepository repository;

    public FacilityGroupRoleService(FacilityGroupRoleRepository repository) {
        this.repository = repository;
    }

    public List<FacilityGroupRole> list() {
        return repository.findAll();
    }

    public FacilityGroupRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityGroupRole %d not found".formatted(id)));
    }

    public FacilityGroupRole create(FacilityGroupRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityGroupRole update(Long id, FacilityGroupRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityGroupRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}