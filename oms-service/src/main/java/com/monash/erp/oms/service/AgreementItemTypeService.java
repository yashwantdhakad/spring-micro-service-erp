package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementItemType;
import com.monash.erp.oms.repository.AgreementItemTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementItemTypeService {

    private final AgreementItemTypeRepository repository;

    public AgreementItemTypeService(AgreementItemTypeRepository repository) {
        this.repository = repository;
    }

    public List<AgreementItemType> list() {
        return repository.findAll();
    }

    public AgreementItemType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementItemType %d not found".formatted(id)));
    }

    public AgreementItemType create(AgreementItemType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementItemType update(Long id, AgreementItemType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementItemType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}