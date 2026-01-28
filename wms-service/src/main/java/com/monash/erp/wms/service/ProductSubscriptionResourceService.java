package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductSubscriptionResource;
import com.monash.erp.wms.repository.ProductSubscriptionResourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductSubscriptionResourceService {

    private final ProductSubscriptionResourceRepository repository;

    public ProductSubscriptionResourceService(ProductSubscriptionResourceRepository repository) {
        this.repository = repository;
    }

    public List<ProductSubscriptionResource> list() {
        return repository.findAll();
    }

    public ProductSubscriptionResource get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductSubscriptionResource %d not found".formatted(id)));
    }

    public ProductSubscriptionResource create(ProductSubscriptionResource entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductSubscriptionResource update(Long id, ProductSubscriptionResource entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductSubscriptionResource %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}