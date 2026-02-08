package com.monash.erp.oms.party.security.service;

import com.monash.erp.oms.party.security.entity.UserLoginSession;
import com.monash.erp.oms.party.security.repository.UserLoginSessionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserLoginSessionService {

    private final UserLoginSessionRepository repository;

    public UserLoginSessionService(UserLoginSessionRepository repository) {
        this.repository = repository;
    }

    public List<UserLoginSession> list() {
        return repository.findAll();
    }

    public UserLoginSession get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLoginSession %d not found".formatted(id)));
    }

    public UserLoginSession create(UserLoginSession entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UserLoginSession update(Long id, UserLoginSession entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLoginSession %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
