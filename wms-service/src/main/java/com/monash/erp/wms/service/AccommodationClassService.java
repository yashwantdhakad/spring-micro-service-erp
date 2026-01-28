package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.AccommodationClass;
import com.monash.erp.wms.repository.AccommodationClassRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AccommodationClassService {

    private final AccommodationClassRepository repository;

    public AccommodationClassService(AccommodationClassRepository repository) {
        this.repository = repository;
    }

    public List<AccommodationClass> list() {
        return repository.findAll();
    }

    public AccommodationClass get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AccommodationClass %d not found".formatted(id)));
    }

    public AccommodationClass create(AccommodationClass entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AccommodationClass update(Long id, AccommodationClass entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AccommodationClass %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}