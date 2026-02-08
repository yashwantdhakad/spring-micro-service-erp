package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.JobInterviewType;
import com.monash.erp.oms.party.service.JobInterviewTypeService;
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
@RequestMapping("/api/job-interview-types")
public class JobInterviewTypeController {

    private final JobInterviewTypeService service;

    public JobInterviewTypeController(JobInterviewTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<JobInterviewType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public JobInterviewType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<JobInterviewType> create(@RequestBody JobInterviewType entity) {
        JobInterviewType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public JobInterviewType update(@PathVariable Long id, @RequestBody JobInterviewType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}