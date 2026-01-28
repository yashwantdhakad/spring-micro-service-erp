package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestWorkEffort;
import com.monash.erp.oms.repository.CustRequestWorkEffortRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestWorkEffortService {

    private final CustRequestWorkEffortRepository repository;

    public CustRequestWorkEffortService(CustRequestWorkEffortRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestWorkEffort> list() {
        return repository.findAll();
    }

    public CustRequestWorkEffort get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestWorkEffort %d not found".formatted(id)));
    }

    public CustRequestWorkEffort create(CustRequestWorkEffort entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestWorkEffort update(Long id, CustRequestWorkEffort entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestWorkEffort %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}