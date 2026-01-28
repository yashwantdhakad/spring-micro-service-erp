package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.TaxAuthorityRateProduct;
import com.monash.erp.oms.repository.TaxAuthorityRateProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TaxAuthorityRateProductService {

    private final TaxAuthorityRateProductRepository repository;

    public TaxAuthorityRateProductService(TaxAuthorityRateProductRepository repository) {
        this.repository = repository;
    }

    public List<TaxAuthorityRateProduct> list() {
        return repository.findAll();
    }

    public TaxAuthorityRateProduct get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthorityRateProduct %d not found".formatted(id)));
    }

    public TaxAuthorityRateProduct create(TaxAuthorityRateProduct entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TaxAuthorityRateProduct update(Long id, TaxAuthorityRateProduct entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthorityRateProduct %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}