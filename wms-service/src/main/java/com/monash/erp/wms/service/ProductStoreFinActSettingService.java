package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreFinActSetting;
import com.monash.erp.wms.repository.ProductStoreFinActSettingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreFinActSettingService {

    private final ProductStoreFinActSettingRepository repository;

    public ProductStoreFinActSettingService(ProductStoreFinActSettingRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreFinActSetting> list() {
        return repository.findAll();
    }

    public ProductStoreFinActSetting get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreFinActSetting %d not found".formatted(id)));
    }

    public ProductStoreFinActSetting create(ProductStoreFinActSetting entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreFinActSetting update(Long id, ProductStoreFinActSetting entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreFinActSetting %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}