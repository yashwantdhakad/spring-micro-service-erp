package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementType;
import com.monash.erp.oms.repository.AgreementTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementTypeService {

    private final AgreementTypeRepository repository;

    public AgreementTypeService(AgreementTypeRepository repository) {
        this.repository = repository;
    }

    public List<AgreementType> list() {
        return repository.findAll();
    }

    public AgreementType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementType %d not found".formatted(id)));
    }

    public AgreementType create(AgreementType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementType update(Long id, AgreementType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}