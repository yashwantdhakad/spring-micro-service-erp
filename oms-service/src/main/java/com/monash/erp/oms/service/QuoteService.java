package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.Quote;
import com.monash.erp.oms.repository.QuoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteService {

    private final QuoteRepository repository;

    public QuoteService(QuoteRepository repository) {
        this.repository = repository;
    }

    public List<Quote> list() {
        return repository.findAll();
    }

    public Quote get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Quote %d not found".formatted(id)));
    }

    public Quote create(Quote entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Quote update(Long id, Quote entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Quote %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}