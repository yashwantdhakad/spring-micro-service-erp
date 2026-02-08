package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.SupplierProductFeature;
import com.monash.erp.oms.party.repository.SupplierProductFeatureRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SupplierProductFeatureService {

    private final SupplierProductFeatureRepository repository;

    public SupplierProductFeatureService(SupplierProductFeatureRepository repository) {
        this.repository = repository;
    }

    public List<SupplierProductFeature> list() {
        return repository.findAll();
    }

    public SupplierProductFeature get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SupplierProductFeature %d not found".formatted(id)));
    }

    public SupplierProductFeature create(SupplierProductFeature entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SupplierProductFeature update(Long id, SupplierProductFeature entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SupplierProductFeature %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}