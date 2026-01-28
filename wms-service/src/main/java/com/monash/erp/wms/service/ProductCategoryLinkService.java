package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductCategoryLink;
import com.monash.erp.wms.repository.ProductCategoryLinkRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductCategoryLinkService {

    private final ProductCategoryLinkRepository repository;

    public ProductCategoryLinkService(ProductCategoryLinkRepository repository) {
        this.repository = repository;
    }

    public List<ProductCategoryLink> list() {
        return repository.findAll();
    }

    public ProductCategoryLink get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryLink %d not found".formatted(id)));
    }

    public ProductCategoryLink create(ProductCategoryLink entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductCategoryLink update(Long id, ProductCategoryLink entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductCategoryLink %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}