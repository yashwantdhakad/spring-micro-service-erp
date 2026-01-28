package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.StatusType;
import com.monash.erp.oms.repository.StatusTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StatusTypeService {

    private final StatusTypeRepository repository;

    public StatusTypeService(StatusTypeRepository repository) {
        this.repository = repository;
    }

    public List<StatusType> list() {
        return repository.findAll();
    }

    public StatusType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "StatusType %d not found".formatted(id)));
    }

    public StatusType create(StatusType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public StatusType update(Long id, StatusType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "StatusType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}