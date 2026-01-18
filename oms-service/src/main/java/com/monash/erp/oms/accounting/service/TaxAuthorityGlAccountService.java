package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.TaxAuthorityGlAccount;
import com.monash.erp.oms.accounting.repository.TaxAuthorityGlAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TaxAuthorityGlAccountService {

    private final TaxAuthorityGlAccountRepository repository;

    public TaxAuthorityGlAccountService(TaxAuthorityGlAccountRepository repository) {
        this.repository = repository;
    }

    public List<TaxAuthorityGlAccount> list() {
        return repository.findAll();
    }

    public TaxAuthorityGlAccount get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthorityGlAccount %d not found".formatted(id)));
    }

    public TaxAuthorityGlAccount create(TaxAuthorityGlAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TaxAuthorityGlAccount update(Long id, TaxAuthorityGlAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthorityGlAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
