package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.FixedAssetProductType;
import com.example.erp.oms.accounting.repository.FixedAssetProductTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetProductTypeService {

    private final FixedAssetProductTypeRepository repository;

    public FixedAssetProductTypeService(FixedAssetProductTypeRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetProductType> list() {
        return repository.findAll();
    }

    public FixedAssetProductType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetProductType %d not found".formatted(id)));
    }

    public FixedAssetProductType create(FixedAssetProductType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetProductType update(Long id, FixedAssetProductType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetProductType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
