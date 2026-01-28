package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.MarketInterest;
import com.monash.erp.wms.repository.MarketInterestRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MarketInterestService {

    private final MarketInterestRepository repository;

    public MarketInterestService(MarketInterestRepository repository) {
        this.repository = repository;
    }

    public List<MarketInterest> list() {
        return repository.findAll();
    }

    public MarketInterest get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MarketInterest %d not found".formatted(id)));
    }

    public MarketInterest create(MarketInterest entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public MarketInterest update(Long id, MarketInterest entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "MarketInterest %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}