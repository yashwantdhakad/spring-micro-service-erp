package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TemporalExpressionAssoc;
import com.monash.erp.wms.repository.TemporalExpressionAssocRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TemporalExpressionAssocService {

    private final TemporalExpressionAssocRepository repository;

    public TemporalExpressionAssocService(TemporalExpressionAssocRepository repository) {
        this.repository = repository;
    }

    public List<TemporalExpressionAssoc> list() {
        return repository.findAll();
    }

    public TemporalExpressionAssoc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TemporalExpressionAssoc %d not found".formatted(id)));
    }

    public TemporalExpressionAssoc create(TemporalExpressionAssoc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TemporalExpressionAssoc update(Long id, TemporalExpressionAssoc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TemporalExpressionAssoc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}