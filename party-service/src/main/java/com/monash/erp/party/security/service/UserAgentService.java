package com.monash.erp.party.security.service;

import com.monash.erp.party.security.entity.UserAgent;
import com.monash.erp.party.security.repository.UserAgentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserAgentService {

    private final UserAgentRepository repository;

    public UserAgentService(UserAgentRepository repository) {
        this.repository = repository;
    }

    public List<UserAgent> list() {
        return repository.findAll();
    }

    public UserAgent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UserAgent %d not found".formatted(id)));
    }

    public UserAgent create(UserAgent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UserAgent update(Long id, UserAgent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UserAgent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}