package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ReturnReason;
import com.monash.erp.wms.repository.ReturnReasonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReturnReasonService {

    private final ReturnReasonRepository repository;

    public ReturnReasonService(ReturnReasonRepository repository) {
        this.repository = repository;
    }

    public List<ReturnReason> list() {
        return repository.findAll();
    }

    public ReturnReason get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnReason %d not found".formatted(id)));
    }

    public ReturnReason create(ReturnReason entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ReturnReason update(Long id, ReturnReason entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnReason %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}