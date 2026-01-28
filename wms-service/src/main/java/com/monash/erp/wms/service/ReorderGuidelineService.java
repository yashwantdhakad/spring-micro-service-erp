package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ReorderGuideline;
import com.monash.erp.wms.repository.ReorderGuidelineRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReorderGuidelineService {

    private final ReorderGuidelineRepository repository;

    public ReorderGuidelineService(ReorderGuidelineRepository repository) {
        this.repository = repository;
    }

    public List<ReorderGuideline> list() {
        return repository.findAll();
    }

    public ReorderGuideline get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReorderGuideline %d not found".formatted(id)));
    }

    public ReorderGuideline create(ReorderGuideline entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ReorderGuideline update(Long id, ReorderGuideline entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReorderGuideline %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}