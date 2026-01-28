package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.AbleTrace;
import com.monash.erp.wms.repository.AbleTraceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AbleTraceService {

    private final AbleTraceRepository repository;

    public AbleTraceService(AbleTraceRepository repository) {
        this.repository = repository;
    }

    public List<AbleTrace> list() {
        return repository.findAll();
    }

    public AbleTrace get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AbleTrace %d not found".formatted(id)));
    }

    public AbleTrace create(AbleTrace entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AbleTrace update(Long id, AbleTrace entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AbleTrace %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}