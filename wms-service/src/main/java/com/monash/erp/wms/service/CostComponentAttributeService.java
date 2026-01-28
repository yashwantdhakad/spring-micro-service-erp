package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.CostComponentAttribute;
import com.monash.erp.wms.repository.CostComponentAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CostComponentAttributeService {

    private final CostComponentAttributeRepository repository;

    public CostComponentAttributeService(CostComponentAttributeRepository repository) {
        this.repository = repository;
    }

    public List<CostComponentAttribute> list() {
        return repository.findAll();
    }

    public CostComponentAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CostComponentAttribute %d not found".formatted(id)));
    }

    public CostComponentAttribute create(CostComponentAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CostComponentAttribute update(Long id, CostComponentAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CostComponentAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}