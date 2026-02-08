package com.monash.erp.oms.party.security.service;

import com.monash.erp.oms.party.security.entity.SecurityGroupPermission;
import com.monash.erp.oms.party.security.repository.SecurityGroupPermissionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SecurityGroupPermissionService {

    private final SecurityGroupPermissionRepository repository;

    public SecurityGroupPermissionService(SecurityGroupPermissionRepository repository) {
        this.repository = repository;
    }

    public List<SecurityGroupPermission> list() {
        return repository.findAll();
    }

    public SecurityGroupPermission get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SecurityGroupPermission %d not found".formatted(id)));
    }

    public SecurityGroupPermission create(SecurityGroupPermission entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SecurityGroupPermission update(Long id, SecurityGroupPermission entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SecurityGroupPermission %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
