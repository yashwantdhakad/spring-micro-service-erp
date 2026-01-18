package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.MrpEvent;
import com.monash.erp.mfg.service.MrpEventService;
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
@RequestMapping("/api/mrp-events")
public class MrpEventController {

    private final MrpEventService service;

    public MrpEventController(MrpEventService service) {
        this.service = service;
    }

    @GetMapping
    public List<MrpEvent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public MrpEvent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<MrpEvent> create(@RequestBody MrpEvent entity) {
        MrpEvent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public MrpEvent update(@PathVariable Long id, @RequestBody MrpEvent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}