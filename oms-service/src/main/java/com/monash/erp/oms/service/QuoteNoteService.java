package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteNote;
import com.monash.erp.oms.repository.QuoteNoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteNoteService {

    private final QuoteNoteRepository repository;

    public QuoteNoteService(QuoteNoteRepository repository) {
        this.repository = repository;
    }

    public List<QuoteNote> list() {
        return repository.findAll();
    }

    public QuoteNote get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteNote %d not found".formatted(id)));
    }

    public QuoteNote create(QuoteNote entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteNote update(Long id, QuoteNote entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteNote %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}