package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.TestingNode;
import com.monash.erp.wms.service.TestingNodeService;
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
@RequestMapping("/api/testing-nodes")
public class TestingNodeController {

    private final TestingNodeService service;

    public TestingNodeController(TestingNodeService service) {
        this.service = service;
    }

    @GetMapping
    public List<TestingNode> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TestingNode get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TestingNode> create(@RequestBody TestingNode entity) {
        TestingNode created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TestingNode update(@PathVariable Long id, @RequestBody TestingNode entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}