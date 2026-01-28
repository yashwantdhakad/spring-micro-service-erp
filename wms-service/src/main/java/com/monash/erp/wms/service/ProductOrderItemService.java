package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductOrderItem;
import com.monash.erp.wms.repository.ProductOrderItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductOrderItemService {

    private final ProductOrderItemRepository repository;

    public ProductOrderItemService(ProductOrderItemRepository repository) {
        this.repository = repository;
    }

    public List<ProductOrderItem> list() {
        return repository.findAll();
    }

    public ProductOrderItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductOrderItem %d not found".formatted(id)));
    }

    public ProductOrderItem create(ProductOrderItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductOrderItem update(Long id, ProductOrderItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductOrderItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}