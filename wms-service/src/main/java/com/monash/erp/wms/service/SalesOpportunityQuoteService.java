package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalesOpportunityQuote;
import com.monash.erp.wms.repository.SalesOpportunityQuoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalesOpportunityQuoteService {

    private final SalesOpportunityQuoteRepository repository;

    public SalesOpportunityQuoteService(SalesOpportunityQuoteRepository repository) {
        this.repository = repository;
    }

    public List<SalesOpportunityQuote> list() {
        return repository.findAll();
    }

    public SalesOpportunityQuote get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityQuote %d not found".formatted(id)));
    }

    public SalesOpportunityQuote create(SalesOpportunityQuote entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalesOpportunityQuote update(Long id, SalesOpportunityQuote entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityQuote %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}