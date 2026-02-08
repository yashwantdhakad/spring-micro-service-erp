package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortEventReminder;
import com.monash.erp.mfg.service.WorkEffortEventReminderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/work-effort-event-reminders")
public class WorkEffortEventReminderController {

    private final WorkEffortEventReminderService service;

    public WorkEffortEventReminderController(WorkEffortEventReminderService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortEventReminder> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortEventReminder get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortEventReminder> create(@RequestBody WorkEffortEventReminder entity) {
        WorkEffortEventReminder created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortEventReminder update(@PathVariable Long id, @RequestBody WorkEffortEventReminder entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}