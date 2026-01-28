package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductSearchResult;
import com.monash.erp.wms.repository.ProductSearchResultRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductSearchResultService {

    private final ProductSearchResultRepository repository;

    public ProductSearchResultService(ProductSearchResultRepository repository) {
        this.repository = repository;
    }

    public List<ProductSearchResult> list() {
        return repository.findAll();
    }

    public ProductSearchResult get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductSearchResult %d not found".formatted(id)));
    }

    public ProductSearchResult create(ProductSearchResult entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductSearchResult update(Long id, ProductSearchResult entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductSearchResult %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}