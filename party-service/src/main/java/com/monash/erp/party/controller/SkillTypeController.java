package com.monash.erp.party.controller;

import com.monash.erp.party.entity.SkillType;
import com.monash.erp.party.service.SkillTypeService;
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
@RequestMapping("/api/skill-types")
public class SkillTypeController {

    private final SkillTypeService service;

    public SkillTypeController(SkillTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<SkillType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SkillType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SkillType> create(@RequestBody SkillType entity) {
        SkillType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SkillType update(@PathVariable Long id, @RequestBody SkillType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}