package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.FixedAssetProduct;
import com.example.erp.oms.accounting.repository.FixedAssetProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetProductService {

    private final FixedAssetProductRepository repository;

    public FixedAssetProductService(FixedAssetProductRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetProduct> list() {
        return repository.findAll();
    }

    public FixedAssetProduct get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetProduct %d not found".formatted(id)));
    }

    public FixedAssetProduct create(FixedAssetProduct entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetProduct update(Long id, FixedAssetProduct entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetProduct %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
