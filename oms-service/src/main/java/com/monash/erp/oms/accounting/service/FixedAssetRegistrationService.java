package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.FixedAssetRegistration;
import com.monash.erp.oms.accounting.repository.FixedAssetRegistrationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetRegistrationService {

    private final FixedAssetRegistrationRepository repository;

    public FixedAssetRegistrationService(FixedAssetRegistrationRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetRegistration> list() {
        return repository.findAll();
    }

    public FixedAssetRegistration get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetRegistration %d not found".formatted(id)));
    }

    public FixedAssetRegistration create(FixedAssetRegistration entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetRegistration update(Long id, FixedAssetRegistration entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetRegistration %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
