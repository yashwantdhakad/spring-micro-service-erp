package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.CostComponentCalc;
import com.example.erp.wms.ofbiz.repository.CostComponentCalcRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CostComponentCalcService {

    private final CostComponentCalcRepository repository;

    public CostComponentCalcService(CostComponentCalcRepository repository) {
        this.repository = repository;
    }

    public List<CostComponentCalc> list() {
        return repository.findAll();
    }

    public CostComponentCalc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CostComponentCalc %d not found".formatted(id)));
    }

    public CostComponentCalc create(CostComponentCalc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CostComponentCalc update(Long id, CostComponentCalc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CostComponentCalc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}