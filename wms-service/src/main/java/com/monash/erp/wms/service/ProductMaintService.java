package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductMaint;
import com.monash.erp.wms.repository.ProductMaintRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductMaintService {

    private final ProductMaintRepository repository;

    public ProductMaintService(ProductMaintRepository repository) {
        this.repository = repository;
    }

    public List<ProductMaint> list() {
        return repository.findAll();
    }

    public ProductMaint get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductMaint %d not found".formatted(id)));
    }

    public ProductMaint create(ProductMaint entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductMaint update(Long id, ProductMaint entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductMaint %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}