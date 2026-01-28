package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PerfReviewItemType;
import com.monash.erp.wms.repository.PerfReviewItemTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PerfReviewItemTypeService {

    private final PerfReviewItemTypeRepository repository;

    public PerfReviewItemTypeService(PerfReviewItemTypeRepository repository) {
        this.repository = repository;
    }

    public List<PerfReviewItemType> list() {
        return repository.findAll();
    }

    public PerfReviewItemType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PerfReviewItemType %d not found".formatted(id)));
    }

    public PerfReviewItemType create(PerfReviewItemType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PerfReviewItemType update(Long id, PerfReviewItemType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PerfReviewItemType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}