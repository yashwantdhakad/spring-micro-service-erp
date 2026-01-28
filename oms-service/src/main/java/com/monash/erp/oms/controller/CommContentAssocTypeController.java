package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CommContentAssocType;
import com.monash.erp.oms.service.CommContentAssocTypeService;
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
@RequestMapping("/api/comm-content-assoc-types")
public class CommContentAssocTypeController {

    private final CommContentAssocTypeService service;

    public CommContentAssocTypeController(CommContentAssocTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<CommContentAssocType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CommContentAssocType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CommContentAssocType> create(@RequestBody CommContentAssocType entity) {
        CommContentAssocType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CommContentAssocType update(@PathVariable Long id, @RequestBody CommContentAssocType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}