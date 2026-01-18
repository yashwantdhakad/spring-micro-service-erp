package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.GlAccountGroupType;
import com.monash.erp.oms.accounting.repository.GlAccountGroupTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlAccountGroupTypeService {

    private final GlAccountGroupTypeRepository repository;

    public GlAccountGroupTypeService(GlAccountGroupTypeRepository repository) {
        this.repository = repository;
    }

    public List<GlAccountGroupType> list() {
        return repository.findAll();
    }

    public GlAccountGroupType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountGroupType %d not found".formatted(id)));
    }

    public GlAccountGroupType create(GlAccountGroupType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlAccountGroupType update(Long id, GlAccountGroupType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountGroupType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
