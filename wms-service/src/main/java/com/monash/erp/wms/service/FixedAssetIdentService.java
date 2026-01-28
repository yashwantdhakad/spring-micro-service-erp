package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FixedAssetIdent;
import com.monash.erp.wms.repository.FixedAssetIdentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetIdentService {

    private final FixedAssetIdentRepository repository;

    public FixedAssetIdentService(FixedAssetIdentRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetIdent> list() {
        return repository.findAll();
    }

    public FixedAssetIdent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetIdent %d not found".formatted(id)));
    }

    public FixedAssetIdent create(FixedAssetIdent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetIdent update(Long id, FixedAssetIdent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetIdent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}