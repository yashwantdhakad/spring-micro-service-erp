package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.RateAmount;
import com.monash.erp.oms.accounting.repository.RateAmountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RateAmountService {

    private final RateAmountRepository repository;

    public RateAmountService(RateAmountRepository repository) {
        this.repository = repository;
    }

    public List<RateAmount> list() {
        return repository.findAll();
    }

    public RateAmount get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RateAmount %d not found".formatted(id)));
    }

    public RateAmount create(RateAmount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RateAmount update(Long id, RateAmount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RateAmount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
