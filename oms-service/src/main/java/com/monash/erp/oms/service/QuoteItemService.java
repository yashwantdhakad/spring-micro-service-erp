package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteItem;
import com.monash.erp.oms.repository.QuoteItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteItemService {

    private final QuoteItemRepository repository;

    public QuoteItemService(QuoteItemRepository repository) {
        this.repository = repository;
    }

    public List<QuoteItem> list() {
        return repository.findAll();
    }

    public QuoteItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteItem %d not found".formatted(id)));
    }

    public QuoteItem create(QuoteItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteItem update(Long id, QuoteItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}