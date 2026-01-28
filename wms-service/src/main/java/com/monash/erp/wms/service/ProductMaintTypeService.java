package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductMaintType;
import com.monash.erp.wms.repository.ProductMaintTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductMaintTypeService {

    private final ProductMaintTypeRepository repository;

    public ProductMaintTypeService(ProductMaintTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductMaintType> list() {
        return repository.findAll();
    }

    public ProductMaintType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductMaintType %d not found".formatted(id)));
    }

    public ProductMaintType create(ProductMaintType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductMaintType update(Long id, ProductMaintType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductMaintType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}