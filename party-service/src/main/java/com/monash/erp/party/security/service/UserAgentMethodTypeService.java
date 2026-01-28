package com.monash.erp.party.security.service;

import com.monash.erp.party.security.entity.UserAgentMethodType;
import com.monash.erp.party.security.repository.UserAgentMethodTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserAgentMethodTypeService {

    private final UserAgentMethodTypeRepository repository;

    public UserAgentMethodTypeService(UserAgentMethodTypeRepository repository) {
        this.repository = repository;
    }

    public List<UserAgentMethodType> list() {
        return repository.findAll();
    }

    public UserAgentMethodType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UserAgentMethodType %d not found".formatted(id)));
    }

    public UserAgentMethodType create(UserAgentMethodType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UserAgentMethodType update(Long id, UserAgentMethodType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UserAgentMethodType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}