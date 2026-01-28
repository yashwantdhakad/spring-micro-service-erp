package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductConfigItem;
import com.monash.erp.wms.repository.ProductConfigItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductConfigItemService {

    private final ProductConfigItemRepository repository;

    public ProductConfigItemService(ProductConfigItemRepository repository) {
        this.repository = repository;
    }

    public List<ProductConfigItem> list() {
        return repository.findAll();
    }

    public ProductConfigItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductConfigItem %d not found".formatted(id)));
    }

    public ProductConfigItem create(ProductConfigItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductConfigItem update(Long id, ProductConfigItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductConfigItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}