package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalesOrderItemFact;
import com.monash.erp.wms.repository.SalesOrderItemFactRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalesOrderItemFactService {

    private final SalesOrderItemFactRepository repository;

    public SalesOrderItemFactService(SalesOrderItemFactRepository repository) {
        this.repository = repository;
    }

    public List<SalesOrderItemFact> list() {
        return repository.findAll();
    }

    public SalesOrderItemFact get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOrderItemFact %d not found".formatted(id)));
    }

    public SalesOrderItemFact create(SalesOrderItemFact entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalesOrderItemFact update(Long id, SalesOrderItemFact entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOrderItemFact %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}