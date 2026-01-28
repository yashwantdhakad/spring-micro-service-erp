package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPaymentMethodType;
import com.monash.erp.wms.repository.ProductPaymentMethodTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPaymentMethodTypeService {

    private final ProductPaymentMethodTypeRepository repository;

    public ProductPaymentMethodTypeService(ProductPaymentMethodTypeRepository repository) {
        this.repository = repository;
    }

    public List<ProductPaymentMethodType> list() {
        return repository.findAll();
    }

    public ProductPaymentMethodType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPaymentMethodType %d not found".formatted(id)));
    }

    public ProductPaymentMethodType create(ProductPaymentMethodType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPaymentMethodType update(Long id, ProductPaymentMethodType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPaymentMethodType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}