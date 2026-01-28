package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.ProdCatalog;
import com.monash.erp.oms.repository.ProdCatalogRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProdCatalogService {

    private final ProdCatalogRepository repository;

    public ProdCatalogService(ProdCatalogRepository repository) {
        this.repository = repository;
    }

    public List<ProdCatalog> list() {
        return repository.findAll();
    }

    public ProdCatalog get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProdCatalog %d not found".formatted(id)));
    }

    public ProdCatalog create(ProdCatalog entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProdCatalog update(Long id, ProdCatalog entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProdCatalog %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}