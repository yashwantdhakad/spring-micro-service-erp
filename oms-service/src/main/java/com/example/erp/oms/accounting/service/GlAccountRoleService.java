package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.GlAccountRole;
import com.example.erp.oms.accounting.repository.GlAccountRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlAccountRoleService {

    private final GlAccountRoleRepository repository;

    public GlAccountRoleService(GlAccountRoleRepository repository) {
        this.repository = repository;
    }

    public List<GlAccountRole> list() {
        return repository.findAll();
    }

    public GlAccountRole get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountRole %d not found".formatted(id)));
    }

    public GlAccountRole create(GlAccountRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlAccountRole update(Long id, GlAccountRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
