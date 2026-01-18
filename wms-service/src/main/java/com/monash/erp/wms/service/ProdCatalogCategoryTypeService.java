package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProdCatalogCategoryType;
import com.monash.erp.wms.repository.ProdCatalogCategoryTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProdCatalogCategoryTypeService {

    private final ProdCatalogCategoryTypeRepository repository;

    public ProdCatalogCategoryTypeService(ProdCatalogCategoryTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProdCatalogCategoryType> list() {
        return repository.findAll();
    }

    public ProdCatalogCategoryType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProdCatalogCategoryType %d not found".formatted(id)));
    }

    public ProdCatalogCategoryType create(ProdCatalogCategoryType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProdCatalogCategoryType update(Long id, ProdCatalogCategoryType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProdCatalogCategoryType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}