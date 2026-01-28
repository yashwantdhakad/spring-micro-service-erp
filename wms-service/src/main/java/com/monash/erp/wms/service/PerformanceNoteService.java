package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PerformanceNote;
import com.monash.erp.wms.repository.PerformanceNoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PerformanceNoteService {

    private final PerformanceNoteRepository repository;

    public PerformanceNoteService(PerformanceNoteRepository repository) {
        this.repository = repository;
    }

    public List<PerformanceNote> list() {
        return repository.findAll();
    }

    public PerformanceNote get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PerformanceNote %d not found".formatted(id)));
    }

    public PerformanceNote create(PerformanceNote entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PerformanceNote update(Long id, PerformanceNote entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PerformanceNote %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}