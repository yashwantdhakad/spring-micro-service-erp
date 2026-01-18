package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.Deduction;
import com.monash.erp.oms.accounting.repository.DeductionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DeductionService {

    private final DeductionRepository repository;

    public DeductionService(DeductionRepository repository) {
        this.repository = repository;
    }

    public List<Deduction> list() {
        return repository.findAll();
    }

    public Deduction get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Deduction %d not found".formatted(id)));
    }

    public Deduction create(Deduction entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Deduction update(Long id, Deduction entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Deduction %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
