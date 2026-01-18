package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.PartyGlAccount;
import com.monash.erp.oms.accounting.repository.PartyGlAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyGlAccountService {

    private final PartyGlAccountRepository repository;

    public PartyGlAccountService(PartyGlAccountRepository repository) {
        this.repository = repository;
    }

    public List<PartyGlAccount> list() {
        return repository.findAll();
    }

    public PartyGlAccount get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyGlAccount %d not found".formatted(id)));
    }

    public PartyGlAccount create(PartyGlAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyGlAccount update(Long id, PartyGlAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyGlAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
