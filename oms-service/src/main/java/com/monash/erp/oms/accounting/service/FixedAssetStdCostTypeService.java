package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.FixedAssetStdCostType;
import com.monash.erp.oms.accounting.repository.FixedAssetStdCostTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetStdCostTypeService {

    private final FixedAssetStdCostTypeRepository repository;

    public FixedAssetStdCostTypeService(FixedAssetStdCostTypeRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetStdCostType> list() {
        return repository.findAll();
    }

    public FixedAssetStdCostType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetStdCostType %d not found".formatted(id)));
    }

    public FixedAssetStdCostType create(FixedAssetStdCostType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetStdCostType update(Long id, FixedAssetStdCostType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetStdCostType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
