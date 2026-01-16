package com.example.erp.party.ofbiz.service;

import com.example.erp.party.ofbiz.domain.PartyRole;
import com.example.erp.party.ofbiz.repository.PartyRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyRoleService {

    private final PartyRoleRepository repository;

    public PartyRoleService(PartyRoleRepository repository) {
        this.repository = repository;
    }

    public List<PartyRole> list() {
        return repository.findAll();
    }

    public PartyRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyRole %d not found".formatted(id)));
    }

    public PartyRole create(PartyRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyRole update(Long id, PartyRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}