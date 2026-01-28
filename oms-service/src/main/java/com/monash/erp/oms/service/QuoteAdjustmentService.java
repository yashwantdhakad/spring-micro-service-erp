package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteAdjustment;
import com.monash.erp.oms.repository.QuoteAdjustmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteAdjustmentService {

    private final QuoteAdjustmentRepository repository;

    public QuoteAdjustmentService(QuoteAdjustmentRepository repository) {
        this.repository = repository;
    }

    public List<QuoteAdjustment> list() {
        return repository.findAll();
    }

    public QuoteAdjustment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteAdjustment %d not found".formatted(id)));
    }

    public QuoteAdjustment create(QuoteAdjustment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteAdjustment update(Long id, QuoteAdjustment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteAdjustment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}