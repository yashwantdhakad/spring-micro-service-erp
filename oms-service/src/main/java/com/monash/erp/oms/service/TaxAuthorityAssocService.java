package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.TaxAuthorityAssoc;
import com.monash.erp.oms.repository.TaxAuthorityAssocRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TaxAuthorityAssocService {

    private final TaxAuthorityAssocRepository repository;

    public TaxAuthorityAssocService(TaxAuthorityAssocRepository repository) {
        this.repository = repository;
    }

    public List<TaxAuthorityAssoc> list() {
        return repository.findAll();
    }

    public TaxAuthorityAssoc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthorityAssoc %d not found".formatted(id)));
    }

    public TaxAuthorityAssoc create(TaxAuthorityAssoc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TaxAuthorityAssoc update(Long id, TaxAuthorityAssoc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthorityAssoc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}