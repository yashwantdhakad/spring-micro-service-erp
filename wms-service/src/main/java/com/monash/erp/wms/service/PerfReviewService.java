package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PerfReview;
import com.monash.erp.wms.repository.PerfReviewRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PerfReviewService {

    private final PerfReviewRepository repository;

    public PerfReviewService(PerfReviewRepository repository) {
        this.repository = repository;
    }

    public List<PerfReview> list() {
        return repository.findAll();
    }

    public PerfReview get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PerfReview %d not found".formatted(id)));
    }

    public PerfReview create(PerfReview entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PerfReview update(Long id, PerfReview entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PerfReview %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}