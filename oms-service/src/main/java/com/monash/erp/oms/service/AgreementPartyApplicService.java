package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementPartyApplic;
import com.monash.erp.oms.repository.AgreementPartyApplicRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementPartyApplicService {

    private final AgreementPartyApplicRepository repository;

    public AgreementPartyApplicService(AgreementPartyApplicRepository repository) {
        this.repository = repository;
    }

    public List<AgreementPartyApplic> list() {
        return repository.findAll();
    }

    public AgreementPartyApplic get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementPartyApplic %d not found".formatted(id)));
    }

    public AgreementPartyApplic create(AgreementPartyApplic entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementPartyApplic update(Long id, AgreementPartyApplic entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementPartyApplic %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}