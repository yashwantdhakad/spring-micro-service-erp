package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.TaxAuthorityAssocType;
import com.monash.erp.oms.accounting.repository.TaxAuthorityAssocTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TaxAuthorityAssocTypeService {

    private final TaxAuthorityAssocTypeRepository repository;

    public TaxAuthorityAssocTypeService(TaxAuthorityAssocTypeRepository repository) {
        this.repository = repository;
    }

    public List<TaxAuthorityAssocType> list() {
        return repository.findAll();
    }

    public TaxAuthorityAssocType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthorityAssocType %d not found".formatted(id)));
    }

    public TaxAuthorityAssocType create(TaxAuthorityAssocType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TaxAuthorityAssocType update(Long id, TaxAuthorityAssocType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthorityAssocType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
