package com.monash.erp.party.security.service;

import com.monash.erp.party.security.entity.UserAgentType;
import com.monash.erp.party.security.repository.UserAgentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserAgentTypeService {

    private final UserAgentTypeRepository repository;

    public UserAgentTypeService(UserAgentTypeRepository repository) {
        this.repository = repository;
    }

    public List<UserAgentType> list() {
        return repository.findAll();
    }

    public UserAgentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UserAgentType %d not found".formatted(id)));
    }

    public UserAgentType create(UserAgentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UserAgentType update(Long id, UserAgentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UserAgentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}