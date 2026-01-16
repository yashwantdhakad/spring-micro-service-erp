package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.WorkEffortReview;
import com.example.erp.mfg.ofbiz.repository.WorkEffortReviewRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortReviewService {

    private final WorkEffortReviewRepository repository;

    public WorkEffortReviewService(WorkEffortReviewRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortReview> list() {
        return repository.findAll();
    }

    public WorkEffortReview get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortReview %d not found".formatted(id)));
    }

    public WorkEffortReview create(WorkEffortReview entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortReview update(Long id, WorkEffortReview entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortReview %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}