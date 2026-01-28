package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CustRequestParty;
import com.monash.erp.oms.service.CustRequestPartyService;
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
@RequestMapping("/api/cust-request-parties")
public class CustRequestPartyController {

    private final CustRequestPartyService service;

    public CustRequestPartyController(CustRequestPartyService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustRequestParty> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustRequestParty get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustRequestParty> create(@RequestBody CustRequestParty entity) {
        CustRequestParty created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustRequestParty update(@PathVariable Long id, @RequestBody CustRequestParty entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}