package com.example.erp.mfg.ofbiz.controller;

import com.example.erp.mfg.ofbiz.domain.WorkEffortKeyword;
import com.example.erp.mfg.ofbiz.service.WorkEffortKeywordService;
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
@RequestMapping("/ofbiz/work-effort-keywords")
public class WorkEffortKeywordController {

    private final WorkEffortKeywordService service;

    public WorkEffortKeywordController(WorkEffortKeywordService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortKeyword> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortKeyword get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortKeyword> create(@RequestBody WorkEffortKeyword entity) {
        WorkEffortKeyword created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortKeyword update(@PathVariable Long id, @RequestBody WorkEffortKeyword entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}