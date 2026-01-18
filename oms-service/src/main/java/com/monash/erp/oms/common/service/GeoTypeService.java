package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.GeoType;
import com.monash.erp.oms.common.repository.GeoTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GeoTypeService {

    private final GeoTypeRepository repository;

    public GeoTypeService(GeoTypeRepository repository) {
        this.repository = repository;
    }

    public List<GeoType> list() {
        return repository.findAll();
    }

    public GeoType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GeoType %d not found".formatted(id)));
    }

    public GeoType create(GeoType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GeoType update(Long id, GeoType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GeoType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
