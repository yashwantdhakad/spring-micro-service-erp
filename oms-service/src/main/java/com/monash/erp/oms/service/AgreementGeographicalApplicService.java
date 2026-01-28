package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementGeographicalApplic;
import com.monash.erp.oms.repository.AgreementGeographicalApplicRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementGeographicalApplicService {

    private final AgreementGeographicalApplicRepository repository;

    public AgreementGeographicalApplicService(AgreementGeographicalApplicRepository repository) {
        this.repository = repository;
    }

    public List<AgreementGeographicalApplic> list() {
        return repository.findAll();
    }

    public AgreementGeographicalApplic get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementGeographicalApplic %d not found".formatted(id)));
    }

    public AgreementGeographicalApplic create(AgreementGeographicalApplic entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementGeographicalApplic update(Long id, AgreementGeographicalApplic entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementGeographicalApplic %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}