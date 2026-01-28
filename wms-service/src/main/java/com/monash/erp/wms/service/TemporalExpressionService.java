package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TemporalExpression;
import com.monash.erp.wms.repository.TemporalExpressionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TemporalExpressionService {

    private final TemporalExpressionRepository repository;

    public TemporalExpressionService(TemporalExpressionRepository repository) {
        this.repository = repository;
    }

    public List<TemporalExpression> list() {
        return repository.findAll();
    }

    public TemporalExpression get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TemporalExpression %d not found".formatted(id)));
    }

    public TemporalExpression create(TemporalExpression entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TemporalExpression update(Long id, TemporalExpression entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TemporalExpression %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}