package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.TaxAuthorityRateType;
import com.monash.erp.oms.repository.TaxAuthorityRateTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TaxAuthorityRateTypeService {

    private final TaxAuthorityRateTypeRepository repository;

    public TaxAuthorityRateTypeService(TaxAuthorityRateTypeRepository repository) {
        this.repository = repository;
    }

    public List<TaxAuthorityRateType> list() {
        return repository.findAll();
    }

    public TaxAuthorityRateType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthorityRateType %d not found".formatted(id)));
    }

    public TaxAuthorityRateType create(TaxAuthorityRateType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TaxAuthorityRateType update(Long id, TaxAuthorityRateType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthorityRateType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}