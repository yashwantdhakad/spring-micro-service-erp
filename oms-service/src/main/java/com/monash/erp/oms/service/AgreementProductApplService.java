package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementProductAppl;
import com.monash.erp.oms.repository.AgreementProductApplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementProductApplService {

    private final AgreementProductApplRepository repository;

    public AgreementProductApplService(AgreementProductApplRepository repository) {
        this.repository = repository;
    }

    public List<AgreementProductAppl> list() {
        return repository.findAll();
    }

    public AgreementProductAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementProductAppl %d not found".formatted(id)));
    }

    public AgreementProductAppl create(AgreementProductAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementProductAppl update(Long id, AgreementProductAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementProductAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}