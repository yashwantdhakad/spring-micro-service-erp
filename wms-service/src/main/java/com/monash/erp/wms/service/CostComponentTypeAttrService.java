package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.CostComponentTypeAttr;
import com.monash.erp.wms.repository.CostComponentTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CostComponentTypeAttrService {

    private final CostComponentTypeAttrRepository repository;

    public CostComponentTypeAttrService(CostComponentTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<CostComponentTypeAttr> list() {
        return repository.findAll();
    }

    public CostComponentTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CostComponentTypeAttr %d not found".formatted(id)));
    }

    public CostComponentTypeAttr create(CostComponentTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CostComponentTypeAttr update(Long id, CostComponentTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CostComponentTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}