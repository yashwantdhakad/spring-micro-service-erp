package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyTypeAttr;
import com.monash.erp.oms.party.repository.PartyTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyTypeAttrService {

    private final PartyTypeAttrRepository repository;

    public PartyTypeAttrService(PartyTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<PartyTypeAttr> list() {
        return repository.findAll();
    }

    public PartyTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyTypeAttr %d not found".formatted(id)));
    }

    public PartyTypeAttr create(PartyTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyTypeAttr update(Long id, PartyTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}