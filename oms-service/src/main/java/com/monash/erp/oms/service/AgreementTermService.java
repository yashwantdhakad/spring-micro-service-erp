package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementTerm;
import com.monash.erp.oms.repository.AgreementTermRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementTermService {

    private final AgreementTermRepository repository;

    public AgreementTermService(AgreementTermRepository repository) {
        this.repository = repository;
    }

    public List<AgreementTerm> list() {
        return repository.findAll();
    }

    public AgreementTerm get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementTerm %d not found".formatted(id)));
    }

    public AgreementTerm create(AgreementTerm entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementTerm update(Long id, AgreementTerm entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementTerm %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}