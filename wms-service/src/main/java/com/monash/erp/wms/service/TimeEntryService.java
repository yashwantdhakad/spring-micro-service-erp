package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TimeEntry;
import com.monash.erp.wms.repository.TimeEntryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TimeEntryService {

    private final TimeEntryRepository repository;

    public TimeEntryService(TimeEntryRepository repository) {
        this.repository = repository;
    }

    public List<TimeEntry> list() {
        return repository.findAll();
    }

    public TimeEntry get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TimeEntry %d not found".formatted(id)));
    }

    public TimeEntry create(TimeEntry entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TimeEntry update(Long id, TimeEntry entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TimeEntry %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}