package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteCoefficient;
import com.monash.erp.oms.repository.QuoteCoefficientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteCoefficientService {

    private final QuoteCoefficientRepository repository;

    public QuoteCoefficientService(QuoteCoefficientRepository repository) {
        this.repository = repository;
    }

    public List<QuoteCoefficient> list() {
        return repository.findAll();
    }

    public QuoteCoefficient get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteCoefficient %d not found".formatted(id)));
    }

    public QuoteCoefficient create(QuoteCoefficient entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteCoefficient update(Long id, QuoteCoefficient entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteCoefficient %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}