package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductKeywordResult;
import com.monash.erp.wms.repository.ProductKeywordResultRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductKeywordResultService {

    private final ProductKeywordResultRepository repository;

    public ProductKeywordResultService(ProductKeywordResultRepository repository) {
        this.repository = repository;
    }

    public List<ProductKeywordResult> list() {
        return repository.findAll();
    }

    public ProductKeywordResult get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductKeywordResult %d not found".formatted(id)));
    }

    public ProductKeywordResult create(ProductKeywordResult entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductKeywordResult update(Long id, ProductKeywordResult entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductKeywordResult %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}