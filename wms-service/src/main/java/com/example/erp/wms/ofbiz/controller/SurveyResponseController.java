package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.SurveyResponse;
import com.example.erp.wms.ofbiz.service.SurveyResponseService;
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
@RequestMapping("/ofbiz/survey-responses")
public class SurveyResponseController {

    private final SurveyResponseService service;

    public SurveyResponseController(SurveyResponseService service) {
        this.service = service;
    }

    @GetMapping
    public List<SurveyResponse> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SurveyResponse get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SurveyResponse> create(@RequestBody SurveyResponse entity) {
        SurveyResponse created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SurveyResponse update(@PathVariable Long id, @RequestBody SurveyResponse entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}