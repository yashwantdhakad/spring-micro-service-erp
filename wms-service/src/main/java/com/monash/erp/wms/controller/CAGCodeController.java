package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.CAGCode;
import com.monash.erp.wms.service.CAGCodeService;
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
@RequestMapping("/api/cag-codes")
public class CAGCodeController {

    private final CAGCodeService service;

    public CAGCodeController(CAGCodeService service) {
        this.service = service;
    }

    @GetMapping
    public List<CAGCode> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CAGCode get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CAGCode> create(@RequestBody CAGCode entity) {
        CAGCode created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CAGCode update(@PathVariable Long id, @RequestBody CAGCode entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}