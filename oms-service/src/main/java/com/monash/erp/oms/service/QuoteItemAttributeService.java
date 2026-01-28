package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteItemAttribute;
import com.monash.erp.oms.repository.QuoteItemAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteItemAttributeService {

    private final QuoteItemAttributeRepository repository;

    public QuoteItemAttributeService(QuoteItemAttributeRepository repository) {
        this.repository = repository;
    }

    public List<QuoteItemAttribute> list() {
        return repository.findAll();
    }

    public QuoteItemAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteItemAttribute %d not found".formatted(id)));
    }

    public QuoteItemAttribute create(QuoteItemAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteItemAttribute update(Long id, QuoteItemAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteItemAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}