package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.FinAccountRole;
import com.example.erp.oms.accounting.repository.FinAccountRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FinAccountRoleService {

    private final FinAccountRoleRepository repository;

    public FinAccountRoleService(FinAccountRoleRepository repository) {
        this.repository = repository;
    }

    public List<FinAccountRole> list() {
        return repository.findAll();
    }

    public FinAccountRole get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountRole %d not found".formatted(id)));
    }

    public FinAccountRole create(FinAccountRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FinAccountRole update(Long id, FinAccountRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
