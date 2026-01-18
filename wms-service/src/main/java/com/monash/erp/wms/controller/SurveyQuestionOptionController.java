package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SurveyQuestionOption;
import com.monash.erp.wms.service.SurveyQuestionOptionService;
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
@RequestMapping("/api/survey-question-options")
public class SurveyQuestionOptionController {

    private final SurveyQuestionOptionService service;

    public SurveyQuestionOptionController(SurveyQuestionOptionService service) {
        this.service = service;
    }

    @GetMapping
    public List<SurveyQuestionOption> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SurveyQuestionOption get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SurveyQuestionOption> create(@RequestBody SurveyQuestionOption entity) {
        SurveyQuestionOption created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SurveyQuestionOption update(@PathVariable Long id, @RequestBody SurveyQuestionOption entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}