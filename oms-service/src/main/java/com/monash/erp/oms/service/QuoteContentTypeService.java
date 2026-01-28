package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteContentType;
import com.monash.erp.oms.repository.QuoteContentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteContentTypeService {

    private final QuoteContentTypeRepository repository;

    public QuoteContentTypeService(QuoteContentTypeRepository repository) {
        this.repository = repository;
    }

    public List<QuoteContentType> list() {
        return repository.findAll();
    }

    public QuoteContentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteContentType %d not found".formatted(id)));
    }

    public QuoteContentType create(QuoteContentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteContentType update(Long id, QuoteContentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteContentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}