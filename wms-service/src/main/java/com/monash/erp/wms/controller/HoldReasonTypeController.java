package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.HoldReasonType;
import com.monash.erp.wms.service.HoldReasonTypeService;
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
@RequestMapping("/api/hold-reason-types")
public class HoldReasonTypeController {

    private final HoldReasonTypeService service;

    public HoldReasonTypeController(HoldReasonTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<HoldReasonType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public HoldReasonType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<HoldReasonType> create(@RequestBody HoldReasonType entity) {
        HoldReasonType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public HoldReasonType update(@PathVariable Long id, @RequestBody HoldReasonType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}