package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementAttribute;
import com.monash.erp.oms.repository.AgreementAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementAttributeService {

    private final AgreementAttributeRepository repository;

    public AgreementAttributeService(AgreementAttributeRepository repository) {
        this.repository = repository;
    }

    public List<AgreementAttribute> list() {
        return repository.findAll();
    }

    public AgreementAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementAttribute %d not found".formatted(id)));
    }

    public AgreementAttribute create(AgreementAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementAttribute update(Long id, AgreementAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}