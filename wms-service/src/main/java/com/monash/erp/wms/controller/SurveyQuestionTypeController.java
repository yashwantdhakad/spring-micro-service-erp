package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SurveyQuestionType;
import com.monash.erp.wms.service.SurveyQuestionTypeService;
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
@RequestMapping("/ofbiz/survey-question-types")
public class SurveyQuestionTypeController {

    private final SurveyQuestionTypeService service;

    public SurveyQuestionTypeController(SurveyQuestionTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<SurveyQuestionType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SurveyQuestionType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SurveyQuestionType> create(@RequestBody SurveyQuestionType entity) {
        SurveyQuestionType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SurveyQuestionType update(@PathVariable Long id, @RequestBody SurveyQuestionType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}