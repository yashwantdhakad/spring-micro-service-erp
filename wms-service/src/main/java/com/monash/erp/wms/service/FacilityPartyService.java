package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityParty;
import com.monash.erp.wms.repository.FacilityPartyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityPartyService {

    private final FacilityPartyRepository repository;

    public FacilityPartyService(FacilityPartyRepository repository) {
        this.repository = repository;
    }

    public List<FacilityParty> list() {
        return repository.findAll();
    }

    public FacilityParty get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityParty %d not found".formatted(id)));
    }

    public FacilityParty create(FacilityParty entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityParty update(Long id, FacilityParty entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityParty %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}