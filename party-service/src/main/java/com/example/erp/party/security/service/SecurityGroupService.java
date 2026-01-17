package com.example.erp.party.security.service;

import com.example.erp.party.security.domain.SecurityGroup;
import com.example.erp.party.security.repository.SecurityGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SecurityGroupService {

    private final SecurityGroupRepository repository;

    public SecurityGroupService(SecurityGroupRepository repository) {
        this.repository = repository;
    }

    public List<SecurityGroup> list() {
        return repository.findAll();
    }

    public SecurityGroup get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SecurityGroup %d not found".formatted(id)));
    }

    public SecurityGroup create(SecurityGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SecurityGroup update(Long id, SecurityGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SecurityGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
