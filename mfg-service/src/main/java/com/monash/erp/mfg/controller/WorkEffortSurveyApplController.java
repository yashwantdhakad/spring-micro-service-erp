package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortSurveyAppl;
import com.monash.erp.mfg.service.WorkEffortSurveyApplService;
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
@RequestMapping("/api/work-effort-survey-appls")
public class WorkEffortSurveyApplController {

    private final WorkEffortSurveyApplService service;

    public WorkEffortSurveyApplController(WorkEffortSurveyApplService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortSurveyAppl> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortSurveyAppl get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortSurveyAppl> create(@RequestBody WorkEffortSurveyAppl entity) {
        WorkEffortSurveyAppl created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortSurveyAppl update(@PathVariable Long id, @RequestBody WorkEffortSurveyAppl entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}