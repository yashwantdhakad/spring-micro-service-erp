package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CommunicationEventWorkEff;
import com.monash.erp.oms.service.CommunicationEventWorkEffService;
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
@RequestMapping("/api/communication-event-work-effs")
public class CommunicationEventWorkEffController {

    private final CommunicationEventWorkEffService service;

    public CommunicationEventWorkEffController(CommunicationEventWorkEffService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommunicationEventWorkEff> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CommunicationEventWorkEff get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CommunicationEventWorkEff> create(@RequestBody CommunicationEventWorkEff entity) {
        CommunicationEventWorkEff created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CommunicationEventWorkEff update(@PathVariable Long id, @RequestBody CommunicationEventWorkEff entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}