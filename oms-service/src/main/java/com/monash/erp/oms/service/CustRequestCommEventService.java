package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestCommEvent;
import com.monash.erp.oms.repository.CustRequestCommEventRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestCommEventService {

    private final CustRequestCommEventRepository repository;

    public CustRequestCommEventService(CustRequestCommEventRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestCommEvent> list() {
        return repository.findAll();
    }

    public CustRequestCommEvent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestCommEvent %d not found".formatted(id)));
    }

    public CustRequestCommEvent create(CustRequestCommEvent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestCommEvent update(Long id, CustRequestCommEvent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestCommEvent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}