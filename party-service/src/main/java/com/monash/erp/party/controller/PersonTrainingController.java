package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PersonTraining;
import com.monash.erp.party.service.PersonTrainingService;
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
@RequestMapping("/api/person-trainings")
public class PersonTrainingController {

    private final PersonTrainingService service;

    public PersonTrainingController(PersonTrainingService service) {
        this.service = service;
    }

    @GetMapping
    public List<PersonTraining> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PersonTraining get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PersonTraining> create(@RequestBody PersonTraining entity) {
        PersonTraining created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PersonTraining update(@PathVariable Long id, @RequestBody PersonTraining entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}