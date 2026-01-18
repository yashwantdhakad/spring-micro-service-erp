package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.FixedAssetDepMethod;
import com.monash.erp.oms.accounting.repository.FixedAssetDepMethodRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetDepMethodService {

    private final FixedAssetDepMethodRepository repository;

    public FixedAssetDepMethodService(FixedAssetDepMethodRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetDepMethod> list() {
        return repository.findAll();
    }

    public FixedAssetDepMethod get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetDepMethod %d not found".formatted(id)));
    }

    public FixedAssetDepMethod create(FixedAssetDepMethod entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetDepMethod update(Long id, FixedAssetDepMethod entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetDepMethod %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
