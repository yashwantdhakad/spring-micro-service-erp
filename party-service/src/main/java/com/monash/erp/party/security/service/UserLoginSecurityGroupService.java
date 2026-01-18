package com.monash.erp.party.security.service;

import com.monash.erp.party.security.entity.UserLoginSecurityGroup;
import com.monash.erp.party.security.repository.UserLoginSecurityGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserLoginSecurityGroupService {

    private final UserLoginSecurityGroupRepository repository;

    public UserLoginSecurityGroupService(UserLoginSecurityGroupRepository repository) {
        this.repository = repository;
    }

    public List<UserLoginSecurityGroup> list() {
        return repository.findAll();
    }

    public UserLoginSecurityGroup get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLoginSecurityGroup %d not found".formatted(id)));
    }

    public UserLoginSecurityGroup create(UserLoginSecurityGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UserLoginSecurityGroup update(Long id, UserLoginSecurityGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLoginSecurityGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
