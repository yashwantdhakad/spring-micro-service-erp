package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductStoreVendorPayment;
import com.monash.erp.wms.repository.ProductStoreVendorPaymentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductStoreVendorPaymentService {

    private final ProductStoreVendorPaymentRepository repository;

    public ProductStoreVendorPaymentService(ProductStoreVendorPaymentRepository repository) {
        this.repository = repository;
    }

    public List<ProductStoreVendorPayment> list() {
        return repository.findAll();
    }

    public ProductStoreVendorPayment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreVendorPayment %d not found".formatted(id)));
    }

    public ProductStoreVendorPayment create(ProductStoreVendorPayment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductStoreVendorPayment update(Long id, ProductStoreVendorPayment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductStoreVendorPayment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}