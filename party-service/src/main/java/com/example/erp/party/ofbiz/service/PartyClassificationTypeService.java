package com.example.erp.party.ofbiz.service;

import com.example.erp.party.ofbiz.domain.PartyClassificationType;
import com.example.erp.party.ofbiz.repository.PartyClassificationTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyClassificationTypeService {

    private final PartyClassificationTypeRepository repository;

    public PartyClassificationTypeService(PartyClassificationTypeRepository repository) {
        this.repository = repository;
    }

    public List<PartyClassificationType> list() {
        return repository.findAll();
    }

    public PartyClassificationType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyClassificationType %d not found".formatted(id)));
    }

    public PartyClassificationType create(PartyClassificationType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyClassificationType update(Long id, PartyClassificationType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyClassificationType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}