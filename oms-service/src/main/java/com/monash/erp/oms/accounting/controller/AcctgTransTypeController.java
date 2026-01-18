package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.AcctgTransType;
import com.monash.erp.oms.accounting.service.AcctgTransTypeService;
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
@RequestMapping("/accounting/acctg-trans-types")
public class AcctgTransTypeController {

    private final AcctgTransTypeService service;

    public AcctgTransTypeController(AcctgTransTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<AcctgTransType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AcctgTransType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AcctgTransType> create(@RequestBody AcctgTransType entity) {
        AcctgTransType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AcctgTransType update(@PathVariable Long id, @RequestBody AcctgTransType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
