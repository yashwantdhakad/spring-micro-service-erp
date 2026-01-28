package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreSurveyAppl;
import com.monash.erp.wms.repository.ProductStoreSurveyApplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreSurveyApplService {

    private final ProductStoreSurveyApplRepository repository;

    public ProductStoreSurveyApplService(ProductStoreSurveyApplRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreSurveyAppl> list() {
        return repository.findAll();
    }

    public ProductStoreSurveyAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreSurveyAppl %d not found".formatted(id)));
    }

    public ProductStoreSurveyAppl create(ProductStoreSurveyAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreSurveyAppl update(Long id, ProductStoreSurveyAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreSurveyAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}