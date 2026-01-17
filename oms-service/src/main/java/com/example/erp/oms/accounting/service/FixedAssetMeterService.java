package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.FixedAssetMeter;
import com.example.erp.oms.accounting.repository.FixedAssetMeterRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetMeterService {

    private final FixedAssetMeterRepository repository;

    public FixedAssetMeterService(FixedAssetMeterRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetMeter> list() {
        return repository.findAll();
    }

    public FixedAssetMeter get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetMeter %d not found".formatted(id)));
    }

    public FixedAssetMeter create(FixedAssetMeter entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetMeter update(Long id, FixedAssetMeter entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetMeter %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
