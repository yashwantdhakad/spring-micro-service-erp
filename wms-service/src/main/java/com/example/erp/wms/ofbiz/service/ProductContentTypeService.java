package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ProductContentType;
import com.example.erp.wms.ofbiz.repository.ProductContentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductContentTypeService {

    private final ProductContentTypeRepository repository;

    public ProductContentTypeService(ProductContentTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductContentType> list() {
        return repository.findAll();
    }

    public ProductContentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductContentType %d not found".formatted(id)));
    }

    public ProductContentType create(ProductContentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductContentType update(Long id, ProductContentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductContentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}