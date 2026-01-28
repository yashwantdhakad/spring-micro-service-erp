package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.GeoPoint;
import com.monash.erp.oms.repository.GeoPointRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GeoPointService {

    private final GeoPointRepository repository;

    public GeoPointService(GeoPointRepository repository) {
        this.repository = repository;
    }

    public List<GeoPoint> list() {
        return repository.findAll();
    }

    public GeoPoint get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GeoPoint %d not found".formatted(id)));
    }

    public GeoPoint create(GeoPoint entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GeoPoint update(Long id, GeoPoint entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GeoPoint %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}