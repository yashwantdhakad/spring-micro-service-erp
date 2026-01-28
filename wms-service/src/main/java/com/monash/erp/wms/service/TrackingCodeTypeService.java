package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TrackingCodeType;
import com.monash.erp.wms.repository.TrackingCodeTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TrackingCodeTypeService {

    private final TrackingCodeTypeRepository repository;

    public TrackingCodeTypeService(TrackingCodeTypeRepository repository) {
        this.repository = repository;
    }

    public List<TrackingCodeType> list() {
        return repository.findAll();
    }

    public TrackingCodeType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TrackingCodeType %d not found".formatted(id)));
    }

    public TrackingCodeType create(TrackingCodeType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TrackingCodeType update(Long id, TrackingCodeType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TrackingCodeType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}