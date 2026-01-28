package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteWorkEffort;
import com.monash.erp.oms.repository.QuoteWorkEffortRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteWorkEffortService {

    private final QuoteWorkEffortRepository repository;

    public QuoteWorkEffortService(QuoteWorkEffortRepository repository) {
        this.repository = repository;
    }

    public List<QuoteWorkEffort> list() {
        return repository.findAll();
    }

    public QuoteWorkEffort get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteWorkEffort %d not found".formatted(id)));
    }

    public QuoteWorkEffort create(QuoteWorkEffort entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteWorkEffort update(Long id, QuoteWorkEffort entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteWorkEffort %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}