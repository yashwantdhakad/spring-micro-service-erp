package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementTypeAttr;
import com.monash.erp.oms.repository.AgreementTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementTypeAttrService {

    private final AgreementTypeAttrRepository repository;

    public AgreementTypeAttrService(AgreementTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<AgreementTypeAttr> list() {
        return repository.findAll();
    }

    public AgreementTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementTypeAttr %d not found".formatted(id)));
    }

    public AgreementTypeAttr create(AgreementTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementTypeAttr update(Long id, AgreementTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}