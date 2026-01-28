package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteTypeAttr;
import com.monash.erp.oms.repository.QuoteTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteTypeAttrService {

    private final QuoteTypeAttrRepository repository;

    public QuoteTypeAttrService(QuoteTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<QuoteTypeAttr> list() {
        return repository.findAll();
    }

    public QuoteTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteTypeAttr %d not found".formatted(id)));
    }

    public QuoteTypeAttr create(QuoteTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteTypeAttr update(Long id, QuoteTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}