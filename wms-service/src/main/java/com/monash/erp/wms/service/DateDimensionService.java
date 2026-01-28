package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.DateDimension;
import com.monash.erp.wms.repository.DateDimensionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DateDimensionService {

    private final DateDimensionRepository repository;

    public DateDimensionService(DateDimensionRepository repository) {
        this.repository = repository;
    }

    public List<DateDimension> list() {
        return repository.findAll();
    }

    public DateDimension get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DateDimension %d not found".formatted(id)));
    }

    public DateDimension create(DateDimension entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DateDimension update(Long id, DateDimension entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DateDimension %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}