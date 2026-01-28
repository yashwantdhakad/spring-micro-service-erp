package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductIdentificationType;
import com.monash.erp.wms.repository.ProductIdentificationTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductIdentificationTypeService {

    private final ProductIdentificationTypeRepository repository;

    public ProductIdentificationTypeService(ProductIdentificationTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductIdentificationType> list() {
        return repository.findAll();
    }

    public ProductIdentificationType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductIdentificationType %d not found".formatted(id)));
    }

    public ProductIdentificationType create(ProductIdentificationType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductIdentificationType update(Long id, ProductIdentificationType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductIdentificationType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}