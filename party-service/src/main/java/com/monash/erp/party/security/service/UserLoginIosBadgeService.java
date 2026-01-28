package com.monash.erp.party.security.service;

import com.monash.erp.party.security.entity.UserLoginIosBadge;
import com.monash.erp.party.security.repository.UserLoginIosBadgeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserLoginIosBadgeService {

    private final UserLoginIosBadgeRepository repository;

    public UserLoginIosBadgeService(UserLoginIosBadgeRepository repository) {
        this.repository = repository;
    }

    public List<UserLoginIosBadge> list() {
        return repository.findAll();
    }

    public UserLoginIosBadge get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLoginIosBadge %d not found".formatted(id)));
    }

    public UserLoginIosBadge create(UserLoginIosBadge entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UserLoginIosBadge update(Long id, UserLoginIosBadge entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLoginIosBadge %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}