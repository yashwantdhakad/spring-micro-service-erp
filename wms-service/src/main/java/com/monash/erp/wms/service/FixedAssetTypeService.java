package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FixedAssetType;
import com.monash.erp.wms.repository.FixedAssetTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetTypeService {

    private final FixedAssetTypeRepository repository;

    public FixedAssetTypeService(FixedAssetTypeRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetType> list() {
        return repository.findAll();
    }

    public FixedAssetType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetType %d not found".formatted(id)));
    }

    public FixedAssetType create(FixedAssetType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetType update(Long id, FixedAssetType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}