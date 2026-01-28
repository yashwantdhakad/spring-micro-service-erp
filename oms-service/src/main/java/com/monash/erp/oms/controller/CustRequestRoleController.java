package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.CustRequestRole;
import com.monash.erp.oms.service.CustRequestRoleService;
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
@RequestMapping("/api/cust-request-roles")
public class CustRequestRoleController {

    private final CustRequestRoleService service;

    public CustRequestRoleController(CustRequestRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustRequestRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustRequestRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustRequestRole> create(@RequestBody CustRequestRole entity) {
        CustRequestRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustRequestRole update(@PathVariable Long id, @RequestBody CustRequestRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}