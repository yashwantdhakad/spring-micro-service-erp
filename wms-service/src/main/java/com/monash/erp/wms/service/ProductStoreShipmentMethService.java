package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreShipmentMeth;
import com.monash.erp.wms.repository.ProductStoreShipmentMethRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreShipmentMethService {

    private final ProductStoreShipmentMethRepository repository;

    public ProductStoreShipmentMethService(ProductStoreShipmentMethRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreShipmentMeth> list() {
        return repository.findAll();
    }

    public ProductStoreShipmentMeth get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreShipmentMeth %d not found".formatted(id)));
    }

    public ProductStoreShipmentMeth create(ProductStoreShipmentMeth entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreShipmentMeth update(Long id, ProductStoreShipmentMeth entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreShipmentMeth %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}