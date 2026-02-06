package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.ProductFeatureApplDto;
import com.monash.erp.wms.entity.ProductFeature;
import com.monash.erp.wms.entity.ProductFeatureAppl;
import com.monash.erp.wms.repository.ProductFeatureApplRepository;
import com.monash.erp.wms.repository.ProductFeatureRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductFeatureApplService {

    private final ProductFeatureApplRepository repository;
    private final ProductFeatureRepository featureRepository;

    public ProductFeatureApplService(
            ProductFeatureApplRepository repository,
            ProductFeatureRepository featureRepository
    ) {
        this.repository = repository;
        this.featureRepository = featureRepository;
    }

    public List<ProductFeatureAppl> list() {
        return repository.findAll();
    }

    public List<ProductFeatureAppl> listByProductId(String productId) {
        return repository.findByProductId(productId);
    }

    public List<ProductFeatureAppl> listByProductFeatureId(String productFeatureId) {
        return repository.findByProductFeatureId(productFeatureId);
    }

    public List<ProductFeatureApplDto> listByProductIdWithFeature(String productId) {
        List<ProductFeatureAppl> appls = repository.findByProductId(productId);
        Map<String, ProductFeature> featuresById = featureRepository.findAll().stream()
                .filter(feature -> feature.getProductFeatureId() != null)
                .collect(Collectors.toMap(ProductFeature::getProductFeatureId, feature -> feature, (a, b) -> a));

        return appls.stream().map(appl -> {
            ProductFeatureApplDto dto = new ProductFeatureApplDto();
            dto.setId(appl.getId());
            dto.setProductId(appl.getProductId());
            dto.setProductFeatureId(appl.getProductFeatureId());
            dto.setProductFeatureApplTypeId(appl.getProductFeatureApplTypeId());
            dto.setFromDate(appl.getFromDate());
            dto.setThruDate(appl.getThruDate());
            dto.setSequenceNum(appl.getSequenceNum());
            dto.setAmount(appl.getAmount());
            dto.setRecurringAmount(appl.getRecurringAmount());
            ProductFeature feature = featuresById.get(appl.getProductFeatureId());
            dto.setFeatureDescription(feature != null ? feature.getDescription() : null);
            dto.setFeatureAbbrev(feature != null ? feature.getAbbrev() : null);
            return dto;
        }).collect(Collectors.toList());
    }

    public ProductFeatureAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureAppl %d not found".formatted(id)));
    }

    public ProductFeatureAppl create(ProductFeatureAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductFeatureAppl update(Long id, ProductFeatureAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
