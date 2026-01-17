package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.UserPreference;
import com.example.erp.oms.common.repository.UserPreferenceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserPreferenceService {

    private final UserPreferenceRepository repository;

    public UserPreferenceService(UserPreferenceRepository repository) {
        this.repository = repository;
    }

    public List<UserPreference> list() {
        return repository.findAll();
    }

    public UserPreference get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UserPreference %d not found".formatted(id)));
    }

    public UserPreference create(UserPreference entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UserPreference update(Long id, UserPreference entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UserPreference %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
