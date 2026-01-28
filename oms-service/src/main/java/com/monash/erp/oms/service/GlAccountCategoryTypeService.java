package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.GlAccountCategoryType;
import com.monash.erp.oms.repository.GlAccountCategoryTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlAccountCategoryTypeService {

    private final GlAccountCategoryTypeRepository repository;

    public GlAccountCategoryTypeService(GlAccountCategoryTypeRepository repository) {
        this.repository = repository;
    }

    public List<GlAccountCategoryType> list() {
        return repository.findAll();
    }

    public GlAccountCategoryType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountCategoryType %d not found".formatted(id)));
    }

    public GlAccountCategoryType create(GlAccountCategoryType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlAccountCategoryType update(Long id, GlAccountCategoryType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountCategoryType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}