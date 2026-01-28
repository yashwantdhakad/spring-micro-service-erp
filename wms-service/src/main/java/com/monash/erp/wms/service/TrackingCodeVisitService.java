package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TrackingCodeVisit;
import com.monash.erp.wms.repository.TrackingCodeVisitRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TrackingCodeVisitService {

    private final TrackingCodeVisitRepository repository;

    public TrackingCodeVisitService(TrackingCodeVisitRepository repository) {
        this.repository = repository;
    }

    public List<TrackingCodeVisit> list() {
        return repository.findAll();
    }

    public TrackingCodeVisit get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TrackingCodeVisit %d not found".formatted(id)));
    }

    public TrackingCodeVisit create(TrackingCodeVisit entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TrackingCodeVisit update(Long id, TrackingCodeVisit entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TrackingCodeVisit %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}