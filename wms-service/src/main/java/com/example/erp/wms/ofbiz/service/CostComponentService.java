package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.CostComponent;
import com.example.erp.wms.ofbiz.repository.CostComponentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CostComponentService {

    private final CostComponentRepository repository;

    public CostComponentService(CostComponentRepository repository) {
        this.repository = repository;
    }

    public List<CostComponent> list() {
        return repository.findAll();
    }

    public CostComponent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CostComponent %d not found".formatted(id)));
    }

    public CostComponent create(CostComponent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CostComponent update(Long id, CostComponent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CostComponent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}