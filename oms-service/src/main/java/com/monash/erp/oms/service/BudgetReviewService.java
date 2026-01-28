package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.BudgetReview;
import com.monash.erp.oms.repository.BudgetReviewRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetReviewService {

    private final BudgetReviewRepository repository;

    public BudgetReviewService(BudgetReviewRepository repository) {
        this.repository = repository;
    }

    public List<BudgetReview> list() {
        return repository.findAll();
    }

    public BudgetReview get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetReview %d not found".formatted(id)));
    }

    public BudgetReview create(BudgetReview entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetReview update(Long id, BudgetReview entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetReview %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}