package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductIdentification;
import com.monash.erp.wms.repository.ProductIdentificationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductIdentificationService {

    private final ProductIdentificationRepository repository;

    public ProductIdentificationService(ProductIdentificationRepository repository) {
        this.repository = repository;
    }

    public List<ProductIdentification> list() {
        return repository.findAll();
    }

    public ProductIdentification get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductIdentification %d not found".formatted(id)));
    }

    public ProductIdentification create(ProductIdentification entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductIdentification update(Long id, ProductIdentification entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductIdentification %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}