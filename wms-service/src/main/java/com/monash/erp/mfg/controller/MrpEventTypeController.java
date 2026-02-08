package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.MrpEventType;
import com.monash.erp.mfg.service.MrpEventTypeService;
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
@RequestMapping("/api/mrp-event-types")
public class MrpEventTypeController {

    private final MrpEventTypeService service;

    public MrpEventTypeController(MrpEventTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<MrpEventType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public MrpEventType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<MrpEventType> create(@RequestBody MrpEventType entity) {
        MrpEventType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public MrpEventType update(@PathVariable Long id, @RequestBody MrpEventType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}