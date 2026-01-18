package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.AcctgTransEntry;
import com.monash.erp.oms.accounting.service.AcctgTransEntryService;
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
@RequestMapping("/api/accounting/acctg-trans-entrys")
public class AcctgTransEntryController {

    private final AcctgTransEntryService service;

    public AcctgTransEntryController(AcctgTransEntryService service) {
        this.service = service;
    }

    @GetMapping
    public List<AcctgTransEntry> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AcctgTransEntry get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AcctgTransEntry> create(@RequestBody AcctgTransEntry entity) {
        AcctgTransEntry created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AcctgTransEntry update(@PathVariable Long id, @RequestBody AcctgTransEntry entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
