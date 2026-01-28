package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.QuantityBreak;
import com.monash.erp.wms.repository.QuantityBreakRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuantityBreakService {

    private final QuantityBreakRepository repository;

    public QuantityBreakService(QuantityBreakRepository repository) {
        this.repository = repository;
    }

    public List<QuantityBreak> list() {
        return repository.findAll();
    }

    public QuantityBreak get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuantityBreak %d not found".formatted(id)));
    }

    public QuantityBreak create(QuantityBreak entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuantityBreak update(Long id, QuantityBreak entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuantityBreak %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}