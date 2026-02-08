package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.TrainingRequest;
import com.monash.erp.oms.party.service.TrainingRequestService;
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
@RequestMapping("/api/training-requests")
public class TrainingRequestController {

    private final TrainingRequestService service;

    public TrainingRequestController(TrainingRequestService service) {
        this.service = service;
    }

    @GetMapping
    public List<TrainingRequest> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TrainingRequest get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TrainingRequest> create(@RequestBody TrainingRequest entity) {
        TrainingRequest created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TrainingRequest update(@PathVariable Long id, @RequestBody TrainingRequest entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}