package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SegmentGroupClassification;
import com.monash.erp.wms.repository.SegmentGroupClassificationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SegmentGroupClassificationService {

    private final SegmentGroupClassificationRepository repository;

    public SegmentGroupClassificationService(SegmentGroupClassificationRepository repository) {
        this.repository = repository;
    }

    public List<SegmentGroupClassification> list() {
        return repository.findAll();
    }

    public SegmentGroupClassification get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SegmentGroupClassification %d not found".formatted(id)));
    }

    public SegmentGroupClassification create(SegmentGroupClassification entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SegmentGroupClassification update(Long id, SegmentGroupClassification entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SegmentGroupClassification %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}