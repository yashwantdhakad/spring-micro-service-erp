package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.DataCategory;
import com.example.erp.wms.ofbiz.repository.DataCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DataCategoryService {

    private final DataCategoryRepository repository;

    public DataCategoryService(DataCategoryRepository repository) {
        this.repository = repository;
    }

    public List<DataCategory> list() {
        return repository.findAll();
    }

    public DataCategory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DataCategory %d not found".formatted(id)));
    }

    public DataCategory create(DataCategory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DataCategory update(Long id, DataCategory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DataCategory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}