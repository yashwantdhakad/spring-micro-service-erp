package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SegmentGroup;
import com.monash.erp.wms.repository.SegmentGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SegmentGroupService {

    private final SegmentGroupRepository repository;

    public SegmentGroupService(SegmentGroupRepository repository) {
        this.repository = repository;
    }

    public List<SegmentGroup> list() {
        return repository.findAll();
    }

    public SegmentGroup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SegmentGroup %d not found".formatted(id)));
    }

    public SegmentGroup create(SegmentGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SegmentGroup update(Long id, SegmentGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SegmentGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}