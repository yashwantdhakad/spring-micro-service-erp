package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.AccommodationMap;
import com.monash.erp.wms.repository.AccommodationMapRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AccommodationMapService {

    private final AccommodationMapRepository repository;

    public AccommodationMapService(AccommodationMapRepository repository) {
        this.repository = repository;
    }

    public List<AccommodationMap> list() {
        return repository.findAll();
    }

    public AccommodationMap get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AccommodationMap %d not found".formatted(id)));
    }

    public AccommodationMap create(AccommodationMap entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AccommodationMap update(Long id, AccommodationMap entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AccommodationMap %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}