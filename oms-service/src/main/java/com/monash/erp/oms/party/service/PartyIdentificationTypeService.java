package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyIdentificationType;
import com.monash.erp.oms.party.repository.PartyIdentificationTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyIdentificationTypeService {

    private final PartyIdentificationTypeRepository repository;

    public PartyIdentificationTypeService(PartyIdentificationTypeRepository repository) {
        this.repository = repository;
    }

    public List<PartyIdentificationType> list() {
        return repository.findAll();
    }

    public PartyIdentificationType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyIdentificationType %d not found".formatted(id)));
    }

    public PartyIdentificationType create(PartyIdentificationType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyIdentificationType update(Long id, PartyIdentificationType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyIdentificationType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}