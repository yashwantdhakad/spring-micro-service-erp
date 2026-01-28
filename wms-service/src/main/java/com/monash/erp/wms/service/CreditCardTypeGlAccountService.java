package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.CreditCardTypeGlAccount;
import com.monash.erp.wms.repository.CreditCardTypeGlAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CreditCardTypeGlAccountService {

    private final CreditCardTypeGlAccountRepository repository;

    public CreditCardTypeGlAccountService(CreditCardTypeGlAccountRepository repository) {
        this.repository = repository;
    }

    public List<CreditCardTypeGlAccount> list() {
        return repository.findAll();
    }

    public CreditCardTypeGlAccount get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CreditCardTypeGlAccount %d not found".formatted(id)));
    }

    public CreditCardTypeGlAccount create(CreditCardTypeGlAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CreditCardTypeGlAccount update(Long id, CreditCardTypeGlAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CreditCardTypeGlAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}