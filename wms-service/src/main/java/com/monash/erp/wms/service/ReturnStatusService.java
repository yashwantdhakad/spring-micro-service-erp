package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ReturnStatus;
import com.monash.erp.wms.repository.ReturnStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReturnStatusService {

    private final ReturnStatusRepository repository;

    public ReturnStatusService(ReturnStatusRepository repository) {
        this.repository = repository;
    }

    public List<ReturnStatus> list() {
        return repository.findAll();
    }

    public ReturnStatus get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnStatus %d not found".formatted(id)));
    }

    public ReturnStatus create(ReturnStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ReturnStatus update(Long id, ReturnStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}