package com.example.erp.party.ofbiz.service;

import com.example.erp.party.ofbiz.domain.PartyType;
import com.example.erp.party.ofbiz.repository.PartyTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyTypeService {

    private final PartyTypeRepository repository;

    public PartyTypeService(PartyTypeRepository repository) {
        this.repository = repository;
    }

    public List<PartyType> list() {
        return repository.findAll();
    }

    public PartyType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyType %d not found".formatted(id)));
    }

    public PartyType create(PartyType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyType update(Long id, PartyType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}