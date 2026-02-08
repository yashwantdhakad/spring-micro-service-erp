package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyCarrierAccountPurpose;
import com.monash.erp.oms.party.repository.PartyCarrierAccountPurposeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyCarrierAccountPurposeService {

    private final PartyCarrierAccountPurposeRepository repository;

    public PartyCarrierAccountPurposeService(PartyCarrierAccountPurposeRepository repository) {
        this.repository = repository;
    }

    public List<PartyCarrierAccountPurpose> list() {
        return repository.findAll();
    }

    public PartyCarrierAccountPurpose get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyCarrierAccountPurpose %d not found".formatted(id)));
    }

    public PartyCarrierAccountPurpose create(PartyCarrierAccountPurpose entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyCarrierAccountPurpose update(Long id, PartyCarrierAccountPurpose entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyCarrierAccountPurpose %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}