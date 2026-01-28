package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.RecurrenceRule;
import com.monash.erp.wms.repository.RecurrenceRuleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RecurrenceRuleService {

    private final RecurrenceRuleRepository repository;

    public RecurrenceRuleService(RecurrenceRuleRepository repository) {
        this.repository = repository;
    }

    public List<RecurrenceRule> list() {
        return repository.findAll();
    }

    public RecurrenceRule get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RecurrenceRule %d not found".formatted(id)));
    }

    public RecurrenceRule create(RecurrenceRule entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RecurrenceRule update(Long id, RecurrenceRule entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RecurrenceRule %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}