package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ValidResponsibility;
import com.monash.erp.wms.repository.ValidResponsibilityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ValidResponsibilityService {

    private final ValidResponsibilityRepository repository;

    public ValidResponsibilityService(ValidResponsibilityRepository repository) {
        this.repository = repository;
    }

    public List<ValidResponsibility> list() {
        return repository.findAll();
    }

    public ValidResponsibility get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ValidResponsibility %d not found".formatted(id)));
    }

    public ValidResponsibility create(ValidResponsibility entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ValidResponsibility update(Long id, ValidResponsibility entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ValidResponsibility %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}