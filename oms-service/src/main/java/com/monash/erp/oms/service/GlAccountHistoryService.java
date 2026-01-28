package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.GlAccountHistory;
import com.monash.erp.oms.repository.GlAccountHistoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlAccountHistoryService {

    private final GlAccountHistoryRepository repository;

    public GlAccountHistoryService(GlAccountHistoryRepository repository) {
        this.repository = repository;
    }

    public List<GlAccountHistory> list() {
        return repository.findAll();
    }

    public GlAccountHistory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountHistory %d not found".formatted(id)));
    }

    public GlAccountHistory create(GlAccountHistory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlAccountHistory update(Long id, GlAccountHistory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountHistory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}