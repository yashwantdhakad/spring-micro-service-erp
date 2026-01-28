package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FixedAsset;
import com.monash.erp.wms.repository.FixedAssetRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetService {

    private final FixedAssetRepository repository;

    public FixedAssetService(FixedAssetRepository repository) {
        this.repository = repository;
    }

    public List<FixedAsset> list() {
        return repository.findAll();
    }

    public FixedAsset get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAsset %d not found".formatted(id)));
    }

    public FixedAsset create(FixedAsset entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAsset update(Long id, FixedAsset entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAsset %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}