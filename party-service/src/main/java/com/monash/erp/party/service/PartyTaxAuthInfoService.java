package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyTaxAuthInfo;
import com.monash.erp.party.repository.PartyTaxAuthInfoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyTaxAuthInfoService {

    private final PartyTaxAuthInfoRepository repository;

    public PartyTaxAuthInfoService(PartyTaxAuthInfoRepository repository) {
        this.repository = repository;
    }

    public List<PartyTaxAuthInfo> list() {
        return repository.findAll();
    }

    public PartyTaxAuthInfo get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyTaxAuthInfo %d not found".formatted(id)));
    }

    public PartyTaxAuthInfo create(PartyTaxAuthInfo entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyTaxAuthInfo update(Long id, PartyTaxAuthInfo entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyTaxAuthInfo %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}