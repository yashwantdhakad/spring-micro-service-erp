package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementEmploymentAppl;
import com.monash.erp.oms.repository.AgreementEmploymentApplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementEmploymentApplService {

    private final AgreementEmploymentApplRepository repository;

    public AgreementEmploymentApplService(AgreementEmploymentApplRepository repository) {
        this.repository = repository;
    }

    public List<AgreementEmploymentAppl> list() {
        return repository.findAll();
    }

    public AgreementEmploymentAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementEmploymentAppl %d not found".formatted(id)));
    }

    public AgreementEmploymentAppl create(AgreementEmploymentAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementEmploymentAppl update(Long id, AgreementEmploymentAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementEmploymentAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}