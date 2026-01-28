package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CustRequestContent;
import com.monash.erp.oms.service.CustRequestContentService;
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
@RequestMapping("/api/cust-request-contents")
public class CustRequestContentController {

    private final CustRequestContentService service;

    public CustRequestContentController(CustRequestContentService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustRequestContent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustRequestContent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustRequestContent> create(@RequestBody CustRequestContent entity) {
        CustRequestContent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustRequestContent update(@PathVariable Long id, @RequestBody CustRequestContent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}