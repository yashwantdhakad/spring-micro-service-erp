package com.monash.erp.party.service;

import com.monash.erp.party.entity.SupplierRatingType;
import com.monash.erp.party.repository.SupplierRatingTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SupplierRatingTypeService {

    private final SupplierRatingTypeRepository repository;

    public SupplierRatingTypeService(SupplierRatingTypeRepository repository) {
        this.repository = repository;
    }

    public List<SupplierRatingType> list() {
        return repository.findAll();
    }

    public SupplierRatingType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SupplierRatingType %d not found".formatted(id)));
    }

    public SupplierRatingType create(SupplierRatingType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SupplierRatingType update(Long id, SupplierRatingType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SupplierRatingType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}