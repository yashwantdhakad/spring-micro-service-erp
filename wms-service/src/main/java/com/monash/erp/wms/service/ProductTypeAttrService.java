package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductTypeAttr;
import com.monash.erp.wms.repository.ProductTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductTypeAttrService {

    private final ProductTypeAttrRepository repository;

    public ProductTypeAttrService(ProductTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<ProductTypeAttr> list() {
        return repository.findAll();
    }

    public ProductTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductTypeAttr %d not found".formatted(id)));
    }

    public ProductTypeAttr create(ProductTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductTypeAttr update(Long id, ProductTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}