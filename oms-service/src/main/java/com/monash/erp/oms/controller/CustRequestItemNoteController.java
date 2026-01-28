package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CustRequestItemNote;
import com.monash.erp.oms.service.CustRequestItemNoteService;
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
@RequestMapping("/api/cust-request-item-notes")
public class CustRequestItemNoteController {

    private final CustRequestItemNoteService service;

    public CustRequestItemNoteController(CustRequestItemNoteService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustRequestItemNote> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustRequestItemNote get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustRequestItemNote> create(@RequestBody CustRequestItemNote entity) {
        CustRequestItemNote created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustRequestItemNote update(@PathVariable Long id, @RequestBody CustRequestItemNote entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}