package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.CostComponentType;
import com.monash.erp.wms.repository.CostComponentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CostComponentTypeService {

    private final CostComponentTypeRepository repository;

    public CostComponentTypeService(CostComponentTypeRepository repository) {
        this.repository = repository;
    }

    public List<CostComponentType> list() {
        return repository.findAll();
    }

    public CostComponentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CostComponentType %d not found".formatted(id)));
    }

    public CostComponentType create(CostComponentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CostComponentType update(Long id, CostComponentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CostComponentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}