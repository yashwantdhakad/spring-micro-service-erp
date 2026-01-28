package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.QuantityBreakType;
import com.monash.erp.wms.repository.QuantityBreakTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuantityBreakTypeService {

    private final QuantityBreakTypeRepository repository;

    public QuantityBreakTypeService(QuantityBreakTypeRepository repository) {
        this.repository = repository;
    }

    public List<QuantityBreakType> list() {
        return repository.findAll();
    }

    public QuantityBreakType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuantityBreakType %d not found".formatted(id)));
    }

    public QuantityBreakType create(QuantityBreakType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuantityBreakType update(Long id, QuantityBreakType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuantityBreakType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}