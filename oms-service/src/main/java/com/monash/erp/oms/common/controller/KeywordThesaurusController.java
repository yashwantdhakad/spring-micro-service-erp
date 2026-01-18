package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.KeywordThesaurus;
import com.monash.erp.oms.common.service.KeywordThesaurusService;
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
@RequestMapping("/api/common/keyword-thesauruses")
public class KeywordThesaurusController {

    private final KeywordThesaurusService service;

    public KeywordThesaurusController(KeywordThesaurusService service) {
        this.service = service;
    }

    @GetMapping
    public List<KeywordThesaurus> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public KeywordThesaurus get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<KeywordThesaurus> create(@RequestBody KeywordThesaurus entity) {
        KeywordThesaurus created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public KeywordThesaurus update(@PathVariable Long id, @RequestBody KeywordThesaurus entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
