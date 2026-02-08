package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyGeoPoint;
import com.monash.erp.oms.party.repository.PartyGeoPointRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyGeoPointService {

    private final PartyGeoPointRepository repository;

    public PartyGeoPointService(PartyGeoPointRepository repository) {
        this.repository = repository;
    }

    public List<PartyGeoPoint> list() {
        return repository.findAll();
    }

    public PartyGeoPoint get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyGeoPoint %d not found".formatted(id)));
    }

    public PartyGeoPoint create(PartyGeoPoint entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyGeoPoint update(Long id, PartyGeoPoint entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyGeoPoint %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}