package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.GlResourceType;
import com.monash.erp.oms.accounting.repository.GlResourceTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlResourceTypeService {

    private final GlResourceTypeRepository repository;

    public GlResourceTypeService(GlResourceTypeRepository repository) {
        this.repository = repository;
    }

    public List<GlResourceType> list() {
        return repository.findAll();
    }

    public GlResourceType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlResourceType %d not found".formatted(id)));
    }

    public GlResourceType create(GlResourceType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlResourceType update(Long id, GlResourceType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlResourceType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
