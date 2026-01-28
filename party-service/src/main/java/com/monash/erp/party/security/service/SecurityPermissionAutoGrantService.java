package com.monash.erp.party.security.service;

import com.monash.erp.party.security.entity.SecurityPermissionAutoGrant;
import com.monash.erp.party.security.repository.SecurityPermissionAutoGrantRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SecurityPermissionAutoGrantService {

    private final SecurityPermissionAutoGrantRepository repository;

    public SecurityPermissionAutoGrantService(SecurityPermissionAutoGrantRepository repository) {
        this.repository = repository;
    }

    public List<SecurityPermissionAutoGrant> list() {
        return repository.findAll();
    }

    public SecurityPermissionAutoGrant get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SecurityPermissionAutoGrant %d not found".formatted(id)));
    }

    public SecurityPermissionAutoGrant create(SecurityPermissionAutoGrant entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SecurityPermissionAutoGrant update(Long id, SecurityPermissionAutoGrant entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SecurityPermissionAutoGrant %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}