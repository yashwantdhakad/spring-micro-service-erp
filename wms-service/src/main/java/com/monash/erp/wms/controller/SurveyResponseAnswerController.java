package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SurveyResponseAnswer;
import com.monash.erp.wms.service.SurveyResponseAnswerService;
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
@RequestMapping("/api/survey-response-answers")
public class SurveyResponseAnswerController {

    private final SurveyResponseAnswerService service;

    public SurveyResponseAnswerController(SurveyResponseAnswerService service) {
        this.service = service;
    }

    @GetMapping
    public List<SurveyResponseAnswer> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SurveyResponseAnswer get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SurveyResponseAnswer> create(@RequestBody SurveyResponseAnswer entity) {
        SurveyResponseAnswer created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SurveyResponseAnswer update(@PathVariable Long id, @RequestBody SurveyResponseAnswer entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}