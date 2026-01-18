package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreEmailSetting;
import com.monash.erp.wms.repository.ProductStoreEmailSettingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreEmailSettingService {

    private final ProductStoreEmailSettingRepository repository;

    public ProductStoreEmailSettingService(ProductStoreEmailSettingRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreEmailSetting> list() {
        return repository.findAll();
    }

    public ProductStoreEmailSetting get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreEmailSetting %d not found".formatted(id)));
    }

    public ProductStoreEmailSetting create(ProductStoreEmailSetting entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreEmailSetting update(Long id, ProductStoreEmailSetting entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreEmailSetting %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}