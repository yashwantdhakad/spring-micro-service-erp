package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.GeoAssocType;
import com.example.erp.oms.common.repository.GeoAssocTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GeoAssocTypeService {

    private final GeoAssocTypeRepository repository;

    public GeoAssocTypeService(GeoAssocTypeRepository repository) {
        this.repository = repository;
    }

    public List<GeoAssocType> list() {
        return repository.findAll();
    }

    public GeoAssocType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GeoAssocType %d not found".formatted(id)));
    }

    public GeoAssocType create(GeoAssocType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GeoAssocType update(Long id, GeoAssocType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GeoAssocType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
