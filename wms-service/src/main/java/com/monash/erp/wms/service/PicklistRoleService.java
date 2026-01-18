package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PicklistRole;
import com.monash.erp.wms.repository.PicklistRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PicklistRoleService {

    private final PicklistRoleRepository repository;

    public PicklistRoleService(PicklistRoleRepository repository) {
        this.repository = repository;
    }

    public List<PicklistRole> list() {
        return repository.findAll();
    }

    public PicklistRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PicklistRole %d not found".formatted(id)));
    }

    public PicklistRole create(PicklistRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PicklistRole update(Long id, PicklistRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PicklistRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}