package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ProdCatalogCategory;
import com.example.erp.wms.ofbiz.repository.ProdCatalogCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProdCatalogCategoryService {

    private final ProdCatalogCategoryRepository repository;

    public ProdCatalogCategoryService(ProdCatalogCategoryRepository repository) {
        this.repository = repository;
    }

    public List<ProdCatalogCategory> list() {
        return repository.findAll();
    }

    public ProdCatalogCategory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProdCatalogCategory %d not found".formatted(id)));
    }

    public ProdCatalogCategory create(ProdCatalogCategory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProdCatalogCategory update(Long id, ProdCatalogCategory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProdCatalogCategory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}