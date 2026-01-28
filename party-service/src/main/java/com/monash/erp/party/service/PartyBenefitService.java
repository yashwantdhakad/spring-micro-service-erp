package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyBenefit;
import com.monash.erp.party.repository.PartyBenefitRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyBenefitService {

    private final PartyBenefitRepository repository;

    public PartyBenefitService(PartyBenefitRepository repository) {
        this.repository = repository;
    }

    public List<PartyBenefit> list() {
        return repository.findAll();
    }

    public PartyBenefit get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyBenefit %d not found".formatted(id)));
    }

    public PartyBenefit create(PartyBenefit entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyBenefit update(Long id, PartyBenefit entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyBenefit %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}