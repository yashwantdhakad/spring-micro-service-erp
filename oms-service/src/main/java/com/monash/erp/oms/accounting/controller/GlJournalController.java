package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.GlJournal;
import com.monash.erp.oms.accounting.service.GlJournalService;
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
@RequestMapping("/api/accounting/gl-journals")
public class GlJournalController {

    private final GlJournalService service;

    public GlJournalController(GlJournalService service) {
        this.service = service;
    }

    @GetMapping
    public List<GlJournal> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GlJournal get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GlJournal> create(@RequestBody GlJournal entity) {
        GlJournal created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GlJournal update(@PathVariable Long id, @RequestBody GlJournal entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
