package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.AcctgTransTypeAttr;
import com.monash.erp.oms.accounting.service.AcctgTransTypeAttrService;
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
@RequestMapping("/accounting/acctg-trans-type-attrs")
public class AcctgTransTypeAttrController {

    private final AcctgTransTypeAttrService service;

    public AcctgTransTypeAttrController(AcctgTransTypeAttrService service) {
        this.service = service;
    }

    @GetMapping
    public List<AcctgTransTypeAttr> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AcctgTransTypeAttr get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AcctgTransTypeAttr> create(@RequestBody AcctgTransTypeAttr entity) {
        AcctgTransTypeAttr created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AcctgTransTypeAttr update(@PathVariable Long id, @RequestBody AcctgTransTypeAttr entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
