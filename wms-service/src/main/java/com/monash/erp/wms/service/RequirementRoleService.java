package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.RequirementRole;
import com.monash.erp.wms.repository.RequirementRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RequirementRoleService {

    private final RequirementRoleRepository repository;

    public RequirementRoleService(RequirementRoleRepository repository) {
        this.repository = repository;
    }

    public List<RequirementRole> list() {
        return repository.findAll();
    }

    public RequirementRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementRole %d not found".formatted(id)));
    }

    public RequirementRole create(RequirementRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RequirementRole update(Long id, RequirementRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}