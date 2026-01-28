package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStorePromoAppl;
import com.monash.erp.wms.repository.ProductStorePromoApplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStorePromoApplService {

    private final ProductStorePromoApplRepository repository;

    public ProductStorePromoApplService(ProductStorePromoApplRepository repository) {
        this.repository = repository;
    }

    public List<ProductStorePromoAppl> list() {
        return repository.findAll();
    }

    public ProductStorePromoAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStorePromoAppl %d not found".formatted(id)));
    }

    public ProductStorePromoAppl create(ProductStorePromoAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStorePromoAppl update(Long id, ProductStorePromoAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStorePromoAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}