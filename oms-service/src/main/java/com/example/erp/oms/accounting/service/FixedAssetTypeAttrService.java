package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.FixedAssetTypeAttr;
import com.example.erp.oms.accounting.repository.FixedAssetTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetTypeAttrService {

    private final FixedAssetTypeAttrRepository repository;

    public FixedAssetTypeAttrService(FixedAssetTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetTypeAttr> list() {
        return repository.findAll();
    }

    public FixedAssetTypeAttr get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetTypeAttr %d not found".formatted(id)));
    }

    public FixedAssetTypeAttr create(FixedAssetTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetTypeAttr update(Long id, FixedAssetTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
