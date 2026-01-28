package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.StandardTimePeriod;
import com.monash.erp.oms.repository.StandardTimePeriodRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StandardTimePeriodService {

    private final StandardTimePeriodRepository repository;

    public StandardTimePeriodService(StandardTimePeriodRepository repository) {
        this.repository = repository;
    }

    public List<StandardTimePeriod> list() {
        return repository.findAll();
    }

    public StandardTimePeriod get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "StandardTimePeriod %d not found".formatted(id)));
    }

    public StandardTimePeriod create(StandardTimePeriod entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public StandardTimePeriod update(Long id, StandardTimePeriod entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "StandardTimePeriod %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}