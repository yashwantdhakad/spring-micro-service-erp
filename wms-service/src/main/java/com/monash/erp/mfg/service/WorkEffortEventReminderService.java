package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortEventReminder;
import com.monash.erp.mfg.repository.WorkEffortEventReminderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortEventReminderService {

    private final WorkEffortEventReminderRepository repository;

    public WorkEffortEventReminderService(WorkEffortEventReminderRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortEventReminder> list() {
        return repository.findAll();
    }

    public WorkEffortEventReminder get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortEventReminder %d not found".formatted(id)));
    }

    public WorkEffortEventReminder create(WorkEffortEventReminder entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortEventReminder update(Long id, WorkEffortEventReminder entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortEventReminder %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}