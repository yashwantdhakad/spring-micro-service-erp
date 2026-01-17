package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.GlAccountType;
import com.example.erp.oms.accounting.repository.GlAccountTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlAccountTypeService {

    private final GlAccountTypeRepository repository;

    public GlAccountTypeService(GlAccountTypeRepository repository) {
        this.repository = repository;
    }

    public List<GlAccountType> list() {
        return repository.findAll();
    }

    public GlAccountType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountType %d not found".formatted(id)));
    }

    public GlAccountType create(GlAccountType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlAccountType update(Long id, GlAccountType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
