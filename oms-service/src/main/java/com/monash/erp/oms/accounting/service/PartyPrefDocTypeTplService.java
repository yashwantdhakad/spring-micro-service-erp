package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.PartyPrefDocTypeTpl;
import com.monash.erp.oms.accounting.repository.PartyPrefDocTypeTplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyPrefDocTypeTplService {

    private final PartyPrefDocTypeTplRepository repository;

    public PartyPrefDocTypeTplService(PartyPrefDocTypeTplRepository repository) {
        this.repository = repository;
    }

    public List<PartyPrefDocTypeTpl> list() {
        return repository.findAll();
    }

    public PartyPrefDocTypeTpl get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyPrefDocTypeTpl %d not found".formatted(id)));
    }

    public PartyPrefDocTypeTpl create(PartyPrefDocTypeTpl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyPrefDocTypeTpl update(Long id, PartyPrefDocTypeTpl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyPrefDocTypeTpl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
