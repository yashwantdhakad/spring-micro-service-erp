package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SegmentGroupType;
import com.monash.erp.wms.service.SegmentGroupTypeService;
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
@RequestMapping("/api/segment-group-types")
public class SegmentGroupTypeController {

    private final SegmentGroupTypeService service;

    public SegmentGroupTypeController(SegmentGroupTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<SegmentGroupType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SegmentGroupType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SegmentGroupType> create(@RequestBody SegmentGroupType entity) {
        SegmentGroupType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SegmentGroupType update(@PathVariable Long id, @RequestBody SegmentGroupType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}