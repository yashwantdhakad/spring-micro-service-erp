package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.CustomTimePeriod;
import com.example.erp.oms.common.repository.CustomTimePeriodRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustomTimePeriodService {

    private final CustomTimePeriodRepository repository;

    public CustomTimePeriodService(CustomTimePeriodRepository repository) {
        this.repository = repository;
    }

    public List<CustomTimePeriod> list() {
        return repository.findAll();
    }

    public CustomTimePeriod get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustomTimePeriod %d not found".formatted(id)));
    }

    public CustomTimePeriod create(CustomTimePeriod entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustomTimePeriod update(Long id, CustomTimePeriod entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustomTimePeriod %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
