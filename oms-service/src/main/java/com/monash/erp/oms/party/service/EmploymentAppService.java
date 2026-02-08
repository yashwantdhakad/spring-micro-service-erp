package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.EmploymentApp;
import com.monash.erp.oms.party.repository.EmploymentAppRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmploymentAppService {

    private final EmploymentAppRepository repository;

    public EmploymentAppService(EmploymentAppRepository repository) {
        this.repository = repository;
    }

    public List<EmploymentApp> list() {
        return repository.findAll();
    }

    public EmploymentApp get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmploymentApp %d not found".formatted(id)));
    }

    public EmploymentApp create(EmploymentApp entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmploymentApp update(Long id, EmploymentApp entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmploymentApp %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}