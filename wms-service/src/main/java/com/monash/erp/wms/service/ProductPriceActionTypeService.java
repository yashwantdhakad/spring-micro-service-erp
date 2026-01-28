package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPriceActionType;
import com.monash.erp.wms.repository.ProductPriceActionTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPriceActionTypeService {

    private final ProductPriceActionTypeRepository repository;

    public ProductPriceActionTypeService(ProductPriceActionTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductPriceActionType> list() {
        return repository.findAll();
    }

    public ProductPriceActionType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceActionType %d not found".formatted(id)));
    }

    public ProductPriceActionType create(ProductPriceActionType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPriceActionType update(Long id, ProductPriceActionType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPriceActionType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}