package com.example.erp.party.ofbiz.service;

import com.example.erp.party.ofbiz.domain.PartyContentType;
import com.example.erp.party.ofbiz.repository.PartyContentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyContentTypeService {

    private final PartyContentTypeRepository repository;

    public PartyContentTypeService(PartyContentTypeRepository repository) {
        this.repository = repository;
    }

    public List<PartyContentType> list() {
        return repository.findAll();
    }

    public PartyContentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyContentType %d not found".formatted(id)));
    }

    public PartyContentType create(PartyContentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyContentType update(Long id, PartyContentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyContentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}