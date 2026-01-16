package com.example.erp.party.ofbiz.service;

import com.example.erp.party.ofbiz.domain.RoleType;
import com.example.erp.party.ofbiz.repository.RoleTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RoleTypeService {

    private final RoleTypeRepository repository;

    public RoleTypeService(RoleTypeRepository repository) {
        this.repository = repository;
    }

    public List<RoleType> list() {
        return repository.findAll();
    }

    public RoleType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RoleType %d not found".formatted(id)));
    }

    public RoleType create(RoleType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RoleType update(Long id, RoleType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RoleType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}