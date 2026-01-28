package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementItemAttribute;
import com.monash.erp.oms.repository.AgreementItemAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementItemAttributeService {

    private final AgreementItemAttributeRepository repository;

    public AgreementItemAttributeService(AgreementItemAttributeRepository repository) {
        this.repository = repository;
    }

    public List<AgreementItemAttribute> list() {
        return repository.findAll();
    }

    public AgreementItemAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementItemAttribute %d not found".formatted(id)));
    }

    public AgreementItemAttribute create(AgreementItemAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementItemAttribute update(Long id, AgreementItemAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementItemAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}