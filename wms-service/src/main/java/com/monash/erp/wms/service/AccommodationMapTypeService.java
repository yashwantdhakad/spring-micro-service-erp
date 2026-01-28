package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.AccommodationMapType;
import com.monash.erp.wms.repository.AccommodationMapTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AccommodationMapTypeService {

    private final AccommodationMapTypeRepository repository;

    public AccommodationMapTypeService(AccommodationMapTypeRepository repository) {
        this.repository = repository;
    }

    public List<AccommodationMapType> list() {
        return repository.findAll();
    }

    public AccommodationMapType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AccommodationMapType %d not found".formatted(id)));
    }

    public AccommodationMapType create(AccommodationMapType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AccommodationMapType update(Long id, AccommodationMapType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AccommodationMapType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}