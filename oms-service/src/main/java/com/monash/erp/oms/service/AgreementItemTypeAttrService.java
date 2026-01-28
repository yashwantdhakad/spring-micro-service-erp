package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementItemTypeAttr;
import com.monash.erp.oms.repository.AgreementItemTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementItemTypeAttrService {

    private final AgreementItemTypeAttrRepository repository;

    public AgreementItemTypeAttrService(AgreementItemTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<AgreementItemTypeAttr> list() {
        return repository.findAll();
    }

    public AgreementItemTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementItemTypeAttr %d not found".formatted(id)));
    }

    public AgreementItemTypeAttr create(AgreementItemTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementItemTypeAttr update(Long id, AgreementItemTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementItemTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}