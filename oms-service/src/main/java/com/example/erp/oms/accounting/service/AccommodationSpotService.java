package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.AccommodationSpot;
import com.example.erp.oms.accounting.repository.AccommodationSpotRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AccommodationSpotService {

    private final AccommodationSpotRepository repository;

    public AccommodationSpotService(AccommodationSpotRepository repository) {
        this.repository = repository;
    }

    public List<AccommodationSpot> list() {
        return repository.findAll();
    }

    public AccommodationSpot get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AccommodationSpot %d not found".formatted(id)));
    }

    public AccommodationSpot create(AccommodationSpot entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AccommodationSpot update(Long id, AccommodationSpot entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AccommodationSpot %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
