package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.FixedAssetStdCost;
import com.monash.erp.oms.accounting.repository.FixedAssetStdCostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetStdCostService {

    private final FixedAssetStdCostRepository repository;

    public FixedAssetStdCostService(FixedAssetStdCostRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetStdCost> list() {
        return repository.findAll();
    }

    public FixedAssetStdCost get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetStdCost %d not found".formatted(id)));
    }

    public FixedAssetStdCost create(FixedAssetStdCost entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetStdCost update(Long id, FixedAssetStdCost entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetStdCost %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
