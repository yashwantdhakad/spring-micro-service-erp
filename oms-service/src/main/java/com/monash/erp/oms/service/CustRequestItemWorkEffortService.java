package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestItemWorkEffort;
import com.monash.erp.oms.repository.CustRequestItemWorkEffortRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestItemWorkEffortService {

    private final CustRequestItemWorkEffortRepository repository;

    public CustRequestItemWorkEffortService(CustRequestItemWorkEffortRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestItemWorkEffort> list() {
        return repository.findAll();
    }

    public CustRequestItemWorkEffort get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestItemWorkEffort %d not found".formatted(id)));
    }

    public CustRequestItemWorkEffort create(CustRequestItemWorkEffort entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestItemWorkEffort update(Long id, CustRequestItemWorkEffort entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestItemWorkEffort %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}