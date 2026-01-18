package com.monash.erp.party.security.service;

import com.monash.erp.party.security.entity.SecurityPermission;
import com.monash.erp.party.security.repository.SecurityPermissionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SecurityPermissionService {

    private final SecurityPermissionRepository repository;

    public SecurityPermissionService(SecurityPermissionRepository repository) {
        this.repository = repository;
    }

    public List<SecurityPermission> list() {
        return repository.findAll();
    }

    public SecurityPermission get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SecurityPermission %d not found".formatted(id)));
    }

    public SecurityPermission create(SecurityPermission entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SecurityPermission update(Long id, SecurityPermission entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SecurityPermission %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
