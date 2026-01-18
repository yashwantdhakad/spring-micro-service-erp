package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.SettlementTerm;
import com.monash.erp.oms.accounting.repository.SettlementTermRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SettlementTermService {

    private final SettlementTermRepository repository;

    public SettlementTermService(SettlementTermRepository repository) {
        this.repository = repository;
    }

    public List<SettlementTerm> list() {
        return repository.findAll();
    }

    public SettlementTerm get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SettlementTerm %d not found".formatted(id)));
    }

    public SettlementTerm create(SettlementTerm entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SettlementTerm update(Long id, SettlementTerm entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SettlementTerm %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
