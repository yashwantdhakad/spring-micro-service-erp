package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteTerm;
import com.monash.erp.oms.repository.QuoteTermRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteTermService {

    private final QuoteTermRepository repository;

    public QuoteTermService(QuoteTermRepository repository) {
        this.repository = repository;
    }

    public List<QuoteTerm> list() {
        return repository.findAll();
    }

    public QuoteTerm get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteTerm %d not found".formatted(id)));
    }

    public QuoteTerm create(QuoteTerm entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteTerm update(Long id, QuoteTerm entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteTerm %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}