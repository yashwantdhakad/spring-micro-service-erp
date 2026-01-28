package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SegmentGroup;
import com.monash.erp.wms.service.SegmentGroupService;
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
@RequestMapping("/api/segment-groups")
public class SegmentGroupController {

    private final SegmentGroupService service;

    public SegmentGroupController(SegmentGroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<SegmentGroup> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SegmentGroup get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SegmentGroup> create(@RequestBody SegmentGroup entity) {
        SegmentGroup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SegmentGroup update(@PathVariable Long id, @RequestBody SegmentGroup entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}