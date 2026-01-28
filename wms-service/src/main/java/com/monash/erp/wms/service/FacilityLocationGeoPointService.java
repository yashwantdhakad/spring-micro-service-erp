package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityLocationGeoPoint;
import com.monash.erp.wms.repository.FacilityLocationGeoPointRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityLocationGeoPointService {

    private final FacilityLocationGeoPointRepository repository;

    public FacilityLocationGeoPointService(FacilityLocationGeoPointRepository repository) {
        this.repository = repository;
    }

    public List<FacilityLocationGeoPoint> list() {
        return repository.findAll();
    }

    public FacilityLocationGeoPoint get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityLocationGeoPoint %d not found".formatted(id)));
    }

    public FacilityLocationGeoPoint create(FacilityLocationGeoPoint entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityLocationGeoPoint update(Long id, FacilityLocationGeoPoint entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityLocationGeoPoint %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}