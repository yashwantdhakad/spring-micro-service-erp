package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SurveyQuestion;
import com.monash.erp.wms.service.SurveyQuestionService;
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
@RequestMapping("/api/survey-questions")
public class SurveyQuestionController {

    private final SurveyQuestionService service;

    public SurveyQuestionController(SurveyQuestionService service) {
        this.service = service;
    }

    @GetMapping
    public List<SurveyQuestion> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SurveyQuestion get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SurveyQuestion> create(@RequestBody SurveyQuestion entity) {
        SurveyQuestion created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SurveyQuestion update(@PathVariable Long id, @RequestBody SurveyQuestion entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}