package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.FixedAssetAttribute;
import com.example.erp.oms.accounting.repository.FixedAssetAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetAttributeService {

    private final FixedAssetAttributeRepository repository;

    public FixedAssetAttributeService(FixedAssetAttributeRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetAttribute> list() {
        return repository.findAll();
    }

    public FixedAssetAttribute get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetAttribute %d not found".formatted(id)));
    }

    public FixedAssetAttribute create(FixedAssetAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetAttribute update(Long id, FixedAssetAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
