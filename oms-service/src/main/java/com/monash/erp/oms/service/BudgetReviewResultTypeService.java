package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.BudgetReviewResultType;
import com.monash.erp.oms.repository.BudgetReviewResultTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetReviewResultTypeService {

    private final BudgetReviewResultTypeRepository repository;

    public BudgetReviewResultTypeService(BudgetReviewResultTypeRepository repository) {
        this.repository = repository;
    }

    public List<BudgetReviewResultType> list() {
        return repository.findAll();
    }

    public BudgetReviewResultType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetReviewResultType %d not found".formatted(id)));
    }

    public BudgetReviewResultType create(BudgetReviewResultType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetReviewResultType update(Long id, BudgetReviewResultType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetReviewResultType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}