package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestCategory;
import com.monash.erp.oms.repository.CustRequestCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestCategoryService {

    private final CustRequestCategoryRepository repository;

    public CustRequestCategoryService(CustRequestCategoryRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestCategory> list() {
        return repository.findAll();
    }

    public CustRequestCategory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestCategory %d not found".formatted(id)));
    }

    public CustRequestCategory create(CustRequestCategory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestCategory update(Long id, CustRequestCategory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestCategory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}