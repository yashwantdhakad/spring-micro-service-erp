package com.monash.erp.party.service;

import com.monash.erp.party.entity.Employment;
import com.monash.erp.party.repository.EmploymentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmploymentService {

    private final EmploymentRepository repository;

    public EmploymentService(EmploymentRepository repository) {
        this.repository = repository;
    }

    public List<Employment> list() {
        return repository.findAll();
    }

    public Employment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employment %d not found".formatted(id)));
    }

    public Employment create(Employment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Employment update(Long id, Employment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}