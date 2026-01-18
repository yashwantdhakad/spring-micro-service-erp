package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.GeoAssoc;
import com.monash.erp.oms.common.repository.GeoAssocRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GeoAssocService {

    private final GeoAssocRepository repository;

    public GeoAssocService(GeoAssocRepository repository) {
        this.repository = repository;
    }

    public List<GeoAssoc> list() {
        return repository.findAll();
    }

    public GeoAssoc get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GeoAssoc %d not found".formatted(id)));
    }

    public GeoAssoc create(GeoAssoc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GeoAssoc update(Long id, GeoAssoc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GeoAssoc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
