package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.FinAccountTypeGlAccount;
import com.monash.erp.oms.accounting.repository.FinAccountTypeGlAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FinAccountTypeGlAccountService {

    private final FinAccountTypeGlAccountRepository repository;

    public FinAccountTypeGlAccountService(FinAccountTypeGlAccountRepository repository) {
        this.repository = repository;
    }

    public List<FinAccountTypeGlAccount> list() {
        return repository.findAll();
    }

    public FinAccountTypeGlAccount get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountTypeGlAccount %d not found".formatted(id)));
    }

    public FinAccountTypeGlAccount create(FinAccountTypeGlAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FinAccountTypeGlAccount update(Long id, FinAccountTypeGlAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountTypeGlAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
