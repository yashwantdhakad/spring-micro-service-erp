package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FixedAssetMaintMeter;
import com.monash.erp.wms.repository.FixedAssetMaintMeterRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetMaintMeterService {

    private final FixedAssetMaintMeterRepository repository;

    public FixedAssetMaintMeterService(FixedAssetMaintMeterRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetMaintMeter> list() {
        return repository.findAll();
    }

    public FixedAssetMaintMeter get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetMaintMeter %d not found".formatted(id)));
    }

    public FixedAssetMaintMeter create(FixedAssetMaintMeter entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetMaintMeter update(Long id, FixedAssetMaintMeter entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetMaintMeter %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}