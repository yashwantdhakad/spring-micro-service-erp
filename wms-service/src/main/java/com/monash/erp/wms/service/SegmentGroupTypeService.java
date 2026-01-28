package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SegmentGroupType;
import com.monash.erp.wms.repository.SegmentGroupTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SegmentGroupTypeService {

    private final SegmentGroupTypeRepository repository;

    public SegmentGroupTypeService(SegmentGroupTypeRepository repository) {
        this.repository = repository;
    }

    public List<SegmentGroupType> list() {
        return repository.findAll();
    }

    public SegmentGroupType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SegmentGroupType %d not found".formatted(id)));
    }

    public SegmentGroupType create(SegmentGroupType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SegmentGroupType update(Long id, SegmentGroupType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SegmentGroupType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}