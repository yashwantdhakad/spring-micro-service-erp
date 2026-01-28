package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.Approval;
import com.monash.erp.oms.repository.ApprovalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ApprovalService {

    private final ApprovalRepository repository;

    public ApprovalService(ApprovalRepository repository) {
        this.repository = repository;
    }

    public List<Approval> list() {
        return repository.findAll();
    }

    public Approval get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Approval %d not found".formatted(id)));
    }

    public Approval create(Approval entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Approval update(Long id, Approval entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Approval %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}