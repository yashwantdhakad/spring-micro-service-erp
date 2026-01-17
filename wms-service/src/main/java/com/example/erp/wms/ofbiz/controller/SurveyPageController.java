package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.SurveyPage;
import com.example.erp.wms.ofbiz.service.SurveyPageService;
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
@RequestMapping("/ofbiz/survey-pages")
public class SurveyPageController {

    private final SurveyPageService service;

    public SurveyPageController(SurveyPageService service) {
        this.service = service;
    }

    @GetMapping
    public List<SurveyPage> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SurveyPage get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SurveyPage> create(@RequestBody SurveyPage entity) {
        SurveyPage created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SurveyPage update(@PathVariable Long id, @RequestBody SurveyPage entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}