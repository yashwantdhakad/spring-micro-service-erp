package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CommunicationEventPrpTyp;
import com.monash.erp.oms.service.CommunicationEventPrpTypService;
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
@RequestMapping("/api/communication-event-prp-typs")
public class CommunicationEventPrpTypController {

    private final CommunicationEventPrpTypService service;

    public CommunicationEventPrpTypController(CommunicationEventPrpTypService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommunicationEventPrpTyp> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CommunicationEventPrpTyp get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CommunicationEventPrpTyp> create(@RequestBody CommunicationEventPrpTyp entity) {
        CommunicationEventPrpTyp created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CommunicationEventPrpTyp update(@PathVariable Long id, @RequestBody CommunicationEventPrpTyp entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}