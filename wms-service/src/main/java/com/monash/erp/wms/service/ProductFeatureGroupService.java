package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductFeatureGroup;
import com.monash.erp.wms.repository.ProductFeatureGroupRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductFeatureGroupService {

    private final ProductFeatureGroupRepository repository;

    public ProductFeatureGroupService(ProductFeatureGroupRepository repository) {
        this.repository = repository;
    }

    public Page<ProductFeatureGroup> list(Pageable pageable, String query) {
        if (query == null || query.isBlank()) {
            return repository.findAll(pageable);
        }
        String normalized = query.trim();
        return repository.findByProductFeatureGroupIdContainingIgnoreCaseOrDescriptionContainingIgnoreCase(
                normalized,
                normalized,
                pageable
        );
    }

    public ProductFeatureGroup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureGroup %d not found".formatted(id)));
    }

    public ProductFeatureGroup create(ProductFeatureGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeatureGroup update(Long id, ProductFeatureGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public ProductFeatureGroup updateByProductFeatureGroupId(String productFeatureGroupId, ProductFeatureGroup entity) {
        ProductFeatureGroup existing = repository.findFirstByProductFeatureGroupIdOrderByIdAsc(productFeatureGroupId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureGroup %s not found".formatted(productFeatureGroupId)));
        entity.setId(existing.getId());
        entity.setProductFeatureGroupId(productFeatureGroupId);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
