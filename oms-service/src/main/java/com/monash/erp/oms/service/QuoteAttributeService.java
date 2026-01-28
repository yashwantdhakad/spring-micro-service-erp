package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteAttribute;
import com.monash.erp.oms.repository.QuoteAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteAttributeService {

    private final QuoteAttributeRepository repository;

    public QuoteAttributeService(QuoteAttributeRepository repository) {
        this.repository = repository;
    }

    public List<QuoteAttribute> list() {
        return repository.findAll();
    }

    public QuoteAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteAttribute %d not found".formatted(id)));
    }

    public QuoteAttribute create(QuoteAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteAttribute update(Long id, QuoteAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}