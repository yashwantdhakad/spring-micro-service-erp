package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.Agreement;
import com.monash.erp.oms.repository.AgreementRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementService {

    private final AgreementRepository repository;

    public AgreementService(AgreementRepository repository) {
        this.repository = repository;
    }

    public List<Agreement> list() {
        return repository.findAll();
    }

    public Agreement get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Agreement %d not found".formatted(id)));
    }

    public Agreement create(Agreement entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Agreement update(Long id, Agreement entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Agreement %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}