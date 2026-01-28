package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteType;
import com.monash.erp.oms.repository.QuoteTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteTypeService {

    private final QuoteTypeRepository repository;

    public QuoteTypeService(QuoteTypeRepository repository) {
        this.repository = repository;
    }

    public List<QuoteType> list() {
        return repository.findAll();
    }

    public QuoteType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteType %d not found".formatted(id)));
    }

    public QuoteType create(QuoteType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteType update(Long id, QuoteType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}