package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyDataSource;
import com.monash.erp.oms.party.repository.PartyDataSourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyDataSourceService {

    private final PartyDataSourceRepository repository;

    public PartyDataSourceService(PartyDataSourceRepository repository) {
        this.repository = repository;
    }

    public List<PartyDataSource> list() {
        return repository.findAll();
    }

    public PartyDataSource get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyDataSource %d not found".formatted(id)));
    }

    public PartyDataSource create(PartyDataSource entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyDataSource update(Long id, PartyDataSource entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyDataSource %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}