package com.monash.erp.party.security.service;

import com.monash.erp.party.security.entity.UserLogin;
import com.monash.erp.party.security.repository.UserLoginRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserLoginService {

    private final UserLoginRepository repository;

    public UserLoginService(UserLoginRepository repository) {
        this.repository = repository;
    }

    public List<UserLogin> list() {
        return repository.findAll();
    }

    public UserLogin get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLogin %d not found".formatted(id)));
    }

    public UserLogin create(UserLogin entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UserLogin update(Long id, UserLogin entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLogin %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
