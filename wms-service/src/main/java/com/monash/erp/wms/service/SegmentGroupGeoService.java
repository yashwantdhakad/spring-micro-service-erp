package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SegmentGroupGeo;
import com.monash.erp.wms.repository.SegmentGroupGeoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SegmentGroupGeoService {

    private final SegmentGroupGeoRepository repository;

    public SegmentGroupGeoService(SegmentGroupGeoRepository repository) {
        this.repository = repository;
    }

    public List<SegmentGroupGeo> list() {
        return repository.findAll();
    }

    public SegmentGroupGeo get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SegmentGroupGeo %d not found".formatted(id)));
    }

    public SegmentGroupGeo create(SegmentGroupGeo entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SegmentGroupGeo update(Long id, SegmentGroupGeo entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SegmentGroupGeo %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}