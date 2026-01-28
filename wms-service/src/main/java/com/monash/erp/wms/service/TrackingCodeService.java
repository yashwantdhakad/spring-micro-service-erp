package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TrackingCode;
import com.monash.erp.wms.repository.TrackingCodeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TrackingCodeService {

    private final TrackingCodeRepository repository;

    public TrackingCodeService(TrackingCodeRepository repository) {
        this.repository = repository;
    }

    public List<TrackingCode> list() {
        return repository.findAll();
    }

    public TrackingCode get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TrackingCode %d not found".formatted(id)));
    }

    public TrackingCode create(TrackingCode entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TrackingCode update(Long id, TrackingCode entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TrackingCode %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}