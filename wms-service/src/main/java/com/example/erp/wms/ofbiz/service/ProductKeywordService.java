package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ProductKeyword;
import com.example.erp.wms.ofbiz.repository.ProductKeywordRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductKeywordService {

    private final ProductKeywordRepository repository;

    public ProductKeywordService(ProductKeywordRepository repository) {
        this.repository = repository;
    }

    public List<ProductKeyword> list() {
        return repository.findAll();
    }

    public ProductKeyword get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductKeyword %d not found".formatted(id)));
    }

    public ProductKeyword create(ProductKeyword entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductKeyword update(Long id, ProductKeyword entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductKeyword %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}