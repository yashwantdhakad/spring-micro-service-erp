package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStorePaymentSetting;
import com.monash.erp.wms.repository.ProductStorePaymentSettingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStorePaymentSettingService {

    private final ProductStorePaymentSettingRepository repository;

    public ProductStorePaymentSettingService(ProductStorePaymentSettingRepository repository) {
        this.repository = repository;
    }

    public List<ProductStorePaymentSetting> list() {
        return repository.findAll();
    }

    public ProductStorePaymentSetting get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStorePaymentSetting %d not found".formatted(id)));
    }

    public ProductStorePaymentSetting create(ProductStorePaymentSetting entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStorePaymentSetting update(Long id, ProductStorePaymentSetting entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStorePaymentSetting %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}