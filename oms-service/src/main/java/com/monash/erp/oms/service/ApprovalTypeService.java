package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.ApprovalType;
import com.monash.erp.oms.repository.ApprovalTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ApprovalTypeService {

    private final ApprovalTypeRepository repository;

    public ApprovalTypeService(ApprovalTypeRepository repository) {
        this.repository = repository;
    }

    public List<ApprovalType> list() {
        return repository.findAll();
    }

    public ApprovalType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ApprovalType %d not found".formatted(id)));
    }

    public ApprovalType create(ApprovalType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ApprovalType update(Long id, ApprovalType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ApprovalType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}