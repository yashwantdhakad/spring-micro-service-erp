package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementWorkEffortApplic;
import com.monash.erp.oms.repository.AgreementWorkEffortApplicRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementWorkEffortApplicService {

    private final AgreementWorkEffortApplicRepository repository;

    public AgreementWorkEffortApplicService(AgreementWorkEffortApplicRepository repository) {
        this.repository = repository;
    }

    public List<AgreementWorkEffortApplic> list() {
        return repository.findAll();
    }

    public AgreementWorkEffortApplic get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementWorkEffortApplic %d not found".formatted(id)));
    }

    public AgreementWorkEffortApplic create(AgreementWorkEffortApplic entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementWorkEffortApplic update(Long id, AgreementWorkEffortApplic entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementWorkEffortApplic %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}