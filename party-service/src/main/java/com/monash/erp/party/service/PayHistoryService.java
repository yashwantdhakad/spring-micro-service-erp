package com.monash.erp.party.service;

import com.monash.erp.party.entity.PayHistory;
import com.monash.erp.party.repository.PayHistoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PayHistoryService {

    private final PayHistoryRepository repository;

    public PayHistoryService(PayHistoryRepository repository) {
        this.repository = repository;
    }

    public List<PayHistory> list() {
        return repository.findAll();
    }

    public PayHistory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PayHistory %d not found".formatted(id)));
    }

    public PayHistory create(PayHistory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PayHistory update(Long id, PayHistory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PayHistory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}