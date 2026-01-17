package com.example.erp.party.security.service;

import com.example.erp.party.security.domain.UserLoginHistory;
import com.example.erp.party.security.repository.UserLoginHistoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserLoginHistoryService {

    private final UserLoginHistoryRepository repository;

    public UserLoginHistoryService(UserLoginHistoryRepository repository) {
        this.repository = repository;
    }

    public List<UserLoginHistory> list() {
        return repository.findAll();
    }

    public UserLoginHistory get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLoginHistory %d not found".formatted(id)));
    }

    public UserLoginHistory create(UserLoginHistory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UserLoginHistory update(Long id, UserLoginHistory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLoginHistory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
