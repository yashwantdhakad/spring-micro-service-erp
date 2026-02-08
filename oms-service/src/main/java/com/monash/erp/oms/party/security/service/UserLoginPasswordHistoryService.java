package com.monash.erp.oms.party.security.service;

import com.monash.erp.oms.party.security.entity.UserLoginPasswordHistory;
import com.monash.erp.oms.party.security.repository.UserLoginPasswordHistoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserLoginPasswordHistoryService {

    private final UserLoginPasswordHistoryRepository repository;

    public UserLoginPasswordHistoryService(UserLoginPasswordHistoryRepository repository) {
        this.repository = repository;
    }

    public List<UserLoginPasswordHistory> list() {
        return repository.findAll();
    }

    public UserLoginPasswordHistory get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLoginPasswordHistory %d not found".formatted(id)));
    }

    public UserLoginPasswordHistory create(UserLoginPasswordHistory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UserLoginPasswordHistory update(Long id, UserLoginPasswordHistory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLoginPasswordHistory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
