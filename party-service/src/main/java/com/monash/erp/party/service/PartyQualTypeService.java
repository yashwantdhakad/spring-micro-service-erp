package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyQualType;
import com.monash.erp.party.repository.PartyQualTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyQualTypeService {

    private final PartyQualTypeRepository repository;

    public PartyQualTypeService(PartyQualTypeRepository repository) {
        this.repository = repository;
    }

    public List<PartyQualType> list() {
        return repository.findAll();
    }

    public PartyQualType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyQualType %d not found".formatted(id)));
    }

    public PartyQualType create(PartyQualType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyQualType update(Long id, PartyQualType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyQualType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}