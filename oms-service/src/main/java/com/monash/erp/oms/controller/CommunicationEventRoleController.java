package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CommunicationEventRole;
import com.monash.erp.oms.service.CommunicationEventRoleService;
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
@RequestMapping("/api/communication-event-roles")
public class CommunicationEventRoleController {

    private final CommunicationEventRoleService service;

    public CommunicationEventRoleController(CommunicationEventRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommunicationEventRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CommunicationEventRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CommunicationEventRole> create(@RequestBody CommunicationEventRole entity) {
        CommunicationEventRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CommunicationEventRole update(@PathVariable Long id, @RequestBody CommunicationEventRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}