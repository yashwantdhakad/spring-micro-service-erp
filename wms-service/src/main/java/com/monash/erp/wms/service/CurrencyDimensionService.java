package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.CurrencyDimension;
import com.monash.erp.wms.repository.CurrencyDimensionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CurrencyDimensionService {

    private final CurrencyDimensionRepository repository;

    public CurrencyDimensionService(CurrencyDimensionRepository repository) {
        this.repository = repository;
    }

    public List<CurrencyDimension> list() {
        return repository.findAll();
    }

    public CurrencyDimension get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CurrencyDimension %d not found".formatted(id)));
    }

    public CurrencyDimension create(CurrencyDimension entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CurrencyDimension update(Long id, CurrencyDimension entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CurrencyDimension %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}