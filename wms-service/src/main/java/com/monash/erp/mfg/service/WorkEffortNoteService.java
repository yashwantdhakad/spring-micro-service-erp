package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortNote;
import com.monash.erp.mfg.repository.WorkEffortNoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortNoteService {

    private final WorkEffortNoteRepository repository;

    public WorkEffortNoteService(WorkEffortNoteRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortNote> list() {
        return repository.findAll();
    }

    public WorkEffortNote get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortNote %d not found".formatted(id)));
    }

    public WorkEffortNote create(WorkEffortNote entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortNote update(Long id, WorkEffortNote entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortNote %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}