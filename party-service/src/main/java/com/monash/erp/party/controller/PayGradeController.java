package com.monash.erp.party.controller;

import com.monash.erp.party.entity.PayGrade;
import com.monash.erp.party.service.PayGradeService;
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
@RequestMapping("/api/pay-grades")
public class PayGradeController {

    private final PayGradeService service;

    public PayGradeController(PayGradeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PayGrade> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PayGrade get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PayGrade> create(@RequestBody PayGrade entity) {
        PayGrade created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PayGrade update(@PathVariable Long id, @RequestBody PayGrade entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}