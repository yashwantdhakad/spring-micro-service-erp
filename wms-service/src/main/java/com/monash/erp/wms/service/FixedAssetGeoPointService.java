package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FixedAssetGeoPoint;
import com.monash.erp.wms.repository.FixedAssetGeoPointRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetGeoPointService {

    private final FixedAssetGeoPointRepository repository;

    public FixedAssetGeoPointService(FixedAssetGeoPointRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetGeoPoint> list() {
        return repository.findAll();
    }

    public FixedAssetGeoPoint get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetGeoPoint %d not found".formatted(id)));
    }

    public FixedAssetGeoPoint create(FixedAssetGeoPoint entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetGeoPoint update(Long id, FixedAssetGeoPoint entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetGeoPoint %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}