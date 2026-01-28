package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.TaxAuthorityCategory;
import com.monash.erp.oms.repository.TaxAuthorityCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TaxAuthorityCategoryService {

    private final TaxAuthorityCategoryRepository repository;

    public TaxAuthorityCategoryService(TaxAuthorityCategoryRepository repository) {
        this.repository = repository;
    }

    public List<TaxAuthorityCategory> list() {
        return repository.findAll();
    }

    public TaxAuthorityCategory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthorityCategory %d not found".formatted(id)));
    }

    public TaxAuthorityCategory create(TaxAuthorityCategory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TaxAuthorityCategory update(Long id, TaxAuthorityCategory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthorityCategory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}