package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.AcctgTransEntryType;
import com.monash.erp.oms.accounting.service.AcctgTransEntryTypeService;
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
@RequestMapping("/accounting/acctg-trans-entry-types")
public class AcctgTransEntryTypeController {

    private final AcctgTransEntryTypeService service;

    public AcctgTransEntryTypeController(AcctgTransEntryTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<AcctgTransEntryType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AcctgTransEntryType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AcctgTransEntryType> create(@RequestBody AcctgTransEntryType entity) {
        AcctgTransEntryType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AcctgTransEntryType update(@PathVariable Long id, @RequestBody AcctgTransEntryType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
