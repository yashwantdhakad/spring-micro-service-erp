package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteContactMech;
import com.monash.erp.oms.repository.QuoteContactMechRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteContactMechService {

    private final QuoteContactMechRepository repository;

    public QuoteContactMechService(QuoteContactMechRepository repository) {
        this.repository = repository;
    }

    public List<QuoteContactMech> list() {
        return repository.findAll();
    }

    public QuoteContactMech get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteContactMech %d not found".formatted(id)));
    }

    public QuoteContactMech create(QuoteContactMech entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteContactMech update(Long id, QuoteContactMech entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteContactMech %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}