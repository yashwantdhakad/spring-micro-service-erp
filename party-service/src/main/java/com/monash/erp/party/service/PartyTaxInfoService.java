package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyTaxInfo;
import com.monash.erp.party.repository.PartyTaxInfoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyTaxInfoService {

    private final PartyTaxInfoRepository repository;

    public PartyTaxInfoService(PartyTaxInfoRepository repository) {
        this.repository = repository;
    }

    public List<PartyTaxInfo> list() {
        return repository.findAll();
    }

    public PartyTaxInfo get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyTaxInfo %d not found".formatted(id)));
    }

    public PartyTaxInfo create(PartyTaxInfo entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyTaxInfo update(Long id, PartyTaxInfo entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyTaxInfo %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}