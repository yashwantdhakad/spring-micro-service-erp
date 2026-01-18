package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SurveyQuestionCategory;
import com.monash.erp.wms.service.SurveyQuestionCategoryService;
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
@RequestMapping("/ofbiz/survey-question-categories")
public class SurveyQuestionCategoryController {

    private final SurveyQuestionCategoryService service;

    public SurveyQuestionCategoryController(SurveyQuestionCategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<SurveyQuestionCategory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SurveyQuestionCategory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SurveyQuestionCategory> create(@RequestBody SurveyQuestionCategory entity) {
        SurveyQuestionCategory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SurveyQuestionCategory update(@PathVariable Long id, @RequestBody SurveyQuestionCategory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}