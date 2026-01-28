package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SaleType;
import com.monash.erp.wms.repository.SaleTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SaleTypeService {

    private final SaleTypeRepository repository;

    public SaleTypeService(SaleTypeRepository repository) {
        this.repository = repository;
    }

    public List<SaleType> list() {
        return repository.findAll();
    }

    public SaleType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SaleType %d not found".formatted(id)));
    }

    public SaleType create(SaleType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SaleType update(Long id, SaleType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SaleType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}