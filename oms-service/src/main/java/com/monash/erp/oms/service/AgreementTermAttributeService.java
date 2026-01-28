package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementTermAttribute;
import com.monash.erp.oms.repository.AgreementTermAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementTermAttributeService {

    private final AgreementTermAttributeRepository repository;

    public AgreementTermAttributeService(AgreementTermAttributeRepository repository) {
        this.repository = repository;
    }

    public List<AgreementTermAttribute> list() {
        return repository.findAll();
    }

    public AgreementTermAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementTermAttribute %d not found".formatted(id)));
    }

    public AgreementTermAttribute create(AgreementTermAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementTermAttribute update(Long id, AgreementTermAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementTermAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}