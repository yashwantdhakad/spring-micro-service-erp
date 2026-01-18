package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyCarrierAccount;
import com.monash.erp.party.repository.PartyCarrierAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyCarrierAccountService {

    private final PartyCarrierAccountRepository repository;

    public PartyCarrierAccountService(PartyCarrierAccountRepository repository) {
        this.repository = repository;
    }

    public List<PartyCarrierAccount> list() {
        return repository.findAll();
    }

    public PartyCarrierAccount get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyCarrierAccount %d not found".formatted(id)));
    }

    public PartyCarrierAccount create(PartyCarrierAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyCarrierAccount update(Long id, PartyCarrierAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyCarrierAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}