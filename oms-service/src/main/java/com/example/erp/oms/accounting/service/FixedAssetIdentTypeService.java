package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.FixedAssetIdentType;
import com.example.erp.oms.accounting.repository.FixedAssetIdentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetIdentTypeService {

    private final FixedAssetIdentTypeRepository repository;

    public FixedAssetIdentTypeService(FixedAssetIdentTypeRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetIdentType> list() {
        return repository.findAll();
    }

    public FixedAssetIdentType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetIdentType %d not found".formatted(id)));
    }

    public FixedAssetIdentType create(FixedAssetIdentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetIdentType update(Long id, FixedAssetIdentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetIdentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
