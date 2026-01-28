package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteContent;
import com.monash.erp.oms.repository.QuoteContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteContentService {

    private final QuoteContentRepository repository;

    public QuoteContentService(QuoteContentRepository repository) {
        this.repository = repository;
    }

    public List<QuoteContent> list() {
        return repository.findAll();
    }

    public QuoteContent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteContent %d not found".formatted(id)));
    }

    public QuoteContent create(QuoteContent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteContent update(Long id, QuoteContent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteContent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}