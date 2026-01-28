package com.monash.erp.party.security.service;

import com.monash.erp.party.security.entity.UserPrefGroupType;
import com.monash.erp.party.security.repository.UserPrefGroupTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserPrefGroupTypeService {

    private final UserPrefGroupTypeRepository repository;

    public UserPrefGroupTypeService(UserPrefGroupTypeRepository repository) {
        this.repository = repository;
    }

    public List<UserPrefGroupType> list() {
        return repository.findAll();
    }

    public UserPrefGroupType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UserPrefGroupType %d not found".formatted(id)));
    }

    public UserPrefGroupType create(UserPrefGroupType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UserPrefGroupType update(Long id, UserPrefGroupType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UserPrefGroupType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}