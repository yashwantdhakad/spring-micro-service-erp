package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteTermAttribute;
import com.monash.erp.oms.repository.QuoteTermAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteTermAttributeService {

    private final QuoteTermAttributeRepository repository;

    public QuoteTermAttributeService(QuoteTermAttributeRepository repository) {
        this.repository = repository;
    }

    public List<QuoteTermAttribute> list() {
        return repository.findAll();
    }

    public QuoteTermAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteTermAttribute %d not found".formatted(id)));
    }

    public QuoteTermAttribute create(QuoteTermAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteTermAttribute update(Long id, QuoteTermAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteTermAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}