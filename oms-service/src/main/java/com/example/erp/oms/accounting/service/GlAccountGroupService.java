package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.GlAccountGroup;
import com.example.erp.oms.accounting.repository.GlAccountGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlAccountGroupService {

    private final GlAccountGroupRepository repository;

    public GlAccountGroupService(GlAccountGroupRepository repository) {
        this.repository = repository;
    }

    public List<GlAccountGroup> list() {
        return repository.findAll();
    }

    public GlAccountGroup get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountGroup %d not found".formatted(id)));
    }

    public GlAccountGroup create(GlAccountGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlAccountGroup update(Long id, GlAccountGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
