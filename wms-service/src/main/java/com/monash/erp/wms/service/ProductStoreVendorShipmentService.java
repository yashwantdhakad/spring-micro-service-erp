package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreVendorShipment;
import com.monash.erp.wms.repository.ProductStoreVendorShipmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreVendorShipmentService {

    private final ProductStoreVendorShipmentRepository repository;

    public ProductStoreVendorShipmentService(ProductStoreVendorShipmentRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreVendorShipment> list() {
        return repository.findAll();
    }

    public ProductStoreVendorShipment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreVendorShipment %d not found".formatted(id)));
    }

    public ProductStoreVendorShipment create(ProductStoreVendorShipment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreVendorShipment update(Long id, ProductStoreVendorShipment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreVendorShipment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}