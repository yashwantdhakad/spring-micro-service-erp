package com.monash.erp.party.service;

import com.monash.erp.party.entity.RoleTypeAttr;
import com.monash.erp.party.repository.RoleTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RoleTypeAttrService {

    private final RoleTypeAttrRepository repository;

    public RoleTypeAttrService(RoleTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<RoleTypeAttr> list() {
        return repository.findAll();
    }

    public RoleTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RoleTypeAttr %d not found".formatted(id)));
    }

    public RoleTypeAttr create(RoleTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RoleTypeAttr update(Long id, RoleTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RoleTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}