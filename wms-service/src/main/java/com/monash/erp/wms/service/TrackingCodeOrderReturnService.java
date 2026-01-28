package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TrackingCodeOrderReturn;
import com.monash.erp.wms.repository.TrackingCodeOrderReturnRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TrackingCodeOrderReturnService {

    private final TrackingCodeOrderReturnRepository repository;

    public TrackingCodeOrderReturnService(TrackingCodeOrderReturnRepository repository) {
        this.repository = repository;
    }

    public List<TrackingCodeOrderReturn> list() {
        return repository.findAll();
    }

    public TrackingCodeOrderReturn get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TrackingCodeOrderReturn %d not found".formatted(id)));
    }

    public TrackingCodeOrderReturn create(TrackingCodeOrderReturn entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TrackingCodeOrderReturn update(Long id, TrackingCodeOrderReturn entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TrackingCodeOrderReturn %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}